// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingGallerySettleNotify.proto

package emu.grasscutter.net.oldproto;

public final class FungusFighterTrainingGallerySettleNotifyOuterClass {
  private FungusFighterTrainingGallerySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingGallerySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingGallerySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 14;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 total_used_time = 4;</code>
     * @return The totalUsedTime.
     */
    int getTotalUsedTime();

    /**
     * <code>.GalleryStopReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>uint32 dead_fungus_num = 1;</code>
     * @return The deadFungusNum.
     */
    int getDeadFungusNum();

    /**
     * <code>uint32 settle_round = 15;</code>
     * @return The settleRound.
     */
    int getSettleRound();

    /**
     * <code>bool is_final_settle = 10;</code>
     * @return The isFinalSettle.
     */
    boolean getIsFinalSettle();

    /**
     * <code>uint32 gadget_life_percentage = 11;</code>
     * @return The gadgetLifePercentage.
     */
    int getGadgetLifePercentage();

    /**
     * <code>uint32 final_score = 9;</code>
     * @return The finalScore.
     */
    int getFinalScore();
  }
  /**
   * <pre>
   * CmdId: 23931
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FungusFighterTrainingGallerySettleNotify}
   */
  public static final class FungusFighterTrainingGallerySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingGallerySettleNotify)
      FungusFighterTrainingGallerySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingGallerySettleNotify.newBuilder() to construct.
    private FungusFighterTrainingGallerySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingGallerySettleNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingGallerySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.class, emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 14;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 14;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int TOTAL_USED_TIME_FIELD_NUMBER = 4;
    private int totalUsedTime_;
    /**
     * <code>uint32 total_used_time = 4;</code>
     * @return The totalUsedTime.
     */
    @java.lang.Override
    public int getTotalUsedTime() {
      return totalUsedTime_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int DEAD_FUNGUS_NUM_FIELD_NUMBER = 1;
    private int deadFungusNum_;
    /**
     * <code>uint32 dead_fungus_num = 1;</code>
     * @return The deadFungusNum.
     */
    @java.lang.Override
    public int getDeadFungusNum() {
      return deadFungusNum_;
    }

    public static final int SETTLE_ROUND_FIELD_NUMBER = 15;
    private int settleRound_;
    /**
     * <code>uint32 settle_round = 15;</code>
     * @return The settleRound.
     */
    @java.lang.Override
    public int getSettleRound() {
      return settleRound_;
    }

    public static final int IS_FINAL_SETTLE_FIELD_NUMBER = 10;
    private boolean isFinalSettle_;
    /**
     * <code>bool is_final_settle = 10;</code>
     * @return The isFinalSettle.
     */
    @java.lang.Override
    public boolean getIsFinalSettle() {
      return isFinalSettle_;
    }

    public static final int GADGET_LIFE_PERCENTAGE_FIELD_NUMBER = 11;
    private int gadgetLifePercentage_;
    /**
     * <code>uint32 gadget_life_percentage = 11;</code>
     * @return The gadgetLifePercentage.
     */
    @java.lang.Override
    public int getGadgetLifePercentage() {
      return gadgetLifePercentage_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 9;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 9;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
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
      if (deadFungusNum_ != 0) {
        output.writeUInt32(1, deadFungusNum_);
      }
      if (totalUsedTime_ != 0) {
        output.writeUInt32(4, totalUsedTime_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(9, finalScore_);
      }
      if (isFinalSettle_ != false) {
        output.writeBool(10, isFinalSettle_);
      }
      if (gadgetLifePercentage_ != 0) {
        output.writeUInt32(11, gadgetLifePercentage_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(14, isNewRecord_);
      }
      if (settleRound_ != 0) {
        output.writeUInt32(15, settleRound_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (deadFungusNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, deadFungusNum_);
      }
      if (totalUsedTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, totalUsedTime_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, finalScore_);
      }
      if (isFinalSettle_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinalSettle_);
      }
      if (gadgetLifePercentage_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, gadgetLifePercentage_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isNewRecord_);
      }
      if (settleRound_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, settleRound_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify other = (emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getTotalUsedTime()
          != other.getTotalUsedTime()) return false;
      if (reason_ != other.reason_) return false;
      if (getDeadFungusNum()
          != other.getDeadFungusNum()) return false;
      if (getSettleRound()
          != other.getSettleRound()) return false;
      if (getIsFinalSettle()
          != other.getIsFinalSettle()) return false;
      if (getGadgetLifePercentage()
          != other.getGadgetLifePercentage()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + TOTAL_USED_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTotalUsedTime();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + DEAD_FUNGUS_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getDeadFungusNum();
      hash = (37 * hash) + SETTLE_ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getSettleRound();
      hash = (37 * hash) + IS_FINAL_SETTLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinalSettle());
      hash = (37 * hash) + GADGET_LIFE_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetLifePercentage();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify prototype) {
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
     * CmdId: 23931
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FungusFighterTrainingGallerySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingGallerySettleNotify)
        emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.class, emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isNewRecord_ = false;

        totalUsedTime_ = 0;

        reason_ = 0;

        deadFungusNum_ = 0;

        settleRound_ = 0;

        isFinalSettle_ = false;

        gadgetLifePercentage_ = 0;

        finalScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify build() {
        emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify buildPartial() {
        emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify result = new emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify(this);
        result.isNewRecord_ = isNewRecord_;
        result.totalUsedTime_ = totalUsedTime_;
        result.reason_ = reason_;
        result.deadFungusNum_ = deadFungusNum_;
        result.settleRound_ = settleRound_;
        result.isFinalSettle_ = isFinalSettle_;
        result.gadgetLifePercentage_ = gadgetLifePercentage_;
        result.finalScore_ = finalScore_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify other) {
        if (other == emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getTotalUsedTime() != 0) {
          setTotalUsedTime(other.getTotalUsedTime());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getDeadFungusNum() != 0) {
          setDeadFungusNum(other.getDeadFungusNum());
        }
        if (other.getSettleRound() != 0) {
          setSettleRound(other.getSettleRound());
        }
        if (other.getIsFinalSettle() != false) {
          setIsFinalSettle(other.getIsFinalSettle());
        }
        if (other.getGadgetLifePercentage() != 0) {
          setGadgetLifePercentage(other.getGadgetLifePercentage());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
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
                deadFungusNum_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                totalUsedTime_ = input.readUInt32();

                break;
              } // case 32
              case 40: {
                reason_ = input.readEnum();

                break;
              } // case 40
              case 72: {
                finalScore_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                isFinalSettle_ = input.readBool();

                break;
              } // case 80
              case 88: {
                gadgetLifePercentage_ = input.readUInt32();

                break;
              } // case 88
              case 112: {
                isNewRecord_ = input.readBool();

                break;
              } // case 112
              case 120: {
                settleRound_ = input.readUInt32();

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

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 14;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 14;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int totalUsedTime_ ;
      /**
       * <code>uint32 total_used_time = 4;</code>
       * @return The totalUsedTime.
       */
      @java.lang.Override
      public int getTotalUsedTime() {
        return totalUsedTime_;
      }
      /**
       * <code>uint32 total_used_time = 4;</code>
       * @param value The totalUsedTime to set.
       * @return This builder for chaining.
       */
      public Builder setTotalUsedTime(int value) {
        
        totalUsedTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_used_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalUsedTime() {
        
        totalUsedTime_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int deadFungusNum_ ;
      /**
       * <code>uint32 dead_fungus_num = 1;</code>
       * @return The deadFungusNum.
       */
      @java.lang.Override
      public int getDeadFungusNum() {
        return deadFungusNum_;
      }
      /**
       * <code>uint32 dead_fungus_num = 1;</code>
       * @param value The deadFungusNum to set.
       * @return This builder for chaining.
       */
      public Builder setDeadFungusNum(int value) {
        
        deadFungusNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dead_fungus_num = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeadFungusNum() {
        
        deadFungusNum_ = 0;
        onChanged();
        return this;
      }

      private int settleRound_ ;
      /**
       * <code>uint32 settle_round = 15;</code>
       * @return The settleRound.
       */
      @java.lang.Override
      public int getSettleRound() {
        return settleRound_;
      }
      /**
       * <code>uint32 settle_round = 15;</code>
       * @param value The settleRound to set.
       * @return This builder for chaining.
       */
      public Builder setSettleRound(int value) {
        
        settleRound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 settle_round = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSettleRound() {
        
        settleRound_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinalSettle_ ;
      /**
       * <code>bool is_final_settle = 10;</code>
       * @return The isFinalSettle.
       */
      @java.lang.Override
      public boolean getIsFinalSettle() {
        return isFinalSettle_;
      }
      /**
       * <code>bool is_final_settle = 10;</code>
       * @param value The isFinalSettle to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinalSettle(boolean value) {
        
        isFinalSettle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_final_settle = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinalSettle() {
        
        isFinalSettle_ = false;
        onChanged();
        return this;
      }

      private int gadgetLifePercentage_ ;
      /**
       * <code>uint32 gadget_life_percentage = 11;</code>
       * @return The gadgetLifePercentage.
       */
      @java.lang.Override
      public int getGadgetLifePercentage() {
        return gadgetLifePercentage_;
      }
      /**
       * <code>uint32 gadget_life_percentage = 11;</code>
       * @param value The gadgetLifePercentage to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetLifePercentage(int value) {
        
        gadgetLifePercentage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_life_percentage = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetLifePercentage() {
        
        gadgetLifePercentage_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 9;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 9;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingGallerySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingGallerySettleNotify)
    private static final emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify();
    }

    public static emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingGallerySettleNotify>() {
      @java.lang.Override
      public FungusFighterTrainingGallerySettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingGallerySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FungusFighterTrainingGallerySettleNotifyOuterClass.FungusFighterTrainingGallerySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingGallerySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.FungusFighterTrainingGallerySettleNoti" +
      "fy.proto\032\027GalleryStopReason.proto\"\373\001\n(Fu" +
      "ngusFighterTrainingGallerySettleNotify\022\025" +
      "\n\ris_new_record\030\016 \001(\010\022\027\n\017total_used_time" +
      "\030\004 \001(\r\022\"\n\006reason\030\005 \001(\0162\022.GalleryStopReas" +
      "on\022\027\n\017dead_fungus_num\030\001 \001(\r\022\024\n\014settle_ro" +
      "und\030\017 \001(\r\022\027\n\017is_final_settle\030\n \001(\010\022\036\n\026ga" +
      "dget_life_percentage\030\013 \001(\r\022\023\n\013final_scor" +
      "e\030\t \001(\rB\036\n\034emu.grasscutter.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_FungusFighterTrainingGallerySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingGallerySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingGallerySettleNotify_descriptor,
        new java.lang.String[] { "IsNewRecord", "TotalUsedTime", "Reason", "DeadFungusNum", "SettleRound", "IsFinalSettle", "GadgetLifePercentage", "FinalScore", });
    emu.grasscutter.net.oldproto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
