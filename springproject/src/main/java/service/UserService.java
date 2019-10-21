package service;

import model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Component
public interface UserService {
    boolean signUp(User user);
    Optional<Long> signIn(User user);

}
