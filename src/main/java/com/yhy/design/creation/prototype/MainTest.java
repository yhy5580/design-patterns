package com.yhy.design.creation.prototype;


import com.yhy.design.creation.prototype.service.impl.UserService;
import com.yhy.design.creation.prototype.service.impl.UserServiceImpl;

/**
 * 用于创建重复的对象，同时又保证性能
 */
public class MainTest {

    public static void main(String[] args) throws Exception {
        UserService userService = new UserServiceImpl();
        User user1 = userService.getUser("张三");
        //此处修改电话号，但是要求后续获取的用户电话号不变
        user1.setTelNum("11111111111");
        System.out.println("user1-->" + user1);

        User user2 = userService.getUser("张三");
        user2.setTelNum("22222222222");
        System.out.println("user2-->" + user2);

        User user3 = userService.getUser("张三");
        user3.setTelNum("333333333333");
        System.out.println("user3-->" + user3);

        User user4 = userService.getUser("张三");
        System.out.println("user4-->" + user4);

        User cloneUser4 = user4.clone();
        System.out.println("cloneUser4-->" + cloneUser4);

    }
}
