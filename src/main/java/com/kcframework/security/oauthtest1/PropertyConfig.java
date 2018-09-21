package com.kcframework.security.oauthtest1;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Created by jayang 配置
 */
@Configuration
public class PropertyConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean("propertySourceBean")
    public PropertySource propertySourceBean() throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        YamlPropertySourceLoader yamlLoader = new YamlPropertySourceLoader();
        PropertySource propertySource = null;
        propertySource = yamlLoader.load("application", resolver.getResource("classpath:application.yml")).get(0);
        return propertySource;
    }
}
