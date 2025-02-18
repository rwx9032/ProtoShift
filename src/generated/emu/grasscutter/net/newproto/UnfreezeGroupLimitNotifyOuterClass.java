// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnfreezeGroupLimitNotify.proto

package emu.grasscutter.net.newproto;

public final class UnfreezeGroupLimitNotifyOuterClass {
  private UnfreezeGroupLimitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnfreezeGroupLimitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnfreezeGroupLimitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 15;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 scene_id = 13;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3483;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UnfreezeGroupLimitNotify}
   */
  public static final class UnfreezeGroupLimitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnfreezeGroupLimitNotify)
      UnfreezeGroupLimitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnfreezeGroupLimitNotify.newBuilder() to construct.
    private UnfreezeGroupLimitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnfreezeGroupLimitNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnfreezeGroupLimitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.class, emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 15;
    private int pointId_;
    /**
     * <code>uint32 point_id = 15;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 13;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 13;</code>
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
      if (sceneId_ != 0) {
        output.writeUInt32(13, sceneId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(15, pointId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, sceneId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, pointId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify other = (emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify) obj;

      if (getPointId()
          != other.getPointId()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify prototype) {
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
     *   CMD_ID = 3483;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UnfreezeGroupLimitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnfreezeGroupLimitNotify)
        emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.class, emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pointId_ = 0;

        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.internal_static_UnfreezeGroupLimitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify build() {
        emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify buildPartial() {
        emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify result = new emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify(this);
        result.pointId_ = pointId_;
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
        if (other instanceof emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify other) {
        if (other == emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
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
              case 104: {
                sceneId_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                pointId_ = input.readUInt32();

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

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 15;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 15;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 13;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:UnfreezeGroupLimitNotify)
    }

    // @@protoc_insertion_point(class_scope:UnfreezeGroupLimitNotify)
    private static final emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify();
    }

    public static emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnfreezeGroupLimitNotify>
        PARSER = new com.google.protobuf.AbstractParser<UnfreezeGroupLimitNotify>() {
      @java.lang.Override
      public UnfreezeGroupLimitNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnfreezeGroupLimitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnfreezeGroupLimitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.UnfreezeGroupLimitNotifyOuterClass.UnfreezeGroupLimitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnfreezeGroupLimitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036UnfreezeGroupLimitNotify.proto\">\n\030Unfr" +
      "eezeGroupLimitNotify\022\020\n\010point_id\030\017 \001(\r\022\020" +
      "\n\010scene_id\030\r \001(\rB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnfreezeGroupLimitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnfreezeGroupLimitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnfreezeGroupLimitNotify_descriptor,
        new java.lang.String[] { "PointId", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
