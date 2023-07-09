package com.yuanye.beans;

import org.springframework.stereotype.Component;

/**
 * @author Kiteye
 * @date 2023/7/8
 * @Description
 */

@Component
public class UserComponent {
    public void sayHi() {
        System.out.println("hi,UserComponent");
    }
}
