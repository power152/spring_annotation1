package com.yuanye.beans;

import org.springframework.context.annotation.Configuration;

/**
 * @author Kiteye
 * @date 2023/7/8
 * @Description
 */

@Configuration
public class UserConfiguration {
    public void sayHi() {
        System.out.println("hi,UserConfiguration");
    }
}
