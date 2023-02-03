package com.like.demo.Config;

import com.dtos.demo.Events.LikeEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.function.Supplier;

@Configuration
public class LikePublisherKafkaConfig {

    @Bean
    public Sinks.Many<LikeEvent> likeSinks(){
        return Sinks.many().multicast().onBackpressureBuffer();
    }

    @Bean
    public Supplier<Flux<LikeEvent>> likeSupplier(Sinks.Many<LikeEvent> sinks){
        return sinks::asFlux;
    }
}
