package com.offcn.springbootdemo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.offcn.springbootdemo.properties.CompanyProperties;
import com.offcn.springbootdemo.properties.CourseProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jms.annotation.EnableJms;

//启动类
@SpringBootApplication
//放在启动类上，所有的contrller,service，都可以用
@EnableConfigurationProperties({CompanyProperties.class, CourseProperties.class})
//扫描dao层的接口
@MapperScan("com.offcn.springbootdemo.dao")
//dubbo的启动器
@EnableDubbo
@EnableJms
public class SpringbootdemoApplication {
/*springboot内置了Tomcat，启动该主函数即可*/
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
