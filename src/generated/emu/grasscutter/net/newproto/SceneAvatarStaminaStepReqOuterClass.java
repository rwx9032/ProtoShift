// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneAvatarStaminaStepReq.proto

package emu.grasscutter.net.newproto;

public final class SceneAvatarStaminaStepReqOuterClass {
  private SceneAvatarStaminaStepReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneAvatarStaminaStepReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneAvatarStaminaStepReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool use_client_rot = 9;</code>
     * @return The useClientRot.
     */
    boolean getUseClientRot();

    /**
     * <code>.Vector rot = 12;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 12;</code>
     * @return The rot.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 12;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 257;
   *   ENET_CHANNEL_ID = 1;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneAvatarStaminaStepReq}
   */
  public static final class SceneAvatarStaminaStepReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneAvatarStaminaStepReq)
      SceneAvatarStaminaStepReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneAvatarStaminaStepReq.newBuilder() to construct.
    private SceneAvatarStaminaStepReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneAvatarStaminaStepReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneAvatarStaminaStepReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.internal_static_SceneAvatarStaminaStepReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.internal_static_SceneAvatarStaminaStepReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.class, emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.Builder.class);
    }

    public static final int USE_CLIENT_ROT_FIELD_NUMBER = 9;
    private boolean useClientRot_;
    /**
     * <code>bool use_client_rot = 9;</code>
     * @return The useClientRot.
     */
    @java.lang.Override
    public boolean getUseClientRot() {
      return useClientRot_;
    }

    public static final int ROT_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 12;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 12;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
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
      if (useClientRot_ != false) {
        output.writeBool(9, useClientRot_);
      }
      if (rot_ != null) {
        output.writeMessage(12, getRot());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (useClientRot_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, useClientRot_);
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getRot());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq other = (emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq) obj;

      if (getUseClientRot()
          != other.getUseClientRot()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
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
      hash = (37 * hash) + USE_CLIENT_ROT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUseClientRot());
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq prototype) {
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
     *   CMD_ID = 257;
     *   ENET_CHANNEL_ID = 1;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneAvatarStaminaStepReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneAvatarStaminaStepReq)
        emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.internal_static_SceneAvatarStaminaStepReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.internal_static_SceneAvatarStaminaStepReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.class, emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        useClientRot_ = false;

        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.internal_static_SceneAvatarStaminaStepReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq build() {
        emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq buildPartial() {
        emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq result = new emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq(this);
        result.useClientRot_ = useClientRot_;
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq other) {
        if (other == emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq.getDefaultInstance()) return this;
        if (other.getUseClientRot() != false) {
          setUseClientRot(other.getUseClientRot());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
              case 72: {
                useClientRot_ = input.readBool();

                break;
              } // case 72
              case 98: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 98
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

      private boolean useClientRot_ ;
      /**
       * <code>bool use_client_rot = 9;</code>
       * @return The useClientRot.
       */
      @java.lang.Override
      public boolean getUseClientRot() {
        return useClientRot_;
      }
      /**
       * <code>bool use_client_rot = 9;</code>
       * @param value The useClientRot to set.
       * @return This builder for chaining.
       */
      public Builder setUseClientRot(boolean value) {
        
        useClientRot_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool use_client_rot = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseClientRot() {
        
        useClientRot_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 12;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 12;</code>
       * @return The rot.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder setRot(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder setRot(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder mergeRot(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SceneAvatarStaminaStepReq)
    }

    // @@protoc_insertion_point(class_scope:SceneAvatarStaminaStepReq)
    private static final emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq();
    }

    public static emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneAvatarStaminaStepReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneAvatarStaminaStepReq>() {
      @java.lang.Override
      public SceneAvatarStaminaStepReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneAvatarStaminaStepReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneAvatarStaminaStepReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneAvatarStaminaStepReqOuterClass.SceneAvatarStaminaStepReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneAvatarStaminaStepReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneAvatarStaminaStepReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SceneAvatarStaminaStepReq.proto\032\014Vecto" +
      "r.proto\"I\n\031SceneAvatarStaminaStepReq\022\026\n\016" +
      "use_client_rot\030\t \001(\010\022\024\n\003rot\030\014 \001(\0132\007.Vect" +
      "orB\036\n\034emu.grasscutter.net.newprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SceneAvatarStaminaStepReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneAvatarStaminaStepReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneAvatarStaminaStepReq_descriptor,
        new java.lang.String[] { "UseClientRot", "Rot", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
