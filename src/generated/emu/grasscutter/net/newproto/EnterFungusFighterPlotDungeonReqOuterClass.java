// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterFungusFighterPlotDungeonReq.proto

package emu.grasscutter.net.newproto;

public final class EnterFungusFighterPlotDungeonReqOuterClass {
  private EnterFungusFighterPlotDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterFungusFighterPlotDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterFungusFighterPlotDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @return A list containing the fungusIdList.
     */
    java.util.List<java.lang.Integer> getFungusIdListList();
    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @return The count of fungusIdList.
     */
    int getFungusIdListCount();
    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    int getFungusIdList(int index);

    /**
     * <code>uint32 dungeon_id = 15;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 23768;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EnterFungusFighterPlotDungeonReq}
   */
  public static final class EnterFungusFighterPlotDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterFungusFighterPlotDungeonReq)
      EnterFungusFighterPlotDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterFungusFighterPlotDungeonReq.newBuilder() to construct.
    private EnterFungusFighterPlotDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterFungusFighterPlotDungeonReq() {
      fungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterFungusFighterPlotDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.internal_static_EnterFungusFighterPlotDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.internal_static_EnterFungusFighterPlotDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.class, emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.Builder.class);
    }

    public static final int FUNGUS_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList fungusIdList_;
    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @return A list containing the fungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFungusIdListList() {
      return fungusIdList_;
    }
    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @return The count of fungusIdList.
     */
    public int getFungusIdListCount() {
      return fungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fungus_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    public int getFungusIdList(int index) {
      return fungusIdList_.getInt(index);
    }
    private int fungusIdListMemoizedSerializedSize = -1;

    public static final int DUNGEON_ID_FIELD_NUMBER = 15;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 15;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (getFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(fungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fungusIdList_.getInt(i));
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(15, dungeonId_);
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
        for (int i = 0; i < fungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fungusIdListMemoizedSerializedSize = dataSize;
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq other = (emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq) obj;

      if (!getFungusIdListList()
          .equals(other.getFungusIdListList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      if (getFungusIdListCount() > 0) {
        hash = (37 * hash) + FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFungusIdListList().hashCode();
      }
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq prototype) {
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
     *   CMD_ID = 23768;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EnterFungusFighterPlotDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterFungusFighterPlotDungeonReq)
        emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.internal_static_EnterFungusFighterPlotDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.internal_static_EnterFungusFighterPlotDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.class, emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.internal_static_EnterFungusFighterPlotDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq build() {
        emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq buildPartial() {
        emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq result = new emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fungusIdList_ = fungusIdList_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq) {
          return mergeFrom((emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq other) {
        if (other == emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq.getDefaultInstance()) return this;
        if (!other.fungusIdList_.isEmpty()) {
          if (fungusIdList_.isEmpty()) {
            fungusIdList_ = other.fungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFungusIdListIsMutable();
            fungusIdList_.addAll(other.fungusIdList_);
          }
          onChanged();
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
              case 88: {
                int v = input.readUInt32();
                ensureFungusIdListIsMutable();
                fungusIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFungusIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fungusIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 120: {
                dungeonId_ = input.readUInt32();

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

      private com.google.protobuf.Internal.IntList fungusIdList_ = emptyIntList();
      private void ensureFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_ = mutableCopy(fungusIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @return A list containing the fungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fungusIdList_) : fungusIdList_;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @return The count of fungusIdList.
       */
      public int getFungusIdListCount() {
        return fungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The fungusIdList at the given index.
       */
      public int getFungusIdList(int index) {
        return fungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The fungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFungusIdList(
          int index, int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @param value The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFungusIdList(int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @param values The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusIdList() {
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 15;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 15;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterFungusFighterPlotDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:EnterFungusFighterPlotDungeonReq)
    private static final emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq();
    }

    public static emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterFungusFighterPlotDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterFungusFighterPlotDungeonReq>() {
      @java.lang.Override
      public EnterFungusFighterPlotDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterFungusFighterPlotDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterFungusFighterPlotDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EnterFungusFighterPlotDungeonReqOuterClass.EnterFungusFighterPlotDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterFungusFighterPlotDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterFungusFighterPlotDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EnterFungusFighterPlotDungeonReq.proto" +
      "\"N\n EnterFungusFighterPlotDungeonReq\022\026\n\016" +
      "fungus_id_list\030\013 \003(\r\022\022\n\ndungeon_id\030\017 \001(\r" +
      "B\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterFungusFighterPlotDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterFungusFighterPlotDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterFungusFighterPlotDungeonReq_descriptor,
        new java.lang.String[] { "FungusIdList", "DungeonId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
