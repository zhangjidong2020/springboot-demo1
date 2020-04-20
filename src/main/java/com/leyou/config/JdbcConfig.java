package com.leyou.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration//配置类
//@PropertySource("classpath:application.properties")
public class JdbcConfig {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;//com.mysql.jdbc.Driver

    @Value("${jdbc.url}")
    private String url;//jdbc:mysql://localhost:3306/day01

    @Value("${jdbc.username}")
    private String username;//root

    @Value("${jdbc.password}")
    private String password;//123456


//    <!-- 配置连接池 -->
//<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource"
//    init-method="init" destroy-method="close">
//    <property name="url" value="${jdbc.url}" />
//    <property name="username" value="${jdbc.username}" />
//    <property name="password" value="${jdbc.password}" />
//</bean>

    //@Bean
    public DataSource dataSource(){
        //创建数据源 连接池
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return  druidDataSource;

    }


}
