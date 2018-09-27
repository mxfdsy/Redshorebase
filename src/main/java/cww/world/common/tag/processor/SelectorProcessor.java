package cww.world.common.tag.processor;

import cww.world.mapper.config.ComboxItemMapper;
import cww.world.pojo.po.config.ComboxItemPO;
import org.springframework.context.ApplicationContext;
import org.thymeleaf.IEngineConfiguration;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.*;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.spring4.context.SpringContextUtils;
import org.thymeleaf.standard.expression.IStandardExpression;
import org.thymeleaf.standard.expression.IStandardExpressionParser;
import org.thymeleaf.standard.expression.StandardExpressions;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 根据type获得下拉选项列表
 * <lmf:typselector name="brand_level"
 * option_display_all="全部"
 * lay-verify="required"
 * option_use_text_instead_key="true"
 * lay-errorText="请选择品牌等级"
 * />
 */
public class SelectorProcessor extends AbstractElementTagProcessor {
    private static final String TAG_NAME = "typselector";//标签名
    private static final String THYMELEAF_TAG_PREFIX= "th:";
    private static final String OPTION_TAG_PREFIX= "option_";
    private static final int PRECEDENCE = 100;//优先级

    public SelectorProcessor(final String dialectPrefix) {
        super(TemplateMode.HTML, // This processor will apply only to HTML mode
                dialectPrefix, // Prefix to be applied to name for matching
                TAG_NAME, // No tag name: match any tag name
                true, // No prefix to be applied to tag name
                null, // Name of the attribute that will be matched
                false, // Apply dialect prefix to attribute name
                PRECEDENCE // Precedence (inside dialect's own precedence)
        );
    }

    @Override
    protected void doProcess(ITemplateContext iTemplateContext, IProcessableElementTag iProcessableElementTag,
                             IElementTagStructureHandler iElementTagStructureHandler) {
        //加入上下文
        ApplicationContext appCtx = SpringContextUtils.getApplicationContext(iTemplateContext);
        ComboxItemMapper mapper=appCtx.getBean(ComboxItemMapper.class);

        final IEngineConfiguration configuration = iTemplateContext.getConfiguration();

        final IStandardExpressionParser parser =
                StandardExpressions.getExpressionParser(configuration);

        final String typeName =
                Optional.ofNullable(iProcessableElementTag.getAttributeValue("type")).orElse(iProcessableElementTag.getAttributeValue("name"));

        final String  allItemKeyName= iProcessableElementTag.getAttributeValue(OPTION_TAG_PREFIX+"display_all");


        List<ComboxItemPO> comboxItemPOList = mapper.listActiveComboxItemByType( typeName );

        final IModelFactory modelFactory = iTemplateContext.getModelFactory();
        final IModel model = modelFactory.createModel();

        Map<String,String> selectorParam  = buildSelectorParam(iTemplateContext,parser,iProcessableElementTag.getAllAttributes());

        model.insert(0, modelFactory.createOpenElementTag("select",
                selectorParam,
                AttributeValueQuotes.NONE,false));
        IOpenElementTag optionItem = null;

        String defaultItem = selectorParam.get(OPTION_TAG_PREFIX+"default_item");

        if(allItemKeyName!=null && !"".equals(allItemKeyName)){
            optionItem = modelFactory.createOpenElementTag("option", "value","");
            model.add(optionItem);
            model.add(modelFactory.createText(allItemKeyName));
        }

        for(ComboxItemPO item : comboxItemPOList) {
            optionItem = modelFactory.createOpenElementTag("option",
                    buildItemParam(iProcessableElementTag.getAllAttributes(),item,defaultItem),
                    AttributeValueQuotes.NONE,false);
            model.add(optionItem);
            model.add(modelFactory.createText(item.getText()));
            model.add(modelFactory.createCloseElementTag("option"));
        }

        model.add(modelFactory.createCloseElementTag("select"));
        iElementTagStructureHandler.replaceWith(model, false);
    }

    private Map<String,String> buildSelectorParam(ITemplateContext context,IStandardExpressionParser parser,IAttribute[] attibutres){
        Map<String, String> param = new HashMap<>();
        IStandardExpression expression = null;
        for(IAttribute attr:attibutres ){
            if(attr.getAttributeCompleteName().startsWith(THYMELEAF_TAG_PREFIX) ){
                expression = parser.parseExpression(context, attr.getValue());
                param.put(attr.getAttributeCompleteName().replace(THYMELEAF_TAG_PREFIX,""), String.valueOf(expression.execute(context)));
            } else {
                param.put(attr.getAttributeCompleteName(), attr.getValue());
            }

        }

        return param;
    }

    private Map<String,String> buildItemParam(IAttribute[] attibutres,ComboxItemPO item,String defaultItem){
        Map<String, String> param = new HashMap<>();
        boolean useTextInsteadKey = false;


        for(IAttribute attr:attibutres ){
            if(attr.getAttributeCompleteName().startsWith(OPTION_TAG_PREFIX)){
                if((OPTION_TAG_PREFIX+"default_item").equals(attr.getAttributeCompleteName())) continue;
                if((OPTION_TAG_PREFIX+"display_all").equals(attr.getAttributeCompleteName())) continue;
                if((OPTION_TAG_PREFIX+"use_text_instead_key").equals(attr.getAttributeCompleteName())){
                    useTextInsteadKey = true;
                }
                param.put(attr.getAttributeCompleteName().replace(OPTION_TAG_PREFIX,""), attr.getValue());

            }
        }
        if(defaultItem!=null && defaultItem.equals(item.getText())){
            param.put("selected","selected");
        }
        if(useTextInsteadKey){
            param.put("value",item.getText());
        } else {
            param.put("value",item.getComboxItemUid());
        }
        param.put(OPTION_TAG_PREFIX+"uid",item.getComboxItemUid());

        return param;
    }

}
