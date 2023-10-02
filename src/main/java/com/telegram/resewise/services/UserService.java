package com.telegram.resewise.services;

import com.telegram.resewise.domain.Service;
import com.telegram.resewise.domain.User;
import com.telegram.resewise.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
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
    public Set<Service> findServicesById(Long id) {
        User user = userRepository.findById(id).orElse(new User());

        return user.getServices();
    }
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(new User());
    }
}
