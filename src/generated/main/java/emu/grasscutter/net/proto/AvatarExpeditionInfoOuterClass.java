// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionInfo.proto

package emu.grasscutter.net.proto;

public final class AvatarExpeditionInfoOuterClass {
  private AvatarExpeditionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarExpeditionState state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.AvatarExpeditionState state = 1;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState getState();

    /**
     * <code>uint32 exp_id = 2;</code>
     * @return The expId.
     */
    int getExpId();

    /**
     * <code>uint32 hour_time = 3;</code>
     * @return The hourTime.
     */
    int getHourTime();

    /**
     * <code>uint32 start_time = 4;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>float shorten_ratio = 5;</code>
     * @return The shortenRatio.
     */
    float getShortenRatio();
  }
  /**
   * Protobuf type {@code AvatarExpeditionInfo}
   */
  public static final class AvatarExpeditionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionInfo)
      AvatarExpeditionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionInfo.newBuilder() to construct.
    private AvatarExpeditionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionInfo() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarExpeditionInfo(
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
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 16: {

              expId_ = input.readUInt32();
              break;
            }
            case 24: {

              hourTime_ = input.readUInt32();
              break;
            }
            case 32: {

              startTime_ = input.readUInt32();
              break;
            }
            case 45: {

              shortenRatio_ = input.readFloat();
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
      return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.class, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.Builder.class);
    }

    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>.AvatarExpeditionState state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.AvatarExpeditionState state = 1;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState result = emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
    }

    public static final int EXP_ID_FIELD_NUMBER = 2;
    private int expId_;
    /**
     * <code>uint32 exp_id = 2;</code>
     * @return The expId.
     */
    @java.lang.Override
    public int getExpId() {
      return expId_;
    }

    public static final int HOUR_TIME_FIELD_NUMBER = 3;
    private int hourTime_;
    /**
     * <code>uint32 hour_time = 3;</code>
     * @return The hourTime.
     */
    @java.lang.Override
    public int getHourTime() {
      return hourTime_;
    }

    public static final int START_TIME_FIELD_NUMBER = 4;
    private int startTime_;
    /**
     * <code>uint32 start_time = 4;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int SHORTEN_RATIO_FIELD_NUMBER = 5;
    private float shortenRatio_;
    /**
     * <code>float shorten_ratio = 5;</code>
     * @return The shortenRatio.
     */
    @java.lang.Override
    public float getShortenRatio() {
      return shortenRatio_;
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
      if (state_ != emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
        output.writeEnum(1, state_);
      }
      if (expId_ != 0) {
        output.writeUInt32(2, expId_);
      }
      if (hourTime_ != 0) {
        output.writeUInt32(3, hourTime_);
      }
      if (startTime_ != 0) {
        output.writeUInt32(4, startTime_);
      }
      if (shortenRatio_ != 0F) {
        output.writeFloat(5, shortenRatio_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, state_);
      }
      if (expId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, expId_);
      }
      if (hourTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, hourTime_);
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, startTime_);
      }
      if (shortenRatio_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, shortenRatio_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo other = (emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo) obj;

      if (state_ != other.state_) return false;
      if (getExpId()
          != other.getExpId()) return false;
      if (getHourTime()
          != other.getHourTime()) return false;
      if (getStartTime()
          != other.getStartTime()) return false;
      if (java.lang.Float.floatToIntBits(getShortenRatio())
          != java.lang.Float.floatToIntBits(
              other.getShortenRatio())) return false;
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
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + EXP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getExpId();
      hash = (37 * hash) + HOUR_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getHourTime();
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + SHORTEN_RATIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getShortenRatio());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo prototype) {
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
     * Protobuf type {@code AvatarExpeditionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionInfo)
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.class, emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.newBuilder()
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
        state_ = 0;

        expId_ = 0;

        hourTime_ = 0;

        startTime_ = 0;

        shortenRatio_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo build() {
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo buildPartial() {
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo result = new emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo(this);
        result.state_ = state_;
        result.expId_ = expId_;
        result.hourTime_ = hourTime_;
        result.startTime_ = startTime_;
        result.shortenRatio_ = shortenRatio_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo other) {
        if (other == emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance()) return this;
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getExpId() != 0) {
          setExpId(other.getExpId());
        }
        if (other.getHourTime() != 0) {
          setHourTime(other.getHourTime());
        }
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getShortenRatio() != 0F) {
          setShortenRatio(other.getShortenRatio());
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
        emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.AvatarExpeditionState state = 1;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.AvatarExpeditionState state = 1;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {

        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarExpeditionState state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState result = emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
      }
      /**
       * <code>.AvatarExpeditionState state = 1;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.AvatarExpeditionState value) {
        if (value == null) {
          throw new NullPointerException();
        }

        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AvatarExpeditionState state = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {

        state_ = 0;
        onChanged();
        return this;
      }

      private int expId_ ;
      /**
       * <code>uint32 exp_id = 2;</code>
       * @return The expId.
       */
      @java.lang.Override
      public int getExpId() {
        return expId_;
      }
      /**
       * <code>uint32 exp_id = 2;</code>
       * @param value The expId to set.
       * @return This builder for chaining.
       */
      public Builder setExpId(int value) {

        expId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpId() {

        expId_ = 0;
        onChanged();
        return this;
      }

      private int hourTime_ ;
      /**
       * <code>uint32 hour_time = 3;</code>
       * @return The hourTime.
       */
      @java.lang.Override
      public int getHourTime() {
        return hourTime_;
      }
      /**
       * <code>uint32 hour_time = 3;</code>
       * @param value The hourTime to set.
       * @return This builder for chaining.
       */
      public Builder setHourTime(int value) {

        hourTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hour_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHourTime() {

        hourTime_ = 0;
        onChanged();
        return this;
      }

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 4;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 4;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {

        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {

        startTime_ = 0;
        onChanged();
        return this;
      }

      private float shortenRatio_ ;
      /**
       * <code>float shorten_ratio = 5;</code>
       * @return The shortenRatio.
       */
      @java.lang.Override
      public float getShortenRatio() {
        return shortenRatio_;
      }
      /**
       * <code>float shorten_ratio = 5;</code>
       * @param value The shortenRatio to set.
       * @return This builder for chaining.
       */
      public Builder setShortenRatio(float value) {

        shortenRatio_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float shorten_ratio = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearShortenRatio() {

        shortenRatio_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionInfo)
    private static final emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo();
    }

    public static emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionInfo>() {
      @java.lang.Override
      public AvatarExpeditionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarExpeditionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarExpeditionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032AvatarExpeditionInfo.proto\032\033AvatarExpe" +
      "ditionState.proto\"\213\001\n\024AvatarExpeditionIn" +
      "fo\022%\n\005state\030\001 \001(\0162\026.AvatarExpeditionStat" +
      "e\022\016\n\006exp_id\030\002 \001(\r\022\021\n\thour_time\030\003 \001(\r\022\022\n\n" +
      "start_time\030\004 \001(\r\022\025\n\rshorten_ratio\030\005 \001(\002B" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.getDescriptor(),
        });
    internal_static_AvatarExpeditionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionInfo_descriptor,
        new java.lang.String[] { "State", "ExpId", "HourTime", "StartTime", "ShortenRatio", });
    emu.grasscutter.net.proto.AvatarExpeditionStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
