package com.rakib.securitywithjwt.controller;

import com.rakib.securitywithjwt.dto.Response;
import com.rakib.securitywithjwt.dto.UserDto;
import com.rakib.securitywithjwt.services.UserService;
import com.rakib.securitywithjwt.util.UrlConstraint;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UrlConstraint.UserManagement.ROOT)
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Response saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }
}
