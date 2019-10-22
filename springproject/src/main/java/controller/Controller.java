package controller;

import org.springframework.stereotype.Component;

import javax.xml.ws.Service;

@Controller
@Component
public class Controller {
    final Service service;

    public Controller(Service service) {
        this.service = service;
    }
}
