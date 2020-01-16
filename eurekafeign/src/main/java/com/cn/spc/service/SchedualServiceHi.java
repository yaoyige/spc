package com.cn.spc.service;

import com.cn.spc.common.User;
import com.cn.spc.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: yyg
 * @Date: 2020/1/8 13:54
 * @Description: FeignClient是熔断器,如果service-hi服务正常则访问改服务
 *               如果服务异常则访问 SchedualServiceHiHystric类,返回
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
//value: 指定访问的服务,fallback: 访问服务失败直接返回错误
public interface SchedualServiceHi {

    /**
     *  feign 本身也是基于http请求的客户端，在接受参数的时候
     * 需要用@RequestParam注解来指明接受的具体参数
     * 如果是单个参数可以使用@RequestParam 和 @RequestBody
     * 如果是多个参数 必须使用 @RequestParam
     * 如果是对象则使用 @RequestBody
     * @param
     * @return:
     * @date: 2020/1/10 11:29
     */
    //路径 value = "/hi" 一致就可以调用服务对应的方法
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/yyg",method = RequestMethod.GET)
    String sayTestFromClientOne(@RequestParam(value = "name") String name);

    @PostMapping(value = "/user")
    String UserTest(@RequestBody User user);

    @RequestMapping(value = "/twoParam",method = RequestMethod.GET)
    String sayTestFromClientOneAndTwoParam(@RequestParam(value = "name") String name,@RequestParam(value = "id") String id);
}
