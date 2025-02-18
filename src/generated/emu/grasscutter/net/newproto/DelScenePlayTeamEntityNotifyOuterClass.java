// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DelScenePlayTeamEntityNotify.proto

package emu.grasscutter.net.newproto;

public final class DelScenePlayTeamEntityNotifyOuterClass {
  private DelScenePlayTeamEntityNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DelScenePlayTeamEntityNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DelScenePlayTeamEntityNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @return A list containing the delEntityIdList.
     */
    java.util.List<java.lang.Integer> getDelEntityIdListList();
    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @return The count of delEntityIdList.
     */
    int getDelEntityIdListCount();
    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The delEntityIdList at the given index.
     */
    int getDelEntityIdList(int index);

    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3237;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DelScenePlayTeamEntityNotify}
   */
  public static final class DelScenePlayTeamEntityNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DelScenePlayTeamEntityNotify)
      DelScenePlayTeamEntityNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DelScenePlayTeamEntityNotify.newBuilder() to construct.
    private DelScenePlayTeamEntityNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DelScenePlayTeamEntityNotify() {
      delEntityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DelScenePlayTeamEntityNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.internal_static_DelScenePlayTeamEntityNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.internal_static_DelScenePlayTeamEntityNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.class, emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.Builder.class);
    }

    public static final int DEL_ENTITY_ID_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList delEntityIdList_;
    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @return A list containing the delEntityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDelEntityIdListList() {
      return delEntityIdList_;
    }
    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @return The count of delEntityIdList.
     */
    public int getDelEntityIdListCount() {
      return delEntityIdList_.size();
    }
    /**
     * <code>repeated uint32 del_entity_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The delEntityIdList at the given index.
     */
    public int getDelEntityIdList(int index) {
      return delEntityIdList_.getInt(index);
    }
    private int delEntityIdListMemoizedSerializedSize = -1;

    public static final int SCENE_ID_FIELD_NUMBER = 10;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (getDelEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(delEntityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delEntityIdList_.size(); i++) {
        output.writeUInt32NoTag(delEntityIdList_.getInt(i));
      }
      if (sceneId_ != 0) {
        output.writeUInt32(10, sceneId_);
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
        for (int i = 0; i < delEntityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delEntityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delEntityIdListMemoizedSerializedSize = dataSize;
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify other = (emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify) obj;

      if (!getDelEntityIdListList()
          .equals(other.getDelEntityIdListList())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (getDelEntityIdListCount() > 0) {
        hash = (37 * hash) + DEL_ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelEntityIdListList().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify prototype) {
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
     *   CMD_ID = 3237;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DelScenePlayTeamEntityNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DelScenePlayTeamEntityNotify)
        emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.internal_static_DelScenePlayTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.internal_static_DelScenePlayTeamEntityNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.class, emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        delEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.internal_static_DelScenePlayTeamEntityNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify build() {
        emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify buildPartial() {
        emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify result = new emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          delEntityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.delEntityIdList_ = delEntityIdList_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify other) {
        if (other == emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify.getDefaultInstance()) return this;
        if (!other.delEntityIdList_.isEmpty()) {
          if (delEntityIdList_.isEmpty()) {
            delEntityIdList_ = other.delEntityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDelEntityIdListIsMutable();
            delEntityIdList_.addAll(other.delEntityIdList_);
          }
          onChanged();
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
              case 40: {
                int v = input.readUInt32();
                ensureDelEntityIdListIsMutable();
                delEntityIdList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureDelEntityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  delEntityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 80: {
                sceneId_ = input.readUInt32();

                break;
              } // case 80
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

      private com.google.protobuf.Internal.IntList delEntityIdList_ = emptyIntList();
      private void ensureDelEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          delEntityIdList_ = mutableCopy(delEntityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @return A list containing the delEntityIdList.
       */
      public java.util.List<java.lang.Integer>
          getDelEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(delEntityIdList_) : delEntityIdList_;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @return The count of delEntityIdList.
       */
      public int getDelEntityIdListCount() {
        return delEntityIdList_.size();
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The delEntityIdList at the given index.
       */
      public int getDelEntityIdList(int index) {
        return delEntityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The delEntityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelEntityIdList(
          int index, int value) {
        ensureDelEntityIdListIsMutable();
        delEntityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @param value The delEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelEntityIdList(int value) {
        ensureDelEntityIdListIsMutable();
        delEntityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @param values The delEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDelEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delEntityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_entity_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelEntityIdList() {
        delEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 10;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DelScenePlayTeamEntityNotify)
    }

    // @@protoc_insertion_point(class_scope:DelScenePlayTeamEntityNotify)
    private static final emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify();
    }

    public static emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DelScenePlayTeamEntityNotify>
        PARSER = new com.google.protobuf.AbstractParser<DelScenePlayTeamEntityNotify>() {
      @java.lang.Override
      public DelScenePlayTeamEntityNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DelScenePlayTeamEntityNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DelScenePlayTeamEntityNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DelScenePlayTeamEntityNotifyOuterClass.DelScenePlayTeamEntityNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DelScenePlayTeamEntityNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DelScenePlayTeamEntityNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"DelScenePlayTeamEntityNotify.proto\"L\n\034" +
      "DelScenePlayTeamEntityNotify\022\032\n\022del_enti" +
      "ty_id_list\030\005 \003(\r\022\020\n\010scene_id\030\n \001(\rB\036\n\034em" +
      "u.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DelScenePlayTeamEntityNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DelScenePlayTeamEntityNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DelScenePlayTeamEntityNotify_descriptor,
        new java.lang.String[] { "DelEntityIdList", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
