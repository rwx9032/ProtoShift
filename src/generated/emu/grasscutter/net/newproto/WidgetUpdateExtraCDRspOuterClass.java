// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetUpdateExtraCDRsp.proto

package emu.grasscutter.net.newproto;

public final class WidgetUpdateExtraCDRspOuterClass {
  private WidgetUpdateExtraCDRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetUpdateExtraCDRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetUpdateExtraCDRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     * @return Whether the coolData field is set.
     */
    boolean hasCoolData();
    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     * @return The coolData.
     */
    emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolData();
    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     */
    emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDataOrBuilder();

    /**
     * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
     * @return The enum numeric value on the wire for extraCdType.
     */
    int getExtraCdTypeValue();
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
     * @return The extraCdType.
     */
    emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cd_group = 11;</code>
     * @return The cdGroup.
     */
    int getCdGroup();

    /**
     * <code>uint32 material_id = 7;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6076;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetUpdateExtraCDRsp}
   */
  public static final class WidgetUpdateExtraCDRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetUpdateExtraCDRsp)
      WidgetUpdateExtraCDRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetUpdateExtraCDRsp.newBuilder() to construct.
    private WidgetUpdateExtraCDRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetUpdateExtraCDRsp() {
      extraCdType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetUpdateExtraCDRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.internal_static_WidgetUpdateExtraCDRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.internal_static_WidgetUpdateExtraCDRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.class, emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.Builder.class);
    }

    public static final int COOL_DATA_FIELD_NUMBER = 10;
    private emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData coolData_;
    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     * @return Whether the coolData field is set.
     */
    @java.lang.Override
    public boolean hasCoolData() {
      return coolData_ != null;
    }
    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     * @return The coolData.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolData() {
      return coolData_ == null ? emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : coolData_;
    }
    /**
     * <code>.WidgetCoolDownData cool_data = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDataOrBuilder() {
      return getCoolData();
    }

    public static final int EXTRA_CD_TYPE_FIELD_NUMBER = 5;
    private int extraCdType_;
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
     * @return The enum numeric value on the wire for extraCdType.
     */
    @java.lang.Override public int getExtraCdTypeValue() {
      return extraCdType_;
    }
    /**
     * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
     * @return The extraCdType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType result = emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.valueOf(extraCdType_);
      return result == null ? emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CD_GROUP_FIELD_NUMBER = 11;
    private int cdGroup_;
    /**
     * <code>uint32 cd_group = 11;</code>
     * @return The cdGroup.
     */
    @java.lang.Override
    public int getCdGroup() {
      return cdGroup_;
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
      if (extraCdType_ != emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.WIDGET_EXTRA_CD_TYPE_NONE.getNumber()) {
        output.writeEnum(5, extraCdType_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(7, materialId_);
      }
      if (coolData_ != null) {
        output.writeMessage(10, getCoolData());
      }
      if (cdGroup_ != 0) {
        output.writeUInt32(11, cdGroup_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extraCdType_ != emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.WIDGET_EXTRA_CD_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, extraCdType_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, materialId_);
      }
      if (coolData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getCoolData());
      }
      if (cdGroup_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cdGroup_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp other = (emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp) obj;

      if (hasCoolData() != other.hasCoolData()) return false;
      if (hasCoolData()) {
        if (!getCoolData()
            .equals(other.getCoolData())) return false;
      }
      if (extraCdType_ != other.extraCdType_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCdGroup()
          != other.getCdGroup()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      if (hasCoolData()) {
        hash = (37 * hash) + COOL_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getCoolData().hashCode();
      }
      hash = (37 * hash) + EXTRA_CD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + extraCdType_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CD_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getCdGroup();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp prototype) {
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
     *   CMD_ID = 6076;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetUpdateExtraCDRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetUpdateExtraCDRsp)
        emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.internal_static_WidgetUpdateExtraCDRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.internal_static_WidgetUpdateExtraCDRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.class, emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (coolDataBuilder_ == null) {
          coolData_ = null;
        } else {
          coolData_ = null;
          coolDataBuilder_ = null;
        }
        extraCdType_ = 0;

        retcode_ = 0;

        cdGroup_ = 0;

        materialId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.internal_static_WidgetUpdateExtraCDRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp build() {
        emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp buildPartial() {
        emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp result = new emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp(this);
        if (coolDataBuilder_ == null) {
          result.coolData_ = coolData_;
        } else {
          result.coolData_ = coolDataBuilder_.build();
        }
        result.extraCdType_ = extraCdType_;
        result.retcode_ = retcode_;
        result.cdGroup_ = cdGroup_;
        result.materialId_ = materialId_;
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
        if (other instanceof emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp other) {
        if (other == emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp.getDefaultInstance()) return this;
        if (other.hasCoolData()) {
          mergeCoolData(other.getCoolData());
        }
        if (other.extraCdType_ != 0) {
          setExtraCdTypeValue(other.getExtraCdTypeValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCdGroup() != 0) {
          setCdGroup(other.getCdGroup());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
                extraCdType_ = input.readEnum();

                break;
              } // case 40
              case 56: {
                materialId_ = input.readUInt32();

                break;
              } // case 56
              case 82: {
                input.readMessage(
                    getCoolDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 82
              case 88: {
                cdGroup_ = input.readUInt32();

                break;
              } // case 88
              case 104: {
                retcode_ = input.readInt32();

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

      private emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData coolData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> coolDataBuilder_;
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       * @return Whether the coolData field is set.
       */
      public boolean hasCoolData() {
        return coolDataBuilder_ != null || coolData_ != null;
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       * @return The coolData.
       */
      public emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData getCoolData() {
        if (coolDataBuilder_ == null) {
          return coolData_ == null ? emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : coolData_;
        } else {
          return coolDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public Builder setCoolData(emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
        if (coolDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          coolData_ = value;
          onChanged();
        } else {
          coolDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public Builder setCoolData(
          emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder builderForValue) {
        if (coolDataBuilder_ == null) {
          coolData_ = builderForValue.build();
          onChanged();
        } else {
          coolDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public Builder mergeCoolData(emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData value) {
        if (coolDataBuilder_ == null) {
          if (coolData_ != null) {
            coolData_ =
              emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.newBuilder(coolData_).mergeFrom(value).buildPartial();
          } else {
            coolData_ = value;
          }
          onChanged();
        } else {
          coolDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public Builder clearCoolData() {
        if (coolDataBuilder_ == null) {
          coolData_ = null;
          onChanged();
        } else {
          coolData_ = null;
          coolDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder getCoolDataBuilder() {
        
        onChanged();
        return getCoolDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      public emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder getCoolDataOrBuilder() {
        if (coolDataBuilder_ != null) {
          return coolDataBuilder_.getMessageOrBuilder();
        } else {
          return coolData_ == null ?
              emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.getDefaultInstance() : coolData_;
        }
      }
      /**
       * <code>.WidgetCoolDownData cool_data = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder> 
          getCoolDataFieldBuilder() {
        if (coolDataBuilder_ == null) {
          coolDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownData.Builder, emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.WidgetCoolDownDataOrBuilder>(
                  getCoolData(),
                  getParentForChildren(),
                  isClean());
          coolData_ = null;
        }
        return coolDataBuilder_;
      }

      private int extraCdType_ = 0;
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
       * @return The enum numeric value on the wire for extraCdType.
       */
      @java.lang.Override public int getExtraCdTypeValue() {
        return extraCdType_;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
       * @param value The enum numeric value on the wire for extraCdType to set.
       * @return This builder for chaining.
       */
      public Builder setExtraCdTypeValue(int value) {
        
        extraCdType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
       * @return The extraCdType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType getExtraCdType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType result = emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.valueOf(extraCdType_);
        return result == null ? emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
       * @param value The extraCdType to set.
       * @return This builder for chaining.
       */
      public Builder setExtraCdType(emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.WidgetExtraCdType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        extraCdType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetExtraCdType extra_cd_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraCdType() {
        
        extraCdType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cdGroup_ ;
      /**
       * <code>uint32 cd_group = 11;</code>
       * @return The cdGroup.
       */
      @java.lang.Override
      public int getCdGroup() {
        return cdGroup_;
      }
      /**
       * <code>uint32 cd_group = 11;</code>
       * @param value The cdGroup to set.
       * @return This builder for chaining.
       */
      public Builder setCdGroup(int value) {
        
        cdGroup_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_group = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdGroup() {
        
        cdGroup_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetUpdateExtraCDRsp)
    }

    // @@protoc_insertion_point(class_scope:WidgetUpdateExtraCDRsp)
    private static final emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp();
    }

    public static emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetUpdateExtraCDRsp>
        PARSER = new com.google.protobuf.AbstractParser<WidgetUpdateExtraCDRsp>() {
      @java.lang.Override
      public WidgetUpdateExtraCDRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetUpdateExtraCDRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetUpdateExtraCDRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WidgetUpdateExtraCDRspOuterClass.WidgetUpdateExtraCDRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetUpdateExtraCDRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetUpdateExtraCDRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WidgetUpdateExtraCDRsp.proto\032\030WidgetCo" +
      "olDownData.proto\032\027WidgetExtraCdType.prot" +
      "o\"\243\001\n\026WidgetUpdateExtraCDRsp\022&\n\tcool_dat" +
      "a\030\n \001(\0132\023.WidgetCoolDownData\022)\n\rextra_cd" +
      "_type\030\005 \001(\0162\022.WidgetExtraCdType\022\017\n\007retco" +
      "de\030\r \001(\005\022\020\n\010cd_group\030\013 \001(\r\022\023\n\013material_i" +
      "d\030\007 \001(\rB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.getDescriptor(),
          emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.getDescriptor(),
        });
    internal_static_WidgetUpdateExtraCDRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetUpdateExtraCDRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetUpdateExtraCDRsp_descriptor,
        new java.lang.String[] { "CoolData", "ExtraCdType", "Retcode", "CdGroup", "MaterialId", });
    emu.grasscutter.net.newproto.WidgetCoolDownDataOuterClass.getDescriptor();
    emu.grasscutter.net.newproto.WidgetExtraCdTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
