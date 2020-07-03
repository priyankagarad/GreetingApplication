package com.bl.demo.service;
import com.bl.demo.model.User;
import com.bl.demo.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements IGreetingService{

    @Autowired
    IGreetingRepository greetingRepository;

    @Override
    public User addUser(User user) {
        return greetingRepository.save(user) ;
    }

    @Override
    public List<User> getAllUser() {
        return greetingRepository.findAll();
    }
}
