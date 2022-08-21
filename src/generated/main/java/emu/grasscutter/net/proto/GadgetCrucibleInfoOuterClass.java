// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetCrucibleInfo.proto

package emu.grasscutter.net.proto;

public final class GadgetCrucibleInfoOuterClass {
  private GadgetCrucibleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetCrucibleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetCrucibleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mp_play_id = 1;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>uint32 prepare_end_time = 2;</code>
     * @return The prepareEndTime.
     */
    int getPrepareEndTime();
  }
  /**
   * Protobuf type {@code GadgetCrucibleInfo}
   */
  public static final class GadgetCrucibleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetCrucibleInfo)
      GadgetCrucibleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetCrucibleInfo.newBuilder() to construct.
    private GadgetCrucibleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetCrucibleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetCrucibleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetCrucibleInfo(
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
            case 8: {

              mpPlayId_ = input.readUInt32();
              break;
            }
            case 16: {

              prepareEndTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.class, emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder.class);
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 1;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 1;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int PREPARE_END_TIME_FIELD_NUMBER = 2;
    private int prepareEndTime_;
    /**
     * <code>uint32 prepare_end_time = 2;</code>
     * @return The prepareEndTime.
     */
    @java.lang.Override
    public int getPrepareEndTime() {
      return prepareEndTime_;
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
      if (mpPlayId_ != 0) {
        output.writeUInt32(1, mpPlayId_);
      }
      if (prepareEndTime_ != 0) {
        output.writeUInt32(2, prepareEndTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, mpPlayId_);
      }
      if (prepareEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, prepareEndTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo other = (emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo) obj;

      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getPrepareEndTime()
          != other.getPrepareEndTime()) return false;
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
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + PREPARE_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPrepareEndTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo prototype) {
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
     * Protobuf type {@code GadgetCrucibleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetCrucibleInfo)
        emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.class, emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.newBuilder()
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
        mpPlayId_ = 0;

        prepareEndTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo build() {
        emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo buildPartial() {
        emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo result = new emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo(this);
        result.mpPlayId_ = mpPlayId_;
        result.prepareEndTime_ = prepareEndTime_;
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
        if (other instanceof emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo other) {
        if (other == emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo.getDefaultInstance()) return this;
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getPrepareEndTime() != 0) {
          setPrepareEndTime(other.getPrepareEndTime());
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
        emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 1;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 1;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {

        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {

        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int prepareEndTime_ ;
      /**
       * <code>uint32 prepare_end_time = 2;</code>
       * @return The prepareEndTime.
       */
      @java.lang.Override
      public int getPrepareEndTime() {
        return prepareEndTime_;
      }
      /**
       * <code>uint32 prepare_end_time = 2;</code>
       * @param value The prepareEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setPrepareEndTime(int value) {

        prepareEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 prepare_end_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPrepareEndTime() {

        prepareEndTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetCrucibleInfo)
    }

    // @@protoc_insertion_point(class_scope:GadgetCrucibleInfo)
    private static final emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo();
    }

    public static emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetCrucibleInfo>
        PARSER = new com.google.protobuf.AbstractParser<GadgetCrucibleInfo>() {
      @java.lang.Override
      public GadgetCrucibleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetCrucibleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetCrucibleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetCrucibleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetCrucibleInfoOuterClass.GadgetCrucibleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetCrucibleInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetCrucibleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GadgetCrucibleInfo.proto\"B\n\022GadgetCruc" +
      "ibleInfo\022\022\n\nmp_play_id\030\001 \001(\r\022\030\n\020prepare_" +
      "end_time\030\002 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetCrucibleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetCrucibleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetCrucibleInfo_descriptor,
        new java.lang.String[] { "MpPlayId", "PrepareEndTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
