// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantSubFieldData.proto

package emu.grasscutter.net.oldproto;

public final class HomePlantSubFieldDataOuterClass {
  private HomePlantSubFieldDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantSubFieldDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantSubFieldData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @return A list containing the entityIdList.
     */
    java.util.List<java.lang.Integer> getEntityIdListList();
    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @return The count of entityIdList.
     */
    int getEntityIdListCount();
    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    int getEntityIdList(int index);

    /**
     * <code>.HomePlantFieldStatus field_status = 14;</code>
     * @return The enum numeric value on the wire for fieldStatus.
     */
    int getFieldStatusValue();
    /**
     * <code>.HomePlantFieldStatus field_status = 14;</code>
     * @return The fieldStatus.
     */
    emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus();

    /**
     * <code>uint32 home_gather_id = 9;</code>
     * @return The homeGatherId.
     */
    int getHomeGatherId();

    /**
     * <code>uint32 seed_id = 8;</code>
     * @return The seedId.
     */
    int getSeedId();

    /**
     * <code>fixed32 end_time = 4;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * Protobuf type {@code HomePlantSubFieldData}
   */
  public static final class HomePlantSubFieldData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantSubFieldData)
      HomePlantSubFieldDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantSubFieldData.newBuilder() to construct.
    private HomePlantSubFieldData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantSubFieldData() {
      entityIdList_ = emptyIntList();
      fieldStatus_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantSubFieldData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.class, emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.Builder.class);
    }

    public static final int ENTITY_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList entityIdList_;
    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @return A list containing the entityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityIdListList() {
      return entityIdList_;
    }
    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @return The count of entityIdList.
     */
    public int getEntityIdListCount() {
      return entityIdList_.size();
    }
    /**
     * <code>repeated uint32 entity_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    public int getEntityIdList(int index) {
      return entityIdList_.getInt(index);
    }
    private int entityIdListMemoizedSerializedSize = -1;

    public static final int FIELD_STATUS_FIELD_NUMBER = 14;
    private int fieldStatus_;
    /**
     * <code>.HomePlantFieldStatus field_status = 14;</code>
     * @return The enum numeric value on the wire for fieldStatus.
     */
    @java.lang.Override public int getFieldStatusValue() {
      return fieldStatus_;
    }
    /**
     * <code>.HomePlantFieldStatus field_status = 14;</code>
     * @return The fieldStatus.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus result = emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.valueOf(fieldStatus_);
      return result == null ? emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.UNRECOGNIZED : result;
    }

    public static final int HOME_GATHER_ID_FIELD_NUMBER = 9;
    private int homeGatherId_;
    /**
     * <code>uint32 home_gather_id = 9;</code>
     * @return The homeGatherId.
     */
    @java.lang.Override
    public int getHomeGatherId() {
      return homeGatherId_;
    }

    public static final int SEED_ID_FIELD_NUMBER = 8;
    private int seedId_;
    /**
     * <code>uint32 seed_id = 8;</code>
     * @return The seedId.
     */
    @java.lang.Override
    public int getSeedId() {
      return seedId_;
    }

    public static final int END_TIME_FIELD_NUMBER = 4;
    private int endTime_;
    /**
     * <code>fixed32 end_time = 4;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
      getSerializedSize();
      if (endTime_ != 0) {
        output.writeFixed32(4, endTime_);
      }
      if (seedId_ != 0) {
        output.writeUInt32(8, seedId_);
      }
      if (homeGatherId_ != 0) {
        output.writeUInt32(9, homeGatherId_);
      }
      if (fieldStatus_ != emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.HOME_PLANT_FIELD_STATUS_STATUE_NONE.getNumber()) {
        output.writeEnum(14, fieldStatus_);
      }
      if (getEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(entityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityIdList_.size(); i++) {
        output.writeUInt32NoTag(entityIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(4, endTime_);
      }
      if (seedId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, seedId_);
      }
      if (homeGatherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, homeGatherId_);
      }
      if (fieldStatus_ != emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.HOME_PLANT_FIELD_STATUS_STATUE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, fieldStatus_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < entityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData other = (emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData) obj;

      if (!getEntityIdListList()
          .equals(other.getEntityIdListList())) return false;
      if (fieldStatus_ != other.fieldStatus_) return false;
      if (getHomeGatherId()
          != other.getHomeGatherId()) return false;
      if (getSeedId()
          != other.getSeedId()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      if (getEntityIdListCount() > 0) {
        hash = (37 * hash) + ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityIdListList().hashCode();
      }
      hash = (37 * hash) + FIELD_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + fieldStatus_;
      hash = (37 * hash) + HOME_GATHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getHomeGatherId();
      hash = (37 * hash) + SEED_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSeedId();
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData prototype) {
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
     * Protobuf type {@code HomePlantSubFieldData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantSubFieldData)
        emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.class, emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        fieldStatus_ = 0;

        homeGatherId_ = 0;

        seedId_ = 0;

        endTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.internal_static_HomePlantSubFieldData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData build() {
        emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData buildPartial() {
        emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData result = new emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityIdList_ = entityIdList_;
        result.fieldStatus_ = fieldStatus_;
        result.homeGatherId_ = homeGatherId_;
        result.seedId_ = seedId_;
        result.endTime_ = endTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData other) {
        if (other == emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData.getDefaultInstance()) return this;
        if (!other.entityIdList_.isEmpty()) {
          if (entityIdList_.isEmpty()) {
            entityIdList_ = other.entityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityIdListIsMutable();
            entityIdList_.addAll(other.entityIdList_);
          }
          onChanged();
        }
        if (other.fieldStatus_ != 0) {
          setFieldStatusValue(other.getFieldStatusValue());
        }
        if (other.getHomeGatherId() != 0) {
          setHomeGatherId(other.getHomeGatherId());
        }
        if (other.getSeedId() != 0) {
          setSeedId(other.getSeedId());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
              case 37: {
                endTime_ = input.readFixed32();

                break;
              } // case 37
              case 64: {
                seedId_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                homeGatherId_ = input.readUInt32();

                break;
              } // case 72
              case 112: {
                fieldStatus_ = input.readEnum();

                break;
              } // case 112
              case 120: {
                int v = input.readUInt32();
                ensureEntityIdListIsMutable();
                entityIdList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureEntityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  entityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private com.google.protobuf.Internal.IntList entityIdList_ = emptyIntList();
      private void ensureEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityIdList_ = mutableCopy(entityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @return A list containing the entityIdList.
       */
      public java.util.List<java.lang.Integer>
          getEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityIdList_) : entityIdList_;
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @return The count of entityIdList.
       */
      public int getEntityIdListCount() {
        return entityIdList_.size();
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The entityIdList at the given index.
       */
      public int getEntityIdList(int index) {
        return entityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The entityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityIdList(
          int index, int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @param value The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityIdList(int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @param values The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityIdList() {
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int fieldStatus_ = 0;
      /**
       * <code>.HomePlantFieldStatus field_status = 14;</code>
       * @return The enum numeric value on the wire for fieldStatus.
       */
      @java.lang.Override public int getFieldStatusValue() {
        return fieldStatus_;
      }
      /**
       * <code>.HomePlantFieldStatus field_status = 14;</code>
       * @param value The enum numeric value on the wire for fieldStatus to set.
       * @return This builder for chaining.
       */
      public Builder setFieldStatusValue(int value) {
        
        fieldStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HomePlantFieldStatus field_status = 14;</code>
       * @return The fieldStatus.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus getFieldStatus() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus result = emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.valueOf(fieldStatus_);
        return result == null ? emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus.UNRECOGNIZED : result;
      }
      /**
       * <code>.HomePlantFieldStatus field_status = 14;</code>
       * @param value The fieldStatus to set.
       * @return This builder for chaining.
       */
      public Builder setFieldStatus(emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.HomePlantFieldStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        fieldStatus_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HomePlantFieldStatus field_status = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFieldStatus() {
        
        fieldStatus_ = 0;
        onChanged();
        return this;
      }

      private int homeGatherId_ ;
      /**
       * <code>uint32 home_gather_id = 9;</code>
       * @return The homeGatherId.
       */
      @java.lang.Override
      public int getHomeGatherId() {
        return homeGatherId_;
      }
      /**
       * <code>uint32 home_gather_id = 9;</code>
       * @param value The homeGatherId to set.
       * @return This builder for chaining.
       */
      public Builder setHomeGatherId(int value) {
        
        homeGatherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 home_gather_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHomeGatherId() {
        
        homeGatherId_ = 0;
        onChanged();
        return this;
      }

      private int seedId_ ;
      /**
       * <code>uint32 seed_id = 8;</code>
       * @return The seedId.
       */
      @java.lang.Override
      public int getSeedId() {
        return seedId_;
      }
      /**
       * <code>uint32 seed_id = 8;</code>
       * @param value The seedId to set.
       * @return This builder for chaining.
       */
      public Builder setSeedId(int value) {
        
        seedId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seed_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeedId() {
        
        seedId_ = 0;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>fixed32 end_time = 4;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>fixed32 end_time = 4;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 end_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomePlantSubFieldData)
    }

    // @@protoc_insertion_point(class_scope:HomePlantSubFieldData)
    private static final emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData();
    }

    public static emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantSubFieldData>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantSubFieldData>() {
      @java.lang.Override
      public HomePlantSubFieldData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomePlantSubFieldData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantSubFieldData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomePlantSubFieldDataOuterClass.HomePlantSubFieldData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantSubFieldData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantSubFieldData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomePlantSubFieldData.proto\032\032HomePlant" +
      "FieldStatus.proto\"\227\001\n\025HomePlantSubFieldD" +
      "ata\022\026\n\016entity_id_list\030\017 \003(\r\022+\n\014field_sta" +
      "tus\030\016 \001(\0162\025.HomePlantFieldStatus\022\026\n\016home" +
      "_gather_id\030\t \001(\r\022\017\n\007seed_id\030\010 \001(\r\022\020\n\010end" +
      "_time\030\004 \001(\007B\036\n\034emu.grasscutter.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.getDescriptor(),
        });
    internal_static_HomePlantSubFieldData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantSubFieldData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantSubFieldData_descriptor,
        new java.lang.String[] { "EntityIdList", "FieldStatus", "HomeGatherId", "SeedId", "EndTime", });
    emu.grasscutter.net.oldproto.HomePlantFieldStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
