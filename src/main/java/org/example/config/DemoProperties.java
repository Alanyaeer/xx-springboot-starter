package org.example.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties(prefix = "spring.demo")
public class DemoProperties {
    private String name;
}
