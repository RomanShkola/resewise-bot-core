package com.telegram.resewise.controllers;

import com.telegram.resewise.api.v1.model.UserCreateDTO;
import com.telegram.resewise.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public Long createUser(@RequestBody UserCreateDTO userCreateDTO) {

        return userService.createUser(userCreateDTO.getTelegramId());
    }
}
