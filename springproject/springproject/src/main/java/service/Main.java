package main.java.service;


import main.java.config.ConfigApp;
import main.java.controller.UserController;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "src.main.java.service");
        context.register(ConfigApp.class);
        context.refresh();

        UserController userController = context.getBean(UserController.class);
//        TaskController taskController = context.getBean(TaskController.class);

        User testUser = new User(null, "111@mail.ru", "1111", "James"
        , "Bond");
        assert !userController.signUp(testUser);
        if (!userController.signIn(testUser)) throw new AssertionError();


//
//        userController.signUp(testUser);
//        userController.signIn(testUser);

//        System.out.println(userController.signIn(testUser));


//        House bean = context.getBean(House.class);
//        bean.method();
    }


    //For spring convert top JSON

    protected void configMessageConvert(List<HttpMessageConverter<?>> converters){
        converters.add(new MappingJackson2HttpMessageConverter());
    }

}


