package com.endava.service;

import com.endava.dao.UserDao;
import com.endava.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    public boolean isValidUser(String login, String password) {
        List<User> listUser = userDao.getUsers();

        for (User user : listUser) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /*public String getPassword(int id) {
        return userDao.getPassword(id);
    }*/
}
