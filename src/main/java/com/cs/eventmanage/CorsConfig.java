package com.cs.eventmanage;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 所有mapping路径
                .allowedOriginPatterns("*") // 所有域 spring-boot 2.4.0及以下使用.allowedOrigins("*")
                .allowedMethods("POST","GET","PUT","DELETE","OPTIONS") // 请求方式
                .allowedHeaders("*") // 所有方法头
                .maxAge(168000) // 等待间隔时间(时间过了则需再次认证)
                .allowCredentials(true); // cookie
    }
}
