// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: water.proto

package com.zeaho.proto.water;

public final class WaterProto {
  private WaterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_water_WaterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_water_WaterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_water_WaterReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_water_WaterReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013water.proto\022\005water\"\035\n\014WaterRequest\022\r\n\005" +
      "price\030\001 \001(\002\"\035\n\nWaterReply\022\017\n\007message\030\001 \001" +
      "(\t2\202\001\n\014WaterCompany\022<\n\016BuyStreamWater\022\023." +
      "water.WaterRequest\032\021.water.WaterReply\"\0000" +
      "\001\0224\n\010BuyWater\022\023.water.WaterRequest\032\021.wat" +
      "er.WaterReply\"\000B+\n\025com.zeaho.proto.water" +
      "B\nWaterProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_water_WaterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_water_WaterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_water_WaterRequest_descriptor,
        new java.lang.String[] { "Price", });
    internal_static_water_WaterReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_water_WaterReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_water_WaterReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
