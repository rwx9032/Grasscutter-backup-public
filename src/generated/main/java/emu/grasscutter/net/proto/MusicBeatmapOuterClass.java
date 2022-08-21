// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicBeatmap.proto

package emu.grasscutter.net.proto;

public final class MusicBeatmapOuterClass {
  private MusicBeatmapOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicBeatmapOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicBeatmap)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 music_id = 1;</code>
     * @return The musicId.
     */
    int getMusicId();

    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList>
        getBeatmapItemListList();
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(int index);
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    int getBeatmapItemListCount();
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>
        getBeatmapItemListOrBuilderList();
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code MusicBeatmap}
   */
  public static final class MusicBeatmap extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicBeatmap)
      MusicBeatmapOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicBeatmap.newBuilder() to construct.
    private MusicBeatmap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicBeatmap() {
      beatmapItemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicBeatmap();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MusicBeatmap(
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

              musicId_ = input.readUInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                beatmapItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList>();
                mutable_bitField0_ |= 0x00000001;
              }
              beatmapItemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.parser(), extensionRegistry));
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
          beatmapItemList_ = java.util.Collections.unmodifiableList(beatmapItemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MusicBeatmapOuterClass.internal_static_MusicBeatmap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.class, emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.Builder.class);
    }

    public static final int MUSIC_ID_FIELD_NUMBER = 1;
    private int musicId_;
    /**
     * <code>uint32 music_id = 1;</code>
     * @return The musicId.
     */
    @java.lang.Override
    public int getMusicId() {
      return musicId_;
    }

    public static final int BEATMAP_ITEM_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList> beatmapItemList_;
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList> getBeatmapItemListList() {
      return beatmapItemList_;
    }
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>
        getBeatmapItemListOrBuilderList() {
      return beatmapItemList_;
    }
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    @java.lang.Override
    public int getBeatmapItemListCount() {
      return beatmapItemList_.size();
    }
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(int index) {
      return beatmapItemList_.get(index);
    }
    /**
     * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(
        int index) {
      return beatmapItemList_.get(index);
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
      if (musicId_ != 0) {
        output.writeUInt32(1, musicId_);
      }
      for (int i = 0; i < beatmapItemList_.size(); i++) {
        output.writeMessage(2, beatmapItemList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, musicId_);
      }
      for (int i = 0; i < beatmapItemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, beatmapItemList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap other = (emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap) obj;

      if (getMusicId()
          != other.getMusicId()) return false;
      if (!getBeatmapItemListList()
          .equals(other.getBeatmapItemListList())) return false;
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
      hash = (37 * hash) + MUSIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicId();
      if (getBeatmapItemListCount() > 0) {
        hash = (37 * hash) + BEATMAP_ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBeatmapItemListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap prototype) {
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
     * Protobuf type {@code MusicBeatmap}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicBeatmap)
        emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MusicBeatmapOuterClass.internal_static_MusicBeatmap_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.class, emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.newBuilder()
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
          getBeatmapItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        musicId_ = 0;

        if (beatmapItemListBuilder_ == null) {
          beatmapItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          beatmapItemListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MusicBeatmapOuterClass.internal_static_MusicBeatmap_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap build() {
        emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap buildPartial() {
        emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap result = new emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap(this);
        int from_bitField0_ = bitField0_;
        result.musicId_ = musicId_;
        if (beatmapItemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            beatmapItemList_ = java.util.Collections.unmodifiableList(beatmapItemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.beatmapItemList_ = beatmapItemList_;
        } else {
          result.beatmapItemList_ = beatmapItemListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap) {
          return mergeFrom((emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap other) {
        if (other == emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance()) return this;
        if (other.getMusicId() != 0) {
          setMusicId(other.getMusicId());
        }
        if (beatmapItemListBuilder_ == null) {
          if (!other.beatmapItemList_.isEmpty()) {
            if (beatmapItemList_.isEmpty()) {
              beatmapItemList_ = other.beatmapItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBeatmapItemListIsMutable();
              beatmapItemList_.addAll(other.beatmapItemList_);
            }
            onChanged();
          }
        } else {
          if (!other.beatmapItemList_.isEmpty()) {
            if (beatmapItemListBuilder_.isEmpty()) {
              beatmapItemListBuilder_.dispose();
              beatmapItemListBuilder_ = null;
              beatmapItemList_ = other.beatmapItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              beatmapItemListBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBeatmapItemListFieldBuilder() : null;
            } else {
              beatmapItemListBuilder_.addAllMessages(other.beatmapItemList_);
            }
          }
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
        emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int musicId_ ;
      /**
       * <code>uint32 music_id = 1;</code>
       * @return The musicId.
       */
      @java.lang.Override
      public int getMusicId() {
        return musicId_;
      }
      /**
       * <code>uint32 music_id = 1;</code>
       * @param value The musicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicId(int value) {

        musicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicId() {

        musicId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList> beatmapItemList_ =
        java.util.Collections.emptyList();
      private void ensureBeatmapItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          beatmapItemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList>(beatmapItemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder> beatmapItemListBuilder_;

      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList> getBeatmapItemListList() {
        if (beatmapItemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(beatmapItemList_);
        } else {
          return beatmapItemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public int getBeatmapItemListCount() {
        if (beatmapItemListBuilder_ == null) {
          return beatmapItemList_.size();
        } else {
          return beatmapItemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList getBeatmapItemList(int index) {
        if (beatmapItemListBuilder_ == null) {
          return beatmapItemList_.get(index);
        } else {
          return beatmapItemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder setBeatmapItemList(
          int index, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList value) {
        if (beatmapItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.set(index, value);
          onChanged();
        } else {
          beatmapItemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder setBeatmapItemList(
          int index, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
        if (beatmapItemListBuilder_ == null) {
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          beatmapItemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder addBeatmapItemList(emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList value) {
        if (beatmapItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.add(value);
          onChanged();
        } else {
          beatmapItemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder addBeatmapItemList(
          int index, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList value) {
        if (beatmapItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.add(index, value);
          onChanged();
        } else {
          beatmapItemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder addBeatmapItemList(
          emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
        if (beatmapItemListBuilder_ == null) {
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.add(builderForValue.build());
          onChanged();
        } else {
          beatmapItemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder addBeatmapItemList(
          int index, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder builderForValue) {
        if (beatmapItemListBuilder_ == null) {
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          beatmapItemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder addAllBeatmapItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList> values) {
        if (beatmapItemListBuilder_ == null) {
          ensureBeatmapItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, beatmapItemList_);
          onChanged();
        } else {
          beatmapItemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder clearBeatmapItemList() {
        if (beatmapItemListBuilder_ == null) {
          beatmapItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          beatmapItemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public Builder removeBeatmapItemList(int index) {
        if (beatmapItemListBuilder_ == null) {
          ensureBeatmapItemListIsMutable();
          beatmapItemList_.remove(index);
          onChanged();
        } else {
          beatmapItemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder getBeatmapItemListBuilder(
          int index) {
        return getBeatmapItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder getBeatmapItemListOrBuilder(
          int index) {
        if (beatmapItemListBuilder_ == null) {
          return beatmapItemList_.get(index);  } else {
          return beatmapItemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>
           getBeatmapItemListOrBuilderList() {
        if (beatmapItemListBuilder_ != null) {
          return beatmapItemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(beatmapItemList_);
        }
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder addBeatmapItemListBuilder() {
        return getBeatmapItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.getDefaultInstance());
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder addBeatmapItemListBuilder(
          int index) {
        return getBeatmapItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.getDefaultInstance());
      }
      /**
       * <code>repeated .MusicBeatmapList beatmap_item_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder>
           getBeatmapItemListBuilderList() {
        return getBeatmapItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>
          getBeatmapItemListFieldBuilder() {
        if (beatmapItemListBuilder_ == null) {
          beatmapItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapList.Builder, emu.grasscutter.net.proto.MusicBeatmapListOuterClass.MusicBeatmapListOrBuilder>(
                  beatmapItemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          beatmapItemList_ = null;
        }
        return beatmapItemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MusicBeatmap)
    }

    // @@protoc_insertion_point(class_scope:MusicBeatmap)
    private static final emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap();
    }

    public static emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicBeatmap>
        PARSER = new com.google.protobuf.AbstractParser<MusicBeatmap>() {
      @java.lang.Override
      public MusicBeatmap parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MusicBeatmap(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MusicBeatmap> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicBeatmap> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MusicBeatmapOuterClass.MusicBeatmap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicBeatmap_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicBeatmap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022MusicBeatmap.proto\032\026MusicBeatmapList.p" +
      "roto\"N\n\014MusicBeatmap\022\020\n\010music_id\030\001 \001(\r\022," +
      "\n\021beatmap_item_list\030\002 \003(\0132\021.MusicBeatmap" +
      "ListB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MusicBeatmapListOuterClass.getDescriptor(),
        });
    internal_static_MusicBeatmap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicBeatmap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicBeatmap_descriptor,
        new java.lang.String[] { "MusicId", "BeatmapItemList", });
    emu.grasscutter.net.proto.MusicBeatmapListOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
