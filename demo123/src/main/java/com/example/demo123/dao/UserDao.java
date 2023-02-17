package com.example.demo123.dao;

import com.example.demo123.dto.UserRegisterRequest;
import com.example.demo123.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
