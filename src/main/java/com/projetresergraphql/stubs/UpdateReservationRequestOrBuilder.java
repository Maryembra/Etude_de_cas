// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.projetresergraphql.stubs;

public interface UpdateReservationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateReservationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.ReservationGrpc reservation = 2;</code>
   * @return Whether the reservation field is set.
   */
  boolean hasReservation();
  /**
   * <code>.ReservationGrpc reservation = 2;</code>
   * @return The reservation.
   */
  com.projetresergraphql.stubs.ReservationGrpc getReservation();
  /**
   * <code>.ReservationGrpc reservation = 2;</code>
   */
  com.projetresergraphql.stubs.ReservationGrpcOrBuilder getReservationOrBuilder();
}
