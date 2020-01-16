package com.cn.spc;

import com.cn.spc.common.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: yyg
 * @Date: 2020/1/7 15:02
 * @Description:
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class,args);
        System.out.println("EurekaServerApplication 启动成功。。。");
    }


    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @PostMapping("/user")
    public String user(@RequestBody User user) {
        return "hi "+user.getName()+",i am from port:" +port;
    }

}
