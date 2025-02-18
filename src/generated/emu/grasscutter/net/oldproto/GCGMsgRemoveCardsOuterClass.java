// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgRemoveCards.proto

package emu.grasscutter.net.oldproto;

public final class GCGMsgRemoveCardsOuterClass {
  private GCGMsgRemoveCardsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgRemoveCardsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgRemoveCards)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 15;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>.GCGZoneType zone = 10;</code>
     * @return The enum numeric value on the wire for zone.
     */
    int getZoneValue();
    /**
     * <code>.GCGZoneType zone = 10;</code>
     * @return The zone.
     */
    emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType getZone();

    /**
     * <code>.GCGReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GCGReason reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason();

    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @return A list containing the cardGuidList.
     */
    java.util.List<java.lang.Integer> getCardGuidListList();
    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @return The count of cardGuidList.
     */
    int getCardGuidListCount();
    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    int getCardGuidList(int index);
  }
  /**
   * Protobuf type {@code GCGMsgRemoveCards}
   */
  public static final class GCGMsgRemoveCards extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgRemoveCards)
      GCGMsgRemoveCardsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgRemoveCards.newBuilder() to construct.
    private GCGMsgRemoveCards(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgRemoveCards() {
      zone_ = 0;
      reason_ = 0;
      cardGuidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgRemoveCards();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.internal_static_GCGMsgRemoveCards_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.internal_static_GCGMsgRemoveCards_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.class, emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 15;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 15;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int ZONE_FIELD_NUMBER = 10;
    private int zone_;
    /**
     * <code>.GCGZoneType zone = 10;</code>
     * @return The enum numeric value on the wire for zone.
     */
    @java.lang.Override public int getZoneValue() {
      return zone_;
    }
    /**
     * <code>.GCGZoneType zone = 10;</code>
     * @return The zone.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType getZone() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType result = emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.valueOf(zone_);
      return result == null ? emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.GCGReason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GCGReason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
    }

    public static final int CARD_GUID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList cardGuidList_;
    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @return A list containing the cardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardGuidListList() {
      return cardGuidList_;
    }
    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @return The count of cardGuidList.
     */
    public int getCardGuidListCount() {
      return cardGuidList_.size();
    }
    /**
     * <code>repeated uint32 card_guid_list = 1;</code>
     * @param index The index of the element to return.
     * @return The cardGuidList at the given index.
     */
    public int getCardGuidList(int index) {
      return cardGuidList_.getInt(index);
    }
    private int cardGuidListMemoizedSerializedSize = -1;

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
      if (getCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(cardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardGuidList_.size(); i++) {
        output.writeUInt32NoTag(cardGuidList_.getInt(i));
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (zone_ != emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        output.writeEnum(10, zone_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(15, controllerId_);
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
        for (int i = 0; i < cardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardGuidListMemoizedSerializedSize = dataSize;
      }
      if (reason_ != emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.GCG_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (zone_ != emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.GCG_ZONE_TYPE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, zone_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards other = (emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (zone_ != other.zone_) return false;
      if (reason_ != other.reason_) return false;
      if (!getCardGuidListList()
          .equals(other.getCardGuidListList())) return false;
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + ZONE_FIELD_NUMBER;
      hash = (53 * hash) + zone_;
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      if (getCardGuidListCount() > 0) {
        hash = (37 * hash) + CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards prototype) {
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
     * Protobuf type {@code GCGMsgRemoveCards}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgRemoveCards)
        emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCardsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.internal_static_GCGMsgRemoveCards_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.internal_static_GCGMsgRemoveCards_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.class, emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        controllerId_ = 0;

        zone_ = 0;

        reason_ = 0;

        cardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.internal_static_GCGMsgRemoveCards_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards build() {
        emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards buildPartial() {
        emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards result = new emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards(this);
        int from_bitField0_ = bitField0_;
        result.controllerId_ = controllerId_;
        result.zone_ = zone_;
        result.reason_ = reason_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardGuidList_ = cardGuidList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards other) {
        if (other == emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.zone_ != 0) {
          setZoneValue(other.getZoneValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.cardGuidList_.isEmpty()) {
          if (cardGuidList_.isEmpty()) {
            cardGuidList_ = other.cardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardGuidListIsMutable();
            cardGuidList_.addAll(other.cardGuidList_);
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
              case 8: {
                int v = input.readUInt32();
                ensureCardGuidListIsMutable();
                cardGuidList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardGuidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 40: {
                reason_ = input.readEnum();

                break;
              } // case 40
              case 80: {
                zone_ = input.readEnum();

                break;
              } // case 80
              case 120: {
                controllerId_ = input.readUInt32();

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
      private int bitField0_;

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 15;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 15;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int zone_ = 0;
      /**
       * <code>.GCGZoneType zone = 10;</code>
       * @return The enum numeric value on the wire for zone.
       */
      @java.lang.Override public int getZoneValue() {
        return zone_;
      }
      /**
       * <code>.GCGZoneType zone = 10;</code>
       * @param value The enum numeric value on the wire for zone to set.
       * @return This builder for chaining.
       */
      public Builder setZoneValue(int value) {
        
        zone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zone = 10;</code>
       * @return The zone.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType getZone() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType result = emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.valueOf(zone_);
        return result == null ? emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGZoneType zone = 10;</code>
       * @param value The zone to set.
       * @return This builder for chaining.
       */
      public Builder setZone(emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.GCGZoneType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        zone_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGZoneType zone = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearZone() {
        
        zone_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GCGReason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GCGReason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason result = emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGReason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.GCGReasonOuterClass.GCGReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGReason reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cardGuidList_ = emptyIntList();
      private void ensureCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardGuidList_ = mutableCopy(cardGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @return A list containing the cardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCardGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardGuidList_) : cardGuidList_;
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @return The count of cardGuidList.
       */
      public int getCardGuidListCount() {
        return cardGuidList_.size();
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @param index The index of the element to return.
       * @return The cardGuidList at the given index.
       */
      public int getCardGuidList(int index) {
        return cardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The cardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuidList(
          int index, int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @param value The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCardGuidList(int value) {
        ensureCardGuidListIsMutable();
        cardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @param values The cardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_guid_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuidList() {
        cardGuidList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGMsgRemoveCards)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgRemoveCards)
    private static final emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards();
    }

    public static emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgRemoveCards>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgRemoveCards>() {
      @java.lang.Override
      public GCGMsgRemoveCards parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgRemoveCards> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgRemoveCards> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGMsgRemoveCardsOuterClass.GCGMsgRemoveCards getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgRemoveCards_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgRemoveCards_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GCGMsgRemoveCards.proto\032\017GCGReason.pro" +
      "to\032\021GCGZoneType.proto\"z\n\021GCGMsgRemoveCar" +
      "ds\022\025\n\rcontroller_id\030\017 \001(\r\022\032\n\004zone\030\n \001(\0162" +
      "\014.GCGZoneType\022\032\n\006reason\030\005 \001(\0162\n.GCGReaso" +
      "n\022\026\n\016card_guid_list\030\001 \003(\rB\036\n\034emu.grasscu" +
      "tter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor(),
          emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgRemoveCards_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgRemoveCards_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgRemoveCards_descriptor,
        new java.lang.String[] { "ControllerId", "Zone", "Reason", "CardGuidList", });
    emu.grasscutter.net.oldproto.GCGReasonOuterClass.getDescriptor();
    emu.grasscutter.net.oldproto.GCGZoneTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
