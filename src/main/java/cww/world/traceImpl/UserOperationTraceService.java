package cww.world.traceImpl;


import cww.world.pojo.po.trace.ModuleOperationTraceDetailPO;

import java.util.List;

public interface UserOperationTraceService {


    List<ModuleOperationTraceDetailPO> generateDetail(Generic newValue, Generic oldValue);

}
