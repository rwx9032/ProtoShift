// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetCaptureAnimalRsp.proto

package emu.grasscutter.net.newproto;

public final class WidgetCaptureAnimalRspOuterClass {
  private WidgetCaptureAnimalRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetCaptureAnimalRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetCaptureAnimalRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 material_id = 7;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector pos = 10;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 10;</code>
     * @return The pos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 10;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4296;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetCaptureAnimalRsp}
   */
  public static final class WidgetCaptureAnimalRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetCaptureAnimalRsp)
      WidgetCaptureAnimalRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetCaptureAnimalRsp.newBuilder() to construct.
    private WidgetCaptureAnimalRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetCaptureAnimalRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetCaptureAnimalRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.internal_static_WidgetCaptureAnimalRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.internal_static_WidgetCaptureAnimalRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.class, emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 7;
    private int materialId_;
    /**
     * <code>uint32 material_id = 7;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int POS_FIELD_NUMBER = 10;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 10;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 10;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(7, materialId_);
      }
      if (pos_ != null) {
        output.writeMessage(10, getPos());
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, materialId_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getPos());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp other = (emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp prototype) {
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
     *   CMD_ID = 4296;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetCaptureAnimalRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetCaptureAnimalRsp)
        emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.internal_static_WidgetCaptureAnimalRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.internal_static_WidgetCaptureAnimalRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.class, emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.newBuilder()
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

        materialId_ = 0;

        entityId_ = 0;

        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.internal_static_WidgetCaptureAnimalRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp build() {
        emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp buildPartial() {
        emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp result = new emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp(this);
        result.retcode_ = retcode_;
        result.materialId_ = materialId_;
        result.entityId_ = entityId_;
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp other) {
        if (other == emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
              case 32: {
                retcode_ = input.readInt32();

                break;
              } // case 32
              case 56: {
                materialId_ = input.readUInt32();

                break;
              } // case 56
              case 82: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
              case 88: {
                entityId_ = input.readUInt32();

                break;
              } // case 88
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 7;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 7;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 10;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 10;</code>
       * @return The pos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder setPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder setPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder mergePos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WidgetCaptureAnimalRsp)
    }

    // @@protoc_insertion_point(class_scope:WidgetCaptureAnimalRsp)
    private static final emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp();
    }

    public static emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetCaptureAnimalRsp>
        PARSER = new com.google.protobuf.AbstractParser<WidgetCaptureAnimalRsp>() {
      @java.lang.Override
      public WidgetCaptureAnimalRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetCaptureAnimalRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetCaptureAnimalRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetCaptureAnimalRspOuterClass.WidgetCaptureAnimalRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetCaptureAnimalRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetCaptureAnimalRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WidgetCaptureAnimalRsp.proto\032\014Vector.p" +
      "roto\"g\n\026WidgetCaptureAnimalRsp\022\017\n\007retcod" +
      "e\030\004 \001(\005\022\023\n\013material_id\030\007 \001(\r\022\021\n\tentity_i" +
      "d\030\013 \001(\r\022\024\n\003pos\030\n \001(\0132\007.VectorB\036\n\034emu.gra" +
      "sscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_WidgetCaptureAnimalRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetCaptureAnimalRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetCaptureAnimalRsp_descriptor,
        new java.lang.String[] { "Retcode", "MaterialId", "EntityId", "Pos", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
