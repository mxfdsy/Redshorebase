package cww.world.common.constant;

/**
 * @author 小武 on 2018/8/17.
 */
public class Constants {
    /*************************** MESSAGE ****************************/
    public static final String CODE_FLAG = "code";
    public static final String ERROR_MSG_FLAG = "error_msg";
    public static final String MESSAGE_FLG = "message";
    public static final String LAST_REDIRECT_URL = "last_redirect_url";
    public static final String REDIRECT_URL = "redirect_url";
    public static final String SUCCESS = "success";
    public static final int SUCCESS_CODE = 200;

    /**
     * 自定义状态码 start
     **/
    public static final int RESP_STATUS_OK = 200;

    public static final int RESP_STATUS_NOAUTH = 401;

    public static final int RESP_STATUS_INTERNAL_ERROR = 500;

    public static final int RESP_STATUS_BADREQUEST = 400;


    /**
     * 用户token
     **/
    public static final String REQUEST_TOKEN_KEY = "user-token";
    /**
     * 客户端版本
     **/
    public static final String REQUEST_VERSION_KEY = "version";
    /**
     * 客户端平台 android/ios
     **/
    public static final String REQUEST_PLATFORM_KEY = "platform";
    /*************************** session ****************************/
    public static final String USER_INFO = "user_info";
    public static final String SYSTEM_ADMIN_KEY = "role01";
    public static final String PARENT_MENU_MAP = "father_menu_map";
    public static final String CHILDREN_MENU_MAP = "children_menu_map";
    public static final String MENU = "login_user_menu";
    public static final String USER_UID = "login_user_uid";
    public static final String SYSTEM_UID = "10000000000000001";

    public static final String DEFAULT_MALL_UID = "11111111111111111";

    public static final String AUDUTOR_LIST_SOUCE_MANUAL = "MANUAL_SELECTION";
    public static final String AUDUTOR_LIST_SOUCE_SYNC = "WORKFLOW_SYNC";
    public static final String AUDUTOR_LIST_SOUCE_WORKFLOWSTEP = "WORKFLOWSTEP_CONFIG";
}
