package Repository;

import model.User;

import java.util.Optional;

public interface UserRepository {
    boolean isExist(User user);
    void createUser(User user);
    Optional<Long> findUserIdByEmailAndPassword(String email, String password);
}
