package com.whh.ssm.service;

import com.whh.ssm.model.User;

import java.util.List;


public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
