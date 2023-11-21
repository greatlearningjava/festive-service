package com.greatlearning.microservice.config;

import com.googlecode.protobuf.format.JsonFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        converters.add(new ProtobufHttpMessageConverter());
    }

    @Bean
    public HttpMessageConverter ProtobufHttpMessageConverter(){
        return new ProtobufHttpMessageConverter();
    }
}
