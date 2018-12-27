package cww.world.common.cache;

import cww.world.common.constant.BaseCode;
import cww.world.common.constant.Parameters;
import cww.world.common.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class JedisPoolWrapper {


	private JedisPool jedisPool = null;
	
	@Autowired
	private Parameters parameters;
	
	@PostConstruct
	public void init()  {
		try {
			JedisPoolConfig config = new JedisPoolConfig();

			jedisPool = new JedisPool(config,parameters.getRedisHost(),parameters.getRedisPort(),2000);
		} catch (Exception e) {
			log.error("Fail to initialize jedis pool", e);
			throw new BaseException(BaseCode.SESSION_SETTING_FAIL,"Fail to initialize jedis pool");
		}
	}

	public JedisPool getJedisPool() {
		return jedisPool;
	}
	
}
