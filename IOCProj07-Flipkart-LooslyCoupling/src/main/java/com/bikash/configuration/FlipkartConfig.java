package com.bikash.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bikash")
/* @PropertySource("com/bikash/property/courier.properties") */
@ImportResource("com/bikash/commons/applicationContext.xml")
public class FlipkartConfig {
    
    }
