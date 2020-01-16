package com.cn.spc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix //开启断路器
@EnableHystrixDashboard //开启 HystrixDashboard
public class EurekaribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaribbonApplication.class, args);
    }


    //@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
