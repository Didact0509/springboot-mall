package com.didact.springbootmall.service.Impl;

import com.didact.springbootmall.dao.UserDao;
import com.didact.springbootmall.dto.UserRegisterRequest;
import com.didact.springbootmall.model.User;
import com.didact.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
