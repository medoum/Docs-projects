package com.user.demo.Config;

import com.dtos.demo.Events.UserEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.util.function.Supplier;

@Configuration
public class UserPublisherKafkaConfig {

    @Bean
    public Sinks.Many<UserEvent> userSinks(){
        return Sinks.many().multicast().onBackpressureBuffer();
    }

    @Bean
    public Supplier<Flux<UserEvent>> userSupplier(Sinks.Many<UserEvent> sinks){

        return sinks::asFlux;
    }
}
