// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeSprintBoatSettleNotify.proto

package emu.grasscutter.net.newproto;

public final class SummerTimeSprintBoatSettleNotifyOuterClass {
  private SummerTimeSprintBoatSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeSprintBoatSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeSprintBoatSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 left_time = 2;</code>
     * @return The leftTime.
     */
    int getLeftTime();

    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 Unk3300_PLFMJPNPPLI = 12;</code>
     * @return The unk3300PLFMJPNPPLI.
     */
    int getUnk3300PLFMJPNPPLI();

    /**
     * <code>uint32 total_num = 10;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 Unk3300_MEEKFJJIOKE = 14;</code>
     * @return The unk3300MEEKFJJIOKE.
     */
    int getUnk3300MEEKFJJIOKE();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8451;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SummerTimeSprintBoatSettleNotify}
   */
  public static final class SummerTimeSprintBoatSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeSprintBoatSettleNotify)
      SummerTimeSprintBoatSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeSprintBoatSettleNotify.newBuilder() to construct.
    private SummerTimeSprintBoatSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeSprintBoatSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeSprintBoatSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.internal_static_SummerTimeSprintBoatSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.internal_static_SummerTimeSprintBoatSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.class, emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 6;
    private int score_;
    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int LEFT_TIME_FIELD_NUMBER = 2;
    private int leftTime_;
    /**
     * <code>uint32 left_time = 2;</code>
     * @return The leftTime.
     */
    @java.lang.Override
    public int getLeftTime() {
      return leftTime_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 5;
    private int groupId_;
    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int UNK3300_PLFMJPNPPLI_FIELD_NUMBER = 12;
    private int unk3300PLFMJPNPPLI_;
    /**
     * <code>uint32 Unk3300_PLFMJPNPPLI = 12;</code>
     * @return The unk3300PLFMJPNPPLI.
     */
    @java.lang.Override
    public int getUnk3300PLFMJPNPPLI() {
      return unk3300PLFMJPNPPLI_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 10;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 10;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 15;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int UNK3300_MEEKFJJIOKE_FIELD_NUMBER = 14;
    private int unk3300MEEKFJJIOKE_;
    /**
     * <code>uint32 Unk3300_MEEKFJJIOKE = 14;</code>
     * @return The unk3300MEEKFJJIOKE.
     */
    @java.lang.Override
    public int getUnk3300MEEKFJJIOKE() {
      return unk3300MEEKFJJIOKE_;
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
      if (leftTime_ != 0) {
        output.writeUInt32(2, leftTime_);
      }
      if (isSuccess_ != false) {
        output.writeBool(4, isSuccess_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(5, groupId_);
      }
      if (score_ != 0) {
        output.writeUInt32(6, score_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(10, totalNum_);
      }
      if (unk3300PLFMJPNPPLI_ != 0) {
        output.writeUInt32(12, unk3300PLFMJPNPPLI_);
      }
      if (unk3300MEEKFJJIOKE_ != 0) {
        output.writeUInt32(14, unk3300MEEKFJJIOKE_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(15, isNewRecord_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (leftTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, leftTime_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isSuccess_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, groupId_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, score_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, totalNum_);
      }
      if (unk3300PLFMJPNPPLI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3300PLFMJPNPPLI_);
      }
      if (unk3300MEEKFJJIOKE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300MEEKFJJIOKE_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify other = (emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getLeftTime()
          != other.getLeftTime()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getUnk3300PLFMJPNPPLI()
          != other.getUnk3300PLFMJPNPPLI()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getUnk3300MEEKFJJIOKE()
          != other.getUnk3300MEEKFJJIOKE()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + LEFT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLeftTime();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + UNK3300_PLFMJPNPPLI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300PLFMJPNPPLI();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + UNK3300_MEEKFJJIOKE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MEEKFJJIOKE();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify prototype) {
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
     *   CMD_ID = 8451;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SummerTimeSprintBoatSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeSprintBoatSettleNotify)
        emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.internal_static_SummerTimeSprintBoatSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.internal_static_SummerTimeSprintBoatSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.class, emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        score_ = 0;

        leftTime_ = 0;

        isSuccess_ = false;

        groupId_ = 0;

        unk3300PLFMJPNPPLI_ = 0;

        totalNum_ = 0;

        isNewRecord_ = false;

        unk3300MEEKFJJIOKE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.internal_static_SummerTimeSprintBoatSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify build() {
        emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify buildPartial() {
        emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify result = new emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify(this);
        result.score_ = score_;
        result.leftTime_ = leftTime_;
        result.isSuccess_ = isSuccess_;
        result.groupId_ = groupId_;
        result.unk3300PLFMJPNPPLI_ = unk3300PLFMJPNPPLI_;
        result.totalNum_ = totalNum_;
        result.isNewRecord_ = isNewRecord_;
        result.unk3300MEEKFJJIOKE_ = unk3300MEEKFJJIOKE_;
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
        if (other instanceof emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify other) {
        if (other == emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getLeftTime() != 0) {
          setLeftTime(other.getLeftTime());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getUnk3300PLFMJPNPPLI() != 0) {
          setUnk3300PLFMJPNPPLI(other.getUnk3300PLFMJPNPPLI());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getUnk3300MEEKFJJIOKE() != 0) {
          setUnk3300MEEKFJJIOKE(other.getUnk3300MEEKFJJIOKE());
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
              case 16: {
                leftTime_ = input.readUInt32();

                break;
              } // case 16
              case 32: {
                isSuccess_ = input.readBool();

                break;
              } // case 32
              case 40: {
                groupId_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                score_ = input.readUInt32();

                break;
              } // case 48
              case 80: {
                totalNum_ = input.readUInt32();

                break;
              } // case 80
              case 96: {
                unk3300PLFMJPNPPLI_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                unk3300MEEKFJJIOKE_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                isNewRecord_ = input.readBool();

                break;
              } // case 120
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

      private int score_ ;
      /**
       * <code>uint32 score = 6;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int leftTime_ ;
      /**
       * <code>uint32 left_time = 2;</code>
       * @return The leftTime.
       */
      @java.lang.Override
      public int getLeftTime() {
        return leftTime_;
      }
      /**
       * <code>uint32 left_time = 2;</code>
       * @param value The leftTime to set.
       * @return This builder for chaining.
       */
      public Builder setLeftTime(int value) {
        
        leftTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftTime() {
        
        leftTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 4;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 5;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300PLFMJPNPPLI_ ;
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 12;</code>
       * @return The unk3300PLFMJPNPPLI.
       */
      @java.lang.Override
      public int getUnk3300PLFMJPNPPLI() {
        return unk3300PLFMJPNPPLI_;
      }
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 12;</code>
       * @param value The unk3300PLFMJPNPPLI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300PLFMJPNPPLI(int value) {
        
        unk3300PLFMJPNPPLI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300PLFMJPNPPLI() {
        
        unk3300PLFMJPNPPLI_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 10;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 10;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 15;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int unk3300MEEKFJJIOKE_ ;
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 14;</code>
       * @return The unk3300MEEKFJJIOKE.
       */
      @java.lang.Override
      public int getUnk3300MEEKFJJIOKE() {
        return unk3300MEEKFJJIOKE_;
      }
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 14;</code>
       * @param value The unk3300MEEKFJJIOKE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MEEKFJJIOKE(int value) {
        
        unk3300MEEKFJJIOKE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MEEKFJJIOKE() {
        
        unk3300MEEKFJJIOKE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeSprintBoatSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeSprintBoatSettleNotify)
    private static final emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify();
    }

    public static emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeSprintBoatSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeSprintBoatSettleNotify>() {
      @java.lang.Override
      public SummerTimeSprintBoatSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SummerTimeSprintBoatSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeSprintBoatSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SummerTimeSprintBoatSettleNotifyOuterClass.SummerTimeSprintBoatSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeSprintBoatSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeSprintBoatSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&SummerTimeSprintBoatSettleNotify.proto" +
      "\"\316\001\n SummerTimeSprintBoatSettleNotify\022\r\n" +
      "\005score\030\006 \001(\r\022\021\n\tleft_time\030\002 \001(\r\022\022\n\nis_su" +
      "ccess\030\004 \001(\010\022\020\n\010group_id\030\005 \001(\r\022\033\n\023Unk3300" +
      "_PLFMJPNPPLI\030\014 \001(\r\022\021\n\ttotal_num\030\n \001(\r\022\025\n" +
      "\ris_new_record\030\017 \001(\010\022\033\n\023Unk3300_MEEKFJJI" +
      "OKE\030\016 \001(\rB\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeSprintBoatSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeSprintBoatSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeSprintBoatSettleNotify_descriptor,
        new java.lang.String[] { "Score", "LeftTime", "IsSuccess", "GroupId", "Unk3300PLFMJPNPPLI", "TotalNum", "IsNewRecord", "Unk3300MEEKFJJIOKE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
