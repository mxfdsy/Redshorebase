package cww.world.common.cache;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import cww.world.common.security.UserElement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;

@Component
@Slf4j
public class CommonCacheUtil {


    private static final String TOKEN_PREFIX = "token.";

    private static final String USER_PREFIX = "user.";


    @Autowired
    private JedisPoolWrapper jedisPoolWrapper;

    /**
     * 缓存 可以value 永久
     *
     * @param key
     * @param value
     */
    public void cache(String key, String value) {
        try {
            JedisPool pool = jedisPoolWrapper.getJedisPool();
            if (pool != null) {
                try (Jedis Jedis = pool.getResource()) {
                    Jedis.select(0);
                    Jedis.set(key, value);
                }
            }
        } catch (Exception e) {
            log.error("Fail to cache value", e);
        }
    }

    /**
     * 获取缓存key
     *
     * @param key
     * @return
     */
    public String getCacheValue(String key) {
        String value = null;
        try {
            JedisPool pool = jedisPoolWrapper.getJedisPool();
            if (pool != null) {
                try (Jedis Jedis = pool.getResource()) {
                    Jedis.select(0);
                    value = Jedis.get(key);
                }
            }
        } catch (Exception e) {
            log.error("Fail to get cached value", e);
        }
        return value;
    }

    /**
     * 设置key value 以及过期时间
     *
     * @param key
     * @param value
     * @param expiry
     * @return
     */
    public long cacheNxExpire(String key, String value, int expiry) {
        long result = 0;
        try {
            JedisPool pool = jedisPoolWrapper.getJedisPool();
            if (pool != null) {
                try (Jedis jedis = pool.getResource()) {
                    jedis.select(0);
                    result = jedis.setnx(key, value);
                    jedis.expire(key, expiry);
                }
            }
        } catch (Exception e) {
            log.error("Fail to cacheNx value", e);
        }

        return result;
    }

    /**
     * 删除缓存key
     *
     * @param key
     */
    public void delKey(String key) {
        JedisPool pool = jedisPoolWrapper.getJedisPool();
        if (pool != null) {

            try (Jedis jedis = pool.getResource()) {
                jedis.select(0);
                try {
                    jedis.del(key);
                } catch (Exception e) {
                    log.error("Fail to remove key from redis", e);
                }
            }
        }
    }



    /**
     * 根据token取缓存的用户信息
     *
     * @param token
     * @return
     * @throws
     */
    public UserElement getUserByToken(String token)  {
        UserElement ue = null;

        JedisPool pool = jedisPoolWrapper.getJedisPool();
        if (pool != null) {
            try (Jedis jedis = pool.getResource()) {
                jedis.select(0);
                try {
                    Map<String, String> map = jedis.hgetAll(TOKEN_PREFIX + token);
                    if (map != null && !map.isEmpty()) {
                        ue = UserElement.fromMap(map);
                    } else {
                        log.warn("Fail to find cached element for token {}", token);
                    }
                } catch (Exception e) {
                    log.error("Fail to get token from redis", e);
                    throw new BaseException(BaseCode.INTERNAL_ERROR, "Fail to get token from redis");
                }
            }
        }

        return ue;
    }
}
