// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerEnterDungeonReq.proto

package emu.grasscutter.net.proto;

public final class PlayerEnterDungeonReqOuterClass {
  private PlayerEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     * @return Whether the unk2800ANJAHBGBIFD field is set.
     */
    boolean hasUnk2800ANJAHBGBIFD();
    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     * @return The unk2800ANJAHBGBIFD.
     */
    emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD();
    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     */
    emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder();

    /**
     * <code>uint32 point_id = 13;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 dungeon_id = 7;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 912
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PlayerEnterDungeonReq}
   */
  public static final class PlayerEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerEnterDungeonReq)
      PlayerEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerEnterDungeonReq.newBuilder() to construct.
    private PlayerEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerEnterDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerEnterDungeonReq(
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
            case 18: {
              emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder subBuilder = null;
              if (unk2800ANJAHBGBIFD_ != null) {
                subBuilder = unk2800ANJAHBGBIFD_.toBuilder();
              }
              unk2800ANJAHBGBIFD_ = input.readMessage(emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk2800ANJAHBGBIFD_);
                unk2800ANJAHBGBIFD_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 104: {

              pointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
    }

    public static final int UNK2800_ANJAHBGBIFD_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG unk2800ANJAHBGBIFD_;
    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     * @return Whether the unk2800ANJAHBGBIFD field is set.
     */
    @java.lang.Override
    public boolean hasUnk2800ANJAHBGBIFD() {
      return unk2800ANJAHBGBIFD_ != null;
    }
    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     * @return The unk2800ANJAHBGBIFD.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD() {
      return unk2800ANJAHBGBIFD_ == null ? emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : unk2800ANJAHBGBIFD_;
    }
    /**
     * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder() {
      return getUnk2800ANJAHBGBIFD();
    }

    public static final int POINT_ID_FIELD_NUMBER = 13;
    private int pointId_;
    /**
     * <code>uint32 point_id = 13;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 7;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 7;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (unk2800ANJAHBGBIFD_ != null) {
        output.writeMessage(2, getUnk2800ANJAHBGBIFD());
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(7, dungeonId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(13, pointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2800ANJAHBGBIFD_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUnk2800ANJAHBGBIFD());
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, dungeonId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, pointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other = (emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) obj;

      if (hasUnk2800ANJAHBGBIFD() != other.hasUnk2800ANJAHBGBIFD()) return false;
      if (hasUnk2800ANJAHBGBIFD()) {
        if (!getUnk2800ANJAHBGBIFD()
            .equals(other.getUnk2800ANJAHBGBIFD())) return false;
      }
      if (getPointId()
          != other.getPointId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      if (hasUnk2800ANJAHBGBIFD()) {
        hash = (37 * hash) + UNK2800_ANJAHBGBIFD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2800ANJAHBGBIFD().hashCode();
      }
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq prototype) {
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
     * CmdId: 912
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PlayerEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerEnterDungeonReq)
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.newBuilder()
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
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          unk2800ANJAHBGBIFD_ = null;
        } else {
          unk2800ANJAHBGBIFD_ = null;
          unk2800ANJAHBGBIFDBuilder_ = null;
        }
        pointId_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq build() {
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq buildPartial() {
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = new emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq(this);
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          result.unk2800ANJAHBGBIFD_ = unk2800ANJAHBGBIFD_;
        } else {
          result.unk2800ANJAHBGBIFD_ = unk2800ANJAHBGBIFDBuilder_.build();
        }
        result.pointId_ = pointId_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other) {
        if (other == emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance()) return this;
        if (other.hasUnk2800ANJAHBGBIFD()) {
          mergeUnk2800ANJAHBGBIFD(other.getUnk2800ANJAHBGBIFD());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG unk2800ANJAHBGBIFD_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder> unk2800ANJAHBGBIFDBuilder_;
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       * @return Whether the unk2800ANJAHBGBIFD field is set.
       */
      public boolean hasUnk2800ANJAHBGBIFD() {
        return unk2800ANJAHBGBIFDBuilder_ != null || unk2800ANJAHBGBIFD_ != null;
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       * @return The unk2800ANJAHBGBIFD.
       */
      public emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getUnk2800ANJAHBGBIFD() {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          return unk2800ANJAHBGBIFD_ == null ? emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : unk2800ANJAHBGBIFD_;
        } else {
          return unk2800ANJAHBGBIFDBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public Builder setUnk2800ANJAHBGBIFD(emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG value) {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2800ANJAHBGBIFD_ = value;
          onChanged();
        } else {
          unk2800ANJAHBGBIFDBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public Builder setUnk2800ANJAHBGBIFD(
          emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder builderForValue) {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          unk2800ANJAHBGBIFD_ = builderForValue.build();
          onChanged();
        } else {
          unk2800ANJAHBGBIFDBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public Builder mergeUnk2800ANJAHBGBIFD(emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG value) {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          if (unk2800ANJAHBGBIFD_ != null) {
            unk2800ANJAHBGBIFD_ =
              emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.newBuilder(unk2800ANJAHBGBIFD_).mergeFrom(value).buildPartial();
          } else {
            unk2800ANJAHBGBIFD_ = value;
          }
          onChanged();
        } else {
          unk2800ANJAHBGBIFDBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public Builder clearUnk2800ANJAHBGBIFD() {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          unk2800ANJAHBGBIFD_ = null;
          onChanged();
        } else {
          unk2800ANJAHBGBIFD_ = null;
          unk2800ANJAHBGBIFDBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder getUnk2800ANJAHBGBIFDBuilder() {

        onChanged();
        return getUnk2800ANJAHBGBIFDFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      public emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder getUnk2800ANJAHBGBIFDOrBuilder() {
        if (unk2800ANJAHBGBIFDBuilder_ != null) {
          return unk2800ANJAHBGBIFDBuilder_.getMessageOrBuilder();
        } else {
          return unk2800ANJAHBGBIFD_ == null ?
              emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance() : unk2800ANJAHBGBIFD_;
        }
      }
      /**
       * <code>.Unk2800_JKLFAJKDLDG Unk2800_ANJAHBGBIFD = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder>
          getUnk2800ANJAHBGBIFDFieldBuilder() {
        if (unk2800ANJAHBGBIFDBuilder_ == null) {
          unk2800ANJAHBGBIFDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder, emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder>(
                  getUnk2800ANJAHBGBIFD(),
                  getParentForChildren(),
                  isClean());
          unk2800ANJAHBGBIFD_ = null;
        }
        return unk2800ANJAHBGBIFDBuilder_;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 13;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 13;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {

        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {

        pointId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {

        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {

        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerEnterDungeonReq)
    private static final emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq();
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerEnterDungeonReq>() {
      @java.lang.Override
      public PlayerEnterDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerEnterDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerEnterDungeonReq_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerEnterDungeonReq.proto\032\031Unk2800_J" +
      "KLFAJKDLDG.proto\"p\n\025PlayerEnterDungeonRe" +
      "q\0221\n\023Unk2800_ANJAHBGBIFD\030\002 \001(\0132\024.Unk2800" +
      "_JKLFAJKDLDG\022\020\n\010point_id\030\r \001(\r\022\022\n\ndungeo" +
      "n_id\030\007 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.getDescriptor(),
        });
    internal_static_PlayerEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerEnterDungeonReq_descriptor,
        new java.lang.String[] { "Unk2800ANJAHBGBIFD", "PointId", "DungeonId", });
    emu.grasscutter.net.proto.Unk2800JKLFAJKDLDG.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
