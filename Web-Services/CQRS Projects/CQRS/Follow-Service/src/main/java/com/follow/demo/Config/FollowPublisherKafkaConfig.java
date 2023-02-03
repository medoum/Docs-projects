package com.follow.demo.Config;

import com.dtos.demo.Events.FollowEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.function.Supplier;

@Configuration
public class FollowPublisherKafkaConfig {

    @Bean
    public Sinks.Many<FollowEvent> followSinks(){
        return Sinks.many().multicast().onBackpressureBuffer();
    }

    @Bean
    public Supplier<Flux<FollowEvent>> followSupplier(Sinks.Many<FollowEvent> sinks){
        return sinks::asFlux;
    }
}
