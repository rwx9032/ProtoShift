// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneEntitiesMovesRsp.proto

package emu.grasscutter.net.oldproto;

public final class SceneEntitiesMovesRspOuterClass {
  private SceneEntitiesMovesRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntitiesMovesRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntitiesMovesRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> 
        getEntityMoveFailInfoListList();
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo getEntityMoveFailInfoList(int index);
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    int getEntityMoveFailInfoListCount();
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder> 
        getEntityMoveFailInfoListOrBuilderList();
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder getEntityMoveFailInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 255
   * EnetChannelId: 1
   * EnetIsReliable: false
   * </pre>
   *
   * Protobuf type {@code SceneEntitiesMovesRsp}
   */
  public static final class SceneEntitiesMovesRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneEntitiesMovesRsp)
      SceneEntitiesMovesRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneEntitiesMovesRsp.newBuilder() to construct.
    private SceneEntitiesMovesRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneEntitiesMovesRsp() {
      entityMoveFailInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneEntitiesMovesRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.internal_static_SceneEntitiesMovesRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.internal_static_SceneEntitiesMovesRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.class, emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.Builder.class);
    }

    public static final int ENTITY_MOVE_FAIL_INFO_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> entityMoveFailInfoList_;
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> getEntityMoveFailInfoListList() {
      return entityMoveFailInfoList_;
    }
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder> 
        getEntityMoveFailInfoListOrBuilderList() {
      return entityMoveFailInfoList_;
    }
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    @java.lang.Override
    public int getEntityMoveFailInfoListCount() {
      return entityMoveFailInfoList_.size();
    }
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo getEntityMoveFailInfoList(int index) {
      return entityMoveFailInfoList_.get(index);
    }
    /**
     * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder getEntityMoveFailInfoListOrBuilder(
        int index) {
      return entityMoveFailInfoList_.get(index);
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
      for (int i = 0; i < entityMoveFailInfoList_.size(); i++) {
        output.writeMessage(11, entityMoveFailInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entityMoveFailInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, entityMoveFailInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp other = (emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp) obj;

      if (!getEntityMoveFailInfoListList()
          .equals(other.getEntityMoveFailInfoListList())) return false;
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
      if (getEntityMoveFailInfoListCount() > 0) {
        hash = (37 * hash) + ENTITY_MOVE_FAIL_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityMoveFailInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp prototype) {
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
     * CmdId: 255
     * EnetChannelId: 1
     * EnetIsReliable: false
     * </pre>
     *
     * Protobuf type {@code SceneEntitiesMovesRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntitiesMovesRsp)
        emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.internal_static_SceneEntitiesMovesRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.internal_static_SceneEntitiesMovesRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.class, emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (entityMoveFailInfoListBuilder_ == null) {
          entityMoveFailInfoList_ = java.util.Collections.emptyList();
        } else {
          entityMoveFailInfoList_ = null;
          entityMoveFailInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.internal_static_SceneEntitiesMovesRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp build() {
        emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp buildPartial() {
        emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp result = new emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp(this);
        int from_bitField0_ = bitField0_;
        if (entityMoveFailInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityMoveFailInfoList_ = java.util.Collections.unmodifiableList(entityMoveFailInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityMoveFailInfoList_ = entityMoveFailInfoList_;
        } else {
          result.entityMoveFailInfoList_ = entityMoveFailInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp other) {
        if (other == emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp.getDefaultInstance()) return this;
        if (entityMoveFailInfoListBuilder_ == null) {
          if (!other.entityMoveFailInfoList_.isEmpty()) {
            if (entityMoveFailInfoList_.isEmpty()) {
              entityMoveFailInfoList_ = other.entityMoveFailInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityMoveFailInfoListIsMutable();
              entityMoveFailInfoList_.addAll(other.entityMoveFailInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityMoveFailInfoList_.isEmpty()) {
            if (entityMoveFailInfoListBuilder_.isEmpty()) {
              entityMoveFailInfoListBuilder_.dispose();
              entityMoveFailInfoListBuilder_ = null;
              entityMoveFailInfoList_ = other.entityMoveFailInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityMoveFailInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntityMoveFailInfoListFieldBuilder() : null;
            } else {
              entityMoveFailInfoListBuilder_.addAllMessages(other.entityMoveFailInfoList_);
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
                emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.parser(),
                        extensionRegistry);
                if (entityMoveFailInfoListBuilder_ == null) {
                  ensureEntityMoveFailInfoListIsMutable();
                  entityMoveFailInfoList_.add(m);
                } else {
                  entityMoveFailInfoListBuilder_.addMessage(m);
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

      private java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> entityMoveFailInfoList_ =
        java.util.Collections.emptyList();
      private void ensureEntityMoveFailInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityMoveFailInfoList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo>(entityMoveFailInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder> entityMoveFailInfoListBuilder_;

      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> getEntityMoveFailInfoListList() {
        if (entityMoveFailInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityMoveFailInfoList_);
        } else {
          return entityMoveFailInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public int getEntityMoveFailInfoListCount() {
        if (entityMoveFailInfoListBuilder_ == null) {
          return entityMoveFailInfoList_.size();
        } else {
          return entityMoveFailInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo getEntityMoveFailInfoList(int index) {
        if (entityMoveFailInfoListBuilder_ == null) {
          return entityMoveFailInfoList_.get(index);
        } else {
          return entityMoveFailInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder setEntityMoveFailInfoList(
          int index, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo value) {
        if (entityMoveFailInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.set(index, value);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder setEntityMoveFailInfoList(
          int index, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder builderForValue) {
        if (entityMoveFailInfoListBuilder_ == null) {
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder addEntityMoveFailInfoList(emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo value) {
        if (entityMoveFailInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.add(value);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder addEntityMoveFailInfoList(
          int index, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo value) {
        if (entityMoveFailInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.add(index, value);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder addEntityMoveFailInfoList(
          emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder builderForValue) {
        if (entityMoveFailInfoListBuilder_ == null) {
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder addEntityMoveFailInfoList(
          int index, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder builderForValue) {
        if (entityMoveFailInfoListBuilder_ == null) {
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder addAllEntityMoveFailInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo> values) {
        if (entityMoveFailInfoListBuilder_ == null) {
          ensureEntityMoveFailInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityMoveFailInfoList_);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder clearEntityMoveFailInfoList() {
        if (entityMoveFailInfoListBuilder_ == null) {
          entityMoveFailInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public Builder removeEntityMoveFailInfoList(int index) {
        if (entityMoveFailInfoListBuilder_ == null) {
          ensureEntityMoveFailInfoListIsMutable();
          entityMoveFailInfoList_.remove(index);
          onChanged();
        } else {
          entityMoveFailInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder getEntityMoveFailInfoListBuilder(
          int index) {
        return getEntityMoveFailInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder getEntityMoveFailInfoListOrBuilder(
          int index) {
        if (entityMoveFailInfoListBuilder_ == null) {
          return entityMoveFailInfoList_.get(index);  } else {
          return entityMoveFailInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder> 
           getEntityMoveFailInfoListOrBuilderList() {
        if (entityMoveFailInfoListBuilder_ != null) {
          return entityMoveFailInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityMoveFailInfoList_);
        }
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder addEntityMoveFailInfoListBuilder() {
        return getEntityMoveFailInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder addEntityMoveFailInfoListBuilder(
          int index) {
        return getEntityMoveFailInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .EntityMoveFailInfo entity_move_fail_info_list = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder> 
           getEntityMoveFailInfoListBuilderList() {
        return getEntityMoveFailInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder> 
          getEntityMoveFailInfoListFieldBuilder() {
        if (entityMoveFailInfoListBuilder_ == null) {
          entityMoveFailInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfo.Builder, emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.EntityMoveFailInfoOrBuilder>(
                  entityMoveFailInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityMoveFailInfoList_ = null;
        }
        return entityMoveFailInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneEntitiesMovesRsp)
    }

    // @@protoc_insertion_point(class_scope:SceneEntitiesMovesRsp)
    private static final emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp();
    }

    public static emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntitiesMovesRsp>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntitiesMovesRsp>() {
      @java.lang.Override
      public SceneEntitiesMovesRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntitiesMovesRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneEntitiesMovesRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneEntitiesMovesRspOuterClass.SceneEntitiesMovesRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntitiesMovesRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneEntitiesMovesRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SceneEntitiesMovesRsp.proto\032\030EntityMov" +
      "eFailInfo.proto\"P\n\025SceneEntitiesMovesRsp" +
      "\0227\n\032entity_move_fail_info_list\030\013 \003(\0132\023.E" +
      "ntityMoveFailInfoB\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneEntitiesMovesRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntitiesMovesRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneEntitiesMovesRsp_descriptor,
        new java.lang.String[] { "EntityMoveFailInfoList", });
    emu.grasscutter.net.oldproto.EntityMoveFailInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
