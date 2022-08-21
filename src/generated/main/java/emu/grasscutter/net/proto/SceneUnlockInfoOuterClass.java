// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneUnlockInfo.proto

package emu.grasscutter.net.proto;

public final class SceneUnlockInfoOuterClass {
  private SceneUnlockInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneUnlockInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneUnlockInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool isLocked = 2;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    int getSceneTagIdList(int index);
  }
  /**
   * Protobuf type {@code SceneUnlockInfo}
   */
  public static final class SceneUnlockInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneUnlockInfo)
      SceneUnlockInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneUnlockInfo.newBuilder() to construct.
    private SceneUnlockInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneUnlockInfo() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneUnlockInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneUnlockInfo(
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

              sceneId_ = input.readUInt32();
              break;
            }
            case 16: {

              isLocked_ = input.readBool();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sceneTagIdList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneTagIdList_.addInt(input.readUInt32());
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
          sceneTagIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.internal_static_SceneUnlockInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.internal_static_SceneUnlockInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.class, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder.class);
    }

    public static final int SCENEID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 1;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int ISLOCKED_FIELD_NUMBER = 2;
    private boolean isLocked_;
    /**
     * <code>bool isLocked = 2;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int SCENETAGIDLIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneTagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @return The count of sceneTagIdList.
     */
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
    }
    /**
     * <code>repeated uint32 sceneTagIdList = 3;</code>
     * @param index The index of the element to return.
     * @return The sceneTagIdList at the given index.
     */
    public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

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
      if (sceneId_ != 0) {
        output.writeUInt32(1, sceneId_);
      }
      if (isLocked_ != false) {
        output.writeBool(2, isLocked_);
      }
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < sceneTagIdList_.size(); i++) {
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i));
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
          .computeUInt32Size(1, sceneId_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isLocked_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sceneTagIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo other = (emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (!getSceneTagIdListList()
          .equals(other.getSceneTagIdListList())) return false;
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
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + ISLOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      if (getSceneTagIdListCount() > 0) {
        hash = (37 * hash) + SCENETAGIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo prototype) {
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
     * Protobuf type {@code SceneUnlockInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneUnlockInfo)
        emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.internal_static_SceneUnlockInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.internal_static_SceneUnlockInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.class, emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.newBuilder()
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

        isLocked_ = false;

        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.internal_static_SceneUnlockInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo build() {
        emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo buildPartial() {
        emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo result = new emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo(this);
        int from_bitField0_ = bitField0_;
        result.sceneId_ = sceneId_;
        result.isLocked_ = isLocked_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo other) {
        if (other == emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (!other.sceneTagIdList_.isEmpty()) {
          if (sceneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
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
        emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {

        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool isLocked = 2;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool isLocked = 2;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {

        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isLocked = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {

        isLocked_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensureSceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
          getSceneTagIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @return The count of sceneTagIdList.
       */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @param index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @param value The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureSceneTagIdListIsMutable();
        sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSceneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sceneTagIdList = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:SceneUnlockInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneUnlockInfo)
    private static final emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo();
    }

    public static emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneUnlockInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneUnlockInfo>() {
      @java.lang.Override
      public SceneUnlockInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneUnlockInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneUnlockInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneUnlockInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneUnlockInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneUnlockInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SceneUnlockInfo.proto\"L\n\017SceneUnlockIn" +
      "fo\022\017\n\007sceneId\030\001 \001(\r\022\020\n\010isLocked\030\002 \001(\010\022\026\n" +
      "\016sceneTagIdList\030\003 \003(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneUnlockInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneUnlockInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneUnlockInfo_descriptor,
        new java.lang.String[] { "SceneId", "IsLocked", "SceneTagIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
