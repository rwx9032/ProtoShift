// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_BEINCMBJDAA_ClientReq.proto

package emu.grasscutter.net.newproto;

public final class Unk2700BEINCMBJDAAClientReq {
  private Unk2700BEINCMBJDAAClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_BEINCMBJDAA_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_BEINCMBJDAA_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_id = 6;</code>
     * @return The targetId.
     */
    int getTargetId();

    /**
     * <code>uint32 source_id = 7;</code>
     * @return The sourceId.
     */
    int getSourceId();

    /**
     * <code>float Unk3250_LCLOFCCIJKH = 13;</code>
     * @return The unk3250LCLOFCCIJKH.
     */
    float getUnk3250LCLOFCCIJKH();

    /**
     * <code>float Unk3250_ECNBKHHADDJ = 12;</code>
     * @return The unk3250ECNBKHHADDJ.
     */
    float getUnk3250ECNBKHHADDJ();
  }
  /**
   * <pre>
   * CmdId: 362
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_BEINCMBJDAA_ClientReq}
   */
  public static final class Unk2700_BEINCMBJDAA_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_BEINCMBJDAA_ClientReq)
      Unk2700_BEINCMBJDAA_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_BEINCMBJDAA_ClientReq.newBuilder() to construct.
    private Unk2700_BEINCMBJDAA_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_BEINCMBJDAA_ClientReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_BEINCMBJDAA_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.internal_static_Unk2700_BEINCMBJDAA_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.class, emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.Builder.class);
    }

    public static final int TARGET_ID_FIELD_NUMBER = 6;
    private int targetId_;
    /**
     * <code>uint32 target_id = 6;</code>
     * @return The targetId.
     */
    @java.lang.Override
    public int getTargetId() {
      return targetId_;
    }

    public static final int SOURCE_ID_FIELD_NUMBER = 7;
    private int sourceId_;
    /**
     * <code>uint32 source_id = 7;</code>
     * @return The sourceId.
     */
    @java.lang.Override
    public int getSourceId() {
      return sourceId_;
    }

    public static final int UNK3250_LCLOFCCIJKH_FIELD_NUMBER = 13;
    private float unk3250LCLOFCCIJKH_;
    /**
     * <code>float Unk3250_LCLOFCCIJKH = 13;</code>
     * @return The unk3250LCLOFCCIJKH.
     */
    @java.lang.Override
    public float getUnk3250LCLOFCCIJKH() {
      return unk3250LCLOFCCIJKH_;
    }

    public static final int UNK3250_ECNBKHHADDJ_FIELD_NUMBER = 12;
    private float unk3250ECNBKHHADDJ_;
    /**
     * <code>float Unk3250_ECNBKHHADDJ = 12;</code>
     * @return The unk3250ECNBKHHADDJ.
     */
    @java.lang.Override
    public float getUnk3250ECNBKHHADDJ() {
      return unk3250ECNBKHHADDJ_;
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
      if (targetId_ != 0) {
        output.writeUInt32(6, targetId_);
      }
      if (sourceId_ != 0) {
        output.writeUInt32(7, sourceId_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3250ECNBKHHADDJ_) != 0) {
        output.writeFloat(12, unk3250ECNBKHHADDJ_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3250LCLOFCCIJKH_) != 0) {
        output.writeFloat(13, unk3250LCLOFCCIJKH_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, targetId_);
      }
      if (sourceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sourceId_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3250ECNBKHHADDJ_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(12, unk3250ECNBKHHADDJ_);
      }
      if (java.lang.Float.floatToRawIntBits(unk3250LCLOFCCIJKH_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, unk3250LCLOFCCIJKH_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq other = (emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq) obj;

      if (getTargetId()
          != other.getTargetId()) return false;
      if (getSourceId()
          != other.getSourceId()) return false;
      if (java.lang.Float.floatToIntBits(getUnk3250LCLOFCCIJKH())
          != java.lang.Float.floatToIntBits(
              other.getUnk3250LCLOFCCIJKH())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3250ECNBKHHADDJ())
          != java.lang.Float.floatToIntBits(
              other.getUnk3250ECNBKHHADDJ())) return false;
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
      hash = (37 * hash) + TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetId();
      hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceId();
      hash = (37 * hash) + UNK3250_LCLOFCCIJKH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3250LCLOFCCIJKH());
      hash = (37 * hash) + UNK3250_ECNBKHHADDJ_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3250ECNBKHHADDJ());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq prototype) {
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
     * CmdId: 362
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_BEINCMBJDAA_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_BEINCMBJDAA_ClientReq)
        emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.internal_static_Unk2700_BEINCMBJDAA_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.class, emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetId_ = 0;

        sourceId_ = 0;

        unk3250LCLOFCCIJKH_ = 0F;

        unk3250ECNBKHHADDJ_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq build() {
        emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq buildPartial() {
        emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq result = new emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq(this);
        result.targetId_ = targetId_;
        result.sourceId_ = sourceId_;
        result.unk3250LCLOFCCIJKH_ = unk3250LCLOFCCIJKH_;
        result.unk3250ECNBKHHADDJ_ = unk3250ECNBKHHADDJ_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq other) {
        if (other == emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq.getDefaultInstance()) return this;
        if (other.getTargetId() != 0) {
          setTargetId(other.getTargetId());
        }
        if (other.getSourceId() != 0) {
          setSourceId(other.getSourceId());
        }
        if (other.getUnk3250LCLOFCCIJKH() != 0F) {
          setUnk3250LCLOFCCIJKH(other.getUnk3250LCLOFCCIJKH());
        }
        if (other.getUnk3250ECNBKHHADDJ() != 0F) {
          setUnk3250ECNBKHHADDJ(other.getUnk3250ECNBKHHADDJ());
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
              case 48: {
                targetId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                sourceId_ = input.readUInt32();

                break;
              } // case 56
              case 101: {
                unk3250ECNBKHHADDJ_ = input.readFloat();

                break;
              } // case 101
              case 109: {
                unk3250LCLOFCCIJKH_ = input.readFloat();

                break;
              } // case 109
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

      private int targetId_ ;
      /**
       * <code>uint32 target_id = 6;</code>
       * @return The targetId.
       */
      @java.lang.Override
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>uint32 target_id = 6;</code>
       * @param value The targetId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetId(int value) {
        
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetId() {
        
        targetId_ = 0;
        onChanged();
        return this;
      }

      private int sourceId_ ;
      /**
       * <code>uint32 source_id = 7;</code>
       * @return The sourceId.
       */
      @java.lang.Override
      public int getSourceId() {
        return sourceId_;
      }
      /**
       * <code>uint32 source_id = 7;</code>
       * @param value The sourceId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceId(int value) {
        
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceId() {
        
        sourceId_ = 0;
        onChanged();
        return this;
      }

      private float unk3250LCLOFCCIJKH_ ;
      /**
       * <code>float Unk3250_LCLOFCCIJKH = 13;</code>
       * @return The unk3250LCLOFCCIJKH.
       */
      @java.lang.Override
      public float getUnk3250LCLOFCCIJKH() {
        return unk3250LCLOFCCIJKH_;
      }
      /**
       * <code>float Unk3250_LCLOFCCIJKH = 13;</code>
       * @param value The unk3250LCLOFCCIJKH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250LCLOFCCIJKH(float value) {
        
        unk3250LCLOFCCIJKH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3250_LCLOFCCIJKH = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250LCLOFCCIJKH() {
        
        unk3250LCLOFCCIJKH_ = 0F;
        onChanged();
        return this;
      }

      private float unk3250ECNBKHHADDJ_ ;
      /**
       * <code>float Unk3250_ECNBKHHADDJ = 12;</code>
       * @return The unk3250ECNBKHHADDJ.
       */
      @java.lang.Override
      public float getUnk3250ECNBKHHADDJ() {
        return unk3250ECNBKHHADDJ_;
      }
      /**
       * <code>float Unk3250_ECNBKHHADDJ = 12;</code>
       * @param value The unk3250ECNBKHHADDJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250ECNBKHHADDJ(float value) {
        
        unk3250ECNBKHHADDJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3250_ECNBKHHADDJ = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250ECNBKHHADDJ() {
        
        unk3250ECNBKHHADDJ_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_BEINCMBJDAA_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_BEINCMBJDAA_ClientReq)
    private static final emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq();
    }

    public static emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_BEINCMBJDAA_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_BEINCMBJDAA_ClientReq>() {
      @java.lang.Override
      public Unk2700_BEINCMBJDAA_ClientReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_BEINCMBJDAA_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_BEINCMBJDAA_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700BEINCMBJDAAClientReq.Unk2700_BEINCMBJDAA_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_BEINCMBJDAA_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_BEINCMBJDAA_ClientReq.proto\"\177\n" +
      "\035Unk2700_BEINCMBJDAA_ClientReq\022\021\n\ttarget" +
      "_id\030\006 \001(\r\022\021\n\tsource_id\030\007 \001(\r\022\033\n\023Unk3250_" +
      "LCLOFCCIJKH\030\r \001(\002\022\033\n\023Unk3250_ECNBKHHADDJ" +
      "\030\014 \001(\002B\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_BEINCMBJDAA_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_BEINCMBJDAA_ClientReq_descriptor,
        new java.lang.String[] { "TargetId", "SourceId", "Unk3250LCLOFCCIJKH", "Unk3250ECNBKHHADDJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
