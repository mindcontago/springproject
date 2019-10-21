package Repository;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Override
    public boolean isExist(User user) {
        return false;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public Optional<Long> findUserIdByEmailAndPassword(String email, String password) {
        return Optional.empty();
    }
}
