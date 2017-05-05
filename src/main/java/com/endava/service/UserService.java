package com.endava.service;


import com.endava.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    boolean isValidUser(String login, String password);
}
