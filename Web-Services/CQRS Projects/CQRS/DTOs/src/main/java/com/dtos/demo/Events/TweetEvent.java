package com.dtos.demo.Events;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class TweetEvent {

    private final UUID id;
    private final Long tweetId;
    private final Long userId;

}
