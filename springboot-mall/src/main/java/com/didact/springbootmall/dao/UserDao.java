package com.didact.springbootmall.dao;

import com.didact.springbootmall.dto.UserRegisterRequest;
import com.didact.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
