// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PropValue.proto

package emu.grasscutter.net.proto;

public final class PropValueOuterClass {
  private PropValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PropValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PropValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>int64 val = 4;</code>
     * @return The val.
     */
    long getVal();

    /**
     * <code>int64 ival = 2;</code>
     * @return Whether the ival field is set.
     */
    boolean hasIval();
    /**
     * <code>int64 ival = 2;</code>
     * @return The ival.
     */
    long getIval();

    /**
     * <code>float fval = 3;</code>
     * @return Whether the fval field is set.
     */
    boolean hasFval();
    /**
     * <code>float fval = 3;</code>
     * @return The fval.
     */
    float getFval();

    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue.ValueCase getValueCase();
  }
  /**
   * Protobuf type {@code PropValue}
   */
  public static final class PropValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PropValue)
      PropValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PropValue.newBuilder() to construct.
    private PropValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PropValue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PropValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PropValue(
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

              type_ = input.readUInt32();
              break;
            }
            case 16: {
              valueCase_ = 2;
              value_ = input.readInt64();
              break;
            }
            case 29: {
              valueCase_ = 3;
              value_ = input.readFloat();
              break;
            }
            case 32: {

              val_ = input.readInt64();
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
      return emu.grasscutter.net.proto.PropValueOuterClass.internal_static_PropValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PropValueOuterClass.internal_static_PropValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PropValueOuterClass.PropValue.class, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder.class);
    }

    private int valueCase_ = 0;
    private java.lang.Object value_;
    public enum ValueCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      IVAL(2),
      FVAL(3),
      VALUE_NOT_SET(0);
      private final int value;
      private ValueCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ValueCase valueOf(int value) {
        return forNumber(value);
      }

      public static ValueCase forNumber(int value) {
        switch (value) {
          case 2: return IVAL;
          case 3: return FVAL;
          case 0: return VALUE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ValueCase
    getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>uint32 type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int VAL_FIELD_NUMBER = 4;
    private long val_;
    /**
     * <code>int64 val = 4;</code>
     * @return The val.
     */
    @java.lang.Override
    public long getVal() {
      return val_;
    }

    public static final int IVAL_FIELD_NUMBER = 2;
    /**
     * <code>int64 ival = 2;</code>
     * @return Whether the ival field is set.
     */
    @java.lang.Override
    public boolean hasIval() {
      return valueCase_ == 2;
    }
    /**
     * <code>int64 ival = 2;</code>
     * @return The ival.
     */
    @java.lang.Override
    public long getIval() {
      if (valueCase_ == 2) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }

    public static final int FVAL_FIELD_NUMBER = 3;
    /**
     * <code>float fval = 3;</code>
     * @return Whether the fval field is set.
     */
    @java.lang.Override
    public boolean hasFval() {
      return valueCase_ == 3;
    }
    /**
     * <code>float fval = 3;</code>
     * @return The fval.
     */
    @java.lang.Override
    public float getFval() {
      if (valueCase_ == 3) {
        return (java.lang.Float) value_;
      }
      return 0F;
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
      if (type_ != 0) {
        output.writeUInt32(1, type_);
      }
      if (valueCase_ == 2) {
        output.writeInt64(
            2, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 3) {
        output.writeFloat(
            3, (float)((java.lang.Float) value_));
      }
      if (val_ != 0L) {
        output.writeInt64(4, val_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, type_);
      }
      if (valueCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(
              2, (long)((java.lang.Long) value_));
      }
      if (valueCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(
              3, (float)((java.lang.Float) value_));
      }
      if (val_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, val_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PropValueOuterClass.PropValue)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PropValueOuterClass.PropValue other = (emu.grasscutter.net.proto.PropValueOuterClass.PropValue) obj;

      if (getType()
          != other.getType()) return false;
      if (getVal()
          != other.getVal()) return false;
      if (!getValueCase().equals(other.getValueCase())) return false;
      switch (valueCase_) {
        case 2:
          if (getIval()
              != other.getIval()) return false;
          break;
        case 3:
          if (java.lang.Float.floatToIntBits(getFval())
              != java.lang.Float.floatToIntBits(
                  other.getFval())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getVal());
      switch (valueCase_) {
        case 2:
          hash = (37 * hash) + IVAL_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getIval());
          break;
        case 3:
          hash = (37 * hash) + FVAL_FIELD_NUMBER;
          hash = (53 * hash) + java.lang.Float.floatToIntBits(
              getFval());
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PropValueOuterClass.PropValue prototype) {
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
     * Protobuf type {@code PropValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PropValue)
        emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PropValueOuterClass.internal_static_PropValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PropValueOuterClass.internal_static_PropValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PropValueOuterClass.PropValue.class, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PropValueOuterClass.PropValue.newBuilder()
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
        type_ = 0;

        val_ = 0L;

        valueCase_ = 0;
        value_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PropValueOuterClass.internal_static_PropValue_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue build() {
        emu.grasscutter.net.proto.PropValueOuterClass.PropValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue buildPartial() {
        emu.grasscutter.net.proto.PropValueOuterClass.PropValue result = new emu.grasscutter.net.proto.PropValueOuterClass.PropValue(this);
        result.type_ = type_;
        result.val_ = val_;
        if (valueCase_ == 2) {
          result.value_ = value_;
        }
        if (valueCase_ == 3) {
          result.value_ = value_;
        }
        result.valueCase_ = valueCase_;
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
        if (other instanceof emu.grasscutter.net.proto.PropValueOuterClass.PropValue) {
          return mergeFrom((emu.grasscutter.net.proto.PropValueOuterClass.PropValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PropValueOuterClass.PropValue other) {
        if (other == emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance()) return this;
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getVal() != 0L) {
          setVal(other.getVal());
        }
        switch (other.getValueCase()) {
          case IVAL: {
            setIval(other.getIval());
            break;
          }
          case FVAL: {
            setFval(other.getFval());
            break;
          }
          case VALUE_NOT_SET: {
            break;
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
        emu.grasscutter.net.proto.PropValueOuterClass.PropValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PropValueOuterClass.PropValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int valueCase_ = 0;
      private java.lang.Object value_;
      public ValueCase
          getValueCase() {
        return ValueCase.forNumber(
            valueCase_);
      }

      public Builder clearValue() {
        valueCase_ = 0;
        value_ = null;
        onChanged();
        return this;
      }


      private int type_ ;
      /**
       * <code>uint32 type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {

        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {

        type_ = 0;
        onChanged();
        return this;
      }

      private long val_ ;
      /**
       * <code>int64 val = 4;</code>
       * @return The val.
       */
      @java.lang.Override
      public long getVal() {
        return val_;
      }
      /**
       * <code>int64 val = 4;</code>
       * @param value The val to set.
       * @return This builder for chaining.
       */
      public Builder setVal(long value) {

        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 val = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVal() {

        val_ = 0L;
        onChanged();
        return this;
      }

      /**
       * <code>int64 ival = 2;</code>
       * @return Whether the ival field is set.
       */
      public boolean hasIval() {
        return valueCase_ == 2;
      }
      /**
       * <code>int64 ival = 2;</code>
       * @return The ival.
       */
      public long getIval() {
        if (valueCase_ == 2) {
          return (java.lang.Long) value_;
        }
        return 0L;
      }
      /**
       * <code>int64 ival = 2;</code>
       * @param value The ival to set.
       * @return This builder for chaining.
       */
      public Builder setIval(long value) {
        valueCase_ = 2;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 ival = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIval() {
        if (valueCase_ == 2) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>float fval = 3;</code>
       * @return Whether the fval field is set.
       */
      public boolean hasFval() {
        return valueCase_ == 3;
      }
      /**
       * <code>float fval = 3;</code>
       * @return The fval.
       */
      public float getFval() {
        if (valueCase_ == 3) {
          return (java.lang.Float) value_;
        }
        return 0F;
      }
      /**
       * <code>float fval = 3;</code>
       * @param value The fval to set.
       * @return This builder for chaining.
       */
      public Builder setFval(float value) {
        valueCase_ = 3;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float fval = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFval() {
        if (valueCase_ == 3) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:PropValue)
    }

    // @@protoc_insertion_point(class_scope:PropValue)
    private static final emu.grasscutter.net.proto.PropValueOuterClass.PropValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PropValueOuterClass.PropValue();
    }

    public static emu.grasscutter.net.proto.PropValueOuterClass.PropValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PropValue>
        PARSER = new com.google.protobuf.AbstractParser<PropValue>() {
      @java.lang.Override
      public PropValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PropValue(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PropValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PropValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PropValue_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PropValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017PropValue.proto\"O\n\tPropValue\022\014\n\004type\030\001" +
      " \001(\r\022\013\n\003val\030\004 \001(\003\022\016\n\004ival\030\002 \001(\003H\000\022\016\n\004fva" +
      "l\030\003 \001(\002H\000B\007\n\005valueB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PropValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PropValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PropValue_descriptor,
        new java.lang.String[] { "Type", "Val", "Ival", "Fval", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
