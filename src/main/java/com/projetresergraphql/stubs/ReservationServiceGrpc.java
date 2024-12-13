package com.projetresergraphql.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@jakarta.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetAllReservationsRequest,
      com.projetresergraphql.stubs.GetAllReservationsResponse> getAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllReservations",
      requestType = com.projetresergraphql.stubs.GetAllReservationsRequest.class,
      responseType = com.projetresergraphql.stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetAllReservationsRequest,
      com.projetresergraphql.stubs.GetAllReservationsResponse> getAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetAllReservationsRequest, com.projetresergraphql.stubs.GetAllReservationsResponse> getAllReservationsMethod;
    if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
          ReservationServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.GetAllReservationsRequest, com.projetresergraphql.stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.SaveReservationRequest,
      com.projetresergraphql.stubs.SaveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveReservation",
      requestType = com.projetresergraphql.stubs.SaveReservationRequest.class,
      responseType = com.projetresergraphql.stubs.SaveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.SaveReservationRequest,
      com.projetresergraphql.stubs.SaveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.SaveReservationRequest, com.projetresergraphql.stubs.SaveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
          ReservationServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.SaveReservationRequest, com.projetresergraphql.stubs.SaveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "SaveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.SaveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.SaveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("SaveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationByIdRequest,
      com.projetresergraphql.stubs.GetReservationByIdResponse> getReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReservationById",
      requestType = com.projetresergraphql.stubs.GetReservationByIdRequest.class,
      responseType = com.projetresergraphql.stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationByIdRequest,
      com.projetresergraphql.stubs.GetReservationByIdResponse> getReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationByIdRequest, com.projetresergraphql.stubs.GetReservationByIdResponse> getReservationByIdMethod;
    if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
          ReservationServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.GetReservationByIdRequest, com.projetresergraphql.stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "ReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ReservationById"))
                  .build();
          }
        }
     }
     return getReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.DeleteReservationRequest,
      com.projetresergraphql.stubs.DeleteReservationResponse> getDeleteReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservationById",
      requestType = com.projetresergraphql.stubs.DeleteReservationRequest.class,
      responseType = com.projetresergraphql.stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.DeleteReservationRequest,
      com.projetresergraphql.stubs.DeleteReservationResponse> getDeleteReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.DeleteReservationRequest, com.projetresergraphql.stubs.DeleteReservationResponse> getDeleteReservationByIdMethod;
    if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationByIdMethod = ReservationServiceGrpc.getDeleteReservationByIdMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationByIdMethod = getDeleteReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.DeleteReservationRequest, com.projetresergraphql.stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservationById"))
                  .build();
          }
        }
     }
     return getDeleteReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationsByClientRequest,
      com.projetresergraphql.stubs.GetReservationsByClientResponse> getReservationsByClientIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReservationsByClientId",
      requestType = com.projetresergraphql.stubs.GetReservationsByClientRequest.class,
      responseType = com.projetresergraphql.stubs.GetReservationsByClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationsByClientRequest,
      com.projetresergraphql.stubs.GetReservationsByClientResponse> getReservationsByClientIdMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.GetReservationsByClientRequest, com.projetresergraphql.stubs.GetReservationsByClientResponse> getReservationsByClientIdMethod;
    if ((getReservationsByClientIdMethod = ReservationServiceGrpc.getReservationsByClientIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReservationsByClientIdMethod = ReservationServiceGrpc.getReservationsByClientIdMethod) == null) {
          ReservationServiceGrpc.getReservationsByClientIdMethod = getReservationsByClientIdMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.GetReservationsByClientRequest, com.projetresergraphql.stubs.GetReservationsByClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "ReservationsByClientId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetReservationsByClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.GetReservationsByClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ReservationsByClientId"))
                  .build();
          }
        }
     }
     return getReservationsByClientIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.projetresergraphql.stubs.UpdateReservationRequest,
      com.projetresergraphql.stubs.UpdateReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.projetresergraphql.stubs.UpdateReservationRequest.class,
      responseType = com.projetresergraphql.stubs.UpdateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.projetresergraphql.stubs.UpdateReservationRequest,
      com.projetresergraphql.stubs.UpdateReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.projetresergraphql.stubs.UpdateReservationRequest, com.projetresergraphql.stubs.UpdateReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<com.projetresergraphql.stubs.UpdateReservationRequest, com.projetresergraphql.stubs.UpdateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.projetresergraphql.stubs.UpdateReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void allReservations(com.projetresergraphql.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Créer une nouvelle réservation
     * </pre>
     */
    public void saveReservation(com.projetresergraphql.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.SaveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void reservationById(com.projetresergraphql.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public void deleteReservationById(com.projetresergraphql.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Récupérer les réservations par ID de client
     * </pre>
     */
    public void reservationsByClientId(com.projetresergraphql.stubs.GetReservationsByClientRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationsByClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationsByClientIdMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(com.projetresergraphql.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.UpdateReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.GetAllReservationsRequest,
                com.projetresergraphql.stubs.GetAllReservationsResponse>(
                  this, METHODID_ALL_RESERVATIONS)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.SaveReservationRequest,
                com.projetresergraphql.stubs.SaveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.GetReservationByIdRequest,
                com.projetresergraphql.stubs.GetReservationByIdResponse>(
                  this, METHODID_RESERVATION_BY_ID)))
          .addMethod(
            getDeleteReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.DeleteReservationRequest,
                com.projetresergraphql.stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION_BY_ID)))
          .addMethod(
            getReservationsByClientIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.GetReservationsByClientRequest,
                com.projetresergraphql.stubs.GetReservationsByClientResponse>(
                  this, METHODID_RESERVATIONS_BY_CLIENT_ID)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.projetresergraphql.stubs.UpdateReservationRequest,
                com.projetresergraphql.stubs.UpdateReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public void allReservations(com.projetresergraphql.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Créer une nouvelle réservation
     * </pre>
     */
    public void saveReservation(com.projetresergraphql.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.SaveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public void reservationById(com.projetresergraphql.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public void deleteReservationById(com.projetresergraphql.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Récupérer les réservations par ID de client
     * </pre>
     */
    public void reservationsByClientId(com.projetresergraphql.stubs.GetReservationsByClientRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationsByClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationsByClientIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(com.projetresergraphql.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.UpdateReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public com.projetresergraphql.stubs.GetAllReservationsResponse allReservations(com.projetresergraphql.stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Créer une nouvelle réservation
     * </pre>
     */
    public com.projetresergraphql.stubs.SaveReservationResponse saveReservation(com.projetresergraphql.stubs.SaveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public com.projetresergraphql.stubs.GetReservationByIdResponse reservationById(com.projetresergraphql.stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public com.projetresergraphql.stubs.DeleteReservationResponse deleteReservationById(com.projetresergraphql.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Récupérer les réservations par ID de client
     * </pre>
     */
    public com.projetresergraphql.stubs.GetReservationsByClientResponse reservationsByClientId(com.projetresergraphql.stubs.GetReservationsByClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationsByClientIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.projetresergraphql.stubs.UpdateReservationResponse updateReservation(com.projetresergraphql.stubs.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Récupérer toutes les réservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.GetAllReservationsResponse> allReservations(
        com.projetresergraphql.stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Créer une nouvelle réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.SaveReservationResponse> saveReservation(
        com.projetresergraphql.stubs.SaveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.GetReservationByIdResponse> reservationById(
        com.projetresergraphql.stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supprimer une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.DeleteReservationResponse> deleteReservationById(
        com.projetresergraphql.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Récupérer les réservations par ID de client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.GetReservationsByClientResponse> reservationsByClientId(
        com.projetresergraphql.stubs.GetReservationsByClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationsByClientIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.projetresergraphql.stubs.UpdateReservationResponse> updateReservation(
        com.projetresergraphql.stubs.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_RESERVATIONS = 0;
  private static final int METHODID_SAVE_RESERVATION = 1;
  private static final int METHODID_RESERVATION_BY_ID = 2;
  private static final int METHODID_DELETE_RESERVATION_BY_ID = 3;
  private static final int METHODID_RESERVATIONS_BY_CLIENT_ID = 4;
  private static final int METHODID_UPDATE_RESERVATION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_RESERVATIONS:
          serviceImpl.allReservations((com.projetresergraphql.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.projetresergraphql.stubs.SaveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.SaveReservationResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((com.projetresergraphql.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION_BY_ID:
          serviceImpl.deleteReservationById((com.projetresergraphql.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.DeleteReservationResponse>) responseObserver);
          break;
        case METHODID_RESERVATIONS_BY_CLIENT_ID:
          serviceImpl.reservationsByClientId((com.projetresergraphql.stubs.GetReservationsByClientRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.GetReservationsByClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.projetresergraphql.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.projetresergraphql.stubs.UpdateReservationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.projetresergraphql.stubs.ReservationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getAllReservationsMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getDeleteReservationByIdMethod())
              .addMethod(getReservationsByClientIdMethod())
              .addMethod(getUpdateReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
