package lk.ijse.Spring.config;

import lk.ijse.Spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Ashan Sandeep
 * @date : 1/6/2023
 * @since : 0.1.0
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig : Instantiated");
    }

    @Bean
    public BasicDataSource bds(){
        return new BasicDataSource();
    }

}
