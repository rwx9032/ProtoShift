// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetInteractReq.proto

package emu.grasscutter.net.newproto;

public final class GadgetInteractReqOuterClass {
  private GadgetInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>.ResinCostType resin_cost_type = 13;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    int getResinCostTypeValue();
    /**
     * <code>.ResinCostType resin_cost_type = 13;</code>
     * @return The resinCostType.
     */
    emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType getResinCostType();

    /**
     * <code>uint32 gadget_entity_id = 8;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>.InterOpType op_type = 2;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.InterOpType op_type = 2;</code>
     * @return The opType.
     */
    emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType getOpType();

    /**
     * <code>uint32 ui_interact_id = 11;</code>
     * @return The uiInteractId.
     */
    int getUiInteractId();

    /**
     * <code>bool is_use_condense_resin = 6;</code>
     * @return The isUseCondenseResin.
     */
    boolean getIsUseCondenseResin();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 879;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GadgetInteractReq}
   */
  public static final class GadgetInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetInteractReq)
      GadgetInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetInteractReq.newBuilder() to construct.
    private GadgetInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetInteractReq() {
      resinCostType_ = 0;
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
    }

    public static final int GADGET_ID_FIELD_NUMBER = 1;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 1;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int RESIN_COST_TYPE_FIELD_NUMBER = 13;
    private int resinCostType_;
    /**
     * <code>.ResinCostType resin_cost_type = 13;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    @java.lang.Override public int getResinCostTypeValue() {
      return resinCostType_;
    }
    /**
     * <code>.ResinCostType resin_cost_type = 13;</code>
     * @return The resinCostType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.valueOf(resinCostType_);
      return result == null ? emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 8;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 8;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 2;
    private int opType_;
    /**
     * <code>.InterOpType op_type = 2;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType op_type = 2;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
      return result == null ? emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
    }

    public static final int UI_INTERACT_ID_FIELD_NUMBER = 11;
    private int uiInteractId_;
    /**
     * <code>uint32 ui_interact_id = 11;</code>
     * @return The uiInteractId.
     */
    @java.lang.Override
    public int getUiInteractId() {
      return uiInteractId_;
    }

    public static final int IS_USE_CONDENSE_RESIN_FIELD_NUMBER = 6;
    private boolean isUseCondenseResin_;
    /**
     * <code>bool is_use_condense_resin = 6;</code>
     * @return The isUseCondenseResin.
     */
    @java.lang.Override
    public boolean getIsUseCondenseResin() {
      return isUseCondenseResin_;
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
      if (gadgetId_ != 0) {
        output.writeUInt32(1, gadgetId_);
      }
      if (opType_ != emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        output.writeEnum(2, opType_);
      }
      if (isUseCondenseResin_ != false) {
        output.writeBool(6, isUseCondenseResin_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(8, gadgetEntityId_);
      }
      if (uiInteractId_ != 0) {
        output.writeUInt32(11, uiInteractId_);
      }
      if (resinCostType_ != emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        output.writeEnum(13, resinCostType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gadgetId_);
      }
      if (opType_ != emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, opType_);
      }
      if (isUseCondenseResin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isUseCondenseResin_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, gadgetEntityId_);
      }
      if (uiInteractId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, uiInteractId_);
      }
      if (resinCostType_ != emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, resinCostType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq other = (emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq) obj;

      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (resinCostType_ != other.resinCostType_) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (opType_ != other.opType_) return false;
      if (getUiInteractId()
          != other.getUiInteractId()) return false;
      if (getIsUseCondenseResin()
          != other.getIsUseCondenseResin()) return false;
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
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + RESIN_COST_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + resinCostType_;
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + UI_INTERACT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUiInteractId();
      hash = (37 * hash) + IS_USE_CONDENSE_RESIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUseCondenseResin());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq prototype) {
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
     *   CMD_ID = 879;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GadgetInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetInteractReq)
        emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gadgetId_ = 0;

        resinCostType_ = 0;

        gadgetEntityId_ = 0;

        opType_ = 0;

        uiInteractId_ = 0;

        isUseCondenseResin_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq build() {
        emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq buildPartial() {
        emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq result = new emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq(this);
        result.gadgetId_ = gadgetId_;
        result.resinCostType_ = resinCostType_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.opType_ = opType_;
        result.uiInteractId_ = uiInteractId_;
        result.isUseCondenseResin_ = isUseCondenseResin_;
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
        if (other instanceof emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq) {
          return mergeFrom((emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq other) {
        if (other == emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance()) return this;
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.resinCostType_ != 0) {
          setResinCostTypeValue(other.getResinCostTypeValue());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getUiInteractId() != 0) {
          setUiInteractId(other.getUiInteractId());
        }
        if (other.getIsUseCondenseResin() != false) {
          setIsUseCondenseResin(other.getIsUseCondenseResin());
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
              case 8: {
                gadgetId_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                opType_ = input.readEnum();

                break;
              } // case 16
              case 48: {
                isUseCondenseResin_ = input.readBool();

                break;
              } // case 48
              case 64: {
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                uiInteractId_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                resinCostType_ = input.readEnum();

                break;
              } // case 104
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

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private int resinCostType_ = 0;
      /**
       * <code>.ResinCostType resin_cost_type = 13;</code>
       * @return The enum numeric value on the wire for resinCostType.
       */
      @java.lang.Override public int getResinCostTypeValue() {
        return resinCostType_;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 13;</code>
       * @param value The enum numeric value on the wire for resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostTypeValue(int value) {
        
        resinCostType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 13;</code>
       * @return The resinCostType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.valueOf(resinCostType_);
        return result == null ? emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 13;</code>
       * @param value The resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostType(emu.grasscutter.net.newproto.ResinCostTypeOuterClass.ResinCostType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        resinCostType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resin_cost_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearResinCostType() {
        
        resinCostType_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 8;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 8;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.InterOpType op_type = 2;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.InterOpType op_type = 2;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 2;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.valueOf(opType_);
        return result == null ? emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InterOpType op_type = 2;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.newproto.InterOpTypeOuterClass.InterOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType op_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int uiInteractId_ ;
      /**
       * <code>uint32 ui_interact_id = 11;</code>
       * @return The uiInteractId.
       */
      @java.lang.Override
      public int getUiInteractId() {
        return uiInteractId_;
      }
      /**
       * <code>uint32 ui_interact_id = 11;</code>
       * @param value The uiInteractId to set.
       * @return This builder for chaining.
       */
      public Builder setUiInteractId(int value) {
        
        uiInteractId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ui_interact_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUiInteractId() {
        
        uiInteractId_ = 0;
        onChanged();
        return this;
      }

      private boolean isUseCondenseResin_ ;
      /**
       * <code>bool is_use_condense_resin = 6;</code>
       * @return The isUseCondenseResin.
       */
      @java.lang.Override
      public boolean getIsUseCondenseResin() {
        return isUseCondenseResin_;
      }
      /**
       * <code>bool is_use_condense_resin = 6;</code>
       * @param value The isUseCondenseResin to set.
       * @return This builder for chaining.
       */
      public Builder setIsUseCondenseResin(boolean value) {
        
        isUseCondenseResin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_use_condense_resin = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUseCondenseResin() {
        
        isUseCondenseResin_ = false;
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


      // @@protoc_insertion_point(builder_scope:GadgetInteractReq)
    }

    // @@protoc_insertion_point(class_scope:GadgetInteractReq)
    private static final emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq();
    }

    public static emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<GadgetInteractReq>() {
      @java.lang.Override
      public GadgetInteractReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GadgetInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetInteractReq.proto\032\021InterOpType.p" +
      "roto\032\023ResinCostType.proto\"\277\001\n\021GadgetInte" +
      "ractReq\022\021\n\tgadget_id\030\001 \001(\r\022\'\n\017resin_cost" +
      "_type\030\r \001(\0162\016.ResinCostType\022\030\n\020gadget_en" +
      "tity_id\030\010 \001(\r\022\035\n\007op_type\030\002 \001(\0162\014.InterOp" +
      "Type\022\026\n\016ui_interact_id\030\013 \001(\r\022\035\n\025is_use_c" +
      "ondense_resin\030\006 \001(\010B\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.InterOpTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.ResinCostTypeOuterClass.getDescriptor(),
        });
    internal_static_GadgetInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetInteractReq_descriptor,
        new java.lang.String[] { "GadgetId", "ResinCostType", "GadgetEntityId", "OpType", "UiInteractId", "IsUseCondenseResin", });
    emu.grasscutter.net.newproto.InterOpTypeOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.ResinCostTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
