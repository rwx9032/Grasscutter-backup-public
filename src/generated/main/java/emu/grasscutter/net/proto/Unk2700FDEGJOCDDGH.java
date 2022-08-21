// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FDEGJOCDDGH.proto

package emu.grasscutter.net.proto;

public final class Unk2700FDEGJOCDDGH {
  private Unk2700FDEGJOCDDGH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FDEGJOCDDGHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FDEGJOCDDGH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_progress = 9;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 challenge_index = 10;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();

    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_id = 8;</code>
     * @return The challengeId.
     */
    int getChallengeId();
  }
  /**
   * Protobuf type {@code Unk2700_FDEGJOCDDGH}
   */
  public static final class Unk2700_FDEGJOCDDGH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FDEGJOCDDGH)
      Unk2700_FDEGJOCDDGHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FDEGJOCDDGH.newBuilder() to construct.
    private Unk2700_FDEGJOCDDGH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FDEGJOCDDGH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FDEGJOCDDGH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_FDEGJOCDDGH(
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

              isSuccess_ = input.readBool();
              break;
            }
            case 64: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 72: {

              curProgress_ = input.readUInt32();
              break;
            }
            case 80: {

              challengeIndex_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.class, emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder.class);
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 9;
    private int curProgress_;
    /**
     * <code>uint32 cur_progress = 9;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 10;
    private int challengeIndex_;
    /**
     * <code>uint32 challenge_index = 10;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 8;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 8;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
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
      if (isSuccess_ != false) {
        output.writeBool(4, isSuccess_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(8, challengeId_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(9, curProgress_);
      }
      if (challengeIndex_ != 0) {
        output.writeUInt32(10, challengeIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isSuccess_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, challengeId_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, curProgress_);
      }
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, challengeIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH other = (emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH) obj;

      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
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
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH prototype) {
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
     * Protobuf type {@code Unk2700_FDEGJOCDDGH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FDEGJOCDDGH)
        emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.class, emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.newBuilder()
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
        curProgress_ = 0;

        challengeIndex_ = 0;

        isSuccess_ = false;

        challengeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.internal_static_Unk2700_FDEGJOCDDGH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH build() {
        emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH buildPartial() {
        emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH result = new emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH(this);
        result.curProgress_ = curProgress_;
        result.challengeIndex_ = challengeIndex_;
        result.isSuccess_ = isSuccess_;
        result.challengeId_ = challengeId_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH other) {
        if (other == emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH.getDefaultInstance()) return this;
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
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
        emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 9;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 9;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {

        curProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {

        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 10;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 10;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {

        challengeIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {

        challengeIndex_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 4;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {

        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 8;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 8;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {

        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {

        challengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FDEGJOCDDGH)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FDEGJOCDDGH)
    private static final emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH();
    }

    public static emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FDEGJOCDDGH>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FDEGJOCDDGH>() {
      @java.lang.Override
      public Unk2700_FDEGJOCDDGH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_FDEGJOCDDGH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_FDEGJOCDDGH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FDEGJOCDDGH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FDEGJOCDDGH.Unk2700_FDEGJOCDDGH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FDEGJOCDDGH_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FDEGJOCDDGH.proto\"n\n\023Unk2700_F" +
      "DEGJOCDDGH\022\024\n\014cur_progress\030\t \001(\r\022\027\n\017chal" +
      "lenge_index\030\n \001(\r\022\022\n\nis_success\030\004 \001(\010\022\024\n" +
      "\014challenge_id\030\010 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FDEGJOCDDGH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FDEGJOCDDGH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FDEGJOCDDGH_descriptor,
        new java.lang.String[] { "CurProgress", "ChallengeIndex", "IsSuccess", "ChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
