package cww.world;

import cww.world.common.tag.mytag.CmsDialect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 小武 on 2018/8/13.
 */
@SpringBootApplication
@MapperScan(basePackages = "cww.world.mapper")
@ImportResource(value = {
        "classpath:META-INF/mybatis/*.xml",
        "classpath:META-INF/rabbitmq/*.xml"
})
@PropertySource(value = "classpath:parameter.properties")
@EnableDiscoveryClient
@EnableFeignClients
public class myApplication {
    public static void main(String[] args) {
        SpringApplication.run(myApplication.class, args);
    }

    @Bean
    public CmsDialect CmsDialect() {
        return new CmsDialect();
    }
}
