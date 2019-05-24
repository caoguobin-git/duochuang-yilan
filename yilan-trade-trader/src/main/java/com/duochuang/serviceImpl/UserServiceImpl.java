/***********************************************
 * File Name: UserServiceImpl
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 05 2019 16:30
 ***********************************************/

package com.duochuang.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.duochuang.mapper.UserMapper;
import com.duochuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public String sayHello(String name) {
        return "Hello "+name+"!";
    }
}
