package com.yfs.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:sss.properties")
public class Util {
    //这里面包括配置文件中的变量，启动项变量和主机系统变量，比如JAVA_HOME
    @Autowired
    Environment environment;
    //lazyload 对autowired的影响
    //泛型注入的时候不支持resource  只支持autowired



}
