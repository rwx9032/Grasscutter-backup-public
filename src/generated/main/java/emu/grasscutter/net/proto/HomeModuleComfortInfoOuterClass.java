// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleComfortInfo.proto

package emu.grasscutter.net.proto;

public final class HomeModuleComfortInfoOuterClass {
  private HomeModuleComfortInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleComfortInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleComfortInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 module_id = 13;</code>
     * @return The moduleId.
     */
    int getModuleId();

    /**
     * <code>uint32 room_scene_comfort_value = 9;</code>
     * @return The roomSceneComfortValue.
     */
    int getRoomSceneComfortValue();

    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @return A list containing the worldSceneBlockComfortValueList.
     */
    java.util.List<java.lang.Integer> getWorldSceneBlockComfortValueListList();
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @return The count of worldSceneBlockComfortValueList.
     */
    int getWorldSceneBlockComfortValueListCount();
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @param index The index of the element to return.
     * @return The worldSceneBlockComfortValueList at the given index.
     */
    int getWorldSceneBlockComfortValueList(int index);
  }
  /**
   * Protobuf type {@code HomeModuleComfortInfo}
   */
  public static final class HomeModuleComfortInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleComfortInfo)
      HomeModuleComfortInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleComfortInfo.newBuilder() to construct.
    private HomeModuleComfortInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleComfortInfo() {
      worldSceneBlockComfortValueList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleComfortInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeModuleComfortInfo(
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                worldSceneBlockComfortValueList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              worldSceneBlockComfortValueList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                worldSceneBlockComfortValueList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                worldSceneBlockComfortValueList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {

              roomSceneComfortValue_ = input.readUInt32();
              break;
            }
            case 104: {

              moduleId_ = input.readUInt32();
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
          worldSceneBlockComfortValueList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.class, emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder.class);
    }

    public static final int MODULE_ID_FIELD_NUMBER = 13;
    private int moduleId_;
    /**
     * <code>uint32 module_id = 13;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
    }

    public static final int ROOM_SCENE_COMFORT_VALUE_FIELD_NUMBER = 9;
    private int roomSceneComfortValue_;
    /**
     * <code>uint32 room_scene_comfort_value = 9;</code>
     * @return The roomSceneComfortValue.
     */
    @java.lang.Override
    public int getRoomSceneComfortValue() {
      return roomSceneComfortValue_;
    }

    public static final int WORLD_SCENE_BLOCK_COMFORT_VALUE_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList worldSceneBlockComfortValueList_;
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @return A list containing the worldSceneBlockComfortValueList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWorldSceneBlockComfortValueListList() {
      return worldSceneBlockComfortValueList_;
    }
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @return The count of worldSceneBlockComfortValueList.
     */
    public int getWorldSceneBlockComfortValueListCount() {
      return worldSceneBlockComfortValueList_.size();
    }
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
     * @param index The index of the element to return.
     * @return The worldSceneBlockComfortValueList at the given index.
     */
    public int getWorldSceneBlockComfortValueList(int index) {
      return worldSceneBlockComfortValueList_.getInt(index);
    }
    private int worldSceneBlockComfortValueListMemoizedSerializedSize = -1;

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
      if (getWorldSceneBlockComfortValueListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(worldSceneBlockComfortValueListMemoizedSerializedSize);
      }
      for (int i = 0; i < worldSceneBlockComfortValueList_.size(); i++) {
        output.writeUInt32NoTag(worldSceneBlockComfortValueList_.getInt(i));
      }
      if (roomSceneComfortValue_ != 0) {
        output.writeUInt32(9, roomSceneComfortValue_);
      }
      if (moduleId_ != 0) {
        output.writeUInt32(13, moduleId_);
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
        for (int i = 0; i < worldSceneBlockComfortValueList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(worldSceneBlockComfortValueList_.getInt(i));
        }
        size += dataSize;
        if (!getWorldSceneBlockComfortValueListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        worldSceneBlockComfortValueListMemoizedSerializedSize = dataSize;
      }
      if (roomSceneComfortValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, roomSceneComfortValue_);
      }
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, moduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo other = (emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo) obj;

      if (getModuleId()
          != other.getModuleId()) return false;
      if (getRoomSceneComfortValue()
          != other.getRoomSceneComfortValue()) return false;
      if (!getWorldSceneBlockComfortValueListList()
          .equals(other.getWorldSceneBlockComfortValueListList())) return false;
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
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (37 * hash) + ROOM_SCENE_COMFORT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getRoomSceneComfortValue();
      if (getWorldSceneBlockComfortValueListCount() > 0) {
        hash = (37 * hash) + WORLD_SCENE_BLOCK_COMFORT_VALUE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWorldSceneBlockComfortValueListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo prototype) {
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
     * Protobuf type {@code HomeModuleComfortInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleComfortInfo)
        emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.class, emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.newBuilder()
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
        moduleId_ = 0;

        roomSceneComfortValue_ = 0;

        worldSceneBlockComfortValueList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo build() {
        emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo buildPartial() {
        emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result = new emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo(this);
        int from_bitField0_ = bitField0_;
        result.moduleId_ = moduleId_;
        result.roomSceneComfortValue_ = roomSceneComfortValue_;
        if (((bitField0_ & 0x00000001) != 0)) {
          worldSceneBlockComfortValueList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.worldSceneBlockComfortValueList_ = worldSceneBlockComfortValueList_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo other) {
        if (other == emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance()) return this;
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
        }
        if (other.getRoomSceneComfortValue() != 0) {
          setRoomSceneComfortValue(other.getRoomSceneComfortValue());
        }
        if (!other.worldSceneBlockComfortValueList_.isEmpty()) {
          if (worldSceneBlockComfortValueList_.isEmpty()) {
            worldSceneBlockComfortValueList_ = other.worldSceneBlockComfortValueList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorldSceneBlockComfortValueListIsMutable();
            worldSceneBlockComfortValueList_.addAll(other.worldSceneBlockComfortValueList_);
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
        emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 13;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 13;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {

        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {

        moduleId_ = 0;
        onChanged();
        return this;
      }

      private int roomSceneComfortValue_ ;
      /**
       * <code>uint32 room_scene_comfort_value = 9;</code>
       * @return The roomSceneComfortValue.
       */
      @java.lang.Override
      public int getRoomSceneComfortValue() {
        return roomSceneComfortValue_;
      }
      /**
       * <code>uint32 room_scene_comfort_value = 9;</code>
       * @param value The roomSceneComfortValue to set.
       * @return This builder for chaining.
       */
      public Builder setRoomSceneComfortValue(int value) {

        roomSceneComfortValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_scene_comfort_value = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomSceneComfortValue() {

        roomSceneComfortValue_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList worldSceneBlockComfortValueList_ = emptyIntList();
      private void ensureWorldSceneBlockComfortValueListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          worldSceneBlockComfortValueList_ = mutableCopy(worldSceneBlockComfortValueList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @return A list containing the worldSceneBlockComfortValueList.
       */
      public java.util.List<java.lang.Integer>
          getWorldSceneBlockComfortValueListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(worldSceneBlockComfortValueList_) : worldSceneBlockComfortValueList_;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @return The count of worldSceneBlockComfortValueList.
       */
      public int getWorldSceneBlockComfortValueListCount() {
        return worldSceneBlockComfortValueList_.size();
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @param index The index of the element to return.
       * @return The worldSceneBlockComfortValueList at the given index.
       */
      public int getWorldSceneBlockComfortValueList(int index) {
        return worldSceneBlockComfortValueList_.getInt(index);
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The worldSceneBlockComfortValueList to set.
       * @return This builder for chaining.
       */
      public Builder setWorldSceneBlockComfortValueList(
          int index, int value) {
        ensureWorldSceneBlockComfortValueListIsMutable();
        worldSceneBlockComfortValueList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @param value The worldSceneBlockComfortValueList to add.
       * @return This builder for chaining.
       */
      public Builder addWorldSceneBlockComfortValueList(int value) {
        ensureWorldSceneBlockComfortValueListIsMutable();
        worldSceneBlockComfortValueList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @param values The worldSceneBlockComfortValueList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWorldSceneBlockComfortValueList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWorldSceneBlockComfortValueListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, worldSceneBlockComfortValueList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWorldSceneBlockComfortValueList() {
        worldSceneBlockComfortValueList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HomeModuleComfortInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleComfortInfo)
    private static final emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo();
    }

    public static emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleComfortInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleComfortInfo>() {
      @java.lang.Override
      public HomeModuleComfortInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeModuleComfortInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeModuleComfortInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleComfortInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleComfortInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleComfortInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeModuleComfortInfo.proto\"z\n\025HomeMod" +
      "uleComfortInfo\022\021\n\tmodule_id\030\r \001(\r\022 \n\030roo" +
      "m_scene_comfort_value\030\t \001(\r\022,\n$world_sce" +
      "ne_block_comfort_value_list\030\003 \003(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleComfortInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleComfortInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleComfortInfo_descriptor,
        new java.lang.String[] { "ModuleId", "RoomSceneComfortValue", "WorldSceneBlockComfortValueList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
