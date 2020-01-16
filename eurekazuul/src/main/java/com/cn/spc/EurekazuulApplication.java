package com.cn.spc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //开启路由网管,根据不同的访问路径映射到哪个服务上 ，在yml文件中配置
@EnableEurekaClient
@SpringBootApplication
public class EurekazuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekazuulApplication.class, args);
        System.out.println("EurekazuulApplication 启动成功。。。");
    }

}
