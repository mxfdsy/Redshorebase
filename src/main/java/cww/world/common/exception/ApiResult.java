package cww.world.common.exception;

import cww.world.common.constant.Constants;
import lombok.Data;

/**
 * Created by JackWangon[www.] 2017/7/29.
 */
@Data
public class ApiResult<T> {

    private int code = Constants.RESP_STATUS_OK;

    private String message;

    private T data;


}
