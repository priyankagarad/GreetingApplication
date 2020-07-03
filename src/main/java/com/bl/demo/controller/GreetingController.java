package com.bl.demo.controller;
import com.bl.demo.model.User;
import com.bl.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    IGreetingService greetingService;

    @PostMapping ("/user")
    public User addUser(@RequestBody User user) {
        return greetingService.addUser(user);
    }
}
