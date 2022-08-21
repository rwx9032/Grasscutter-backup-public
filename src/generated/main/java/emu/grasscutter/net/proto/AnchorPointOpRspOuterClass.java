// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnchorPointOpRsp.proto

package emu.grasscutter.net.proto;

public final class AnchorPointOpRspOuterClass {
  private AnchorPointOpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnchorPointOpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnchorPointOpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 anchor_point_id = 12;</code>
     * @return The anchorPointId.
     */
    int getAnchorPointId();

    /**
     * <code>uint32 anchor_point_op_type = 4;</code>
     * @return The anchorPointOpType.
     */
    int getAnchorPointOpType();
  }
  /**
   * <pre>
   * CmdId: 4252
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AnchorPointOpRsp}
   */
  public static final class AnchorPointOpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnchorPointOpRsp)
      AnchorPointOpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnchorPointOpRsp.newBuilder() to construct.
    private AnchorPointOpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnchorPointOpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnchorPointOpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AnchorPointOpRsp(
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
            case 32: {

              anchorPointOpType_ = input.readUInt32();
              break;
            }
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              anchorPointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.class, emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ANCHOR_POINT_ID_FIELD_NUMBER = 12;
    private int anchorPointId_;
    /**
     * <code>uint32 anchor_point_id = 12;</code>
     * @return The anchorPointId.
     */
    @java.lang.Override
    public int getAnchorPointId() {
      return anchorPointId_;
    }

    public static final int ANCHOR_POINT_OP_TYPE_FIELD_NUMBER = 4;
    private int anchorPointOpType_;
    /**
     * <code>uint32 anchor_point_op_type = 4;</code>
     * @return The anchorPointOpType.
     */
    @java.lang.Override
    public int getAnchorPointOpType() {
      return anchorPointOpType_;
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
      if (anchorPointOpType_ != 0) {
        output.writeUInt32(4, anchorPointOpType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (anchorPointId_ != 0) {
        output.writeUInt32(12, anchorPointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (anchorPointOpType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, anchorPointOpType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (anchorPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, anchorPointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp other = (emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAnchorPointId()
          != other.getAnchorPointId()) return false;
      if (getAnchorPointOpType()
          != other.getAnchorPointOpType()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ANCHOR_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointId();
      hash = (37 * hash) + ANCHOR_POINT_OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointOpType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp prototype) {
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
     * CmdId: 4252
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AnchorPointOpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnchorPointOpRsp)
        emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.class, emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.newBuilder()
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
        retcode_ = 0;

        anchorPointId_ = 0;

        anchorPointOpType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp build() {
        emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp buildPartial() {
        emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp result = new emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp(this);
        result.retcode_ = retcode_;
        result.anchorPointId_ = anchorPointId_;
        result.anchorPointOpType_ = anchorPointOpType_;
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
        if (other instanceof emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp other) {
        if (other == emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAnchorPointId() != 0) {
          setAnchorPointId(other.getAnchorPointId());
        }
        if (other.getAnchorPointOpType() != 0) {
          setAnchorPointOpType(other.getAnchorPointOpType());
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
        emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {

        retcode_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointId_ ;
      /**
       * <code>uint32 anchor_point_id = 12;</code>
       * @return The anchorPointId.
       */
      @java.lang.Override
      public int getAnchorPointId() {
        return anchorPointId_;
      }
      /**
       * <code>uint32 anchor_point_id = 12;</code>
       * @param value The anchorPointId to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointId(int value) {

        anchorPointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointId() {

        anchorPointId_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointOpType_ ;
      /**
       * <code>uint32 anchor_point_op_type = 4;</code>
       * @return The anchorPointOpType.
       */
      @java.lang.Override
      public int getAnchorPointOpType() {
        return anchorPointOpType_;
      }
      /**
       * <code>uint32 anchor_point_op_type = 4;</code>
       * @param value The anchorPointOpType to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointOpType(int value) {

        anchorPointOpType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_op_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointOpType() {

        anchorPointOpType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AnchorPointOpRsp)
    }

    // @@protoc_insertion_point(class_scope:AnchorPointOpRsp)
    private static final emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp();
    }

    public static emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnchorPointOpRsp>
        PARSER = new com.google.protobuf.AbstractParser<AnchorPointOpRsp>() {
      @java.lang.Override
      public AnchorPointOpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnchorPointOpRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnchorPointOpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnchorPointOpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnchorPointOpRsp_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnchorPointOpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AnchorPointOpRsp.proto\"Z\n\020AnchorPointO" +
      "pRsp\022\017\n\007retcode\030\005 \001(\005\022\027\n\017anchor_point_id" +
      "\030\014 \001(\r\022\034\n\024anchor_point_op_type\030\004 \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnchorPointOpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnchorPointOpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnchorPointOpRsp_descriptor,
        new java.lang.String[] { "Retcode", "AnchorPointId", "AnchorPointOpType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
