package com.dtos.demo.Events;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class LikeEvent {

    private final UUID id;
    private final Long likeId;
    private final Long userId;
}
