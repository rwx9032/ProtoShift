// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IslandPartyRaftInfoNotify.proto

package emu.grasscutter.net.newproto;

public final class IslandPartyRaftInfoNotifyOuterClass {
  private IslandPartyRaftInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IslandPartyRaftInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IslandPartyRaftInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_HNECEGNMKNK = 4;</code>
     * @return The unk3300HNECEGNMKNK.
     */
    int getUnk3300HNECEGNMKNK();

    /**
     * <code>uint32 Unk3300_FBACMOFGPGJ = 1;</code>
     * @return The unk3300FBACMOFGPGJ.
     */
    int getUnk3300FBACMOFGPGJ();

    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 coin = 14;</code>
     * @return The coin.
     */
    int getCoin();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5589;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IslandPartyRaftInfoNotify}
   */
  public static final class IslandPartyRaftInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IslandPartyRaftInfoNotify)
      IslandPartyRaftInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IslandPartyRaftInfoNotify.newBuilder() to construct.
    private IslandPartyRaftInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IslandPartyRaftInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IslandPartyRaftInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.internal_static_IslandPartyRaftInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.internal_static_IslandPartyRaftInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.class, emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.Builder.class);
    }

    public static final int UNK3300_HNECEGNMKNK_FIELD_NUMBER = 4;
    private int unk3300HNECEGNMKNK_;
    /**
     * <code>uint32 Unk3300_HNECEGNMKNK = 4;</code>
     * @return The unk3300HNECEGNMKNK.
     */
    @java.lang.Override
    public int getUnk3300HNECEGNMKNK() {
      return unk3300HNECEGNMKNK_;
    }

    public static final int UNK3300_FBACMOFGPGJ_FIELD_NUMBER = 1;
    private int unk3300FBACMOFGPGJ_;
    /**
     * <code>uint32 Unk3300_FBACMOFGPGJ = 1;</code>
     * @return The unk3300FBACMOFGPGJ.
     */
    @java.lang.Override
    public int getUnk3300FBACMOFGPGJ() {
      return unk3300FBACMOFGPGJ_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 8;
    private int pointId_;
    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int COIN_FIELD_NUMBER = 14;
    private int coin_;
    /**
     * <code>uint32 coin = 14;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
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
      if (unk3300FBACMOFGPGJ_ != 0) {
        output.writeUInt32(1, unk3300FBACMOFGPGJ_);
      }
      if (unk3300HNECEGNMKNK_ != 0) {
        output.writeUInt32(4, unk3300HNECEGNMKNK_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(8, pointId_);
      }
      if (coin_ != 0) {
        output.writeUInt32(14, coin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300FBACMOFGPGJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300FBACMOFGPGJ_);
      }
      if (unk3300HNECEGNMKNK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300HNECEGNMKNK_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, pointId_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, coin_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify other = (emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify) obj;

      if (getUnk3300HNECEGNMKNK()
          != other.getUnk3300HNECEGNMKNK()) return false;
      if (getUnk3300FBACMOFGPGJ()
          != other.getUnk3300FBACMOFGPGJ()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getCoin()
          != other.getCoin()) return false;
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
      hash = (37 * hash) + UNK3300_HNECEGNMKNK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HNECEGNMKNK();
      hash = (37 * hash) + UNK3300_FBACMOFGPGJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FBACMOFGPGJ();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 5589;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IslandPartyRaftInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IslandPartyRaftInfoNotify)
        emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.internal_static_IslandPartyRaftInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.internal_static_IslandPartyRaftInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.class, emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300HNECEGNMKNK_ = 0;

        unk3300FBACMOFGPGJ_ = 0;

        pointId_ = 0;

        coin_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.internal_static_IslandPartyRaftInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify build() {
        emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify buildPartial() {
        emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify result = new emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify(this);
        result.unk3300HNECEGNMKNK_ = unk3300HNECEGNMKNK_;
        result.unk3300FBACMOFGPGJ_ = unk3300FBACMOFGPGJ_;
        result.pointId_ = pointId_;
        result.coin_ = coin_;
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
        if (other instanceof emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify other) {
        if (other == emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify.getDefaultInstance()) return this;
        if (other.getUnk3300HNECEGNMKNK() != 0) {
          setUnk3300HNECEGNMKNK(other.getUnk3300HNECEGNMKNK());
        }
        if (other.getUnk3300FBACMOFGPGJ() != 0) {
          setUnk3300FBACMOFGPGJ(other.getUnk3300FBACMOFGPGJ());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
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
                unk3300FBACMOFGPGJ_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                unk3300HNECEGNMKNK_ = input.readUInt32();

                break;
              } // case 32
              case 64: {
                pointId_ = input.readUInt32();

                break;
              } // case 64
              case 112: {
                coin_ = input.readUInt32();

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

      private int unk3300HNECEGNMKNK_ ;
      /**
       * <code>uint32 Unk3300_HNECEGNMKNK = 4;</code>
       * @return The unk3300HNECEGNMKNK.
       */
      @java.lang.Override
      public int getUnk3300HNECEGNMKNK() {
        return unk3300HNECEGNMKNK_;
      }
      /**
       * <code>uint32 Unk3300_HNECEGNMKNK = 4;</code>
       * @param value The unk3300HNECEGNMKNK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HNECEGNMKNK(int value) {
        
        unk3300HNECEGNMKNK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HNECEGNMKNK = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HNECEGNMKNK() {
        
        unk3300HNECEGNMKNK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FBACMOFGPGJ_ ;
      /**
       * <code>uint32 Unk3300_FBACMOFGPGJ = 1;</code>
       * @return The unk3300FBACMOFGPGJ.
       */
      @java.lang.Override
      public int getUnk3300FBACMOFGPGJ() {
        return unk3300FBACMOFGPGJ_;
      }
      /**
       * <code>uint32 Unk3300_FBACMOFGPGJ = 1;</code>
       * @param value The unk3300FBACMOFGPGJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FBACMOFGPGJ(int value) {
        
        unk3300FBACMOFGPGJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FBACMOFGPGJ = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FBACMOFGPGJ() {
        
        unk3300FBACMOFGPGJ_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 8;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int coin_ ;
      /**
       * <code>uint32 coin = 14;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 14;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        
        coin_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IslandPartyRaftInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:IslandPartyRaftInfoNotify)
    private static final emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify();
    }

    public static emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IslandPartyRaftInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<IslandPartyRaftInfoNotify>() {
      @java.lang.Override
      public IslandPartyRaftInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<IslandPartyRaftInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IslandPartyRaftInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.IslandPartyRaftInfoNotifyOuterClass.IslandPartyRaftInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IslandPartyRaftInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IslandPartyRaftInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037IslandPartyRaftInfoNotify.proto\"u\n\031Isl" +
      "andPartyRaftInfoNotify\022\033\n\023Unk3300_HNECEG" +
      "NMKNK\030\004 \001(\r\022\033\n\023Unk3300_FBACMOFGPGJ\030\001 \001(\r" +
      "\022\020\n\010point_id\030\010 \001(\r\022\014\n\004coin\030\016 \001(\rB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IslandPartyRaftInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IslandPartyRaftInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IslandPartyRaftInfoNotify_descriptor,
        new java.lang.String[] { "Unk3300HNECEGNMKNK", "Unk3300FBACMOFGPGJ", "PointId", "Coin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
