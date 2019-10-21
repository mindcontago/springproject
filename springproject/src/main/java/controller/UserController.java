package controller;

import lombok.RequiredArgsConstructor;
import model.User;
import org.springframework.stereotype.Component;
import service.AuthService;
import service.UserService;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final AuthService authService;

    public boolean signUp(User user) {
        return userService.signUp(user);
    }

    public Optional<Long> signIn(User user) {
        return userService.signIn(user);
    }
}
