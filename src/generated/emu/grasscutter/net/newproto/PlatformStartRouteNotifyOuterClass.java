// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlatformStartRouteNotify.proto

package emu.grasscutter.net.newproto;

public final class PlatformStartRouteNotifyOuterClass {
  private PlatformStartRouteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlatformStartRouteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlatformStartRouteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 scene_time = 7;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>.PlatformInfo platform = 2;</code>
     * @return Whether the platform field is set.
     */
    boolean hasPlatform();
    /**
     * <code>.PlatformInfo platform = 2;</code>
     * @return The platform.
     */
    emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo getPlatform();
    /**
     * <code>.PlatformInfo platform = 2;</code>
     */
    emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 208;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlatformStartRouteNotify}
   */
  public static final class PlatformStartRouteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlatformStartRouteNotify)
      PlatformStartRouteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlatformStartRouteNotify.newBuilder() to construct.
    private PlatformStartRouteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlatformStartRouteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlatformStartRouteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.internal_static_PlatformStartRouteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.internal_static_PlatformStartRouteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.class, emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 12;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 7;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 7;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int PLATFORM_FIELD_NUMBER = 2;
    private emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo platform_;
    /**
     * <code>.PlatformInfo platform = 2;</code>
     * @return Whether the platform field is set.
     */
    @java.lang.Override
    public boolean hasPlatform() {
      return platform_ != null;
    }
    /**
     * <code>.PlatformInfo platform = 2;</code>
     * @return The platform.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo getPlatform() {
      return platform_ == null ? emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
    }
    /**
     * <code>.PlatformInfo platform = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
      return getPlatform();
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
      if (platform_ != null) {
        output.writeMessage(2, getPlatform());
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(7, sceneTime_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(12, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (platform_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPlatform());
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sceneTime_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify other = (emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (hasPlatform() != other.hasPlatform()) return false;
      if (hasPlatform()) {
        if (!getPlatform()
            .equals(other.getPlatform())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      if (hasPlatform()) {
        hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
        hash = (53 * hash) + getPlatform().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify prototype) {
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
     *   CMD_ID = 208;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlatformStartRouteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlatformStartRouteNotify)
        emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.internal_static_PlatformStartRouteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.internal_static_PlatformStartRouteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.class, emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        sceneTime_ = 0;

        if (platformBuilder_ == null) {
          platform_ = null;
        } else {
          platform_ = null;
          platformBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.internal_static_PlatformStartRouteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify build() {
        emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify buildPartial() {
        emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify result = new emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify(this);
        result.entityId_ = entityId_;
        result.sceneTime_ = sceneTime_;
        if (platformBuilder_ == null) {
          result.platform_ = platform_;
        } else {
          result.platform_ = platformBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify other) {
        if (other == emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.hasPlatform()) {
          mergePlatform(other.getPlatform());
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
              case 18: {
                input.readMessage(
                    getPlatformFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 18
              case 56: {
                sceneTime_ = input.readUInt32();

                break;
              } // case 56
              case 96: {
                entityId_ = input.readUInt32();

                break;
              } // case 96
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 12;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 12;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 7;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 7;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo platform_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder> platformBuilder_;
      /**
       * <code>.PlatformInfo platform = 2;</code>
       * @return Whether the platform field is set.
       */
      public boolean hasPlatform() {
        return platformBuilder_ != null || platform_ != null;
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       * @return The platform.
       */
      public emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo getPlatform() {
        if (platformBuilder_ == null) {
          return platform_ == null ? emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
        } else {
          return platformBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public Builder setPlatform(emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo value) {
        if (platformBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          platform_ = value;
          onChanged();
        } else {
          platformBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public Builder setPlatform(
          emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.Builder builderForValue) {
        if (platformBuilder_ == null) {
          platform_ = builderForValue.build();
          onChanged();
        } else {
          platformBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public Builder mergePlatform(emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo value) {
        if (platformBuilder_ == null) {
          if (platform_ != null) {
            platform_ =
              emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.newBuilder(platform_).mergeFrom(value).buildPartial();
          } else {
            platform_ = value;
          }
          onChanged();
        } else {
          platformBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public Builder clearPlatform() {
        if (platformBuilder_ == null) {
          platform_ = null;
          onChanged();
        } else {
          platform_ = null;
          platformBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.Builder getPlatformBuilder() {
        
        onChanged();
        return getPlatformFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      public emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
        if (platformBuilder_ != null) {
          return platformBuilder_.getMessageOrBuilder();
        } else {
          return platform_ == null ?
              emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : platform_;
        }
      }
      /**
       * <code>.PlatformInfo platform = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder> 
          getPlatformFieldBuilder() {
        if (platformBuilder_ == null) {
          platformBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfo.Builder, emu.grasscutter.net.newproto.PlatformInfoOuterClass.PlatformInfoOrBuilder>(
                  getPlatform(),
                  getParentForChildren(),
                  isClean());
          platform_ = null;
        }
        return platformBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlatformStartRouteNotify)
    }

    // @@protoc_insertion_point(class_scope:PlatformStartRouteNotify)
    private static final emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify();
    }

    public static emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlatformStartRouteNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlatformStartRouteNotify>() {
      @java.lang.Override
      public PlatformStartRouteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlatformStartRouteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlatformStartRouteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlatformStartRouteNotifyOuterClass.PlatformStartRouteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlatformStartRouteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlatformStartRouteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlatformStartRouteNotify.proto\032\022Platfo" +
      "rmInfo.proto\"b\n\030PlatformStartRouteNotify" +
      "\022\021\n\tentity_id\030\014 \001(\r\022\022\n\nscene_time\030\007 \001(\r\022" +
      "\037\n\010platform\030\002 \001(\0132\r.PlatformInfoB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.PlatformInfoOuterClass.getDescriptor(),
        });
    internal_static_PlatformStartRouteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlatformStartRouteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlatformStartRouteNotify_descriptor,
        new java.lang.String[] { "EntityId", "SceneTime", "Platform", });
    emu.grasscutter.net.newproto.PlatformInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
