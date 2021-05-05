package com.zy.web.utils;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.springframework.context.annotation.Bean;

public class ShiroConfigUtil {

    @Bean
    public static ShiroDialect utilGetShiroDialect(){
        return new ShiroDialect();
    }

}
