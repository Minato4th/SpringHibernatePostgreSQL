package com.endava.dao;

import com.endava.model.User;

import java.io.Serializable;
import java.util.List;

/**
 * 5/3/2017
 */
public interface UserDao extends Serializable{
    List<User> getUsers();
    //boolean isValidUser();
}
