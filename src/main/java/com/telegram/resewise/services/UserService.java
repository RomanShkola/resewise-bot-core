package com.telegram.resewise.services;

import com.telegram.resewise.domain.User;
import com.telegram.resewise.repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long createUser(String id) {
        User user = new User();
        user.setTelegramId(id);
        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }
}
