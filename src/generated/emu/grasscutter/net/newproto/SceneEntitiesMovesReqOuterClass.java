// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntitiesMovesReq.proto

package emu.grasscutter.net.newproto;

public final class SceneEntitiesMovesReqOuterClass {
  private SceneEntitiesMovesReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntitiesMovesReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntitiesMovesReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> 
        getEntityMoveInfoListList();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index);
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    int getEntityMoveInfoListCount();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
        getEntityMoveInfoListOrBuilderList();
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 292;
   *   ENET_CHANNEL_ID = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneEntitiesMovesReq}
   */
  public static final class SceneEntitiesMovesReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntitiesMovesReq)
      SceneEntitiesMovesReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntitiesMovesReq.newBuilder() to construct.
    private SceneEntitiesMovesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntitiesMovesReq() {
      entityMoveInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntitiesMovesReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.internal_static_SceneEntitiesMovesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.internal_static_SceneEntitiesMovesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.class, emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.Builder.class);
    }

    public static final int ENTITY_MOVE_INFO_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> entityMoveInfoList_;
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> getEntityMoveInfoListList() {
      return entityMoveInfoList_;
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
        getEntityMoveInfoListOrBuilderList() {
      return entityMoveInfoList_;
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    @java.lang.Override
    public int getEntityMoveInfoListCount() {
      return entityMoveInfoList_.size();
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index) {
      return entityMoveInfoList_.get(index);
    }
    /**
     * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
        int index) {
      return entityMoveInfoList_.get(index);
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
      for (int i = 0; i < entityMoveInfoList_.size(); i++) {
        output.writeMessage(11, entityMoveInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entityMoveInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, entityMoveInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq other = (emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq) obj;

      if (!getEntityMoveInfoListList()
          .equals(other.getEntityMoveInfoListList())) return false;
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
      if (getEntityMoveInfoListCount() > 0) {
        hash = (37 * hash) + ENTITY_MOVE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityMoveInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq prototype) {
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
     *   CMD_ID = 292;
     *   ENET_CHANNEL_ID = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneEntitiesMovesReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntitiesMovesReq)
        emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.internal_static_SceneEntitiesMovesReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.internal_static_SceneEntitiesMovesReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.class, emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoList_ = java.util.Collections.emptyList();
        } else {
          entityMoveInfoList_ = null;
          entityMoveInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.internal_static_SceneEntitiesMovesReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq build() {
        emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq buildPartial() {
        emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq result = new emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq(this);
        int from_bitField0_ = bitField0_;
        if (entityMoveInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityMoveInfoList_ = java.util.Collections.unmodifiableList(entityMoveInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityMoveInfoList_ = entityMoveInfoList_;
        } else {
          result.entityMoveInfoList_ = entityMoveInfoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq other) {
        if (other == emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq.getDefaultInstance()) return this;
        if (entityMoveInfoListBuilder_ == null) {
          if (!other.entityMoveInfoList_.isEmpty()) {
            if (entityMoveInfoList_.isEmpty()) {
              entityMoveInfoList_ = other.entityMoveInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityMoveInfoListIsMutable();
              entityMoveInfoList_.addAll(other.entityMoveInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityMoveInfoList_.isEmpty()) {
            if (entityMoveInfoListBuilder_.isEmpty()) {
              entityMoveInfoListBuilder_.dispose();
              entityMoveInfoListBuilder_ = null;
              entityMoveInfoList_ = other.entityMoveInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityMoveInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntityMoveInfoListFieldBuilder() : null;
            } else {
              entityMoveInfoListBuilder_.addAllMessages(other.entityMoveInfoList_);
            }
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
              case 90: {
                emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.parser(),
                        extensionRegistry);
                if (entityMoveInfoListBuilder_ == null) {
                  ensureEntityMoveInfoListIsMutable();
                  entityMoveInfoList_.add(m);
                } else {
                  entityMoveInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 90
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

      private java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> entityMoveInfoList_ =
        java.util.Collections.emptyList();
      private void ensureEntityMoveInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityMoveInfoList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo>(entityMoveInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> entityMoveInfoListBuilder_;

      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> getEntityMoveInfoListList() {
        if (entityMoveInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityMoveInfoList_);
        } else {
          return entityMoveInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public int getEntityMoveInfoListCount() {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.size();
        } else {
          return entityMoveInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo getEntityMoveInfoList(int index) {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.get(index);
        } else {
          return entityMoveInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder setEntityMoveInfoList(
          int index, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.set(index, value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder setEntityMoveInfoList(
          int index, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder addEntityMoveInfoList(emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder addEntityMoveInfoList(
          int index, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo value) {
        if (entityMoveInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(index, value);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder addEntityMoveInfoList(
          emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder addEntityMoveInfoList(
          int index, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder builderForValue) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder addAllEntityMoveInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo> values) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityMoveInfoList_);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder clearEntityMoveInfoList() {
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public Builder removeEntityMoveInfoList(int index) {
        if (entityMoveInfoListBuilder_ == null) {
          ensureEntityMoveInfoListIsMutable();
          entityMoveInfoList_.remove(index);
          onChanged();
        } else {
          entityMoveInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder getEntityMoveInfoListBuilder(
          int index) {
        return getEntityMoveInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder getEntityMoveInfoListOrBuilder(
          int index) {
        if (entityMoveInfoListBuilder_ == null) {
          return entityMoveInfoList_.get(index);  } else {
          return entityMoveInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
           getEntityMoveInfoListOrBuilderList() {
        if (entityMoveInfoListBuilder_ != null) {
          return entityMoveInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityMoveInfoList_);
        }
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder addEntityMoveInfoListBuilder() {
        return getEntityMoveInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder addEntityMoveInfoListBuilder(
          int index) {
        return getEntityMoveInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveInfo entity_move_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder> 
           getEntityMoveInfoListBuilderList() {
        return getEntityMoveInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder> 
          getEntityMoveInfoListFieldBuilder() {
        if (entityMoveInfoListBuilder_ == null) {
          entityMoveInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder, emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder>(
                  entityMoveInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityMoveInfoList_ = null;
        }
        return entityMoveInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntitiesMovesReq)
    }

    // @@protoc_insertion_point(class_scope:SceneEntitiesMovesReq)
    private static final emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq();
    }

    public static emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntitiesMovesReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntitiesMovesReq>() {
      @java.lang.Override
      public SceneEntitiesMovesReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntitiesMovesReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntitiesMovesReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneEntitiesMovesReqOuterClass.SceneEntitiesMovesReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntitiesMovesReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntitiesMovesReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneEntitiesMovesReq.proto\032\024EntityMov" +
      "eInfo.proto\"G\n\025SceneEntitiesMovesReq\022.\n\025" +
      "entity_move_info_list\030\013 \003(\0132\017.EntityMove" +
      "InfoB\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntitiesMovesReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntitiesMovesReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntitiesMovesReq_descriptor,
        new java.lang.String[] { "EntityMoveInfoList", });
    emu.grasscutter.net.newproto.EntityMoveInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
