package com.trabean.payment;

import com.trabean.payment.interceptor.UserHeaderInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private UserHeaderInterceptor userHeaderInterceptor;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000, https://j11a604.p.ssafy.io")  // 프론트엔드 도메인
                .allowedMethods("*")  // 모든 HTTP 메서드 허용
                .allowedHeaders("*")
                .allowCredentials(true);  // 쿠키 등 자격 증명 허용
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userHeaderInterceptor).addPathPatterns("/**");
    }
}
