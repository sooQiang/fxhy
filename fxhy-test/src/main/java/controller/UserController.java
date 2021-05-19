package controller;

import Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/insert",method = {RequestMethod.POST,RequestMethod.GET})
    public void insert(){

        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock lock = new ReentrantLock();

        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        readLock.lock();
        lock.lock();

        readWriteLock.isWriteLocked();


        readWriteLock.writeLock();

        User user = new User();
        userService.insert(user);
        System.out.printf("hello world");
    }
}
