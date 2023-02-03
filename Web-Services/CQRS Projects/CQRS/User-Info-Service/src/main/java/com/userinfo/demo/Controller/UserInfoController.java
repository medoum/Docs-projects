package com.userinfo.demo.Controller;

import com.userinfo.demo.Entities.UserFullInfo;
import com.userinfo.demo.Services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/{userInfoId}")
    public UserFullInfo getUserInfoById(@PathVariable long userInfoId){
        return userInfoService.getUserInfoById(userInfoId);
    }
}
