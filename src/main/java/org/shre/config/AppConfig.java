package org.shre.config;

import org.shre.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = {"desktop","com1"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

}
