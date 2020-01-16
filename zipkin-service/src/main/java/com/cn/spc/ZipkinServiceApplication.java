package com.cn.spc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer  //开启链路追踪
public class ZipkinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceApplication.class, args);
        System.out.println("ZipkinServiceApplication 启动成功。。。");
    }

}
