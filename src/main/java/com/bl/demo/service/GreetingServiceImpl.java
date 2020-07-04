package com.bl.demo.service;
import com.bl.demo.model.User;
import com.bl.demo.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static org.hibernate.type.DoubleType.ZERO;

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

    @Override
    public User updateUser(int id, User user) {
        User updateData=greetingRepository.findById(id).get();
        updateData.setFirstName(user.getFirstName());
        updateData.setLastName(user.getLastName());
        updateData.setUpdatedStamp(LocalDateTime.now());
        return greetingRepository.save(updateData);
    }
    
    @Override
    public String deleteUser(int id) {
        if (id != ZERO) {
            greetingRepository.deleteById(id);
            return "Deleted Successfully";
        }
        else{
            return null;
        }
    }
}
