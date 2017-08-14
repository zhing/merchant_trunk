package com.gornix.services.formatters;

import com.gornix.model.db.User;
import com.gornix.model.pojo.GenericBuilder;
import com.gornix.model.pojo.UserInfo;

public class UserInfoFormatter {

    public static UserInfo formatUserInfo(User user) {
        return GenericBuilder.of(UserInfo::new)
                .with(UserInfo::setId, user.getId())
                .with(UserInfo::setName, user.getName())
                .with(UserInfo::setAge, user.getAge())
                .build();
    }
}
