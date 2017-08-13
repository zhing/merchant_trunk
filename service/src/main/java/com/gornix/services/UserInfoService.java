package com.gornix.services;

import com.gornix.services.formatters.UserInfoFormatter;
import com.gornix.model.pojo.UserInfo;
import com.gornix.model.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserInfoService {

    @Autowired
    private UserRepository userRepository;

    public List<UserInfo> fetchUserInfoByName(String userName) {
        return userRepository.findUsersByUsername(userName)
                .stream().map(UserInfoFormatter::formatUserInfo).collect(Collectors.toList());
    }
}
