package com.tweet.demo.Repository;

import com.tweet.demo.Entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
