package com.user.demo.Services;

import com.user.demo.Entities.User;
import com.user.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserEventPublisher userEventPublisher;

    @Autowired
    private UserRepository userRepository;

    public User getUserById(long userId){
        return userRepository.findById(userId).get();
    }

    public User addNewUser(User newUser){
        userRepository.save(newUser);
        userEventPublisher.publishUserEvent(newUser);
        return newUser;
    }
}
