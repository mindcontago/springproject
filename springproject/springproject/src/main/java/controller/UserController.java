package main.java.controller;

import lombok.RequiredArgsConstructor;
import main.java.service.AuthService;
import model.User;
import org.springframework.stereotype.Component;
import service.UserService;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final AuthService authService;

    public UserController(UserService userService, AuthService authService) {
        this.userService = userService;
        this.authService = authService;
    }

    public boolean signUp(User user) {
        return userService.signUp(user);
    }

    public boolean signIn(User user) {
        Optional<Long> optionalUserId = userService.signIn(user);
        optionalUserId.ifPresent(authService::setUserId);
        return optionalUserId.isPresent();
    }
}
