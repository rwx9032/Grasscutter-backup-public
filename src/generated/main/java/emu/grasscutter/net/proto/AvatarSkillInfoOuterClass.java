// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillInfo.proto

package emu.grasscutter.net.proto;

public final class AvatarSkillInfoOuterClass {
  private AvatarSkillInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pass_cd_time = 1;</code>
     * @return The passCdTime.
     */
    int getPassCdTime();

    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return A list containing the fullCdTimeList.
     */
    java.util.List<java.lang.Integer> getFullCdTimeListList();
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return The count of fullCdTimeList.
     */
    int getFullCdTimeListCount();
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fullCdTimeList at the given index.
     */
    int getFullCdTimeList(int index);

    /**
     * <code>uint32 max_charge_count = 3;</code>
     * @return The maxChargeCount.
     */
    int getMaxChargeCount();
  }
  /**
   * Protobuf type {@code AvatarSkillInfo}
   */
  public static final class AvatarSkillInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillInfo)
      AvatarSkillInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillInfo.newBuilder() to construct.
    private AvatarSkillInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillInfo() {
      fullCdTimeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarSkillInfo(
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

              passCdTime_ = input.readUInt32();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fullCdTimeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fullCdTimeList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fullCdTimeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fullCdTimeList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 24: {

              maxChargeCount_ = input.readUInt32();
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
          fullCdTimeList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.class, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.Builder.class);
    }

    public static final int PASS_CD_TIME_FIELD_NUMBER = 1;
    private int passCdTime_;
    /**
     * <code>uint32 pass_cd_time = 1;</code>
     * @return The passCdTime.
     */
    @java.lang.Override
    public int getPassCdTime() {
      return passCdTime_;
    }

    public static final int FULL_CD_TIME_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList fullCdTimeList_;
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return A list containing the fullCdTimeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFullCdTimeListList() {
      return fullCdTimeList_;
    }
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return The count of fullCdTimeList.
     */
    public int getFullCdTimeListCount() {
      return fullCdTimeList_.size();
    }
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fullCdTimeList at the given index.
     */
    public int getFullCdTimeList(int index) {
      return fullCdTimeList_.getInt(index);
    }
    private int fullCdTimeListMemoizedSerializedSize = -1;

    public static final int MAX_CHARGE_COUNT_FIELD_NUMBER = 3;
    private int maxChargeCount_;
    /**
     * <code>uint32 max_charge_count = 3;</code>
     * @return The maxChargeCount.
     */
    @java.lang.Override
    public int getMaxChargeCount() {
      return maxChargeCount_;
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
      if (passCdTime_ != 0) {
        output.writeUInt32(1, passCdTime_);
      }
      if (getFullCdTimeListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(fullCdTimeListMemoizedSerializedSize);
      }
      for (int i = 0; i < fullCdTimeList_.size(); i++) {
        output.writeUInt32NoTag(fullCdTimeList_.getInt(i));
      }
      if (maxChargeCount_ != 0) {
        output.writeUInt32(3, maxChargeCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (passCdTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, passCdTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fullCdTimeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fullCdTimeList_.getInt(i));
        }
        size += dataSize;
        if (!getFullCdTimeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fullCdTimeListMemoizedSerializedSize = dataSize;
      }
      if (maxChargeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxChargeCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo other = (emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo) obj;

      if (getPassCdTime()
          != other.getPassCdTime()) return false;
      if (!getFullCdTimeListList()
          .equals(other.getFullCdTimeListList())) return false;
      if (getMaxChargeCount()
          != other.getMaxChargeCount()) return false;
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
      hash = (37 * hash) + PASS_CD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPassCdTime();
      if (getFullCdTimeListCount() > 0) {
        hash = (37 * hash) + FULL_CD_TIME_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFullCdTimeListList().hashCode();
      }
      hash = (37 * hash) + MAX_CHARGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxChargeCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo prototype) {
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
     * Protobuf type {@code AvatarSkillInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillInfo)
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.class, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.newBuilder()
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
        passCdTime_ = 0;

        fullCdTimeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        maxChargeCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo build() {
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo buildPartial() {
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo result = new emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo(this);
        int from_bitField0_ = bitField0_;
        result.passCdTime_ = passCdTime_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fullCdTimeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fullCdTimeList_ = fullCdTimeList_;
        result.maxChargeCount_ = maxChargeCount_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo other) {
        if (other == emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.getDefaultInstance()) return this;
        if (other.getPassCdTime() != 0) {
          setPassCdTime(other.getPassCdTime());
        }
        if (!other.fullCdTimeList_.isEmpty()) {
          if (fullCdTimeList_.isEmpty()) {
            fullCdTimeList_ = other.fullCdTimeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFullCdTimeListIsMutable();
            fullCdTimeList_.addAll(other.fullCdTimeList_);
          }
          onChanged();
        }
        if (other.getMaxChargeCount() != 0) {
          setMaxChargeCount(other.getMaxChargeCount());
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
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int passCdTime_ ;
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @return The passCdTime.
       */
      @java.lang.Override
      public int getPassCdTime() {
        return passCdTime_;
      }
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @param value The passCdTime to set.
       * @return This builder for chaining.
       */
      public Builder setPassCdTime(int value) {

        passCdTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassCdTime() {

        passCdTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fullCdTimeList_ = emptyIntList();
      private void ensureFullCdTimeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fullCdTimeList_ = mutableCopy(fullCdTimeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return A list containing the fullCdTimeList.
       */
      public java.util.List<java.lang.Integer>
          getFullCdTimeListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fullCdTimeList_) : fullCdTimeList_;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return The count of fullCdTimeList.
       */
      public int getFullCdTimeListCount() {
        return fullCdTimeList_.size();
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param index The index of the element to return.
       * @return The fullCdTimeList at the given index.
       */
      public int getFullCdTimeList(int index) {
        return fullCdTimeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The fullCdTimeList to set.
       * @return This builder for chaining.
       */
      public Builder setFullCdTimeList(
          int index, int value) {
        ensureFullCdTimeListIsMutable();
        fullCdTimeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param value The fullCdTimeList to add.
       * @return This builder for chaining.
       */
      public Builder addFullCdTimeList(int value) {
        ensureFullCdTimeListIsMutable();
        fullCdTimeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param values The fullCdTimeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFullCdTimeList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFullCdTimeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fullCdTimeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFullCdTimeList() {
        fullCdTimeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int maxChargeCount_ ;
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @return The maxChargeCount.
       */
      @java.lang.Override
      public int getMaxChargeCount() {
        return maxChargeCount_;
      }
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @param value The maxChargeCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxChargeCount(int value) {

        maxChargeCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxChargeCount() {

        maxChargeCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarSkillInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillInfo)
    private static final emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo();
    }

    public static emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillInfo>() {
      @java.lang.Override
      public AvatarSkillInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarSkillInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarSkillInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AvatarSkillInfo.proto\"\\\n\017AvatarSkillIn" +
      "fo\022\024\n\014pass_cd_time\030\001 \001(\r\022\031\n\021full_cd_time" +
      "_list\030\002 \003(\r\022\030\n\020max_charge_count\030\003 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillInfo_descriptor,
        new java.lang.String[] { "PassCdTime", "FullCdTimeList", "MaxChargeCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
