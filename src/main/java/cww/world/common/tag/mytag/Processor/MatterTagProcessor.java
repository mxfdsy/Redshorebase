package cww.world.common.tag.mytag.Processor;

import cww.world.mapper.config.ComboxItemMapper;
import cww.world.pojo.po.config.ComboxItemPO;
import org.springframework.context.ApplicationContext;
import org.springframework.util.CollectionUtils;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractElementTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.spring4.context.SpringContextUtils;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.List;

/**
 * @author 小武 on 2018/9/27.
 */
public class MatterTagProcessor extends AbstractElementTagProcessor{

    //标签名
    private static final String TAG_NAME  = "mxfdsy";
    //优先级
    private static final int PRECEDENCE = 10000;

    public MatterTagProcessor( String dialectPrefix) {
        super(
                TemplateMode.HTML, // 此处理器将仅应用于HTML模式
                dialectPrefix,     // 要应用于名称的匹配前缀
                TAG_NAME,          // 标签名称：匹配此名称的特定标签
                true,              // 将标签前缀应用于标签名称
                null,              // 无属性名称：将通过标签名称匹配
                false,             // 没有要应用于属性名称的前缀
                PRECEDENCE);       // 优先(内部方言自己的优先)

    }


    /**
     * context 页面上下文
     * @param context
     * @param tag
     * @param structureHandler
     */
    @Override
    protected void doProcess(ITemplateContext context,
                             IProcessableElementTag tag,
                             IElementTagStructureHandler structureHandler) {

        ApplicationContext appCtx = SpringContextUtils.getApplicationContext(context);
        ComboxItemMapper mapper = appCtx.getBean(ComboxItemMapper.class);

        /**
         * 从标签中读取matterid属性，标签中的这个可选属性将告诉我们需要什么样的数据
         */
        final String  matterid= tag.getAttributeValue("redshorebase");


        List<ComboxItemPO> comboxItemPOS = mapper.listActiveComboxItemByType(matterid);

        String text = null;
        if (!CollectionUtils.isEmpty(comboxItemPOS)) {
            text = "ok";
        } else {
            text = "no";
        }


        /**
         * 创建将替换自定义标签的DOM结构
         * text 讲显示在“<div>”标签内，因此必须 首先创建
         * 然后必须想其中添加一个节点
         */
        final IModelFactory modelFactory = context.getModelFactory();
        final IModel model = modelFactory.createModel();
        model.add(modelFactory.createOpenElementTag("div"));
        model.add(modelFactory.createText(text));
        model.add(modelFactory.createCloseElementTag("div"));


        /**
         * 指示引擎用指定的模型替换整个元素
         */
        structureHandler.replaceWith(model, false);


    }
}

