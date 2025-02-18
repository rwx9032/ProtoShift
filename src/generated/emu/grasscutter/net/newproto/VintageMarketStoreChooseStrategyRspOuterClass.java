// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketStoreChooseStrategyRsp.proto

package emu.grasscutter.net.newproto;

public final class VintageMarketStoreChooseStrategyRspOuterClass {
  private VintageMarketStoreChooseStrategyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketStoreChooseStrategyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketStoreChooseStrategyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 store_id = 11;</code>
     * @return The storeId.
     */
    int getStoreId();

    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @return A list containing the strategyList.
     */
    java.util.List<java.lang.Integer> getStrategyListList();
    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @return The count of strategyList.
     */
    int getStrategyListCount();
    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    int getStrategyList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 21298;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code VintageMarketStoreChooseStrategyRsp}
   */
  public static final class VintageMarketStoreChooseStrategyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketStoreChooseStrategyRsp)
      VintageMarketStoreChooseStrategyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketStoreChooseStrategyRsp.newBuilder() to construct.
    private VintageMarketStoreChooseStrategyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketStoreChooseStrategyRsp() {
      strategyList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketStoreChooseStrategyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.class, emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STORE_ID_FIELD_NUMBER = 11;
    private int storeId_;
    /**
     * <code>uint32 store_id = 11;</code>
     * @return The storeId.
     */
    @java.lang.Override
    public int getStoreId() {
      return storeId_;
    }

    public static final int STRATEGY_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList strategyList_;
    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @return A list containing the strategyList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getStrategyListList() {
      return strategyList_;
    }
    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @return The count of strategyList.
     */
    public int getStrategyListCount() {
      return strategyList_.size();
    }
    /**
     * <code>repeated uint32 strategy_list = 3;</code>
     * @param index The index of the element to return.
     * @return The strategyList at the given index.
     */
    public int getStrategyList(int index) {
      return strategyList_.getInt(index);
    }
    private int strategyListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getStrategyListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(strategyListMemoizedSerializedSize);
      }
      for (int i = 0; i < strategyList_.size(); i++) {
        output.writeUInt32NoTag(strategyList_.getInt(i));
      }
      if (storeId_ != 0) {
        output.writeUInt32(11, storeId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < strategyList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(strategyList_.getInt(i));
        }
        size += dataSize;
        if (!getStrategyListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        strategyListMemoizedSerializedSize = dataSize;
      }
      if (storeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, storeId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp other = (emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getStoreId()
          != other.getStoreId()) return false;
      if (!getStrategyListList()
          .equals(other.getStrategyListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + STORE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStoreId();
      if (getStrategyListCount() > 0) {
        hash = (37 * hash) + STRATEGY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStrategyListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp prototype) {
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
     *   CMD_ID = 21298;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code VintageMarketStoreChooseStrategyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketStoreChooseStrategyRsp)
        emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.class, emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        storeId_ = 0;

        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp build() {
        emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp buildPartial() {
        emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp result = new emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.storeId_ = storeId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          strategyList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.strategyList_ = strategyList_;
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
        if (other instanceof emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp other) {
        if (other == emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getStoreId() != 0) {
          setStoreId(other.getStoreId());
        }
        if (!other.strategyList_.isEmpty()) {
          if (strategyList_.isEmpty()) {
            strategyList_ = other.strategyList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStrategyListIsMutable();
            strategyList_.addAll(other.strategyList_);
          }
          onChanged();
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
              case 24: {
                int v = input.readUInt32();
                ensureStrategyListIsMutable();
                strategyList_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureStrategyListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  strategyList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
              case 88: {
                storeId_ = input.readUInt32();

                break;
              } // case 88
              case 112: {
                retcode_ = input.readInt32();

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
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int storeId_ ;
      /**
       * <code>uint32 store_id = 11;</code>
       * @return The storeId.
       */
      @java.lang.Override
      public int getStoreId() {
        return storeId_;
      }
      /**
       * <code>uint32 store_id = 11;</code>
       * @param value The storeId to set.
       * @return This builder for chaining.
       */
      public Builder setStoreId(int value) {
        
        storeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 store_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreId() {
        
        storeId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList strategyList_ = emptyIntList();
      private void ensureStrategyListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          strategyList_ = mutableCopy(strategyList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @return A list containing the strategyList.
       */
      public java.util.List<java.lang.Integer>
          getStrategyListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(strategyList_) : strategyList_;
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @return The count of strategyList.
       */
      public int getStrategyListCount() {
        return strategyList_.size();
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @param index The index of the element to return.
       * @return The strategyList at the given index.
       */
      public int getStrategyList(int index) {
        return strategyList_.getInt(index);
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The strategyList to set.
       * @return This builder for chaining.
       */
      public Builder setStrategyList(
          int index, int value) {
        ensureStrategyListIsMutable();
        strategyList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @param value The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addStrategyList(int value) {
        ensureStrategyListIsMutable();
        strategyList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @param values The strategyList to add.
       * @return This builder for chaining.
       */
      public Builder addAllStrategyList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStrategyListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, strategyList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 strategy_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStrategyList() {
        strategyList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:VintageMarketStoreChooseStrategyRsp)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketStoreChooseStrategyRsp)
    private static final emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp();
    }

    public static emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketStoreChooseStrategyRsp>() {
      @java.lang.Override
      public VintageMarketStoreChooseStrategyRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketStoreChooseStrategyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.VintageMarketStoreChooseStrategyRspOuterClass.VintageMarketStoreChooseStrategyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketStoreChooseStrategyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)VintageMarketStoreChooseStrategyRsp.pr" +
      "oto\"_\n#VintageMarketStoreChooseStrategyR" +
      "sp\022\017\n\007retcode\030\016 \001(\005\022\020\n\010store_id\030\013 \001(\r\022\025\n" +
      "\rstrategy_list\030\003 \003(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageMarketStoreChooseStrategyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketStoreChooseStrategyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketStoreChooseStrategyRsp_descriptor,
        new java.lang.String[] { "Retcode", "StoreId", "StrategyList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
