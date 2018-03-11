package com.yfs.boot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * spring boot启动加载的类，自己写自定义的starter的时候需要在spring.factories中指定该类，用法参考mybatis中的用法
 * Configuration和ComponentScan是spring的而不是boot的
 * EnableConfigurationProperties注解中直接简单的列出属性类来快捷的注册@ConfigurationProperties bean的定义
 * 当@EnableConfigurationProperties注解应用到你的@Configuration时，任何被@ConfigurationProperties注解的beans将自动被Environment属性配置
 * ConditionalOnClass只有SqlSessionFactory，SqlSessionFactoryBean在类路径上才可以被加载，ConditionalOnMissingBean 是不在类路径上才被加载
 */
@Configuration
@ConditionalOnClass({SqlSessionFactory.class, SqlSessionFactoryBean.class})
@ConditionalOnBean({DataSource.class})
@EnableConfigurationProperties({MyProperties.class})
@AutoConfigureAfter({DataSourceAutoConfiguration.class})
@ComponentScan("com.yfs")
public class MyConfiguration {
    //自动注入
    @Value("com.yfs.name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * spring生命周期
     * spring事件监听
     * spring  profile
     *
     * @Luckup
     *
     * @ImportResource("classpath:xxx.xml)
     *
     * @EnableWebMvc
     *
     *
     */
}
