// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerRecordHandbookRsp.proto

package emu.grasscutter.net.newproto;

public final class TowerRecordHandbookRspOuterClass {
  private TowerRecordHandbookRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerRecordHandbookRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerRecordHandbookRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> 
        getMonthlyDetailListList();
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getMonthlyDetailList(int index);
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    int getMonthlyDetailListCount();
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder> 
        getMonthlyDetailListOrBuilderList();
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder getMonthlyDetailListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2475;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TowerRecordHandbookRsp}
   */
  public static final class TowerRecordHandbookRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerRecordHandbookRsp)
      TowerRecordHandbookRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerRecordHandbookRsp.newBuilder() to construct.
    private TowerRecordHandbookRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerRecordHandbookRsp() {
      monthlyDetailList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerRecordHandbookRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.internal_static_TowerRecordHandbookRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.internal_static_TowerRecordHandbookRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.class, emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.Builder.class);
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

    public static final int MONTHLY_DETAIL_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> monthlyDetailList_;
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> getMonthlyDetailListList() {
      return monthlyDetailList_;
    }
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder> 
        getMonthlyDetailListOrBuilderList() {
      return monthlyDetailList_;
    }
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    @java.lang.Override
    public int getMonthlyDetailListCount() {
      return monthlyDetailList_.size();
    }
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getMonthlyDetailList(int index) {
      return monthlyDetailList_.get(index);
    }
    /**
     * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder getMonthlyDetailListOrBuilder(
        int index) {
      return monthlyDetailList_.get(index);
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
      for (int i = 0; i < monthlyDetailList_.size(); i++) {
        output.writeMessage(4, monthlyDetailList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < monthlyDetailList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, monthlyDetailList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp other = (emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getMonthlyDetailListList()
          .equals(other.getMonthlyDetailListList())) return false;
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
      if (getMonthlyDetailListCount() > 0) {
        hash = (37 * hash) + MONTHLY_DETAIL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonthlyDetailListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp prototype) {
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
     *   CMD_ID = 2475;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TowerRecordHandbookRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerRecordHandbookRsp)
        emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.internal_static_TowerRecordHandbookRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.internal_static_TowerRecordHandbookRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.class, emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.newBuilder()
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

        if (monthlyDetailListBuilder_ == null) {
          monthlyDetailList_ = java.util.Collections.emptyList();
        } else {
          monthlyDetailList_ = null;
          monthlyDetailListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.internal_static_TowerRecordHandbookRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp build() {
        emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp buildPartial() {
        emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp result = new emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (monthlyDetailListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            monthlyDetailList_ = java.util.Collections.unmodifiableList(monthlyDetailList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.monthlyDetailList_ = monthlyDetailList_;
        } else {
          result.monthlyDetailList_ = monthlyDetailListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp other) {
        if (other == emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (monthlyDetailListBuilder_ == null) {
          if (!other.monthlyDetailList_.isEmpty()) {
            if (monthlyDetailList_.isEmpty()) {
              monthlyDetailList_ = other.monthlyDetailList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMonthlyDetailListIsMutable();
              monthlyDetailList_.addAll(other.monthlyDetailList_);
            }
            onChanged();
          }
        } else {
          if (!other.monthlyDetailList_.isEmpty()) {
            if (monthlyDetailListBuilder_.isEmpty()) {
              monthlyDetailListBuilder_.dispose();
              monthlyDetailListBuilder_ = null;
              monthlyDetailList_ = other.monthlyDetailList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              monthlyDetailListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonthlyDetailListFieldBuilder() : null;
            } else {
              monthlyDetailListBuilder_.addAllMessages(other.monthlyDetailList_);
            }
          }
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
              case 34: {
                emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.parser(),
                        extensionRegistry);
                if (monthlyDetailListBuilder_ == null) {
                  ensureMonthlyDetailListIsMutable();
                  monthlyDetailList_.add(m);
                } else {
                  monthlyDetailListBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
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

      private java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> monthlyDetailList_ =
        java.util.Collections.emptyList();
      private void ensureMonthlyDetailListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          monthlyDetailList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail>(monthlyDetailList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder> monthlyDetailListBuilder_;

      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> getMonthlyDetailListList() {
        if (monthlyDetailListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monthlyDetailList_);
        } else {
          return monthlyDetailListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public int getMonthlyDetailListCount() {
        if (monthlyDetailListBuilder_ == null) {
          return monthlyDetailList_.size();
        } else {
          return monthlyDetailListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail getMonthlyDetailList(int index) {
        if (monthlyDetailListBuilder_ == null) {
          return monthlyDetailList_.get(index);
        } else {
          return monthlyDetailListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder setMonthlyDetailList(
          int index, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail value) {
        if (monthlyDetailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.set(index, value);
          onChanged();
        } else {
          monthlyDetailListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder setMonthlyDetailList(
          int index, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder builderForValue) {
        if (monthlyDetailListBuilder_ == null) {
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.set(index, builderForValue.build());
          onChanged();
        } else {
          monthlyDetailListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder addMonthlyDetailList(emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail value) {
        if (monthlyDetailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.add(value);
          onChanged();
        } else {
          monthlyDetailListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder addMonthlyDetailList(
          int index, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail value) {
        if (monthlyDetailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.add(index, value);
          onChanged();
        } else {
          monthlyDetailListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder addMonthlyDetailList(
          emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder builderForValue) {
        if (monthlyDetailListBuilder_ == null) {
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.add(builderForValue.build());
          onChanged();
        } else {
          monthlyDetailListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder addMonthlyDetailList(
          int index, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder builderForValue) {
        if (monthlyDetailListBuilder_ == null) {
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.add(index, builderForValue.build());
          onChanged();
        } else {
          monthlyDetailListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder addAllMonthlyDetailList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail> values) {
        if (monthlyDetailListBuilder_ == null) {
          ensureMonthlyDetailListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monthlyDetailList_);
          onChanged();
        } else {
          monthlyDetailListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder clearMonthlyDetailList() {
        if (monthlyDetailListBuilder_ == null) {
          monthlyDetailList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          monthlyDetailListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public Builder removeMonthlyDetailList(int index) {
        if (monthlyDetailListBuilder_ == null) {
          ensureMonthlyDetailListIsMutable();
          monthlyDetailList_.remove(index);
          onChanged();
        } else {
          monthlyDetailListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder getMonthlyDetailListBuilder(
          int index) {
        return getMonthlyDetailListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder getMonthlyDetailListOrBuilder(
          int index) {
        if (monthlyDetailListBuilder_ == null) {
          return monthlyDetailList_.get(index);  } else {
          return monthlyDetailListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder> 
           getMonthlyDetailListOrBuilderList() {
        if (monthlyDetailListBuilder_ != null) {
          return monthlyDetailListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monthlyDetailList_);
        }
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder addMonthlyDetailListBuilder() {
        return getMonthlyDetailListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder addMonthlyDetailListBuilder(
          int index) {
        return getMonthlyDetailListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerMonthlyDetail monthly_detail_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder> 
           getMonthlyDetailListBuilderList() {
        return getMonthlyDetailListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder> 
          getMonthlyDetailListFieldBuilder() {
        if (monthlyDetailListBuilder_ == null) {
          monthlyDetailListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetail.Builder, emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.TowerMonthlyDetailOrBuilder>(
                  monthlyDetailList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          monthlyDetailList_ = null;
        }
        return monthlyDetailListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerRecordHandbookRsp)
    }

    // @@protoc_insertion_point(class_scope:TowerRecordHandbookRsp)
    private static final emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp();
    }

    public static emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerRecordHandbookRsp>
        PARSER = new com.google.protobuf.AbstractParser<TowerRecordHandbookRsp>() {
      @java.lang.Override
      public TowerRecordHandbookRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerRecordHandbookRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerRecordHandbookRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.TowerRecordHandbookRspOuterClass.TowerRecordHandbookRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerRecordHandbookRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerRecordHandbookRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TowerRecordHandbookRsp.proto\032\030TowerMon" +
      "thlyDetail.proto\"[\n\026TowerRecordHandbookR" +
      "sp\022\017\n\007retcode\030\010 \001(\005\0220\n\023monthly_detail_li" +
      "st\030\004 \003(\0132\023.TowerMonthlyDetailB\036\n\034emu.gra" +
      "sscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.getDescriptor(),
        });
    internal_static_TowerRecordHandbookRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerRecordHandbookRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerRecordHandbookRsp_descriptor,
        new java.lang.String[] { "Retcode", "MonthlyDetailList", });
    emu.grasscutter.net.newproto.TowerMonthlyDetailOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
