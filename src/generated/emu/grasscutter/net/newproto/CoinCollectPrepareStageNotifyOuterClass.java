// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectPrepareStageNotify.proto

package emu.grasscutter.net.newproto;

public final class CoinCollectPrepareStageNotifyOuterClass {
  private CoinCollectPrepareStageNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectPrepareStageNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectPrepareStageNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     * @return Whether the coinCollectInfo field is set.
     */
    boolean hasCoinCollectInfo();
    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     * @return The coinCollectInfo.
     */
    emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getCoinCollectInfo();
    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     */
    emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder getCoinCollectInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6408;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CoinCollectPrepareStageNotify}
   */
  public static final class CoinCollectPrepareStageNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectPrepareStageNotify)
      CoinCollectPrepareStageNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectPrepareStageNotify.newBuilder() to construct.
    private CoinCollectPrepareStageNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectPrepareStageNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectPrepareStageNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.internal_static_CoinCollectPrepareStageNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.internal_static_CoinCollectPrepareStageNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.class, emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.Builder.class);
    }

    public static final int COIN_COLLECT_INFO_FIELD_NUMBER = 11;
    private emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo coinCollectInfo_;
    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     * @return Whether the coinCollectInfo field is set.
     */
    @java.lang.Override
    public boolean hasCoinCollectInfo() {
      return coinCollectInfo_ != null;
    }
    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     * @return The coinCollectInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getCoinCollectInfo() {
      return coinCollectInfo_ == null ? emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.getDefaultInstance() : coinCollectInfo_;
    }
    /**
     * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder getCoinCollectInfoOrBuilder() {
      return getCoinCollectInfo();
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
      if (coinCollectInfo_ != null) {
        output.writeMessage(11, getCoinCollectInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coinCollectInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getCoinCollectInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify other = (emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify) obj;

      if (hasCoinCollectInfo() != other.hasCoinCollectInfo()) return false;
      if (hasCoinCollectInfo()) {
        if (!getCoinCollectInfo()
            .equals(other.getCoinCollectInfo())) return false;
      }
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
      if (hasCoinCollectInfo()) {
        hash = (37 * hash) + COIN_COLLECT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCoinCollectInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify prototype) {
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
     *   CMD_ID = 6408;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CoinCollectPrepareStageNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectPrepareStageNotify)
        emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.internal_static_CoinCollectPrepareStageNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.internal_static_CoinCollectPrepareStageNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.class, emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (coinCollectInfoBuilder_ == null) {
          coinCollectInfo_ = null;
        } else {
          coinCollectInfo_ = null;
          coinCollectInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.internal_static_CoinCollectPrepareStageNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify build() {
        emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify buildPartial() {
        emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify result = new emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify(this);
        if (coinCollectInfoBuilder_ == null) {
          result.coinCollectInfo_ = coinCollectInfo_;
        } else {
          result.coinCollectInfo_ = coinCollectInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify other) {
        if (other == emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify.getDefaultInstance()) return this;
        if (other.hasCoinCollectInfo()) {
          mergeCoinCollectInfo(other.getCoinCollectInfo());
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
              case 90: {
                input.readMessage(
                    getCoinCollectInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 90
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

      private emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo coinCollectInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder> coinCollectInfoBuilder_;
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       * @return Whether the coinCollectInfo field is set.
       */
      public boolean hasCoinCollectInfo() {
        return coinCollectInfoBuilder_ != null || coinCollectInfo_ != null;
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       * @return The coinCollectInfo.
       */
      public emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getCoinCollectInfo() {
        if (coinCollectInfoBuilder_ == null) {
          return coinCollectInfo_ == null ? emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.getDefaultInstance() : coinCollectInfo_;
        } else {
          return coinCollectInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public Builder setCoinCollectInfo(emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo value) {
        if (coinCollectInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          coinCollectInfo_ = value;
          onChanged();
        } else {
          coinCollectInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public Builder setCoinCollectInfo(
          emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder builderForValue) {
        if (coinCollectInfoBuilder_ == null) {
          coinCollectInfo_ = builderForValue.build();
          onChanged();
        } else {
          coinCollectInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public Builder mergeCoinCollectInfo(emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo value) {
        if (coinCollectInfoBuilder_ == null) {
          if (coinCollectInfo_ != null) {
            coinCollectInfo_ =
              emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.newBuilder(coinCollectInfo_).mergeFrom(value).buildPartial();
          } else {
            coinCollectInfo_ = value;
          }
          onChanged();
        } else {
          coinCollectInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public Builder clearCoinCollectInfo() {
        if (coinCollectInfoBuilder_ == null) {
          coinCollectInfo_ = null;
          onChanged();
        } else {
          coinCollectInfo_ = null;
          coinCollectInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder getCoinCollectInfoBuilder() {
        
        onChanged();
        return getCoinCollectInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      public emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder getCoinCollectInfoOrBuilder() {
        if (coinCollectInfoBuilder_ != null) {
          return coinCollectInfoBuilder_.getMessageOrBuilder();
        } else {
          return coinCollectInfo_ == null ?
              emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.getDefaultInstance() : coinCollectInfo_;
        }
      }
      /**
       * <code>.CoinCollectStageInfo coin_collect_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder> 
          getCoinCollectInfoFieldBuilder() {
        if (coinCollectInfoBuilder_ == null) {
          coinCollectInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder, emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder>(
                  getCoinCollectInfo(),
                  getParentForChildren(),
                  isClean());
          coinCollectInfo_ = null;
        }
        return coinCollectInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectPrepareStageNotify)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectPrepareStageNotify)
    private static final emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify();
    }

    public static emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectPrepareStageNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectPrepareStageNotify>() {
      @java.lang.Override
      public CoinCollectPrepareStageNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CoinCollectPrepareStageNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectPrepareStageNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CoinCollectPrepareStageNotifyOuterClass.CoinCollectPrepareStageNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectPrepareStageNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectPrepareStageNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#CoinCollectPrepareStageNotify.proto\032\032C" +
      "oinCollectStageInfo.proto\"Q\n\035CoinCollect" +
      "PrepareStageNotify\0220\n\021coin_collect_info\030" +
      "\013 \001(\0132\025.CoinCollectStageInfoB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.getDescriptor(),
        });
    internal_static_CoinCollectPrepareStageNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectPrepareStageNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectPrepareStageNotify_descriptor,
        new java.lang.String[] { "CoinCollectInfo", });
    emu.grasscutter.net.newproto.CoinCollectStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
