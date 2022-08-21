// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GatherGadgetInfo.proto

package emu.grasscutter.net.proto;

public final class GatherGadgetInfoOuterClass {
  private GatherGadgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GatherGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GatherGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>bool is_forbid_guest = 2;</code>
     * @return The isForbidGuest.
     */
    boolean getIsForbidGuest();
  }
  /**
   * Protobuf type {@code GatherGadgetInfo}
   */
  public static final class GatherGadgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GatherGadgetInfo)
      GatherGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GatherGadgetInfo.newBuilder() to construct.
    private GatherGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GatherGadgetInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GatherGadgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GatherGadgetInfo(
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

              itemId_ = input.readUInt32();
              break;
            }
            case 16: {

              isForbidGuest_ = input.readBool();
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
      return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.class, emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int IS_FORBID_GUEST_FIELD_NUMBER = 2;
    private boolean isForbidGuest_;
    /**
     * <code>bool is_forbid_guest = 2;</code>
     * @return The isForbidGuest.
     */
    @java.lang.Override
    public boolean getIsForbidGuest() {
      return isForbidGuest_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (isForbidGuest_ != false) {
        output.writeBool(2, isForbidGuest_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (isForbidGuest_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isForbidGuest_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo other = (emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getIsForbidGuest()
          != other.getIsForbidGuest()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + IS_FORBID_GUEST_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForbidGuest());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo prototype) {
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
     * Protobuf type {@code GatherGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GatherGadgetInfo)
        emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.class, emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.newBuilder()
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
        itemId_ = 0;

        isForbidGuest_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.internal_static_GatherGadgetInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo build() {
        emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo buildPartial() {
        emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo result = new emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo(this);
        result.itemId_ = itemId_;
        result.isForbidGuest_ = isForbidGuest_;
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
        if (other instanceof emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo other) {
        if (other == emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getIsForbidGuest() != false) {
          setIsForbidGuest(other.getIsForbidGuest());
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
        emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {

        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {

        itemId_ = 0;
        onChanged();
        return this;
      }

      private boolean isForbidGuest_ ;
      /**
       * <code>bool is_forbid_guest = 2;</code>
       * @return The isForbidGuest.
       */
      @java.lang.Override
      public boolean getIsForbidGuest() {
        return isForbidGuest_;
      }
      /**
       * <code>bool is_forbid_guest = 2;</code>
       * @param value The isForbidGuest to set.
       * @return This builder for chaining.
       */
      public Builder setIsForbidGuest(boolean value) {

        isForbidGuest_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_forbid_guest = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForbidGuest() {

        isForbidGuest_ = false;
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


      // @@protoc_insertion_point(builder_scope:GatherGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:GatherGadgetInfo)
    private static final emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo();
    }

    public static emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GatherGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<GatherGadgetInfo>() {
      @java.lang.Override
      public GatherGadgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GatherGadgetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GatherGadgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GatherGadgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GatherGadgetInfoOuterClass.GatherGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GatherGadgetInfo_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GatherGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GatherGadgetInfo.proto\"<\n\020GatherGadget" +
      "Info\022\017\n\007item_id\030\001 \001(\r\022\027\n\017is_forbid_guest" +
      "\030\002 \001(\010B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GatherGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GatherGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GatherGadgetInfo_descriptor,
        new java.lang.String[] { "ItemId", "IsForbidGuest", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
