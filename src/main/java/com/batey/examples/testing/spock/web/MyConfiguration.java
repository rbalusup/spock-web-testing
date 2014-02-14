package com.batey.examples.testing.spock.web;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        return new TomcatEmbeddedServletContainerFactory(8080);
    }

}
