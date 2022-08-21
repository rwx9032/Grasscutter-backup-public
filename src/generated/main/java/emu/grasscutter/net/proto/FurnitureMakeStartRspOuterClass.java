// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FurnitureMakeStartRsp.proto

package emu.grasscutter.net.proto;

public final class FurnitureMakeStartRspOuterClass {
  private FurnitureMakeStartRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FurnitureMakeStartRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FurnitureMakeStartRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    boolean hasFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return The furnitureMakeSlot.
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot();
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     */
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4729
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FurnitureMakeStartRsp}
   */
  public static final class FurnitureMakeStartRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FurnitureMakeStartRsp)
      FurnitureMakeStartRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FurnitureMakeStartRsp.newBuilder() to construct.
    private FurnitureMakeStartRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FurnitureMakeStartRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FurnitureMakeStartRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FurnitureMakeStartRsp(
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
            case 42: {
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder subBuilder = null;
              if (furnitureMakeSlot_ != null) {
                subBuilder = furnitureMakeSlot_.toBuilder();
              }
              furnitureMakeSlot_ = input.readMessage(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(furnitureMakeSlot_);
                furnitureMakeSlot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 64: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.class, emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.Builder.class);
    }

    public static final int FURNITURE_MAKE_SLOT_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return Whether the furnitureMakeSlot field is set.
     */
    @java.lang.Override
    public boolean hasFurnitureMakeSlot() {
      return furnitureMakeSlot_ != null;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     * @return The furnitureMakeSlot.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
      return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
    }
    /**
     * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
      return getFurnitureMakeSlot();
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (furnitureMakeSlot_ != null) {
        output.writeMessage(5, getFurnitureMakeSlot());
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (furnitureMakeSlot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getFurnitureMakeSlot());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp other = (emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp) obj;

      if (hasFurnitureMakeSlot() != other.hasFurnitureMakeSlot()) return false;
      if (hasFurnitureMakeSlot()) {
        if (!getFurnitureMakeSlot()
            .equals(other.getFurnitureMakeSlot())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasFurnitureMakeSlot()) {
        hash = (37 * hash) + FURNITURE_MAKE_SLOT_FIELD_NUMBER;
        hash = (53 * hash) + getFurnitureMakeSlot().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp prototype) {
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
     * CmdId: 4729
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FurnitureMakeStartRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FurnitureMakeStartRsp)
        emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.class, emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.newBuilder()
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
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = null;
        } else {
          furnitureMakeSlot_ = null;
          furnitureMakeSlotBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.internal_static_FurnitureMakeStartRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp build() {
        emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp buildPartial() {
        emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp result = new emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp(this);
        if (furnitureMakeSlotBuilder_ == null) {
          result.furnitureMakeSlot_ = furnitureMakeSlot_;
        } else {
          result.furnitureMakeSlot_ = furnitureMakeSlotBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp) {
          return mergeFrom((emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp other) {
        if (other == emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp.getDefaultInstance()) return this;
        if (other.hasFurnitureMakeSlot()) {
          mergeFurnitureMakeSlot(other.getFurnitureMakeSlot());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot furnitureMakeSlot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder> furnitureMakeSlotBuilder_;
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       * @return Whether the furnitureMakeSlot field is set.
       */
      public boolean hasFurnitureMakeSlot() {
        return furnitureMakeSlotBuilder_ != null || furnitureMakeSlot_ != null;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       * @return The furnitureMakeSlot.
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot getFurnitureMakeSlot() {
        if (furnitureMakeSlotBuilder_ == null) {
          return furnitureMakeSlot_ == null ? emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        } else {
          return furnitureMakeSlotBuilder_.getMessage();
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder setFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          furnitureMakeSlot_ = value;
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder setFurnitureMakeSlot(
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder builderForValue) {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = builderForValue.build();
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder mergeFurnitureMakeSlot(emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot value) {
        if (furnitureMakeSlotBuilder_ == null) {
          if (furnitureMakeSlot_ != null) {
            furnitureMakeSlot_ =
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.newBuilder(furnitureMakeSlot_).mergeFrom(value).buildPartial();
          } else {
            furnitureMakeSlot_ = value;
          }
          onChanged();
        } else {
          furnitureMakeSlotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public Builder clearFurnitureMakeSlot() {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlot_ = null;
          onChanged();
        } else {
          furnitureMakeSlot_ = null;
          furnitureMakeSlotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder getFurnitureMakeSlotBuilder() {

        onChanged();
        return getFurnitureMakeSlotFieldBuilder().getBuilder();
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      public emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder getFurnitureMakeSlotOrBuilder() {
        if (furnitureMakeSlotBuilder_ != null) {
          return furnitureMakeSlotBuilder_.getMessageOrBuilder();
        } else {
          return furnitureMakeSlot_ == null ?
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.getDefaultInstance() : furnitureMakeSlot_;
        }
      }
      /**
       * <code>.FurnitureMakeSlot furniture_make_slot = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>
          getFurnitureMakeSlotFieldBuilder() {
        if (furnitureMakeSlotBuilder_ == null) {
          furnitureMakeSlotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlot.Builder, emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.FurnitureMakeSlotOrBuilder>(
                  getFurnitureMakeSlot(),
                  getParentForChildren(),
                  isClean());
          furnitureMakeSlot_ = null;
        }
        return furnitureMakeSlotBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {

        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FurnitureMakeStartRsp)
    }

    // @@protoc_insertion_point(class_scope:FurnitureMakeStartRsp)
    private static final emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp();
    }

    public static emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FurnitureMakeStartRsp>
        PARSER = new com.google.protobuf.AbstractParser<FurnitureMakeStartRsp>() {
      @java.lang.Override
      public FurnitureMakeStartRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FurnitureMakeStartRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FurnitureMakeStartRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FurnitureMakeStartRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FurnitureMakeStartRspOuterClass.FurnitureMakeStartRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FurnitureMakeStartRsp_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FurnitureMakeStartRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033FurnitureMakeStartRsp.proto\032\027Furniture" +
      "MakeSlot.proto\"Y\n\025FurnitureMakeStartRsp\022" +
      "/\n\023furniture_make_slot\030\005 \001(\0132\022.Furniture" +
      "MakeSlot\022\017\n\007retcode\030\010 \001(\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor(),
        });
    internal_static_FurnitureMakeStartRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FurnitureMakeStartRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FurnitureMakeStartRsp_descriptor,
        new java.lang.String[] { "FurnitureMakeSlot", "Retcode", });
    emu.grasscutter.net.proto.FurnitureMakeSlotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
