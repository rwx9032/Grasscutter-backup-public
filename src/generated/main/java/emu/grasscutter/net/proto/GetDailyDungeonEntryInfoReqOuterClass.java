// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetDailyDungeonEntryInfoReq.proto

package emu.grasscutter.net.proto;

public final class GetDailyDungeonEntryInfoReqOuterClass {
  private GetDailyDungeonEntryInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetDailyDungeonEntryInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetDailyDungeonEntryInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 15;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 930
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetDailyDungeonEntryInfoReq}
   */
  public static final class GetDailyDungeonEntryInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetDailyDungeonEntryInfoReq)
      GetDailyDungeonEntryInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDailyDungeonEntryInfoReq.newBuilder() to construct.
    private GetDailyDungeonEntryInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDailyDungeonEntryInfoReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetDailyDungeonEntryInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetDailyDungeonEntryInfoReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 120: {

              sceneId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.class, emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 15;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 15;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (sceneId_ != 0) {
        output.writeUInt32(15, sceneId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, sceneId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq other = (emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 930
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetDailyDungeonEntryInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetDailyDungeonEntryInfoReq)
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.class, emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.internal_static_GetDailyDungeonEntryInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq build() {
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq buildPartial() {
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq result = new emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq(this);
        result.sceneId_ = sceneId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq other) {
        if (other == emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 15;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 15;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {

        sceneId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetDailyDungeonEntryInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetDailyDungeonEntryInfoReq)
    private static final emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq();
    }

    public static emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetDailyDungeonEntryInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetDailyDungeonEntryInfoReq>() {
      @java.lang.Override
      public GetDailyDungeonEntryInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetDailyDungeonEntryInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetDailyDungeonEntryInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetDailyDungeonEntryInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetDailyDungeonEntryInfoReqOuterClass.GetDailyDungeonEntryInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetDailyDungeonEntryInfoReq_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GetDailyDungeonEntryInfoReq.proto\"/\n\033G" +
      "etDailyDungeonEntryInfoReq\022\020\n\010scene_id\030\017" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetDailyDungeonEntryInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetDailyDungeonEntryInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetDailyDungeonEntryInfoReq_descriptor,
        new java.lang.String[] { "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
