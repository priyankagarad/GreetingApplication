package com.bl.demo.service;
import com.bl.demo.model.User;

import java.util.List;

public interface IGreetingService {
    User addUser(User user);
    List<User> getAllUser();
    User updateUser(int id, User user);
    String deleteUser(int id);
}
