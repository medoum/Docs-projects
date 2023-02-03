package com.grpc.demo.client;

import com.grpc.demo.entities.Greeting;
import com.grpc.demo.entities.Person;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Component
public class HelloWorldClient {

    private static final Logger LOGGER =
            (Logger) LoggerFactory.getLogger(HelloWorldClient.class);

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
        LOGGER.info("client sending {}");

        /*
         * Send gRPC resuest using the stub to the server in order to execute the server side sayHello(firstName, lastName) method.
         * The execution returns a Greeting response.
         * */
        Greeting greeting =
                HelloWorldServiceGrpcBlockingStub.sayHello(person);
        LOGGER.info("client received {}");

        return greeting.getMessage();
    }
}
