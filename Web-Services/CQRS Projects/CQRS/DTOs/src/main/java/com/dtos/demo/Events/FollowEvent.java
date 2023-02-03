package com.dtos.demo.Events;

import lombok.Data;

import java.util.UUID;

@Data
public class FollowEvent {

    private final UUID id;
    private final Long followOpId;
    private final Long followerId;
}
