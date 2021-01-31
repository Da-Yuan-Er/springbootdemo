package com.offcn.springbootdemo.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "course")

@Configuration
@PropertySource(value = "myapplication.properties")
public class CourseProperties {
    String type="研究生";
    String time="10d";
    String price="5.6W";
}
