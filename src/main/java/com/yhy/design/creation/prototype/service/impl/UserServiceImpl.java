package com.yhy.design.creation.prototype.service.impl;

import com.yhy.design.creation.prototype.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private final Map<String, User> userCahceMap = new HashMap<>();

    @Override
    public User getUser(String userName) throws Exception {
        User user;
        if (userCahceMap.containsKey(userName)) {
            //从缓存中获取到原型，返回原型的克隆
            user = userCahceMap.get(userName).clone();
        } else {
            user = getUserByName(userName);
            //原型放入缓存
            userCahceMap.put(userName, user);
            //返回原型的克隆
            user = user.clone();
        }
        return user;
    }

    private static User getUserByName(String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setAge(20);
        user.setTelNum("12345678900");
        return user;
    }

}
