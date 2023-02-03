package com.tweet.demo.Services;

import com.dtos.demo.Events.TweetEvent;
import com.dtos.demo.Events.UserEvent;
import com.tweet.demo.Entities.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.UUID;

@Service
public class TweetEventPublisher {

    @Autowired
    private Sinks.Many<TweetEvent> tweetSinks;

    public void publishTweetEvent(Tweet newTweet){

        TweetEvent tweetEvent = new TweetEvent(
                UUID.randomUUID(),
                newTweet.getTweetId(),
                newTweet.getUserId()
        );
        tweetSinks.tryEmitNext(tweetEvent);
    }
}