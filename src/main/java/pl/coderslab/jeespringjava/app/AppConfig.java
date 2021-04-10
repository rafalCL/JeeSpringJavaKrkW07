package pl.coderslab.jeespringjava.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.jeespringjava.beans.HelloWorld;

@Configuration
//@ComponentScan("pl.coderslab.jeespringjava")
@ComponentScan(basePackages = {"pl.coderslab.jeespringjava.beans",
                                "pl.coderslab.jeespringjava.controller"})
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
