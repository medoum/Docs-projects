package com.example.grpc_demo2.server;

import com.example.grpc_demo2.entities.Greeting;
import com.example.grpc_demo2.entities.HelloWorldServiceGrpcGrpc;
import com.example.grpc_demo2.entities.Person;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GRpcService
public class HelloWorldServiceImpl extends HelloWorldServiceGrpcGrpc.HelloWorldServiceGrpcImplBase {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    /**
     * Override the sayHello() method and generate a Greeting response based on the first and last name.
     * Takes two parameters: a person and StreamObserver objects.
     */
    @Override
    public void sayHello(Person personn_request,
                         StreamObserver<Greeting> responseObserver) {

        LOGGER.info("server received {}", personn_request);

        String message = "Hello " + personn_request.getFirstName() + " "
                + personn_request.getLastName() + ". This is a response from the server";

        Greeting greeting =
                Greeting.newBuilder().setMessage(message).build();
        LOGGER.info("Server responded {}", greeting);

        /*
         * onNext() to return the result.
         * */
        responseObserver.onNext(greeting);

        /*
         * onCompleted() to tell gRpc we finished the returning.
         * */
        responseObserver.onCompleted();
    }

}
