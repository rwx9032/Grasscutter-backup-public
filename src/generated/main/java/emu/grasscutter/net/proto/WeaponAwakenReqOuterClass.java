// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeaponAwakenReq.proto

package emu.grasscutter.net.proto;

public final class WeaponAwakenReqOuterClass {
  private WeaponAwakenReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponAwakenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeaponAwakenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 item_guid = 10;</code>
     * @return The itemGuid.
     */
    long getItemGuid();

    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    int getAffixLevelMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    boolean containsAffixLevelMap(
        int key);
    /**
     * Use {@link #getAffixLevelMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAffixLevelMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAffixLevelMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */

    int getAffixLevelMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */

    int getAffixLevelMapOrThrow(
        int key);

    /**
     * <code>uint64 target_weapon_guid = 9;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();
  }
  /**
   * <pre>
   * CmdId: 695
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code WeaponAwakenReq}
   */
  public static final class WeaponAwakenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeaponAwakenReq)
      WeaponAwakenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeaponAwakenReq.newBuilder() to construct.
    private WeaponAwakenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeaponAwakenReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeaponAwakenReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WeaponAwakenReq(
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                affixLevelMap_ = com.google.protobuf.MapField.newMapField(
                    AffixLevelMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              affixLevelMap__ = input.readMessage(
                  AffixLevelMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              affixLevelMap_.getMutableMap().put(
                  affixLevelMap__.getKey(), affixLevelMap__.getValue());
              break;
            }
            case 72: {

              targetWeaponGuid_ = input.readUInt64();
              break;
            }
            case 80: {

              itemGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 7:
          return internalGetAffixLevelMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.class, emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.Builder.class);
    }

    public static final int ITEM_GUID_FIELD_NUMBER = 10;
    private long itemGuid_;
    /**
     * <code>uint64 item_guid = 10;</code>
     * @return The itemGuid.
     */
    @java.lang.Override
    public long getItemGuid() {
      return itemGuid_;
    }

    public static final int AFFIX_LEVEL_MAP_FIELD_NUMBER = 7;
    private static final class AffixLevelMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> affixLevelMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAffixLevelMap() {
      if (affixLevelMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AffixLevelMapDefaultEntryHolder.defaultEntry);
      }
      return affixLevelMap_;
    }

    public int getAffixLevelMapCount() {
      return internalGetAffixLevelMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */

    @java.lang.Override
    public boolean containsAffixLevelMap(
        int key) {

      return internalGetAffixLevelMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAffixLevelMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixLevelMap() {
      return getAffixLevelMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixLevelMapMap() {
      return internalGetAffixLevelMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    @java.lang.Override

    public int getAffixLevelMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAffixLevelMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
     */
    @java.lang.Override

    public int getAffixLevelMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAffixLevelMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 9;
    private long targetWeaponGuid_;
    /**
     * <code>uint64 target_weapon_guid = 9;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAffixLevelMap(),
          AffixLevelMapDefaultEntryHolder.defaultEntry,
          7);
      if (targetWeaponGuid_ != 0L) {
        output.writeUInt64(9, targetWeaponGuid_);
      }
      if (itemGuid_ != 0L) {
        output.writeUInt64(10, itemGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAffixLevelMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        affixLevelMap__ = AffixLevelMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(7, affixLevelMap__);
      }
      if (targetWeaponGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, targetWeaponGuid_);
      }
      if (itemGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, itemGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq other = (emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) obj;

      if (getItemGuid()
          != other.getItemGuid()) return false;
      if (!internalGetAffixLevelMap().equals(
          other.internalGetAffixLevelMap())) return false;
      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
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
      hash = (37 * hash) + ITEM_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getItemGuid());
      if (!internalGetAffixLevelMap().getMap().isEmpty()) {
        hash = (37 * hash) + AFFIX_LEVEL_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAffixLevelMap().hashCode();
      }
      hash = (37 * hash) + TARGET_WEAPON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetWeaponGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq prototype) {
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
     * CmdId: 695
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code WeaponAwakenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeaponAwakenReq)
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetAffixLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 7:
            return internalGetMutableAffixLevelMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.class, emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.newBuilder()
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
        itemGuid_ = 0L;

        internalGetMutableAffixLevelMap().clear();
        targetWeaponGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.internal_static_WeaponAwakenReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq build() {
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq buildPartial() {
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq result = new emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq(this);
        int from_bitField0_ = bitField0_;
        result.itemGuid_ = itemGuid_;
        result.affixLevelMap_ = internalGetAffixLevelMap();
        result.affixLevelMap_.makeImmutable();
        result.targetWeaponGuid_ = targetWeaponGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) {
          return mergeFrom((emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq other) {
        if (other == emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq.getDefaultInstance()) return this;
        if (other.getItemGuid() != 0L) {
          setItemGuid(other.getItemGuid());
        }
        internalGetMutableAffixLevelMap().mergeFrom(
            other.internalGetAffixLevelMap());
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
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
        emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long itemGuid_ ;
      /**
       * <code>uint64 item_guid = 10;</code>
       * @return The itemGuid.
       */
      @java.lang.Override
      public long getItemGuid() {
        return itemGuid_;
      }
      /**
       * <code>uint64 item_guid = 10;</code>
       * @param value The itemGuid to set.
       * @return This builder for chaining.
       */
      public Builder setItemGuid(long value) {

        itemGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 item_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemGuid() {

        itemGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> affixLevelMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAffixLevelMap() {
        if (affixLevelMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AffixLevelMapDefaultEntryHolder.defaultEntry);
        }
        return affixLevelMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAffixLevelMap() {
        onChanged();;
        if (affixLevelMap_ == null) {
          affixLevelMap_ = com.google.protobuf.MapField.newMapField(
              AffixLevelMapDefaultEntryHolder.defaultEntry);
        }
        if (!affixLevelMap_.isMutable()) {
          affixLevelMap_ = affixLevelMap_.copy();
        }
        return affixLevelMap_;
      }

      public int getAffixLevelMapCount() {
        return internalGetAffixLevelMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */

      @java.lang.Override
      public boolean containsAffixLevelMap(
          int key) {

        return internalGetAffixLevelMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAffixLevelMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixLevelMap() {
        return getAffixLevelMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAffixLevelMapMap() {
        return internalGetAffixLevelMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */
      @java.lang.Override

      public int getAffixLevelMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAffixLevelMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */
      @java.lang.Override

      public int getAffixLevelMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAffixLevelMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAffixLevelMap() {
        internalGetMutableAffixLevelMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */

      public Builder removeAffixLevelMap(
          int key) {

        internalGetMutableAffixLevelMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAffixLevelMap() {
        return internalGetMutableAffixLevelMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */
      public Builder putAffixLevelMap(
          int key,
          int value) {


        internalGetMutableAffixLevelMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_level_map = 7;</code>
       */

      public Builder putAllAffixLevelMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableAffixLevelMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private long targetWeaponGuid_ ;
      /**
       * <code>uint64 target_weapon_guid = 9;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 target_weapon_guid = 9;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {

        targetWeaponGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_weapon_guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {

        targetWeaponGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:WeaponAwakenReq)
    }

    // @@protoc_insertion_point(class_scope:WeaponAwakenReq)
    private static final emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq();
    }

    public static emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeaponAwakenReq>
        PARSER = new com.google.protobuf.AbstractParser<WeaponAwakenReq>() {
      @java.lang.Override
      public WeaponAwakenReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WeaponAwakenReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WeaponAwakenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeaponAwakenReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponAwakenReqOuterClass.WeaponAwakenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponAwakenReq_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponAwakenReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponAwakenReq_AffixLevelMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WeaponAwakenReq.proto\"\264\001\n\017WeaponAwaken" +
      "Req\022\021\n\titem_guid\030\n \001(\004\022<\n\017affix_level_ma" +
      "p\030\007 \003(\0132#.WeaponAwakenReq.AffixLevelMapE" +
      "ntry\022\032\n\022target_weapon_guid\030\t \001(\004\0324\n\022Affi" +
      "xLevelMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001" +
      "(\r:\0028\001B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeaponAwakenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeaponAwakenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponAwakenReq_descriptor,
        new java.lang.String[] { "ItemGuid", "AffixLevelMap", "TargetWeaponGuid", });
    internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor =
      internal_static_WeaponAwakenReq_descriptor.getNestedTypes().get(0);
    internal_static_WeaponAwakenReq_AffixLevelMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponAwakenReq_AffixLevelMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
