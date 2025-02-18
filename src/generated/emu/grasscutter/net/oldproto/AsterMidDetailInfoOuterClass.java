// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterMidDetailInfo.proto

package emu.grasscutter.net.oldproto;

public final class AsterMidDetailInfoOuterClass {
  private AsterMidDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterMidDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterMidDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 begin_time = 10;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> 
        getCampListList();
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo getCampList(int index);
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    int getCampListCount();
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder> 
        getCampListOrBuilderList();
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder getCampListOrBuilder(
        int index);

    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 collect_count = 11;</code>
     * @return The collectCount.
     */
    int getCollectCount();
  }
  /**
   * Protobuf type {@code AsterMidDetailInfo}
   */
  public static final class AsterMidDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterMidDetailInfo)
      AsterMidDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterMidDetailInfo.newBuilder() to construct.
    private AsterMidDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterMidDetailInfo() {
      campList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterMidDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.internal_static_AsterMidDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.internal_static_AsterMidDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.class, emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.Builder.class);
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 10;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 10;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int CAMP_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> campList_;
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> getCampListList() {
      return campList_;
    }
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder> 
        getCampListOrBuilderList() {
      return campList_;
    }
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    @java.lang.Override
    public int getCampListCount() {
      return campList_.size();
    }
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo getCampList(int index) {
      return campList_.get(index);
    }
    /**
     * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder getCampListOrBuilder(
        int index) {
      return campList_.get(index);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 4;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int COLLECT_COUNT_FIELD_NUMBER = 11;
    private int collectCount_;
    /**
     * <code>uint32 collect_count = 11;</code>
     * @return The collectCount.
     */
    @java.lang.Override
    public int getCollectCount() {
      return collectCount_;
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
      if (isOpen_ != false) {
        output.writeBool(4, isOpen_);
      }
      for (int i = 0; i < campList_.size(); i++) {
        output.writeMessage(7, campList_.get(i));
      }
      if (beginTime_ != 0) {
        output.writeUInt32(10, beginTime_);
      }
      if (collectCount_ != 0) {
        output.writeUInt32(11, collectCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isOpen_);
      }
      for (int i = 0; i < campList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, campList_.get(i));
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, beginTime_);
      }
      if (collectCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, collectCount_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo other = (emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo) obj;

      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (!getCampListList()
          .equals(other.getCampListList())) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getCollectCount()
          != other.getCollectCount()) return false;
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
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      if (getCampListCount() > 0) {
        hash = (37 * hash) + CAMP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCampListList().hashCode();
      }
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + COLLECT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCollectCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo prototype) {
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
     * Protobuf type {@code AsterMidDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterMidDetailInfo)
        emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.internal_static_AsterMidDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.internal_static_AsterMidDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.class, emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        beginTime_ = 0;

        if (campListBuilder_ == null) {
          campList_ = java.util.Collections.emptyList();
        } else {
          campList_ = null;
          campListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;

        collectCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.internal_static_AsterMidDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo build() {
        emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo buildPartial() {
        emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo result = new emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.beginTime_ = beginTime_;
        if (campListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            campList_ = java.util.Collections.unmodifiableList(campList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.campList_ = campList_;
        } else {
          result.campList_ = campListBuilder_.build();
        }
        result.isOpen_ = isOpen_;
        result.collectCount_ = collectCount_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo other) {
        if (other == emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo.getDefaultInstance()) return this;
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (campListBuilder_ == null) {
          if (!other.campList_.isEmpty()) {
            if (campList_.isEmpty()) {
              campList_ = other.campList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCampListIsMutable();
              campList_.addAll(other.campList_);
            }
            onChanged();
          }
        } else {
          if (!other.campList_.isEmpty()) {
            if (campListBuilder_.isEmpty()) {
              campListBuilder_.dispose();
              campListBuilder_ = null;
              campList_ = other.campList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              campListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCampListFieldBuilder() : null;
            } else {
              campListBuilder_.addAllMessages(other.campList_);
            }
          }
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getCollectCount() != 0) {
          setCollectCount(other.getCollectCount());
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
              case 32: {
                isOpen_ = input.readBool();

                break;
              } // case 32
              case 58: {
                emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.parser(),
                        extensionRegistry);
                if (campListBuilder_ == null) {
                  ensureCampListIsMutable();
                  campList_.add(m);
                } else {
                  campListBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 80: {
                beginTime_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                collectCount_ = input.readUInt32();

                break;
              } // case 88
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

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 10;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 10;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> campList_ =
        java.util.Collections.emptyList();
      private void ensureCampListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          campList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo>(campList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder> campListBuilder_;

      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> getCampListList() {
        if (campListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(campList_);
        } else {
          return campListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public int getCampListCount() {
        if (campListBuilder_ == null) {
          return campList_.size();
        } else {
          return campListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo getCampList(int index) {
        if (campListBuilder_ == null) {
          return campList_.get(index);
        } else {
          return campListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder setCampList(
          int index, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.set(index, value);
          onChanged();
        } else {
          campListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder setCampList(
          int index, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.set(index, builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder addCampList(emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.add(value);
          onChanged();
        } else {
          campListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder addCampList(
          int index, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.add(index, value);
          onChanged();
        } else {
          campListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder addCampList(
          emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.add(builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder addCampList(
          int index, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.add(index, builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder addAllCampList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo> values) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, campList_);
          onChanged();
        } else {
          campListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder clearCampList() {
        if (campListBuilder_ == null) {
          campList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          campListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public Builder removeCampList(int index) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.remove(index);
          onChanged();
        } else {
          campListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder getCampListBuilder(
          int index) {
        return getCampListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder getCampListOrBuilder(
          int index) {
        if (campListBuilder_ == null) {
          return campList_.get(index);  } else {
          return campListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder> 
           getCampListOrBuilderList() {
        if (campListBuilder_ != null) {
          return campListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(campList_);
        }
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder addCampListBuilder() {
        return getCampListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder addCampListBuilder(
          int index) {
        return getCampListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AsterMidCampInfo camp_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder> 
           getCampListBuilderList() {
        return getCampListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder> 
          getCampListFieldBuilder() {
        if (campListBuilder_ == null) {
          campListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfo.Builder, emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.AsterMidCampInfoOrBuilder>(
                  campList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          campList_ = null;
        }
        return campListBuilder_;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 4;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int collectCount_ ;
      /**
       * <code>uint32 collect_count = 11;</code>
       * @return The collectCount.
       */
      @java.lang.Override
      public int getCollectCount() {
        return collectCount_;
      }
      /**
       * <code>uint32 collect_count = 11;</code>
       * @param value The collectCount to set.
       * @return This builder for chaining.
       */
      public Builder setCollectCount(int value) {
        
        collectCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 collect_count = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCollectCount() {
        
        collectCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AsterMidDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:AsterMidDetailInfo)
    private static final emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo();
    }

    public static emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterMidDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<AsterMidDetailInfo>() {
      @java.lang.Override
      public AsterMidDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AsterMidDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterMidDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AsterMidDetailInfoOuterClass.AsterMidDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterMidDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterMidDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030AsterMidDetailInfo.proto\032\026AsterMidCamp" +
      "Info.proto\"v\n\022AsterMidDetailInfo\022\022\n\nbegi" +
      "n_time\030\n \001(\r\022$\n\tcamp_list\030\007 \003(\0132\021.AsterM" +
      "idCampInfo\022\017\n\007is_open\030\004 \001(\010\022\025\n\rcollect_c" +
      "ount\030\013 \001(\rB\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.getDescriptor(),
        });
    internal_static_AsterMidDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterMidDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterMidDetailInfo_descriptor,
        new java.lang.String[] { "BeginTime", "CampList", "IsOpen", "CollectCount", });
    emu.grasscutter.net.oldproto.AsterMidCampInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
