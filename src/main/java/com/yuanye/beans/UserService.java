package com.yuanye.beans;
/**
 * @author Kiteye
 * @date 2023/7/8
 * @Description
 */


import org.springframework.stereotype.Service;

// @service = <bean id="UserService" class="com.yuanye.beans.UserService"></bean>
@Service
public class UserService {
    public void sayhi() {
        System.out.println("hi UserService");
    }
}
