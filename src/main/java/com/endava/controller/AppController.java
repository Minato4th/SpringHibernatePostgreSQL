package com.endava.controller;

import com.endava.model.User;
import com.endava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    private String message = "All Users";

    @RequestMapping(value="/index")
    public String home(Model model) {
        List<User> listUsers = userService.getUsers();
        model.addAttribute("userList", listUsers);
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String newRegistration(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveRegistration(@ModelAttribute("user") User user, Model model){

        if (userService.isValidUser(user.getLogin(), user.getPassword())){
            List<User> listUsers = new ArrayList<User>();
            listUsers.add(user);

            model.addAttribute("userList", listUsers);
            model.addAttribute("message", "Welcome");

            return "hello";
        } else {
            model.addAttribute("message", "Incorrect login or password");
            return "login";
        }
    }

}
