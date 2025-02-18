// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleBeginNotify.proto

package emu.grasscutter.net.oldproto;

public final class SealBattleBeginNotifyOuterClass {
  private SealBattleBeginNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SealBattleBeginNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SealBattleBeginNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 seal_max_progress = 9;</code>
     * @return The sealMaxProgress.
     */
    int getSealMaxProgress();

    /**
     * <code>uint32 seal_entity_id = 1;</code>
     * @return The sealEntityId.
     */
    int getSealEntityId();

    /**
     * <code>uint32 seal_radius = 12;</code>
     * @return The sealRadius.
     */
    int getSealRadius();

    /**
     * <code>.SealBattleType battle_type = 14;</code>
     * @return The enum numeric value on the wire for battleType.
     */
    int getBattleTypeValue();
    /**
     * <code>.SealBattleType battle_type = 14;</code>
     * @return The battleType.
     */
    emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType getBattleType();
  }
  /**
   * <pre>
   * CmdId: 289
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SealBattleBeginNotify}
   */
  public static final class SealBattleBeginNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SealBattleBeginNotify)
      SealBattleBeginNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SealBattleBeginNotify.newBuilder() to construct.
    private SealBattleBeginNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SealBattleBeginNotify() {
      battleType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SealBattleBeginNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.class, emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.Builder.class);
    }

    public static final int SEAL_MAX_PROGRESS_FIELD_NUMBER = 9;
    private int sealMaxProgress_;
    /**
     * <code>uint32 seal_max_progress = 9;</code>
     * @return The sealMaxProgress.
     */
    @java.lang.Override
    public int getSealMaxProgress() {
      return sealMaxProgress_;
    }

    public static final int SEAL_ENTITY_ID_FIELD_NUMBER = 1;
    private int sealEntityId_;
    /**
     * <code>uint32 seal_entity_id = 1;</code>
     * @return The sealEntityId.
     */
    @java.lang.Override
    public int getSealEntityId() {
      return sealEntityId_;
    }

    public static final int SEAL_RADIUS_FIELD_NUMBER = 12;
    private int sealRadius_;
    /**
     * <code>uint32 seal_radius = 12;</code>
     * @return The sealRadius.
     */
    @java.lang.Override
    public int getSealRadius() {
      return sealRadius_;
    }

    public static final int BATTLE_TYPE_FIELD_NUMBER = 14;
    private int battleType_;
    /**
     * <code>.SealBattleType battle_type = 14;</code>
     * @return The enum numeric value on the wire for battleType.
     */
    @java.lang.Override public int getBattleTypeValue() {
      return battleType_;
    }
    /**
     * <code>.SealBattleType battle_type = 14;</code>
     * @return The battleType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType getBattleType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType result = emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.valueOf(battleType_);
      return result == null ? emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.UNRECOGNIZED : result;
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
      if (sealEntityId_ != 0) {
        output.writeUInt32(1, sealEntityId_);
      }
      if (sealMaxProgress_ != 0) {
        output.writeUInt32(9, sealMaxProgress_);
      }
      if (sealRadius_ != 0) {
        output.writeUInt32(12, sealRadius_);
      }
      if (battleType_ != emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.SEAL_BATTLE_TYPE_KEEP_ALIVE.getNumber()) {
        output.writeEnum(14, battleType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sealEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sealEntityId_);
      }
      if (sealMaxProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sealMaxProgress_);
      }
      if (sealRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sealRadius_);
      }
      if (battleType_ != emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.SEAL_BATTLE_TYPE_KEEP_ALIVE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, battleType_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify other = (emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify) obj;

      if (getSealMaxProgress()
          != other.getSealMaxProgress()) return false;
      if (getSealEntityId()
          != other.getSealEntityId()) return false;
      if (getSealRadius()
          != other.getSealRadius()) return false;
      if (battleType_ != other.battleType_) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SEAL_MAX_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getSealMaxProgress();
      hash = (37 * hash) + SEAL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSealEntityId();
      hash = (37 * hash) + SEAL_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getSealRadius();
      hash = (37 * hash) + BATTLE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + battleType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify prototype) {
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
     * CmdId: 289
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SealBattleBeginNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SealBattleBeginNotify)
        emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.class, emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        sealMaxProgress_ = 0;

        sealEntityId_ = 0;

        sealRadius_ = 0;

        battleType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify build() {
        emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify buildPartial() {
        emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify result = new emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify(this);
        result.sealMaxProgress_ = sealMaxProgress_;
        result.sealEntityId_ = sealEntityId_;
        result.sealRadius_ = sealRadius_;
        result.battleType_ = battleType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify other) {
        if (other == emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.getDefaultInstance()) return this;
        if (other.getSealMaxProgress() != 0) {
          setSealMaxProgress(other.getSealMaxProgress());
        }
        if (other.getSealEntityId() != 0) {
          setSealEntityId(other.getSealEntityId());
        }
        if (other.getSealRadius() != 0) {
          setSealRadius(other.getSealRadius());
        }
        if (other.battleType_ != 0) {
          setBattleTypeValue(other.getBattleTypeValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                sealEntityId_ = input.readUInt32();

                break;
              } // case 8
              case 72: {
                sealMaxProgress_ = input.readUInt32();

                break;
              } // case 72
              case 96: {
                sealRadius_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                battleType_ = input.readEnum();

                break;
              } // case 112
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private int sealMaxProgress_ ;
      /**
       * <code>uint32 seal_max_progress = 9;</code>
       * @return The sealMaxProgress.
       */
      @java.lang.Override
      public int getSealMaxProgress() {
        return sealMaxProgress_;
      }
      /**
       * <code>uint32 seal_max_progress = 9;</code>
       * @param value The sealMaxProgress to set.
       * @return This builder for chaining.
       */
      public Builder setSealMaxProgress(int value) {
        
        sealMaxProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_max_progress = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealMaxProgress() {
        
        sealMaxProgress_ = 0;
        onChanged();
        return this;
      }

      private int sealEntityId_ ;
      /**
       * <code>uint32 seal_entity_id = 1;</code>
       * @return The sealEntityId.
       */
      @java.lang.Override
      public int getSealEntityId() {
        return sealEntityId_;
      }
      /**
       * <code>uint32 seal_entity_id = 1;</code>
       * @param value The sealEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSealEntityId(int value) {
        
        sealEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealEntityId() {
        
        sealEntityId_ = 0;
        onChanged();
        return this;
      }

      private int sealRadius_ ;
      /**
       * <code>uint32 seal_radius = 12;</code>
       * @return The sealRadius.
       */
      @java.lang.Override
      public int getSealRadius() {
        return sealRadius_;
      }
      /**
       * <code>uint32 seal_radius = 12;</code>
       * @param value The sealRadius to set.
       * @return This builder for chaining.
       */
      public Builder setSealRadius(int value) {
        
        sealRadius_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_radius = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealRadius() {
        
        sealRadius_ = 0;
        onChanged();
        return this;
      }

      private int battleType_ = 0;
      /**
       * <code>.SealBattleType battle_type = 14;</code>
       * @return The enum numeric value on the wire for battleType.
       */
      @java.lang.Override public int getBattleTypeValue() {
        return battleType_;
      }
      /**
       * <code>.SealBattleType battle_type = 14;</code>
       * @param value The enum numeric value on the wire for battleType to set.
       * @return This builder for chaining.
       */
      public Builder setBattleTypeValue(int value) {
        
        battleType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SealBattleType battle_type = 14;</code>
       * @return The battleType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType getBattleType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType result = emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.valueOf(battleType_);
        return result == null ? emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType.UNRECOGNIZED : result;
      }
      /**
       * <code>.SealBattleType battle_type = 14;</code>
       * @param value The battleType to set.
       * @return This builder for chaining.
       */
      public Builder setBattleType(emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.SealBattleType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        battleType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SealBattleType battle_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBattleType() {
        
        battleType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SealBattleBeginNotify)
    }

    // @@protoc_insertion_point(class_scope:SealBattleBeginNotify)
    private static final emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify();
    }

    public static emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SealBattleBeginNotify>
        PARSER = new com.google.protobuf.AbstractParser<SealBattleBeginNotify>() {
      @java.lang.Override
      public SealBattleBeginNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SealBattleBeginNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SealBattleBeginNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SealBattleBeginNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SealBattleBeginNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SealBattleBeginNotify.proto\032\024SealBattl" +
      "eType.proto\"\205\001\n\025SealBattleBeginNotify\022\031\n" +
      "\021seal_max_progress\030\t \001(\r\022\026\n\016seal_entity_" +
      "id\030\001 \001(\r\022\023\n\013seal_radius\030\014 \001(\r\022$\n\013battle_" +
      "type\030\016 \001(\0162\017.SealBattleTypeB\036\n\034emu.grass" +
      "cutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.getDescriptor(),
        });
    internal_static_SealBattleBeginNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SealBattleBeginNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SealBattleBeginNotify_descriptor,
        new java.lang.String[] { "SealMaxProgress", "SealEntityId", "SealRadius", "BattleType", });
    emu.grasscutter.net.oldproto.SealBattleTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
