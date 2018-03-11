package com.yfs.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件加载类
 * locations是要加载的文件的路径，不填是主程序的application.properties,填写的话会在主程序下面找aaa.properties，如果找不到会在下面的starter下面找
 * prefix是参数的前缀,比如配置文件中是com.yfs.name=洋富帅，com.yfs.pwd=123,则加载完后该类的name和pwd已经赋值
 * ignoreInvalidFields如果为true，则该类下声明的属性都要匹配到，否则抛异常
 * 赋值过程是在实例化以后进行的，执行完构造方法调用该类的的set方法，如果没写set方法则无法起作用
 */
@ConfigurationProperties(locations = "classpath:aaa.properties", prefix = "com.yfs", ignoreInvalidFields = false)
public class MyProperties {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
