package com.stepangusev.springApp;

import com.stepangusev.springApp.config.AppConfig;
import com.stepangusev.springApp.model.User;
import com.stepangusev.springApp.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//
//        User user1 = new User("Stepan", "Gusev", 29);
//        User user2 = new User("Ivan", "Fedorov", 31);
//        User user3 = new User("Elena", "Petrova", 20);
//
//        userService.save(user1);
//        userService.save(user2);
//        userService.save(user3);
//
//        System.out.println(userService.listAllUsers());
    }
}
