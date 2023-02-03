package com.user.demo.Services;

import com.dtos.demo.Events.UserEvent;
import com.user.demo.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.UUID;

@Service
public class UserEventPublisher {

    @Autowired
    private Sinks.Many<UserEvent> userSinks;

    public void publishUserEvent(User newUser){

        UserEvent userEvent = new UserEvent(
                UUID.randomUUID(),
                newUser.getUserId(),
                newUser.getUsername(),
                newUser.getFullname(),
                newUser.getAddress(),
                newUser.getDateOfBirth()
        );
        userSinks.tryEmitNext(userEvent);
    }
}