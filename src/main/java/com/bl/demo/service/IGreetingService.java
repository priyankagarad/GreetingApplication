package com.bl.demo.service;
import com.bl.demo.model.User;

import java.util.List;

public interface IGreetingService {
    User addUser(User user);
    List<User> getAllUser();


}
