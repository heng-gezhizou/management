package com.greenism.management.service.impl;

import com.greenism.management.dao.UserDao;
import com.greenism.management.entity.User;
import com.greenism.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.greenism.management.service.impl
 * Description
 *
 * @data:2019/12/22 20:41
 * @author:jiahongjie
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) {

        userDao.insertUser(user);

    }
}
