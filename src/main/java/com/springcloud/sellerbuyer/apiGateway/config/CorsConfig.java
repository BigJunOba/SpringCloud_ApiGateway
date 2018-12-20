//package com.springcloud.sellerbuyer.apiGateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//import java.util.Arrays;
//
///**
// * @program: api-gateway
// * @description: 跨域配置
// * @author: JunOba
// * @create: 2018-12-20 11:04
// * C - Cross  O - Origin  R - Resource  S - Sharing
// */
//@Component
//public class CorsConfig {
//
//    @Bean
//    public CorsFilter corsFilter() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(Arrays.asList("*"));
//        config.setAllowedHeaders(Arrays.asList("*"));
//        config.setAllowedMethods(Arrays.asList("*"));
//        config.setMaxAge(300l);
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
//}
