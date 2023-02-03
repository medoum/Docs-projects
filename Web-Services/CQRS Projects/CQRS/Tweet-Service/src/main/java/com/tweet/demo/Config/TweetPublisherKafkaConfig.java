package com.tweet.demo.Config;

import com.dtos.demo.Events.TweetEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.function.Supplier;

@Configuration
public class TweetPublisherKafkaConfig {

    @Bean
    public Sinks.Many<TweetEvent> tweetSinks(){
        return Sinks.many().multicast().onBackpressureBuffer();
    }

    @Bean
    public Supplier<Flux<TweetEvent>> tweetSupplier(Sinks.Many<TweetEvent> sinks){
        return sinks::asFlux;
    }
}
