package org.example.annotationbasedconfiguration.demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public Client clientBean(){
        return new Client();
    }
    @Bean
    public User userBean(){
        return new User(clientBean());
    }

}
