// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SaveMainCoopRsp.proto

package emu.grasscutter.net.oldproto;

public final class SaveMainCoopRspOuterClass {
  private SaveMainCoopRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SaveMainCoopRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveMainCoopRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @return A list containing the savePointIdList.
     */
    java.util.List<java.lang.Integer> getSavePointIdListList();
    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @return The count of savePointIdList.
     */
    int getSavePointIdListCount();
    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The savePointIdList at the given index.
     */
    int getSavePointIdList(int index);

    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 1957
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code SaveMainCoopRsp}
   */
  public static final class SaveMainCoopRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveMainCoopRsp)
      SaveMainCoopRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveMainCoopRsp.newBuilder() to construct.
    private SaveMainCoopRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveMainCoopRsp() {
      savePointIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveMainCoopRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.internal_static_SaveMainCoopRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.internal_static_SaveMainCoopRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.class, emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SAVE_POINT_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList savePointIdList_;
    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @return A list containing the savePointIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSavePointIdListList() {
      return savePointIdList_;
    }
    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @return The count of savePointIdList.
     */
    public int getSavePointIdListCount() {
      return savePointIdList_.size();
    }
    /**
     * <code>repeated uint32 save_point_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The savePointIdList at the given index.
     */
    public int getSavePointIdList(int index) {
      return savePointIdList_.getInt(index);
    }
    private int savePointIdListMemoizedSerializedSize = -1;

    public static final int ID_FIELD_NUMBER = 14;
    private int id_;
    /**
     * <code>uint32 id = 14;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (id_ != 0) {
        output.writeUInt32(14, id_);
      }
      if (getSavePointIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(savePointIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < savePointIdList_.size(); i++) {
        output.writeUInt32NoTag(savePointIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, id_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < savePointIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(savePointIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSavePointIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        savePointIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp other = (emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getSavePointIdListList()
          .equals(other.getSavePointIdListList())) return false;
      if (getId()
          != other.getId()) return false;
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
      if (getSavePointIdListCount() > 0) {
        hash = (37 * hash) + SAVE_POINT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSavePointIdListList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp prototype) {
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
     * CmdId: 1957
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code SaveMainCoopRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveMainCoopRsp)
        emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.internal_static_SaveMainCoopRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.internal_static_SaveMainCoopRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.class, emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.newBuilder()
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

        savePointIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.internal_static_SaveMainCoopRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp build() {
        emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp buildPartial() {
        emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp result = new emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          savePointIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.savePointIdList_ = savePointIdList_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp other) {
        if (other == emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.savePointIdList_.isEmpty()) {
          if (savePointIdList_.isEmpty()) {
            savePointIdList_ = other.savePointIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSavePointIdListIsMutable();
            savePointIdList_.addAll(other.savePointIdList_);
          }
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
                retcode_ = input.readInt32();

                break;
              } // case 16
              case 112: {
                id_ = input.readUInt32();

                break;
              } // case 112
              case 120: {
                int v = input.readUInt32();
                ensureSavePointIdListIsMutable();
                savePointIdList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSavePointIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  savePointIdList_.addInt(input.readUInt32());
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList savePointIdList_ = emptyIntList();
      private void ensureSavePointIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          savePointIdList_ = mutableCopy(savePointIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @return A list containing the savePointIdList.
       */
      public java.util.List<java.lang.Integer>
          getSavePointIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(savePointIdList_) : savePointIdList_;
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @return The count of savePointIdList.
       */
      public int getSavePointIdListCount() {
        return savePointIdList_.size();
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The savePointIdList at the given index.
       */
      public int getSavePointIdList(int index) {
        return savePointIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The savePointIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSavePointIdList(
          int index, int value) {
        ensureSavePointIdListIsMutable();
        savePointIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @param value The savePointIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSavePointIdList(int value) {
        ensureSavePointIdListIsMutable();
        savePointIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @param values The savePointIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSavePointIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSavePointIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, savePointIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 save_point_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSavePointIdList() {
        savePointIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 14;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SaveMainCoopRsp)
    }

    // @@protoc_insertion_point(class_scope:SaveMainCoopRsp)
    private static final emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp();
    }

    public static emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveMainCoopRsp>
        PARSER = new com.google.protobuf.AbstractParser<SaveMainCoopRsp>() {
      @java.lang.Override
      public SaveMainCoopRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SaveMainCoopRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveMainCoopRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SaveMainCoopRspOuterClass.SaveMainCoopRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveMainCoopRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveMainCoopRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SaveMainCoopRsp.proto\"J\n\017SaveMainCoopR" +
      "sp\022\017\n\007retcode\030\002 \001(\005\022\032\n\022save_point_id_lis" +
      "t\030\017 \003(\r\022\n\n\002id\030\016 \001(\rB\036\n\034emu.grasscutter.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SaveMainCoopRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SaveMainCoopRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveMainCoopRsp_descriptor,
        new java.lang.String[] { "Retcode", "SavePointIdList", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
