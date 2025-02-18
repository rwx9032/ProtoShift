// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusCardInfo.proto

package emu.grasscutter.net.newproto;

public final class InBattleMechanicusCardInfoOuterClass {
  private InBattleMechanicusCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_KCIEINMEPDH = 2;</code>
     * @return The unk3300KCIEINMEPDH.
     */
    int getUnk3300KCIEINMEPDH();

    /**
     * <code>uint32 Unk3300_NDAOOKKGJPH = 7;</code>
     * @return The unk3300NDAOOKKGJPH.
     */
    int getUnk3300NDAOOKKGJPH();

    /**
     * <code>uint32 cost_points = 5;</code>
     * @return The costPoints.
     */
    int getCostPoints();

    /**
     * <code>uint32 card_id = 3;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 Unk3300_FNAHKHODBKN = 13;</code>
     * @return The unk3300FNAHKHODBKN.
     */
    int getUnk3300FNAHKHODBKN();

    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
     * @return The enum numeric value on the wire for challengeState.
     */
    int getChallengeStateValue();
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
     * @return The challengeState.
     */
    emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState();
  }
  /**
   * Protobuf type {@code InBattleMechanicusCardInfo}
   */
  public static final class InBattleMechanicusCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusCardInfo)
      InBattleMechanicusCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusCardInfo.newBuilder() to construct.
    private InBattleMechanicusCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusCardInfo() {
      challengeState_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusCardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.class, emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.Builder.class);
    }

    public static final int UNK3300_KCIEINMEPDH_FIELD_NUMBER = 2;
    private int unk3300KCIEINMEPDH_;
    /**
     * <code>uint32 Unk3300_KCIEINMEPDH = 2;</code>
     * @return The unk3300KCIEINMEPDH.
     */
    @java.lang.Override
    public int getUnk3300KCIEINMEPDH() {
      return unk3300KCIEINMEPDH_;
    }

    public static final int UNK3300_NDAOOKKGJPH_FIELD_NUMBER = 7;
    private int unk3300NDAOOKKGJPH_;
    /**
     * <code>uint32 Unk3300_NDAOOKKGJPH = 7;</code>
     * @return The unk3300NDAOOKKGJPH.
     */
    @java.lang.Override
    public int getUnk3300NDAOOKKGJPH() {
      return unk3300NDAOOKKGJPH_;
    }

    public static final int COST_POINTS_FIELD_NUMBER = 5;
    private int costPoints_;
    /**
     * <code>uint32 cost_points = 5;</code>
     * @return The costPoints.
     */
    @java.lang.Override
    public int getCostPoints() {
      return costPoints_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 3;
    private int cardId_;
    /**
     * <code>uint32 card_id = 3;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int UNK3300_FNAHKHODBKN_FIELD_NUMBER = 13;
    private int unk3300FNAHKHODBKN_;
    /**
     * <code>uint32 Unk3300_FNAHKHODBKN = 13;</code>
     * @return The unk3300FNAHKHODBKN.
     */
    @java.lang.Override
    public int getUnk3300FNAHKHODBKN() {
      return unk3300FNAHKHODBKN_;
    }

    public static final int CHALLENGE_STATE_FIELD_NUMBER = 15;
    private int challengeState_;
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
     * @return The enum numeric value on the wire for challengeState.
     */
    @java.lang.Override public int getChallengeStateValue() {
      return challengeState_;
    }
    /**
     * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
     * @return The challengeState.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState result = emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.valueOf(challengeState_);
      return result == null ? emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.UNRECOGNIZED : result;
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
      if (unk3300KCIEINMEPDH_ != 0) {
        output.writeUInt32(2, unk3300KCIEINMEPDH_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(3, cardId_);
      }
      if (costPoints_ != 0) {
        output.writeUInt32(5, costPoints_);
      }
      if (unk3300NDAOOKKGJPH_ != 0) {
        output.writeUInt32(7, unk3300NDAOOKKGJPH_);
      }
      if (unk3300FNAHKHODBKN_ != 0) {
        output.writeUInt32(13, unk3300FNAHKHODBKN_);
      }
      if (challengeState_ != emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_NONE.getNumber()) {
        output.writeEnum(15, challengeState_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300KCIEINMEPDH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300KCIEINMEPDH_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cardId_);
      }
      if (costPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, costPoints_);
      }
      if (unk3300NDAOOKKGJPH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300NDAOOKKGJPH_);
      }
      if (unk3300FNAHKHODBKN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300FNAHKHODBKN_);
      }
      if (challengeState_ != emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.IN_BATTLE_MECHANICUS_CARD_CHALLENGE_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, challengeState_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo other = (emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo) obj;

      if (getUnk3300KCIEINMEPDH()
          != other.getUnk3300KCIEINMEPDH()) return false;
      if (getUnk3300NDAOOKKGJPH()
          != other.getUnk3300NDAOOKKGJPH()) return false;
      if (getCostPoints()
          != other.getCostPoints()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (getUnk3300FNAHKHODBKN()
          != other.getUnk3300FNAHKHODBKN()) return false;
      if (challengeState_ != other.challengeState_) return false;
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
      hash = (37 * hash) + UNK3300_KCIEINMEPDH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KCIEINMEPDH();
      hash = (37 * hash) + UNK3300_NDAOOKKGJPH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NDAOOKKGJPH();
      hash = (37 * hash) + COST_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCostPoints();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + UNK3300_FNAHKHODBKN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FNAHKHODBKN();
      hash = (37 * hash) + CHALLENGE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + challengeState_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo prototype) {
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
     * Protobuf type {@code InBattleMechanicusCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusCardInfo)
        emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.class, emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300KCIEINMEPDH_ = 0;

        unk3300NDAOOKKGJPH_ = 0;

        costPoints_ = 0;

        cardId_ = 0;

        unk3300FNAHKHODBKN_ = 0;

        challengeState_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.internal_static_InBattleMechanicusCardInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo build() {
        emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo buildPartial() {
        emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo result = new emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo(this);
        result.unk3300KCIEINMEPDH_ = unk3300KCIEINMEPDH_;
        result.unk3300NDAOOKKGJPH_ = unk3300NDAOOKKGJPH_;
        result.costPoints_ = costPoints_;
        result.cardId_ = cardId_;
        result.unk3300FNAHKHODBKN_ = unk3300FNAHKHODBKN_;
        result.challengeState_ = challengeState_;
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
        if (other instanceof emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo other) {
        if (other == emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo.getDefaultInstance()) return this;
        if (other.getUnk3300KCIEINMEPDH() != 0) {
          setUnk3300KCIEINMEPDH(other.getUnk3300KCIEINMEPDH());
        }
        if (other.getUnk3300NDAOOKKGJPH() != 0) {
          setUnk3300NDAOOKKGJPH(other.getUnk3300NDAOOKKGJPH());
        }
        if (other.getCostPoints() != 0) {
          setCostPoints(other.getCostPoints());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getUnk3300FNAHKHODBKN() != 0) {
          setUnk3300FNAHKHODBKN(other.getUnk3300FNAHKHODBKN());
        }
        if (other.challengeState_ != 0) {
          setChallengeStateValue(other.getChallengeStateValue());
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
                unk3300KCIEINMEPDH_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                cardId_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                costPoints_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                unk3300NDAOOKKGJPH_ = input.readUInt32();

                break;
              } // case 56
              case 104: {
                unk3300FNAHKHODBKN_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                challengeState_ = input.readEnum();

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

      private int unk3300KCIEINMEPDH_ ;
      /**
       * <code>uint32 Unk3300_KCIEINMEPDH = 2;</code>
       * @return The unk3300KCIEINMEPDH.
       */
      @java.lang.Override
      public int getUnk3300KCIEINMEPDH() {
        return unk3300KCIEINMEPDH_;
      }
      /**
       * <code>uint32 Unk3300_KCIEINMEPDH = 2;</code>
       * @param value The unk3300KCIEINMEPDH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KCIEINMEPDH(int value) {
        
        unk3300KCIEINMEPDH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KCIEINMEPDH = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KCIEINMEPDH() {
        
        unk3300KCIEINMEPDH_ = 0;
        onChanged();
        return this;
      }

      private int unk3300NDAOOKKGJPH_ ;
      /**
       * <code>uint32 Unk3300_NDAOOKKGJPH = 7;</code>
       * @return The unk3300NDAOOKKGJPH.
       */
      @java.lang.Override
      public int getUnk3300NDAOOKKGJPH() {
        return unk3300NDAOOKKGJPH_;
      }
      /**
       * <code>uint32 Unk3300_NDAOOKKGJPH = 7;</code>
       * @param value The unk3300NDAOOKKGJPH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NDAOOKKGJPH(int value) {
        
        unk3300NDAOOKKGJPH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NDAOOKKGJPH = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NDAOOKKGJPH() {
        
        unk3300NDAOOKKGJPH_ = 0;
        onChanged();
        return this;
      }

      private int costPoints_ ;
      /**
       * <code>uint32 cost_points = 5;</code>
       * @return The costPoints.
       */
      @java.lang.Override
      public int getCostPoints() {
        return costPoints_;
      }
      /**
       * <code>uint32 cost_points = 5;</code>
       * @param value The costPoints to set.
       * @return This builder for chaining.
       */
      public Builder setCostPoints(int value) {
        
        costPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_points = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostPoints() {
        
        costPoints_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 3;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 3;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FNAHKHODBKN_ ;
      /**
       * <code>uint32 Unk3300_FNAHKHODBKN = 13;</code>
       * @return The unk3300FNAHKHODBKN.
       */
      @java.lang.Override
      public int getUnk3300FNAHKHODBKN() {
        return unk3300FNAHKHODBKN_;
      }
      /**
       * <code>uint32 Unk3300_FNAHKHODBKN = 13;</code>
       * @param value The unk3300FNAHKHODBKN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FNAHKHODBKN(int value) {
        
        unk3300FNAHKHODBKN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FNAHKHODBKN = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FNAHKHODBKN() {
        
        unk3300FNAHKHODBKN_ = 0;
        onChanged();
        return this;
      }

      private int challengeState_ = 0;
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
       * @return The enum numeric value on the wire for challengeState.
       */
      @java.lang.Override public int getChallengeStateValue() {
        return challengeState_;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
       * @param value The enum numeric value on the wire for challengeState to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeStateValue(int value) {
        
        challengeState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
       * @return The challengeState.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState getChallengeState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState result = emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.valueOf(challengeState_);
        return result == null ? emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState.UNRECOGNIZED : result;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
       * @param value The challengeState to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeState(emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.InBattleMechanicusCardChallengeState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        challengeState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InBattleMechanicusCardChallengeState challenge_state = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeState() {
        
        challengeState_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusCardInfo)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusCardInfo)
    private static final emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo();
    }

    public static emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusCardInfo>() {
      @java.lang.Override
      public InBattleMechanicusCardInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleMechanicusCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.InBattleMechanicusCardInfoOuterClass.InBattleMechanicusCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n InBattleMechanicusCardInfo.proto\032*InBa" +
      "ttleMechanicusCardChallengeState.proto\"\331" +
      "\001\n\032InBattleMechanicusCardInfo\022\033\n\023Unk3300" +
      "_KCIEINMEPDH\030\002 \001(\r\022\033\n\023Unk3300_NDAOOKKGJP" +
      "H\030\007 \001(\r\022\023\n\013cost_points\030\005 \001(\r\022\017\n\007card_id\030" +
      "\003 \001(\r\022\033\n\023Unk3300_FNAHKHODBKN\030\r \001(\r\022>\n\017ch" +
      "allenge_state\030\017 \001(\0162%.InBattleMechanicus" +
      "CardChallengeStateB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.getDescriptor(),
        });
    internal_static_InBattleMechanicusCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusCardInfo_descriptor,
        new java.lang.String[] { "Unk3300KCIEINMEPDH", "Unk3300NDAOOKKGJPH", "CostPoints", "CardId", "Unk3300FNAHKHODBKN", "ChallengeState", });
    emu.grasscutter.net.newproto.InBattleMechanicusCardChallengeStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
