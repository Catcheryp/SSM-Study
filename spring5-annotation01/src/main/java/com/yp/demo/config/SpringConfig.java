package com.yp.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.yp"})
public class SpringConfig {

}
