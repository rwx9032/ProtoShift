// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBeingHealedNotify.proto

package emu.grasscutter.net.newproto;

public final class EvtBeingHealedNotifyOuterClass {
  private EvtBeingHealedNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBeingHealedNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBeingHealedNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float Unk3300_LCLOFCCIJKH = 2;</code>
     * @return The unk3300LCLOFCCIJKH.
     */
    float getUnk3300LCLOFCCIJKH();

    /**
     * <code>float Unk3300_ECNBKHHADDJ = 3;</code>
     * @return The unk3300ECNBKHHADDJ.
     */
    float getUnk3300ECNBKHHADDJ();

    /**
     * <code>uint32 target_id = 4;</code>
     * @return The targetId.
     */
    int getTargetId();

    /**
     * <code>uint32 source_id = 6;</code>
     * @return The sourceId.
     */
    int getSourceId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 366;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtBeingHealedNotify}
   */
  public static final class EvtBeingHealedNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBeingHealedNotify)
      EvtBeingHealedNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBeingHealedNotify.newBuilder() to construct.
    private EvtBeingHealedNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBeingHealedNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBeingHealedNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
    }

    public static final int UNK3300_LCLOFCCIJKH_FIELD_NUMBER = 2;
    private float unk3300LCLOFCCIJKH_;
    /**
     * <code>float Unk3300_LCLOFCCIJKH = 2;</code>
     * @return The unk3300LCLOFCCIJKH.
     */
    @java.lang.Override
    public float getUnk3300LCLOFCCIJKH() {
      return unk3300LCLOFCCIJKH_;
    }

    public static final int UNK3300_ECNBKHHADDJ_FIELD_NUMBER = 3;
    private float unk3300ECNBKHHADDJ_;
    /**
     * <code>float Unk3300_ECNBKHHADDJ = 3;</code>
     * @return The unk3300ECNBKHHADDJ.
     */
    @java.lang.Override
    public float getUnk3300ECNBKHHADDJ() {
      return unk3300ECNBKHHADDJ_;
    }

    public static final int TARGET_ID_FIELD_NUMBER = 4;
    private int targetId_;
    /**
     * <code>uint32 target_id = 4;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }

    public static final int SOURCE_ID_FIELD_NUMBER = 6;
    private int sourceId_;
    /**
     * <code>uint32 source_id = 6;</code>
     * @return The sourceId.
     */
    @java.lang.Override
    public int getSourceId() {
      return sourceId_;
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
      if (java.lang.Float.floatToRawIntBits(unk3300LCLOFCCIJKH_) != 0) {
        output.writeFloat(2, unk3300LCLOFCCIJKH_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3300ECNBKHHADDJ_) != 0) {
        output.writeFloat(3, unk3300ECNBKHHADDJ_);
      }
      if (targetId_ != 0) {
        output.writeUInt32(4, targetId_);
      }
      if (sourceId_ != 0) {
        output.writeUInt32(6, sourceId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(unk3300LCLOFCCIJKH_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, unk3300LCLOFCCIJKH_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3300ECNBKHHADDJ_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, unk3300ECNBKHHADDJ_);
      }
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, targetId_);
      }
      if (sourceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sourceId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other = (emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) obj;

      if (java.lang.Float.floatToIntBits(getUnk3300LCLOFCCIJKH())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300LCLOFCCIJKH())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300ECNBKHHADDJ())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300ECNBKHHADDJ())) return false;
      if (getTargetId()
          != other.getTargetId()) return false;
      if (getSourceId()
          != other.getSourceId()) return false;
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
      hash = (37 * hash) + UNK3300_LCLOFCCIJKH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300LCLOFCCIJKH());
      hash = (37 * hash) + UNK3300_ECNBKHHADDJ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300ECNBKHHADDJ());
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify prototype) {
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
     *   CMD_ID = 366;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtBeingHealedNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBeingHealedNotify)
        emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.class, emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300LCLOFCCIJKH_ = 0F;

        unk3300ECNBKHHADDJ_ = 0F;

        targetId_ = 0;

        sourceId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.internal_static_EvtBeingHealedNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify build() {
        emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify buildPartial() {
        emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify result = new emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify(this);
        result.unk3300LCLOFCCIJKH_ = unk3300LCLOFCCIJKH_;
        result.unk3300ECNBKHHADDJ_ = unk3300ECNBKHHADDJ_;
        result.targetId_ = targetId_;
        result.sourceId_ = sourceId_;
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
        if (other instanceof emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify other) {
        if (other == emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify.getDefaultInstance()) return this;
        if (other.getUnk3300LCLOFCCIJKH() != 0F) {
          setUnk3300LCLOFCCIJKH(other.getUnk3300LCLOFCCIJKH());
        }
        if (other.getUnk3300ECNBKHHADDJ() != 0F) {
          setUnk3300ECNBKHHADDJ(other.getUnk3300ECNBKHHADDJ());
        }
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (other.getSourceId() != 0) {
          setSourceId(other.getSourceId());
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
              case 21: {
                unk3300LCLOFCCIJKH_ = input.readFloat();

                break;
              } // case 21
              case 29: {
                unk3300ECNBKHHADDJ_ = input.readFloat();

                break;
              } // case 29
              case 32: {
                targetId_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                sourceId_ = input.readUInt32();

                break;
              } // case 48
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

      private float unk3300LCLOFCCIJKH_ ;
      /**
       * <code>float Unk3300_LCLOFCCIJKH = 2;</code>
       * @return The unk3300LCLOFCCIJKH.
       */
      @java.lang.Override
      public float getUnk3300LCLOFCCIJKH() {
        return unk3300LCLOFCCIJKH_;
      }
      /**
       * <code>float Unk3300_LCLOFCCIJKH = 2;</code>
       * @param value The unk3300LCLOFCCIJKH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LCLOFCCIJKH(float value) {
        
        unk3300LCLOFCCIJKH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_LCLOFCCIJKH = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LCLOFCCIJKH() {
        
        unk3300LCLOFCCIJKH_ = 0F;
        onChanged();
        return this;
      }

      private float unk3300ECNBKHHADDJ_ ;
      /**
       * <code>float Unk3300_ECNBKHHADDJ = 3;</code>
       * @return The unk3300ECNBKHHADDJ.
       */
      @java.lang.Override
      public float getUnk3300ECNBKHHADDJ() {
        return unk3300ECNBKHHADDJ_;
      }
      /**
       * <code>float Unk3300_ECNBKHHADDJ = 3;</code>
       * @param value The unk3300ECNBKHHADDJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300ECNBKHHADDJ(float value) {
        
        unk3300ECNBKHHADDJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_ECNBKHHADDJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300ECNBKHHADDJ() {
        
        unk3300ECNBKHHADDJ_ = 0F;
        onChanged();
        return this;
      }

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 4;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 4;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private int sourceId_ ;
      /**
       * <code>uint32 source_id = 6;</code>
       * @return The sourceId.
       */
      @java.lang.Override
      public int getSourceId() {
        return sourceId_;
      }
      /**
       * <code>uint32 source_id = 6;</code>
       * @param value The sourceId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceId(int value) {
        
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceId() {
        
        sourceId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtBeingHealedNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBeingHealedNotify)
    private static final emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify();
    }

    public static emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBeingHealedNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBeingHealedNotify>() {
      @java.lang.Override
      public EvtBeingHealedNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtBeingHealedNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBeingHealedNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.EvtBeingHealedNotifyOuterClass.EvtBeingHealedNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBeingHealedNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBeingHealedNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EvtBeingHealedNotify.proto\"v\n\024EvtBeing" +
      "HealedNotify\022\033\n\023Unk3300_LCLOFCCIJKH\030\002 \001(" +
      "\002\022\033\n\023Unk3300_ECNBKHHADDJ\030\003 \001(\002\022\021\n\ttarget" +
      "_id\030\004 \001(\r\022\021\n\tsource_id\030\006 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtBeingHealedNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBeingHealedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBeingHealedNotify_descriptor,
        new java.lang.String[] { "Unk3300LCLOFCCIJKH", "Unk3300ECNBKHHADDJ", "TargetId", "SourceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
