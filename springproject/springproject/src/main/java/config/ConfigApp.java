package main.java.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"src.main.java.controller", "src.main.java.dao", "src.main.java.service"})
public class ConfigApp {

}
