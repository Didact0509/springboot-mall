package com.didact.springbootmall.dao;

import com.didact.springbootmall.dto.UserRegisterRequest;
import com.didact.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
