package com.grpc.demo.server;

import com.grpc.demo.entities.HelloWorldServiceGrpc;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class HelloWorldServiceImpl extends HelloWorldServiceGrpc {


    @Override
    public void sayHello() {

    }

}
