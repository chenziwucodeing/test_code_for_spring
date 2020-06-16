package com.chenzizi;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DTMApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DTMApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }

}
