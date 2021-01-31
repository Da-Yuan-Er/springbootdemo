package com.offcn.springbootdemo.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(//作用是引用配置文件中的前缀
        prefix = "com.offcn"
)
@ToString
public class CompanyProperties {
    int age  = 20;
    String address = "牛栏山基地";
    String code = "10098762";
}
