package com.qiufeng.demoservice.controller;

import com.qiufeng.demoservice.dao.UserDao;
import com.qiufeng.demoservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<User> test() {
        return userDao.selectAll();
    }
}
