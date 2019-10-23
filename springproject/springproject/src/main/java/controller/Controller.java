package main.java.controller;

import org.springframework.stereotype.Component;

import javax.xml.ws.Service;

@org.springframework.stereotype.Controller
@Component
public class Controller {
    final Service service;

    public Controller(Service service) {
        this.service = service;
    }
}
