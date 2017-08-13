package com.gornix.web.controllers;

import com.gornix.model.pojo.UserInfo;
import com.gornix.services.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoSerivce;

    @RequestMapping(value = "/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<UserInfo> fetchUserByName(@PathVariable("userName") String name) {
        return userInfoSerivce.fetchUserInfoByName(name);
    }

}
