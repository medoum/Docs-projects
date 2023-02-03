package com.example.grpc_demo2.client;


import com.example.grpc_demo2.entities.Greeting;
import com.example.grpc_demo2.entities.HelloWorldServiceGrpcGrpc;
import com.example.grpc_demo2.entities.Person;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorldClient {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloWorldClient.class);

    /*
     * Declare a blocking (Synchronous) stub.
     * */
    private HelloWorldServiceGrpcGrpc.HelloWorldServiceGrpcBlockingStub HelloWorldServiceGrpcBlockingStub;

    /*
     * Build a MessageChannel with @PostConstruct annotation ad init() method
     * */
    @PostConstruct
    private void init() {

        /*
         * Initialize the MessageChannel and relate it to the gRPC server running on port 6565.
         * */
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build();

        /*
         * Relate the MessageChannel to the client gRPC stub.
         * */
        HelloWorldServiceGrpcBlockingStub =
                HelloWorldServiceGrpcGrpc.newBlockingStub(managedChannel);
    }

    /*
     * sayHello(firstName, lastName) client implementation.
     * */
    public String sayHello(String firstName, String lastName) {

        /*
         * Create a person using the builder pattern and set its attributes.
         * */
        Person person = Person.newBuilder().setFirstName(firstName)
                .setLastName(lastName).build();
        LOGGER.info("client sending {}", person);

        /*
         * Send gRPC resuest using the stub to the server in order to execute the server side sayHello(firstName, lastName) method.
         * The execution returns a Greeting response.
         * */
        Greeting greeting =
                HelloWorldServiceGrpcBlockingStub.sayHello(person);
        LOGGER.info("client received {}", greeting);

        return greeting.getMessage();
    }


}
