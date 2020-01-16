package com.cn.spc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient1Application {
    public static void main(String[] args){
        SpringApplication.run(EurekaClient1Application.class,args);
        System.out.println("EurekaServerApplication 启动成功。。。");
    }


    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }


    @RequestMapping("/yyg")
    public String test(@RequestParam String name) {
        return "yyg "+name+",i am from port:" +port;
    }

    @RequestMapping(value = "/twoParam")
    public String sayTestFromClientOneAndTwoParam(@RequestParam(value = "name") String name,@RequestParam(value = "id") String id){
        return "yyg "+name+","+id+",i am from port:" +port;
    }

}
