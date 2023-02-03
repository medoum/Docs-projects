package com.example.grpc_demo2.entities;

import io.grpc.Channel;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.11.0)",
        comments = "Source: HelloWorld.proto")
public final class HelloWorldServiceGrpcGrpc {

  private HelloWorldServiceGrpcGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc_demo2.entities.HelloWorldServiceGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getSayHelloMethod()} instead.
  public static final io.grpc.MethodDescriptor<com.example.grpc_demo2.entities.Person,
          com.example.grpc_demo2.entities.Greeting> METHOD_SAY_HELLO = getSayHelloMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.example.grpc_demo2.entities.Person,
          com.example.grpc_demo2.entities.Greeting> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.example.grpc_demo2.entities.Person,
          com.example.grpc_demo2.entities.Greeting> getSayHelloMethod() {
    return getSayHelloMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.example.grpc_demo2.entities.Person,
          com.example.grpc_demo2.entities.Greeting> getSayHelloMethodHelper() {
    io.grpc.MethodDescriptor<com.example.grpc_demo2.entities.Person, com.example.grpc_demo2.entities.Greeting> getSayHelloMethod;
    if ((getSayHelloMethod = HelloWorldServiceGrpcGrpc.getSayHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpcGrpc.class) {
        if ((getSayHelloMethod = HelloWorldServiceGrpcGrpc.getSayHelloMethod) == null) {
          HelloWorldServiceGrpcGrpc.getSayHelloMethod = getSayHelloMethod =
                  io.grpc.MethodDescriptor.<com.example.grpc_demo2.entities.Person, com.example.grpc_demo2.entities.Greeting>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(
                                  "com.example.grpc_demo2.entities.HelloWorldServiceGrpc", "sayHello"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.example.grpc_demo2.entities.Person.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.example.grpc_demo2.entities.Greeting.getDefaultInstance()))
                          .setSchemaDescriptor(new HelloWorldServiceGrpcMethodDescriptorSupplier("sayHello"))
                          .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceGrpcStub newStub(io.grpc.Channel channel) {
    return new HelloWorldServiceGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */



  public  static HelloWorldServiceGrpcGrpc.HelloWorldServiceGrpcBlockingStub newBlockingStub(
          Channel channel) {
    return new HelloWorldServiceGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceGrpcFutureStub newFutureStub(
          io.grpc.Channel channel) {
    return new HelloWorldServiceGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloWorldServiceGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.example.grpc_demo2.entities.Person request,
                         io.grpc.stub.StreamObserver<com.example.grpc_demo2.entities.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getSayHelloMethodHelper(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      com.example.grpc_demo2.entities.Person,
                                      com.example.grpc_demo2.entities.Greeting>(
                                      this, METHODID_SAY_HELLO)))
              .build();
    }
  }

  /**
   */
  public static final class HelloWorldServiceGrpcStub extends io.grpc.stub.AbstractStub<HelloWorldServiceGrpcStub> {
    private HelloWorldServiceGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceGrpcStub(io.grpc.Channel channel,
                                      io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloWorldServiceGrpcStub build(io.grpc.Channel channel,
                                              io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceGrpcStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.example.grpc_demo2.entities.Person request,
                         io.grpc.stub.StreamObserver<com.example.grpc_demo2.entities.Greeting> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloWorldServiceGrpcBlockingStub extends io.grpc.stub.AbstractStub<HelloWorldServiceGrpcBlockingStub> {
    private HelloWorldServiceGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceGrpcBlockingStub(io.grpc.Channel channel,
                                              io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloWorldServiceGrpcBlockingStub build(io.grpc.Channel channel,
                                                      io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc_demo2.entities.Greeting sayHello(com.example.grpc_demo2.entities.Person request) {
      return blockingUnaryCall(
              getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloWorldServiceGrpcFutureStub extends io.grpc.stub.AbstractStub<HelloWorldServiceGrpcFutureStub> {
    private HelloWorldServiceGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloWorldServiceGrpcFutureStub(io.grpc.Channel channel,
                                            io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloWorldServiceGrpcFutureStub build(io.grpc.Channel channel,
                                                    io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc_demo2.entities.Greeting> sayHello(
            com.example.grpc_demo2.entities.Person request) {
      return futureUnaryCall(
              getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldServiceGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldServiceGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.example.grpc_demo2.entities.Person) request,
                  (io.grpc.stub.StreamObserver<com.example.grpc_demo2.entities.Greeting>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloWorldServiceGrpcBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceGrpcBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc_demo2.entities.HelloWorld.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldServiceGrpc");
    }
  }

  private static final class HelloWorldServiceGrpcFileDescriptorSupplier
          extends HelloWorldServiceGrpcBaseDescriptorSupplier {
    HelloWorldServiceGrpcFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceGrpcMethodDescriptorSupplier
          extends HelloWorldServiceGrpcBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloWorldServiceGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new HelloWorldServiceGrpcFileDescriptorSupplier())
                  .addMethod(getSayHelloMethodHelper())
                  .build();
        }
      }
    }
    return result;
  }


}
