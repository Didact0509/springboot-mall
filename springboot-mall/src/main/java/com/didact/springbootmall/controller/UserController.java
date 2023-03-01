package com.didact.springbootmall.controller;

import com.didact.springbootmall.dto.UserLoginRequest;
import com.didact.springbootmall.dto.UserRegisterRequest;
import com.didact.springbootmall.model.User;
import com.didact.springbootmall.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "測試 UserController", description = "User REST API")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "註冊帳號")
    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @Operation(description = "登入帳號")
    @PostMapping("/users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
        User user = userService.login(userLoginRequest);

        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
