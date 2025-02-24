package org.example.config;

import org.example.service.DemoService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnClass(DemoService.class)
@ConditionalOnProperty(prefix = "spring.demo", name = "name")
public class DemoAutoConfiguration {
    @Resource
    private DemoProperties demoProperties;

    @Bean
    @ConditionalOnMissingBean
    public DemoService demoService(){
        DemoService demoService = new DemoService();
//        demoService
        demoService.setName(demoProperties.getName());
        return demoService;
    }
}
