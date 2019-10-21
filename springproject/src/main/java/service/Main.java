package service;


import config.ConfigApp;
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

//        House bean = context.getBean(House.class);
//        bean.method();
    }


    //For spring convert top JSON
    
    protected void configMessageConvert(List<HttpMessageConverter<?>> converters){
        converters.add(new MappingJackson2HttpMessageConverter());
    }

}


