package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {

    @Bean
    public SpringCorePractice springCorePractice(){
        return new SpringCorePractice();
    }

    @Bean
    public WelcomeToCydeoApp welcomeToCydeoApp(){
        return new WelcomeToCydeoApp();
    }

    @Bean
    public String str1(){
        return "Hello from str1";
    }

    @Bean
    public String str2(){
        return "Hello from str2";
    }
}
