package com.cn.spc.service.impl;

import com.cn.spc.common.User;
import com.cn.spc.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Auther: yyg
 * @Date: 2020/1/8 14:23
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayTestFromClientOneAndTwoParam(String name, String id) {
        return "多个参数使用错误";
    }

    @Override
    public String sayHiFromClientOne(String name) {
        return name+ "sorry";
    }

    @Override
    public String sayTestFromClientOne(String name) {
        return name+"Test 错误";
    }

    @Override
    public String UserTest(User user) {
        return "获取用户失败"+user.getName();
    }
}
