// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apple.proto

package com.zeaho.proto.apple;

public final class AppleProto {
  private AppleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apple_AppleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apple_AppleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_apple_AppleReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_apple_AppleReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013apple.proto\022\005apple\"\034\n\014AppleRequest\022\014\n\004" +
      "name\030\001 \001(\t\"\035\n\nAppleReply\022\017\n\007message\030\001 \001(" +
      "\t2>\n\006Farmer\0224\n\010GetApple\022\023.apple.AppleReq" +
      "uest\032\021.apple.AppleReply\"\000B+\n\025com.zeaho.p" +
      "roto.appleB\nAppleProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_apple_AppleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_apple_AppleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apple_AppleRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_apple_AppleReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_apple_AppleReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_apple_AppleReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
