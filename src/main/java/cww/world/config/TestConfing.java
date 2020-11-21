package cww.world.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfing {

    @Bean
    public TestBean getBean() {
        System.out.println("testtttttttt");
        return new TestBean();
    }
}
