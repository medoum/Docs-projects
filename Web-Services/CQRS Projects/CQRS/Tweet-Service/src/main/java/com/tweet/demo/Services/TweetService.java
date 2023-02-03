package com.tweet.demo.Services;

import com.tweet.demo.Entities.Tweet;
import com.tweet.demo.Repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private TweetEventPublisher tweetEventPublisher;

    public Tweet getTweetById(long tweetId){
        return tweetRepository.findById(tweetId).get();
    }

    public Tweet addNewTweet(Tweet newTweet){

        tweetRepository.save(newTweet);
        tweetEventPublisher.publishTweetEvent(newTweet);
        return newTweet;
    }
}
