// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package org.wso2.micro.gateway.tests.grpc.gen;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\"$\n\013TestRequest\022\025\n\rtestReqSt" +
      "ring\030\001 \001(\t\"%\n\014TestResponse\022\025\n\rtestResStr" +
      "ing\030\001 \001(\t26\n\013TestService\022\'\n\010testCall\022\014.T" +
      "estRequest\032\r.TestResponseB%\n!org.wso2.mi" +
      "cro.gateway.tests.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestRequest_descriptor,
        new java.lang.String[] { "TestReqString", });
    internal_static_TestResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestResponse_descriptor,
        new java.lang.String[] { "TestResString", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
