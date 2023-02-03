package com.follow.demo.Services;

import com.dtos.demo.Events.FollowEvent;
import com.follow.demo.Entities.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.UUID;

@Service
public class FollowEventPublisher {

    @Autowired
    private Sinks.Many<FollowEvent> followSinks;

    public void publishFollowEvent(Follow newFollow){

        FollowEvent followEvent = new FollowEvent(
                UUID.randomUUID(),
                newFollow.getFollowOpId(),
                newFollow.getFollowerId()
        );
        followSinks.tryEmitNext(followEvent);
    }
}