package com.example.demo123.service;

import com.example.demo123.dto.UserLoginRequest;
import com.example.demo123.dto.UserRegisterRequest;
import com.example.demo123.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
