package pl.coderslab.jeespringjava.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.jeespringjava.beans.HelloWorld;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
