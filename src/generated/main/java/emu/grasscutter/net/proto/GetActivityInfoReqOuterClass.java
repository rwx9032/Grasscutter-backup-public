// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetActivityInfoReq.proto

package emu.grasscutter.net.proto;

public final class GetActivityInfoReqOuterClass {
  private GetActivityInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetActivityInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetActivityInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @return A list containing the activityIdList.
     */
    java.util.List<java.lang.Integer> getActivityIdListList();
    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @return The count of activityIdList.
     */
    int getActivityIdListCount();
    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The activityIdList at the given index.
     */
    int getActivityIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 2067
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code GetActivityInfoReq}
   */
  public static final class GetActivityInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetActivityInfoReq)
      GetActivityInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetActivityInfoReq.newBuilder() to construct.
    private GetActivityInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetActivityInfoReq() {
      activityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetActivityInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetActivityInfoReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                activityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              activityIdList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                activityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                activityIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          activityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.internal_static_GetActivityInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.internal_static_GetActivityInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.class, emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.Builder.class);
    }

    public static final int ACTIVITY_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList activityIdList_;
    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @return A list containing the activityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getActivityIdListList() {
      return activityIdList_;
    }
    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @return The count of activityIdList.
     */
    public int getActivityIdListCount() {
      return activityIdList_.size();
    }
    /**
     * <code>repeated uint32 activity_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The activityIdList at the given index.
     */
    public int getActivityIdList(int index) {
      return activityIdList_.getInt(index);
    }
    private int activityIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getActivityIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(activityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < activityIdList_.size(); i++) {
        output.writeUInt32NoTag(activityIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < activityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(activityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getActivityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        activityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq other = (emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq) obj;

      if (!getActivityIdListList()
          .equals(other.getActivityIdListList())) return false;
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
      if (getActivityIdListCount() > 0) {
        hash = (37 * hash) + ACTIVITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getActivityIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq prototype) {
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
     * CmdId: 2067
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code GetActivityInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetActivityInfoReq)
        emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.internal_static_GetActivityInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.internal_static_GetActivityInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.class, emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.newBuilder()
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
        activityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.internal_static_GetActivityInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq build() {
        emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq buildPartial() {
        emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq result = new emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          activityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.activityIdList_ = activityIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq other) {
        if (other == emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq.getDefaultInstance()) return this;
        if (!other.activityIdList_.isEmpty()) {
          if (activityIdList_.isEmpty()) {
            activityIdList_ = other.activityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActivityIdListIsMutable();
            activityIdList_.addAll(other.activityIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList activityIdList_ = emptyIntList();
      private void ensureActivityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          activityIdList_ = mutableCopy(activityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @return A list containing the activityIdList.
       */
      public java.util.List<java.lang.Integer>
          getActivityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(activityIdList_) : activityIdList_;
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @return The count of activityIdList.
       */
      public int getActivityIdListCount() {
        return activityIdList_.size();
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The activityIdList at the given index.
       */
      public int getActivityIdList(int index) {
        return activityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The activityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setActivityIdList(
          int index, int value) {
        ensureActivityIdListIsMutable();
        activityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @param value The activityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addActivityIdList(int value) {
        ensureActivityIdListIsMutable();
        activityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @param values The activityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllActivityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureActivityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, activityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 activity_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityIdList() {
        activityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GetActivityInfoReq)
    }

    // @@protoc_insertion_point(class_scope:GetActivityInfoReq)
    private static final emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq();
    }

    public static emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetActivityInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<GetActivityInfoReq>() {
      @java.lang.Override
      public GetActivityInfoReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetActivityInfoReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetActivityInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetActivityInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetActivityInfoReqOuterClass.GetActivityInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetActivityInfoReq_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetActivityInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetActivityInfoReq.proto\".\n\022GetActivit" +
      "yInfoReq\022\030\n\020activity_id_list\030\004 \003(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetActivityInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetActivityInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetActivityInfoReq_descriptor,
        new java.lang.String[] { "ActivityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
