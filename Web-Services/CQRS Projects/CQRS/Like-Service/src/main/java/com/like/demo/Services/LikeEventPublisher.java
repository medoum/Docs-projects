package com.like.demo.Services;

import com.dtos.demo.Events.LikeEvent;
import com.dtos.demo.Events.UserEvent;
import com.like.demo.Entities.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.UUID;

@Service
public class LikeEventPublisher {

    @Autowired
    private Sinks.Many<LikeEvent> likeSinks;

    public void publishLikeEvent(Like newLike){

        LikeEvent likeEvent = new LikeEvent(
                UUID.randomUUID(),
                newLike.getLikeId(),
                newLike.getUserId()
        );
        likeSinks.tryEmitNext(likeEvent);
    }
}