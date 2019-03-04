package cww.world.common.constant;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统参数
 */
@Component
@Data
public class Parameters {

    @Value("#{'${security.noneSecurityPath}'.split(',')}")
    private List<String> noneSecurityPath;

    /*****redis config start*******/
    @Value("${spring.redis.host}")
    private String redisHost;
    @Value("${spring.redis.port}")
    private int redisPort;

    /*****redis config end*******/


    public List<String> getNoneSecurityPath() {
        return noneSecurityPath;
    }

    public void setNoneSecurityPath(List<String> noneSecurityPath) {
        this.noneSecurityPath = noneSecurityPath;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public int getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(int redisPort) {
        this.redisPort = redisPort;
    }
}
