package com.yuanye.beans;

/**
 * @author Kiteye
 * @date 2023/7/9
 * @Description
 */
import com.yuanye.model.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBeans {
    @Bean(name = {"User","UserFo"}) //@Bean("user")
    public UserInfo getUser() { // 方法名就是 bean name
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setName("鸢也");
        userInfo.setPassword("123456");
        return userInfo;
    }
}
