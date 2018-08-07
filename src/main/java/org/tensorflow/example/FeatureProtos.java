// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: feature.proto

package org.tensorflow.example;

public final class FeatureProtos {
  private FeatureProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BytesList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BytesList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FloatList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FloatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Int64List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Int64List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Features_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Features_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Features_FeatureEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Features_FeatureEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FeatureList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureLists_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FeatureLists_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FeatureLists_FeatureListEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rfeature.proto\022\ntensorflow\"\032\n\tBytesList" +
      "\022\r\n\005value\030\001 \003(\014\"\036\n\tFloatList\022\021\n\005value\030\001 " +
      "\003(\002B\002\020\001\"\036\n\tInt64List\022\021\n\005value\030\001 \003(\003B\002\020\001\"" +
      "\230\001\n\007Feature\022+\n\nbytes_list\030\001 \001(\0132\025.tensor" +
      "flow.BytesListH\000\022+\n\nfloat_list\030\002 \001(\0132\025.t" +
      "ensorflow.FloatListH\000\022+\n\nint64_list\030\003 \001(" +
      "\0132\025.tensorflow.Int64ListH\000B\006\n\004kind\"\203\001\n\010F" +
      "eatures\0222\n\007feature\030\001 \003(\0132!.tensorflow.Fe" +
      "atures.FeatureEntry\032C\n\014FeatureEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\"\n\005value\030\002 \001(\0132\023.tensorflow.Fea" +
      "ture:\0028\001\"3\n\013FeatureList\022$\n\007feature\030\001 \003(\013" +
      "2\023.tensorflow.Feature\"\234\001\n\014FeatureLists\022?" +
      "\n\014feature_list\030\001 \003(\0132).tensorflow.Featur" +
      "eLists.FeatureListEntry\032K\n\020FeatureListEn" +
      "try\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 \001(\0132\027.tensor" +
      "flow.FeatureList:\0028\001B,\n\026org.tensorflow.e" +
      "xampleB\rFeatureProtosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tensorflow_BytesList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_BytesList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BytesList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_FloatList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_FloatList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FloatList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_Int64List_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_Int64List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Int64List_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_Feature_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Feature_descriptor,
        new java.lang.String[] { "BytesList", "FloatList", "Int64List", "Kind", });
    internal_static_tensorflow_Features_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_Features_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Features_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_tensorflow_Features_FeatureEntry_descriptor =
      internal_static_tensorflow_Features_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_Features_FeatureEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Features_FeatureEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FeatureList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_FeatureList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FeatureList_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_tensorflow_FeatureLists_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_FeatureLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FeatureLists_descriptor,
        new java.lang.String[] { "FeatureList", });
    internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor =
      internal_static_tensorflow_FeatureLists_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_FeatureLists_FeatureListEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
