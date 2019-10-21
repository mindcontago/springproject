package service;

import Repository.UserRepositoryImpl;
import lombok.RequiredArgsConstructor;
import model.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepositoryImpl userRepositoryImpl;

    @Override
    public boolean signUp(User user) {
        if (userRepositoryImpl.isExist(user)) {
            return false;
        } else {
            userRepositoryImpl.createUser(user);
            return true;
        }
    }

    @Override
    public Optional<Long> signIn(User user) {

        return userRepositoryImpl.findUserIdByEmailAndPassword(user.getEmail(), user.getPassword());
    }
}
