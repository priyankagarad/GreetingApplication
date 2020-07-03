package com.bl.demo.controller;
import com.bl.demo.model.User;
import com.bl.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    IGreetingService greetingService;

    @PostMapping ("/userinformation")
    public User addUser(@RequestBody User user) {
        return greetingService.addUser(user);
    }

    @GetMapping("/userinformation")
    public List<User> getAllUser() {
        return greetingService.getAllUser();
    }

    @PutMapping ("/userinformation")
    public User addUser(@RequestParam (value = "id") int id, @RequestBody User user) {
        return greetingAppService.updateUser(id, user);
    }

}
