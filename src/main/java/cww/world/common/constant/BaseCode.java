package cww.world.common.constant;

/**
 * @author 小武 on 2018/8/17.\
 */
public enum BaseCode {
    /**
     * success
     */
    SUCESS(200, "Opeartion success"),

    UNKNOWN(-1, "Unknown error"),

    PERMISSION_IS_NOT_EXIST(13001, "权限信息不存在"),

    SESSION_SETTING_FAIL(13002, "缓存设置失败"),

    INTERNAL_ERROR(11002, "请求信息不存在"),

    DATE_ERROR(11003, "数据异常"),

    DB_INSERT_ERROR(19999, "数据库插入错误"),

    ROLE_NAME_IS_EXIST_ERROR(25003, "角色名已存在"),

    ROLE_CREATE_ERROR(25001, "角色创建失败"),

    ROLE_IS_NOT_EXIST_ERROR(25004, "角色不存在"),

    MENU_DO_NOT_EXIST(12002, "菜单不存在"),

    WORKFLOW_PROGRESS_NOT_EXISTS(23004, "审核流程不存在"),

    OPERATION_NOT_SUPPORT(1100, "Operation does not support"),

    WORKFLOW_AUDITOR_LIST_IS_EMPTY(23003, "审核人候选列表为空"),

    WORKFLOW_AUDIT_STRATEGY_NOT_SUPPORT(23006, "审核处理策略不支持使用"),

    WORKFLOW_AUDIT_STATUS_ERROR(23002, "审核状态错误"),

    DB_UPDATE_ERROR(19998, "数据库更新错误"),
    WORKFLOW_AUDITOR_ERROR(23001, "用户不在审核人候选列表"),

    INVALID_ARGUMENT(11001, "请求参数错误");


    public static final String DEFAULT_MALL_UID = "11111111111111111";

    private int code;
    private String message;


    BaseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    //   不知道干嘛的代码
//    public static BaseCode valueOf(int code) {
//        BaseCode ec = values.get(code);
//        if (ec != null) {
//            return ec;
//        }
//        return UNKNOWN;
//    }
//
//    public static BaseCode valueOfCodeStr(String codeStr) {
//        try {
//            int code = Integer.valueOf(codeStr);
//            BaseCode ec = values.get(code);
//            if (ec != null) {
//                return ec;
//            }
//            return UNKNOWN;
//        } catch (Exception e) {
//            return UNKNOWN;
//        }
//    }
//
//
//    private static final MapTest<Integer, BaseCode> values = new HashMap<Integer, BaseCode>();
//
//    static {
//        for (BaseCode ec : BaseCode.values()) {
//            values.put(ec.code, ec);
//        }
//    }

}
