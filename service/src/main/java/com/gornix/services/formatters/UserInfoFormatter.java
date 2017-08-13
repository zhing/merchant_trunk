package com.gornix.services.formatters;

import com.gornix.model.db.User;
import com.gornix.model.pojo.UserInfo;

public class UserInfoFormatter {

    public static UserInfo formatUserInfo(User user) {
        return new UserInfo.Builder()
                .withId(user.getId())
                .withName(user.getName())
                .withAge(user.getAge())
                .build();
    }
}
