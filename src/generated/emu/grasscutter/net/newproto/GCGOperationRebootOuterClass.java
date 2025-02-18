// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationReboot.proto

package emu.grasscutter.net.newproto;

public final class GCGOperationRebootOuterClass {
  private GCGOperationRebootOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationRebootOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationReboot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @return A list containing the diceIndexList.
     */
    java.util.List<java.lang.Integer> getDiceIndexListList();
    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @return The count of diceIndexList.
     */
    int getDiceIndexListCount();
    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    int getDiceIndexList(int index);

    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @return A list containing the costCardGuidList.
     */
    java.util.List<java.lang.Integer> getCostCardGuidListList();
    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @return The count of costCardGuidList.
     */
    int getCostCardGuidListCount();
    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The costCardGuidList at the given index.
     */
    int getCostCardGuidList(int index);
  }
  /**
   * Protobuf type {@code GCGOperationReboot}
   */
  public static final class GCGOperationReboot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationReboot)
      GCGOperationRebootOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationReboot.newBuilder() to construct.
    private GCGOperationReboot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationReboot() {
      diceIndexList_ = emptyIntList();
      costCardGuidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationReboot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.class, emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.Builder.class);
    }

    public static final int DICE_INDEX_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList diceIndexList_;
    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @return A list containing the diceIndexList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDiceIndexListList() {
      return diceIndexList_;
    }
    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @return The count of diceIndexList.
     */
    public int getDiceIndexListCount() {
      return diceIndexList_.size();
    }
    /**
     * <code>repeated uint32 dice_index_list = 2;</code>
     * @param index The index of the element to return.
     * @return The diceIndexList at the given index.
     */
    public int getDiceIndexList(int index) {
      return diceIndexList_.getInt(index);
    }
    private int diceIndexListMemoizedSerializedSize = -1;

    public static final int COST_CARD_GUID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList costCardGuidList_;
    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @return A list containing the costCardGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCostCardGuidListList() {
      return costCardGuidList_;
    }
    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @return The count of costCardGuidList.
     */
    public int getCostCardGuidListCount() {
      return costCardGuidList_.size();
    }
    /**
     * <code>repeated uint32 cost_card_guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The costCardGuidList at the given index.
     */
    public int getCostCardGuidList(int index) {
      return costCardGuidList_.getInt(index);
    }
    private int costCardGuidListMemoizedSerializedSize = -1;

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
      if (getDiceIndexListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(diceIndexListMemoizedSerializedSize);
      }
      for (int i = 0; i < diceIndexList_.size(); i++) {
        output.writeUInt32NoTag(diceIndexList_.getInt(i));
      }
      if (getCostCardGuidListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(costCardGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < costCardGuidList_.size(); i++) {
        output.writeUInt32NoTag(costCardGuidList_.getInt(i));
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
        for (int i = 0; i < diceIndexList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(diceIndexList_.getInt(i));
        }
        size += dataSize;
        if (!getDiceIndexListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        diceIndexListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < costCardGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(costCardGuidList_.getInt(i));
        }
        size += dataSize;
        if (!getCostCardGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        costCardGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot other = (emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot) obj;

      if (!getDiceIndexListList()
          .equals(other.getDiceIndexListList())) return false;
      if (!getCostCardGuidListList()
          .equals(other.getCostCardGuidListList())) return false;
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
      if (getDiceIndexListCount() > 0) {
        hash = (37 * hash) + DICE_INDEX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDiceIndexListList().hashCode();
      }
      if (getCostCardGuidListCount() > 0) {
        hash = (37 * hash) + COST_CARD_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCostCardGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot prototype) {
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
     * Protobuf type {@code GCGOperationReboot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationReboot)
        emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationRebootOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.class, emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        costCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.internal_static_GCGOperationReboot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot build() {
        emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot buildPartial() {
        emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot result = new emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          diceIndexList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.diceIndexList_ = diceIndexList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          costCardGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.costCardGuidList_ = costCardGuidList_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot other) {
        if (other == emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot.getDefaultInstance()) return this;
        if (!other.diceIndexList_.isEmpty()) {
          if (diceIndexList_.isEmpty()) {
            diceIndexList_ = other.diceIndexList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiceIndexListIsMutable();
            diceIndexList_.addAll(other.diceIndexList_);
          }
          onChanged();
        }
        if (!other.costCardGuidList_.isEmpty()) {
          if (costCardGuidList_.isEmpty()) {
            costCardGuidList_ = other.costCardGuidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureCostCardGuidListIsMutable();
            costCardGuidList_.addAll(other.costCardGuidList_);
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
              case 16: {
                int v = input.readUInt32();
                ensureDiceIndexListIsMutable();
                diceIndexList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureDiceIndexListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  diceIndexList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 112: {
                int v = input.readUInt32();
                ensureCostCardGuidListIsMutable();
                costCardGuidList_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCostCardGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  costCardGuidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private com.google.protobuf.Internal.IntList diceIndexList_ = emptyIntList();
      private void ensureDiceIndexListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          diceIndexList_ = mutableCopy(diceIndexList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @return A list containing the diceIndexList.
       */
      public java.util.List<java.lang.Integer>
          getDiceIndexListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(diceIndexList_) : diceIndexList_;
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @return The count of diceIndexList.
       */
      public int getDiceIndexListCount() {
        return diceIndexList_.size();
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @param index The index of the element to return.
       * @return The diceIndexList at the given index.
       */
      public int getDiceIndexList(int index) {
        return diceIndexList_.getInt(index);
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The diceIndexList to set.
       * @return This builder for chaining.
       */
      public Builder setDiceIndexList(
          int index, int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @param value The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addDiceIndexList(int value) {
        ensureDiceIndexListIsMutable();
        diceIndexList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @param values The diceIndexList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDiceIndexList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDiceIndexListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, diceIndexList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 dice_index_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiceIndexList() {
        diceIndexList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList costCardGuidList_ = emptyIntList();
      private void ensureCostCardGuidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          costCardGuidList_ = mutableCopy(costCardGuidList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @return A list containing the costCardGuidList.
       */
      public java.util.List<java.lang.Integer>
          getCostCardGuidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(costCardGuidList_) : costCardGuidList_;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @return The count of costCardGuidList.
       */
      public int getCostCardGuidListCount() {
        return costCardGuidList_.size();
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @param index The index of the element to return.
       * @return The costCardGuidList at the given index.
       */
      public int getCostCardGuidList(int index) {
        return costCardGuidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The costCardGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setCostCardGuidList(
          int index, int value) {
        ensureCostCardGuidListIsMutable();
        costCardGuidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @param value The costCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addCostCardGuidList(int value) {
        ensureCostCardGuidListIsMutable();
        costCardGuidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @param values The costCardGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCostCardGuidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCostCardGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, costCardGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 cost_card_guid_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostCardGuidList() {
        costCardGuidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GCGOperationReboot)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationReboot)
    private static final emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot();
    }

    public static emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationReboot>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationReboot>() {
      @java.lang.Override
      public GCGOperationReboot parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGOperationReboot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationReboot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGOperationRebootOuterClass.GCGOperationReboot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationReboot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationReboot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGOperationReboot.proto\"J\n\022GCGOperati" +
      "onReboot\022\027\n\017dice_index_list\030\002 \003(\r\022\033\n\023cos" +
      "t_card_guid_list\030\016 \003(\rB\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGOperationReboot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationReboot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationReboot_descriptor,
        new java.lang.String[] { "DiceIndexList", "CostCardGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
