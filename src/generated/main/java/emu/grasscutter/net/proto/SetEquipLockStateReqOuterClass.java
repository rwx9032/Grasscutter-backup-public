// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetEquipLockStateReq.proto

package emu.grasscutter.net.proto;

public final class SetEquipLockStateReqOuterClass {
  private SetEquipLockStateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetEquipLockStateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetEquipLockStateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_locked = 15;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    /**
     * <code>uint64 target_equip_guid = 9;</code>
     * @return The targetEquipGuid.
     */
    long getTargetEquipGuid();
  }
  /**
   * <pre>
   * CmdId: 666
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetEquipLockStateReq}
   */
  public static final class SetEquipLockStateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetEquipLockStateReq)
      SetEquipLockStateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetEquipLockStateReq.newBuilder() to construct.
    private SetEquipLockStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetEquipLockStateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetEquipLockStateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetEquipLockStateReq(
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
            case 72: {

              targetEquipGuid_ = input.readUInt64();
              break;
            }
            case 120: {

              isLocked_ = input.readBool();
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
      return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.class, emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.Builder.class);
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 15;
    private boolean isLocked_;
    /**
     * <code>bool is_locked = 15;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
    }

    public static final int TARGET_EQUIP_GUID_FIELD_NUMBER = 9;
    private long targetEquipGuid_;
    /**
     * <code>uint64 target_equip_guid = 9;</code>
     * @return The targetEquipGuid.
     */
    @java.lang.Override
    public long getTargetEquipGuid() {
      return targetEquipGuid_;
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
      if (targetEquipGuid_ != 0L) {
        output.writeUInt64(9, targetEquipGuid_);
      }
      if (isLocked_ != false) {
        output.writeBool(15, isLocked_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetEquipGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, targetEquipGuid_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isLocked_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq other = (emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (getTargetEquipGuid()
          != other.getTargetEquipGuid()) return false;
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
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      hash = (37 * hash) + TARGET_EQUIP_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetEquipGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq prototype) {
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
     * CmdId: 666
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetEquipLockStateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetEquipLockStateReq)
        emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.class, emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.newBuilder()
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
        isLocked_ = false;

        targetEquipGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.internal_static_SetEquipLockStateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq build() {
        emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq buildPartial() {
        emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq result = new emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq(this);
        result.isLocked_ = isLocked_;
        result.targetEquipGuid_ = targetEquipGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq other) {
        if (other == emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        if (other.getTargetEquipGuid() != 0L) {
          setTargetEquipGuid(other.getTargetEquipGuid());
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
        emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 15;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 15;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {

        isLocked_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {

        isLocked_ = false;
        onChanged();
        return this;
      }

      private long targetEquipGuid_ ;
      /**
       * <code>uint64 target_equip_guid = 9;</code>
       * @return The targetEquipGuid.
       */
      @java.lang.Override
      public long getTargetEquipGuid() {
        return targetEquipGuid_;
      }
      /**
       * <code>uint64 target_equip_guid = 9;</code>
       * @param value The targetEquipGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEquipGuid(long value) {

        targetEquipGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_equip_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEquipGuid() {

        targetEquipGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:SetEquipLockStateReq)
    }

    // @@protoc_insertion_point(class_scope:SetEquipLockStateReq)
    private static final emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq();
    }

    public static emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetEquipLockStateReq>
        PARSER = new com.google.protobuf.AbstractParser<SetEquipLockStateReq>() {
      @java.lang.Override
      public SetEquipLockStateReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetEquipLockStateReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetEquipLockStateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetEquipLockStateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetEquipLockStateReqOuterClass.SetEquipLockStateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetEquipLockStateReq_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetEquipLockStateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SetEquipLockStateReq.proto\"D\n\024SetEquip" +
      "LockStateReq\022\021\n\tis_locked\030\017 \001(\010\022\031\n\021targe" +
      "t_equip_guid\030\t \001(\004B\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetEquipLockStateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetEquipLockStateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetEquipLockStateReq_descriptor,
        new java.lang.String[] { "IsLocked", "TargetEquipGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
