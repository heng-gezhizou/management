package com.greenism.management.controller;

import com.greenism.management.constants.Constants;
import com.greenism.management.entity.User;
import com.greenism.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:UserController
 * Package:com.greenism.management.controller
 * Description
 *
 * @data:2019/12/22 20:40
 * @author:jiahongjie
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody() User user ){

        userService.addUser(user);
        return Constants.SUCCESS;
    }

}
