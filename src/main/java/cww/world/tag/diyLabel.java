package cww.world.tag;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.processor.StandardXmlNsTagProcessor;
import org.thymeleaf.templatemode.TemplateMode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 小武 on 2018/9/17.
 */
public class diyLabel extends AbstractProcessorDialect {
    private static final String DIALECT_NAME = "cww";//定义方言名称

    protected diyLabel(String name, String prefix, int processorPrecedence) {
        // 我们将设置此方言与“方言处理器”优先级相同
        // 标准方言, 以便处理器执行交错。
        super(name, prefix, processorPrecedence);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> processors = new HashSet<IProcessor>();
//        processors.add(new MatterTagProcessor(dialectPrefix));//添加我们定义的标签


        processors.add(new StandardXmlNsTagProcessor(TemplateMode.HTML, dialectPrefix));
        return processors;

    }
}
