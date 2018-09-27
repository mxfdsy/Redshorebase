package cww.world.common.tag;

import cww.world.common.tag.processor.SelectorProcessor;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 小武 on 2018/9/17.
 */
public class diyLabel extends AbstractProcessorDialect {
    //定义方言名称
    private static final String DIALECT_NAME = "cww Dialect";

    //权限的自定义方言的前缀
    private static final String PREFIX = "cww";

    protected diyLabel() {
        super(DIALECT_NAME, PREFIX, StandardDialect.PROCESSOR_PRECEDENCE);
    }


    @Override
    public Set<IProcessor> getProcessors(final String dialectPrefix) {
        Set<IProcessor> processors = new HashSet<>();
        //添加我们定义的标签
        processors.add(new SelectorProcessor(dialectPrefix));
        return processors;
    }
}
