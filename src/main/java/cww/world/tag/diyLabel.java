//package cww.world.tag;
//
//import org.thymeleaf.dialect.AbstractProcessorDialect;
//import org.thymeleaf.processor.IProcessor;
//import org.thymeleaf.standard.StandardDialect;
//import org.thymeleaf.standard.processor.StandardXmlNsTagProcessor;
//import org.thymeleaf.templatemode.TemplateMode;
//
//import java.util.HashSet;
//import java.util.Set;
//
///**
// * @author 小武 on 2018/9/17.
// */
//public class diyLabel extends AbstractProcessorDialect {
//    //定义方言名称
//    private static final String DIALECT_NAME = "cww Dialect";
//
//    protected diyLabel() {
//        super(DIALECT_NAME, "cww", StandardDialect.PROCESSOR_PRECEDENCE);
//    }
//
//
//    @Override
//    public Set<IProcessor> getProcessors(final String dialectPrefix) {
//        Set<IProcessor> processors = new HashSet<IProcessor>();
//        processors.add(new MatterTagProcessor(dialectPrefix));//添加我们定义的标签
//
//        processors.add(new StandardXmlNsTagProcessor(TemplateMode.HTML, dialectPrefix));
//
//        return processors;
//    }
//}
