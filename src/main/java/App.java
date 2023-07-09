import com.yuanye.beans.*;
import com.yuanye.model.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kiteye
 * @date 2023/7/8
 * @Description
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-config.xml");
//        UserController userController = applicationContext.getBean("userController", UserController.class);
//        userController.sayHi();
//
//        UserService userService = applicationContext.getBean("userService",UserService.class);
//        userService.sayhi();
//
//        UserRepository userRepository = applicationContext.getBean("userRepository",UserRepository.class);
//        userRepository.sayhi();
//
//        UserComponent userComponent = applicationContext.getBean("userComponent",UserComponent.class);
//        userComponent.sayHi();
//
//        UserConfiguration userConfiguration = applicationContext.getBean("userConfiguration",UserConfiguration.class);
//        userConfiguration.sayHi();

        UserInfo userInfo = applicationContext.getBean("UserFo",UserInfo.class);
        System.out.println(userInfo);
    }
}
