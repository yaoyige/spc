package com.cn.spc.controller;

import com.cn.spc.common.User;
import com.cn.spc.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: yyg
 * @Date: 2020/1/8 13:56
 * @Description:  测试feign访问其他服务器参数传参
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/yyg",method = RequestMethod.GET)
    public String sayTest(@RequestParam String name){
        return schedualServiceHi.sayTestFromClientOne(name);
    }

    @PostMapping(value = "/user")
    public String UserTest(@RequestBody User user){
       return schedualServiceHi.UserTest(user);
    }

    //访问多个服务
    @GetMapping(value="/twoParam")
    public String sayTestFromClientOneAndTwoParam(@RequestParam(value = "name") String name,@RequestParam(value = "id") String id){
        String s = schedualServiceHi.sayHiFromClientOne(name);
        String s1 = schedualServiceHi.sayTestFromClientOneAndTwoParam(name, id);
        return s+s1;
    }

}
