package controller;

import Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/insert",method = {RequestMethod.POST,RequestMethod.GET})
    public void insert(){
        User user = new User();
        userService.insert(user);
        System.out.printf("hello world");
    }
}
