// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassivePropParam.proto

package emu.grasscutter.net.proto;

public final class MassivePropParamOuterClass {
  private MassivePropParamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassivePropParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassivePropParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @return A list containing the reactionInfoList.
     */
    java.util.List<java.lang.Integer> getReactionInfoListList();
    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @return The count of reactionInfoList.
     */
    int getReactionInfoListCount();
    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @param index The index of the element to return.
     * @return The reactionInfoList at the given index.
     */
    int getReactionInfoList(int index);

    /**
     * <code>repeated float param_list = 3;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Float> getParamListList();
    /**
     * <code>repeated float param_list = 3;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated float param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    float getParamList(int index);

    /**
     * <code>uint32 sync_flag = 4;</code>
     * @return The syncFlag.
     */
    int getSyncFlag();
  }
  /**
   * Protobuf type {@code MassivePropParam}
   */
  public static final class MassivePropParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassivePropParam)
      MassivePropParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassivePropParam.newBuilder() to construct.
    private MassivePropParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassivePropParam() {
      reactionInfoList_ = emptyIntList();
      paramList_ = emptyFloatList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassivePropParam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MassivePropParam(
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
            case 8: {

              type_ = input.readInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                reactionInfoList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              reactionInfoList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                reactionInfoList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                reactionInfoList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 29: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                paramList_ = newFloatList();
                mutable_bitField0_ |= 0x00000002;
              }
              paramList_.addFloat(input.readFloat());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newFloatList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              syncFlag_ = input.readUInt32();
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
          reactionInfoList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.class, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int REACTION_INFO_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList reactionInfoList_;
    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @return A list containing the reactionInfoList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getReactionInfoListList() {
      return reactionInfoList_;
    }
    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @return The count of reactionInfoList.
     */
    public int getReactionInfoListCount() {
      return reactionInfoList_.size();
    }
    /**
     * <code>repeated uint32 reaction_info_list = 2;</code>
     * @param index The index of the element to return.
     * @return The reactionInfoList at the given index.
     */
    public int getReactionInfoList(int index) {
      return reactionInfoList_.getInt(index);
    }
    private int reactionInfoListMemoizedSerializedSize = -1;

    public static final int PARAM_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.FloatList paramList_;
    /**
     * <code>repeated float param_list = 3;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Float>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated float param_list = 3;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated float param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public float getParamList(int index) {
      return paramList_.getFloat(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int SYNC_FLAG_FIELD_NUMBER = 4;
    private int syncFlag_;
    /**
     * <code>uint32 sync_flag = 4;</code>
     * @return The syncFlag.
     */
    @java.lang.Override
    public int getSyncFlag() {
      return syncFlag_;
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
      getSerializedSize();
      if (type_ != 0) {
        output.writeInt32(1, type_);
      }
      if (getReactionInfoListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(reactionInfoListMemoizedSerializedSize);
      }
      for (int i = 0; i < reactionInfoList_.size(); i++) {
        output.writeUInt32NoTag(reactionInfoList_.getInt(i));
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeFloatNoTag(paramList_.getFloat(i));
      }
      if (syncFlag_ != 0) {
        output.writeUInt32(4, syncFlag_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < reactionInfoList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(reactionInfoList_.getInt(i));
        }
        size += dataSize;
        if (!getReactionInfoListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        reactionInfoListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        dataSize = 4 * getParamListList().size();
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (syncFlag_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, syncFlag_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam other = (emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) obj;

      if (getType()
          != other.getType()) return false;
      if (!getReactionInfoListList()
          .equals(other.getReactionInfoListList())) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getSyncFlag()
          != other.getSyncFlag()) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      if (getReactionInfoListCount() > 0) {
        hash = (37 * hash) + REACTION_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getReactionInfoListList().hashCode();
      }
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + SYNC_FLAG_FIELD_NUMBER;
      hash = (53 * hash) + getSyncFlag();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam prototype) {
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
     * Protobuf type {@code MassivePropParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassivePropParam)
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.class, emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.newBuilder()
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
        type_ = 0;

        reactionInfoList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        paramList_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        syncFlag_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.internal_static_MassivePropParam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam build() {
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam buildPartial() {
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam result = new emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam(this);
        int from_bitField0_ = bitField0_;
        result.type_ = type_;
        if (((bitField0_ & 0x00000001) != 0)) {
          reactionInfoList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reactionInfoList_ = reactionInfoList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.paramList_ = paramList_;
        result.syncFlag_ = syncFlag_;
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
        if (other instanceof emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) {
          return mergeFrom((emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam other) {
        if (other == emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (!other.reactionInfoList_.isEmpty()) {
          if (reactionInfoList_.isEmpty()) {
            reactionInfoList_ = other.reactionInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReactionInfoListIsMutable();
            reactionInfoList_.addAll(other.reactionInfoList_);
          }
          onChanged();
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getSyncFlag() != 0) {
          setSyncFlag(other.getSyncFlag());
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
        emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>int32 type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList reactionInfoList_ = emptyIntList();
      private void ensureReactionInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          reactionInfoList_ = mutableCopy(reactionInfoList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @return A list containing the reactionInfoList.
       */
      public java.util.List<java.lang.Integer>
          getReactionInfoListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(reactionInfoList_) : reactionInfoList_;
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @return The count of reactionInfoList.
       */
      public int getReactionInfoListCount() {
        return reactionInfoList_.size();
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @param index The index of the element to return.
       * @return The reactionInfoList at the given index.
       */
      public int getReactionInfoList(int index) {
        return reactionInfoList_.getInt(index);
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The reactionInfoList to set.
       * @return This builder for chaining.
       */
      public Builder setReactionInfoList(
          int index, int value) {
        ensureReactionInfoListIsMutable();
        reactionInfoList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @param value The reactionInfoList to add.
       * @return This builder for chaining.
       */
      public Builder addReactionInfoList(int value) {
        ensureReactionInfoListIsMutable();
        reactionInfoList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @param values The reactionInfoList to add.
       * @return This builder for chaining.
       */
      public Builder addAllReactionInfoList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureReactionInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reactionInfoList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reaction_info_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReactionInfoList() {
        reactionInfoList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.FloatList paramList_ = emptyFloatList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Float>
          getParamListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public float getParamList(int index) {
        return paramList_.getFloat(index);
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, float value) {
        ensureParamListIsMutable();
        paramList_.setFloat(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(float value) {
        ensureParamListIsMutable();
        paramList_.addFloat(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float param_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyFloatList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int syncFlag_ ;
      /**
       * <code>uint32 sync_flag = 4;</code>
       * @return The syncFlag.
       */
      @java.lang.Override
      public int getSyncFlag() {
        return syncFlag_;
      }
      /**
       * <code>uint32 sync_flag = 4;</code>
       * @param value The syncFlag to set.
       * @return This builder for chaining.
       */
      public Builder setSyncFlag(int value) {

        syncFlag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sync_flag = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSyncFlag() {

        syncFlag_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MassivePropParam)
    }

    // @@protoc_insertion_point(class_scope:MassivePropParam)
    private static final emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam();
    }

    public static emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassivePropParam>
        PARSER = new com.google.protobuf.AbstractParser<MassivePropParam>() {
      @java.lang.Override
      public MassivePropParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MassivePropParam(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MassivePropParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassivePropParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MassivePropParamOuterClass.MassivePropParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassivePropParam_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassivePropParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MassivePropParam.proto\"c\n\020MassivePropP" +
      "aram\022\014\n\004type\030\001 \001(\005\022\032\n\022reaction_info_list" +
      "\030\002 \003(\r\022\022\n\nparam_list\030\003 \003(\002\022\021\n\tsync_flag\030" +
      "\004 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MassivePropParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassivePropParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassivePropParam_descriptor,
        new java.lang.String[] { "Type", "ReactionInfoList", "ParamList", "SyncFlag", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
