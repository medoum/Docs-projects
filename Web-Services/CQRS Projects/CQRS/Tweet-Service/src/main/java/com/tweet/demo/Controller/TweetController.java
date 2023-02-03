package com.tweet.demo.Controller;

import com.tweet.demo.Entities.Tweet;
import com.tweet.demo.Services.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @GetMapping("/{tweetId}")
    public Tweet getTweetById(@PathVariable long tweetId){
        return tweetService.getTweetById(tweetId);
    }


    @PostMapping("/newTweet")
    public Tweet AddTweet(@RequestBody Tweet newTweet){
        return tweetService.addNewTweet(newTweet);
    }
}
