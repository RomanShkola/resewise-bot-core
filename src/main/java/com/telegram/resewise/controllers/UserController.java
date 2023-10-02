package com.telegram.resewise.controllers;

import com.telegram.resewise.api.v1.model.UserInput;
import com.telegram.resewise.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @PostMapping({"", "/"})
    public Long createUser(@RequestBody UserInput userInput) {

        return userService.createUser(userInput.getTelegramId());
    }
}
