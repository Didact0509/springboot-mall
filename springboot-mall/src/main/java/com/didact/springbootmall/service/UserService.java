package com.didact.springbootmall.service;

import com.didact.springbootmall.dto.UserLoginRequest;
import com.didact.springbootmall.dto.UserRegisterRequest;
import com.didact.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
