package service;


import config.ConfigApp;
import controller.TaskController;
import controller.UserController;
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
        TaskController taskController = context.getBean(TaskController.class);

        User testUser = User.builder().userId((long) 1)
                .name("James")
                .surname("Bond")
                .email("bond@aol.com")
                .passowrd("333").build();

        userController.signUp(testUser);
        userController.signIn(testUser);

//        House bean = context.getBean(House.class);
//        bean.method();
    }


    //For spring convert top JSON

    protected void configMessageConvert(List<HttpMessageConverter<?>> converters){
        converters.add(new MappingJackson2HttpMessageConverter());
    }

}


