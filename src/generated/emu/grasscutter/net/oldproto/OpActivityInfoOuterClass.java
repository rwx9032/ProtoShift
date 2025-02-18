// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpActivityInfo.proto

package emu.grasscutter.net.oldproto;

public final class OpActivityInfoOuterClass {
  private OpActivityInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpActivityInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpActivityInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 2;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>uint32 end_time = 6;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 begin_time = 5;</code>
     * @return The beginTime.
     */
    int getBeginTime();

    /**
     * <code>bool is_has_change = 1;</code>
     * @return The isHasChange.
     */
    boolean getIsHasChange();

    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     * @return Whether the bonusInfo field is set.
     */
    boolean hasBonusInfo();
    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     * @return The bonusInfo.
     */
    emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo();
    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     */
    emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder();

    public emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.DetailCase getDetailCase();
  }
  /**
   * Protobuf type {@code OpActivityInfo}
   */
  public static final class OpActivityInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpActivityInfo)
      OpActivityInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpActivityInfo.newBuilder() to construct.
    private OpActivityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpActivityInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpActivityInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.class, emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.Builder.class);
    }

    private int detailCase_ = 0;
    private java.lang.Object detail_;
    public enum DetailCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      BONUS_INFO(12),
      DETAIL_NOT_SET(0);
      private final int value;
      private DetailCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailCase forNumber(int value) {
        switch (value) {
          case 12: return BONUS_INFO;
          case 0: return DETAIL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailCase
    getDetailCase() {
      return DetailCase.forNumber(
          detailCase_);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 2;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 6;
    private int endTime_;
    /**
     * <code>uint32 end_time = 6;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 5;
    private int beginTime_;
    /**
     * <code>uint32 begin_time = 5;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }

    public static final int IS_HAS_CHANGE_FIELD_NUMBER = 1;
    private boolean isHasChange_;
    /**
     * <code>bool is_has_change = 1;</code>
     * @return The isHasChange.
     */
    @java.lang.Override
    public boolean getIsHasChange() {
      return isHasChange_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 13;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int BONUS_INFO_FIELD_NUMBER = 12;
    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     * @return Whether the bonusInfo field is set.
     */
    @java.lang.Override
    public boolean hasBonusInfo() {
      return detailCase_ == 12;
    }
    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     * @return The bonusInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo() {
      if (detailCase_ == 12) {
         return (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_;
      }
      return emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
    }
    /**
     * <code>.BonusOpActivityInfo bonus_info = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder() {
      if (detailCase_ == 12) {
         return (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_;
      }
      return emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
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
      if (isHasChange_ != false) {
        output.writeBool(1, isHasChange_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(2, activityId_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(5, beginTime_);
      }
      if (endTime_ != 0) {
        output.writeUInt32(6, endTime_);
      }
      if (detailCase_ == 12) {
        output.writeMessage(12, (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(13, scheduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHasChange_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isHasChange_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, activityId_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, beginTime_);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, endTime_);
      }
      if (detailCase_ == 12) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo other = (emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getIsHasChange()
          != other.getIsHasChange()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!getDetailCase().equals(other.getDetailCase())) return false;
      switch (detailCase_) {
        case 12:
          if (!getBonusInfo()
              .equals(other.getBonusInfo())) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (37 * hash) + IS_HAS_CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHasChange());
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      switch (detailCase_) {
        case 12:
          hash = (37 * hash) + BONUS_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getBonusInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo prototype) {
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
     * Protobuf type {@code OpActivityInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpActivityInfo)
        emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.class, emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        endTime_ = 0;

        beginTime_ = 0;

        isHasChange_ = false;

        scheduleId_ = 0;

        if (bonusInfoBuilder_ != null) {
          bonusInfoBuilder_.clear();
        }
        detailCase_ = 0;
        detail_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.internal_static_OpActivityInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo build() {
        emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo buildPartial() {
        emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo result = new emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo(this);
        result.activityId_ = activityId_;
        result.endTime_ = endTime_;
        result.beginTime_ = beginTime_;
        result.isHasChange_ = isHasChange_;
        result.scheduleId_ = scheduleId_;
        if (detailCase_ == 12) {
          if (bonusInfoBuilder_ == null) {
            result.detail_ = detail_;
          } else {
            result.detail_ = bonusInfoBuilder_.build();
          }
        }
        result.detailCase_ = detailCase_;
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
        if (other instanceof emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo other) {
        if (other == emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getIsHasChange() != false) {
          setIsHasChange(other.getIsHasChange());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        switch (other.getDetailCase()) {
          case BONUS_INFO: {
            mergeBonusInfo(other.getBonusInfo());
            break;
          }
          case DETAIL_NOT_SET: {
            break;
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
              case 8: {
                isHasChange_ = input.readBool();

                break;
              } // case 8
              case 16: {
                activityId_ = input.readUInt32();

                break;
              } // case 16
              case 40: {
                beginTime_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                endTime_ = input.readUInt32();

                break;
              } // case 48
              case 98: {
                input.readMessage(
                    getBonusInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                detailCase_ = 12;
                break;
              } // case 98
              case 104: {
                scheduleId_ = input.readUInt32();

                break;
              } // case 104
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
      private int detailCase_ = 0;
      private java.lang.Object detail_;
      public DetailCase
          getDetailCase() {
        return DetailCase.forNumber(
            detailCase_);
      }

      public Builder clearDetail() {
        detailCase_ = 0;
        detail_ = null;
        onChanged();
        return this;
      }


      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 2;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 2;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 6;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 6;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 5;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 5;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isHasChange_ ;
      /**
       * <code>bool is_has_change = 1;</code>
       * @return The isHasChange.
       */
      @java.lang.Override
      public boolean getIsHasChange() {
        return isHasChange_;
      }
      /**
       * <code>bool is_has_change = 1;</code>
       * @param value The isHasChange to set.
       * @return This builder for chaining.
       */
      public Builder setIsHasChange(boolean value) {
        
        isHasChange_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_has_change = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHasChange() {
        
        isHasChange_ = false;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder> bonusInfoBuilder_;
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       * @return Whether the bonusInfo field is set.
       */
      @java.lang.Override
      public boolean hasBonusInfo() {
        return detailCase_ == 12;
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       * @return The bonusInfo.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo getBonusInfo() {
        if (bonusInfoBuilder_ == null) {
          if (detailCase_ == 12) {
            return (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_;
          }
          return emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
        } else {
          if (detailCase_ == 12) {
            return bonusInfoBuilder_.getMessage();
          }
          return emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      public Builder setBonusInfo(emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo value) {
        if (bonusInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          bonusInfoBuilder_.setMessage(value);
        }
        detailCase_ = 12;
        return this;
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      public Builder setBonusInfo(
          emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder builderForValue) {
        if (bonusInfoBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          bonusInfoBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 12;
        return this;
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      public Builder mergeBonusInfo(emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo value) {
        if (bonusInfoBuilder_ == null) {
          if (detailCase_ == 12 &&
              detail_ != emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance()) {
            detail_ = emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.newBuilder((emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 12) {
            bonusInfoBuilder_.mergeFrom(value);
          } else {
            bonusInfoBuilder_.setMessage(value);
          }
        }
        detailCase_ = 12;
        return this;
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      public Builder clearBonusInfo() {
        if (bonusInfoBuilder_ == null) {
          if (detailCase_ == 12) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 12) {
            detailCase_ = 0;
            detail_ = null;
          }
          bonusInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      public emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder getBonusInfoBuilder() {
        return getBonusInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder getBonusInfoOrBuilder() {
        if ((detailCase_ == 12) && (bonusInfoBuilder_ != null)) {
          return bonusInfoBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 12) {
            return (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_;
          }
          return emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.BonusOpActivityInfo bonus_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder> 
          getBonusInfoFieldBuilder() {
        if (bonusInfoBuilder_ == null) {
          if (!(detailCase_ == 12)) {
            detail_ = emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.getDefaultInstance();
          }
          bonusInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo.Builder, emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfoOrBuilder>(
                  (emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.BonusOpActivityInfo) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 12;
        onChanged();;
        return bonusInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OpActivityInfo)
    }

    // @@protoc_insertion_point(class_scope:OpActivityInfo)
    private static final emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo();
    }

    public static emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpActivityInfo>
        PARSER = new com.google.protobuf.AbstractParser<OpActivityInfo>() {
      @java.lang.Override
      public OpActivityInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpActivityInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpActivityInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.OpActivityInfoOuterClass.OpActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpActivityInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpActivityInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024OpActivityInfo.proto\032\031BonusOpActivityI" +
      "nfo.proto\"\255\001\n\016OpActivityInfo\022\023\n\013activity" +
      "_id\030\002 \001(\r\022\020\n\010end_time\030\006 \001(\r\022\022\n\nbegin_tim" +
      "e\030\005 \001(\r\022\025\n\ris_has_change\030\001 \001(\010\022\023\n\013schedu" +
      "le_id\030\r \001(\r\022*\n\nbonus_info\030\014 \001(\0132\024.BonusO" +
      "pActivityInfoH\000B\010\n\006detailB\036\n\034emu.grasscu" +
      "tter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_OpActivityInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpActivityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpActivityInfo_descriptor,
        new java.lang.String[] { "ActivityId", "EndTime", "BeginTime", "IsHasChange", "ScheduleId", "BonusInfo", "Detail", });
    emu.grasscutter.net.oldproto.BonusOpActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
