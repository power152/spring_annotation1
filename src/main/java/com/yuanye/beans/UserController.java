package com.yuanye.beans;
/**
 * @author Kiteye
 * @date 2023/7/8
 * @Description
 */
import org.springframework.stereotype.Controller;

// Controller =<bean id="user" class="com.yuanye.beans.User"></bean>
// spring 在启动的时候就把当前的对象存储在了容器里面
@Controller
public class UserController {
    public void sayHi() {
        System.out.println("hi UserController");
    }
}
