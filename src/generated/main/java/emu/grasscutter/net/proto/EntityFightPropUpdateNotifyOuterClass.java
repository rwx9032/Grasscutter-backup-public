// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityFightPropUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class EntityFightPropUpdateNotifyOuterClass {
  private EntityFightPropUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityFightPropUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityFightPropUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    int getFightPropMapCount();
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    boolean containsFightPropMap(
        int key);
    /**
     * Use {@link #getFightPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Float>
    getFightPropMap();
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Float>
    getFightPropMapMap();
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */

    float getFightPropMapOrDefault(
        int key,
        float defaultValue);
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */

    float getFightPropMapOrThrow(
        int key);

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 1235
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code EntityFightPropUpdateNotify}
   */
  public static final class EntityFightPropUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityFightPropUpdateNotify)
      EntityFightPropUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityFightPropUpdateNotify.newBuilder() to construct.
    private EntityFightPropUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityFightPropUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityFightPropUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EntityFightPropUpdateNotify(
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
            case 104: {

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fightPropMap_ = com.google.protobuf.MapField.newMapField(
                    FightPropMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Float>
              fightPropMap__ = input.readMessage(
                  FightPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              fightPropMap_.getMutableMap().put(
                  fightPropMap__.getKey(), fightPropMap__.getValue());
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
      return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 15:
          return internalGetFightPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.class, emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.Builder.class);
    }

    public static final int FIGHT_PROP_MAP_FIELD_NUMBER = 15;
    private static final class FightPropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Float> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Float>newDefaultInstance(
                  emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.FLOAT,
                  0F);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Float> fightPropMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Float>
    internalGetFightPropMap() {
      if (fightPropMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FightPropMapDefaultEntryHolder.defaultEntry);
      }
      return fightPropMap_;
    }

    public int getFightPropMapCount() {
      return internalGetFightPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */

    @java.lang.Override
    public boolean containsFightPropMap(
        int key) {

      return internalGetFightPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFightPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Float> getFightPropMap() {
      return getFightPropMapMap();
    }
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Float> getFightPropMapMap() {
      return internalGetFightPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    @java.lang.Override

    public float getFightPropMapOrDefault(
        int key,
        float defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Float> map =
          internalGetFightPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
     */
    @java.lang.Override

    public float getFightPropMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Float> map =
          internalGetFightPropMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetFightPropMap(),
          FightPropMapDefaultEntryHolder.defaultEntry,
          15);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Float> entry
           : internalGetFightPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Float>
        fightPropMap__ = FightPropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(15, fightPropMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify other = (emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify) obj;

      if (!internalGetFightPropMap().equals(
          other.internalGetFightPropMap())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (!internalGetFightPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + FIGHT_PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetFightPropMap().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify prototype) {
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
     * CmdId: 1235
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code EntityFightPropUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityFightPropUpdateNotify)
        emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetFightPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 15:
            return internalGetMutableFightPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.class, emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.newBuilder()
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
        internalGetMutableFightPropMap().clear();
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.internal_static_EntityFightPropUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify build() {
        emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify result = new emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.fightPropMap_ = internalGetFightPropMap();
        result.fightPropMap_.makeImmutable();
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify.getDefaultInstance()) return this;
        internalGetMutableFightPropMap().mergeFrom(
            other.internalGetFightPropMap());
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Float> fightPropMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Float>
      internalGetFightPropMap() {
        if (fightPropMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              FightPropMapDefaultEntryHolder.defaultEntry);
        }
        return fightPropMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Float>
      internalGetMutableFightPropMap() {
        onChanged();;
        if (fightPropMap_ == null) {
          fightPropMap_ = com.google.protobuf.MapField.newMapField(
              FightPropMapDefaultEntryHolder.defaultEntry);
        }
        if (!fightPropMap_.isMutable()) {
          fightPropMap_ = fightPropMap_.copy();
        }
        return fightPropMap_;
      }

      public int getFightPropMapCount() {
        return internalGetFightPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */

      @java.lang.Override
      public boolean containsFightPropMap(
          int key) {

        return internalGetFightPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getFightPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Float> getFightPropMap() {
        return getFightPropMapMap();
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Float> getFightPropMapMap() {
        return internalGetFightPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */
      @java.lang.Override

      public float getFightPropMapOrDefault(
          int key,
          float defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Float> map =
            internalGetFightPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */
      @java.lang.Override

      public float getFightPropMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Float> map =
            internalGetFightPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearFightPropMap() {
        internalGetMutableFightPropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */

      public Builder removeFightPropMap(
          int key) {

        internalGetMutableFightPropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Float>
      getMutableFightPropMap() {
        return internalGetMutableFightPropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */
      public Builder putFightPropMap(
          int key,
          float value) {


        internalGetMutableFightPropMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, float&gt; fight_prop_map = 15;</code>
       */

      public Builder putAllFightPropMap(
          java.util.Map<java.lang.Integer, java.lang.Float> values) {
        internalGetMutableFightPropMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {

        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EntityFightPropUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:EntityFightPropUpdateNotify)
    private static final emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify();
    }

    public static emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityFightPropUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<EntityFightPropUpdateNotify>() {
      @java.lang.Override
      public EntityFightPropUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityFightPropUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EntityFightPropUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityFightPropUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EntityFightPropUpdateNotifyOuterClass.EntityFightPropUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropUpdateNotify_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropUpdateNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EntityFightPropUpdateNotify.proto\"\255\001\n\033" +
      "EntityFightPropUpdateNotify\022F\n\016fight_pro" +
      "p_map\030\017 \003(\0132..EntityFightPropUpdateNotif" +
      "y.FightPropMapEntry\022\021\n\tentity_id\030\r \001(\r\0323" +
      "\n\021FightPropMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005valu" +
      "e\030\002 \001(\002:\0028\001B\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityFightPropUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityFightPropUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropUpdateNotify_descriptor,
        new java.lang.String[] { "FightPropMap", "EntityId", });
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor =
      internal_static_EntityFightPropUpdateNotify_descriptor.getNestedTypes().get(0);
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
