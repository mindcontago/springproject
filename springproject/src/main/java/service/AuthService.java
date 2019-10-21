package service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private Long userId;

    public Long getUserId() {
        if (userId == null) {
            System.out.println("No such user.");
        }
        return userId;
    }

    public void checkAuth() {
        getUserId();
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
