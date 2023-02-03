package com.userinfo.demo.Config;

import com.dtos.demo.Events.FollowEvent;
import com.dtos.demo.Events.LikeEvent;
import com.dtos.demo.Events.TweetEvent;
import com.dtos.demo.Events.UserEvent;
import com.userinfo.demo.Services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventsConsumerConfig {

    @Autowired
    private UserInfoService userInfoService;

    @Bean
    public Consumer<UserEvent> userEventConsumer(){
        return (userEvent) -> userInfoService.updateUserData(userEvent);
    }

    @Bean
    public Consumer<FollowEvent> followEventConsumer(){
        return (followEvent) -> userInfoService.updateFollowForUser(followEvent);
    }

    @Bean
    public Consumer<TweetEvent> tweetEventConsumer(){
        return (tweetEvent) -> userInfoService.updateTweetForUser(tweetEvent);
    }

    @Bean
    public Consumer<LikeEvent> likeEventConsumer(){
        return (likeEvent) -> userInfoService.updateLikeForUser(likeEvent);
    }

}
