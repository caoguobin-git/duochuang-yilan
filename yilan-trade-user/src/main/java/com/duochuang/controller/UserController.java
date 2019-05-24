/***********************************************
 * File Name: UserController
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 24 05 2019 17:06
 ***********************************************/

package com.duochuang.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.duochuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
}
