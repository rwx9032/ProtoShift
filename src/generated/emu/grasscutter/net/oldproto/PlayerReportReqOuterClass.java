// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerReportReq.proto

package emu.grasscutter.net.oldproto;

public final class PlayerReportReqOuterClass {
  private PlayerReportReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerReportReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerReportReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReportReasonType reason = 12;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.ReportReasonType reason = 12;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType getReason();

    /**
     * <code>string content = 8;</code>
     * @return The content.
     */
    java.lang.String getContent();
    /**
     * <code>string content = 8;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>uint32 target_home_module_id = 5;</code>
     * @return The targetHomeModuleId.
     */
    int getTargetHomeModuleId();

    /**
     * <code>string target_home_module_name = 6;</code>
     * @return The targetHomeModuleName.
     */
    java.lang.String getTargetHomeModuleName();
    /**
     * <code>string target_home_module_name = 6;</code>
     * @return The bytes for targetHomeModuleName.
     */
    com.google.protobuf.ByteString
        getTargetHomeModuleNameBytes();

    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 4024
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PlayerReportReq}
   */
  public static final class PlayerReportReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerReportReq)
      PlayerReportReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerReportReq.newBuilder() to construct.
    private PlayerReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerReportReq() {
      reason_ = 0;
      content_ = "";
      targetHomeModuleName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerReportReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.internal_static_PlayerReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.internal_static_PlayerReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.class, emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 12;
    private int reason_;
    /**
     * <code>.ReportReasonType reason = 12;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.ReportReasonType reason = 12;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType result = emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.UNRECOGNIZED : result;
    }

    public static final int CONTENT_FIELD_NUMBER = 8;
    private volatile java.lang.Object content_;
    /**
     * <code>string content = 8;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 8;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_HOME_MODULE_ID_FIELD_NUMBER = 5;
    private int targetHomeModuleId_;
    /**
     * <code>uint32 target_home_module_id = 5;</code>
     * @return The targetHomeModuleId.
     */
    @java.lang.Override
    public int getTargetHomeModuleId() {
      return targetHomeModuleId_;
    }

    public static final int TARGET_HOME_MODULE_NAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object targetHomeModuleName_;
    /**
     * <code>string target_home_module_name = 6;</code>
     * @return The targetHomeModuleName.
     */
    @java.lang.Override
    public java.lang.String getTargetHomeModuleName() {
      java.lang.Object ref = targetHomeModuleName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetHomeModuleName_ = s;
        return s;
      }
    }
    /**
     * <code>string target_home_module_name = 6;</code>
     * @return The bytes for targetHomeModuleName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetHomeModuleNameBytes() {
      java.lang.Object ref = targetHomeModuleName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetHomeModuleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_UID_FIELD_NUMBER = 14;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (targetHomeModuleId_ != 0) {
        output.writeUInt32(5, targetHomeModuleId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetHomeModuleName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, targetHomeModuleName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, content_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.REPORT_REASON_TYPE_NONE.getNumber()) {
        output.writeEnum(12, reason_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(14, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetHomeModuleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetHomeModuleId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetHomeModuleName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, targetHomeModuleName_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, content_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.REPORT_REASON_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, reason_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetUid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq other = (emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq) obj;

      if (reason_ != other.reason_) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (getTargetHomeModuleId()
          != other.getTargetHomeModuleId()) return false;
      if (!getTargetHomeModuleName()
          .equals(other.getTargetHomeModuleName())) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + TARGET_HOME_MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetHomeModuleId();
      hash = (37 * hash) + TARGET_HOME_MODULE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetHomeModuleName().hashCode();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq prototype) {
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
     * CmdId: 4024
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PlayerReportReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerReportReq)
        emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.internal_static_PlayerReportReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.internal_static_PlayerReportReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.class, emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reason_ = 0;

        content_ = "";

        targetHomeModuleId_ = 0;

        targetHomeModuleName_ = "";

        targetUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.internal_static_PlayerReportReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq build() {
        emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq buildPartial() {
        emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq result = new emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq(this);
        result.reason_ = reason_;
        result.content_ = content_;
        result.targetHomeModuleId_ = targetHomeModuleId_;
        result.targetHomeModuleName_ = targetHomeModuleName_;
        result.targetUid_ = targetUid_;
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq other) {
        if (other == emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          onChanged();
        }
        if (other.getTargetHomeModuleId() != 0) {
          setTargetHomeModuleId(other.getTargetHomeModuleId());
        }
        if (!other.getTargetHomeModuleName().isEmpty()) {
          targetHomeModuleName_ = other.targetHomeModuleName_;
          onChanged();
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
                targetHomeModuleId_ = input.readUInt32();

                break;
              } // case 40
              case 50: {
                targetHomeModuleName_ = input.readStringRequireUtf8();

                break;
              } // case 50
              case 66: {
                content_ = input.readStringRequireUtf8();

                break;
              } // case 66
              case 96: {
                reason_ = input.readEnum();

                break;
              } // case 96
              case 112: {
                targetUid_ = input.readUInt32();

                break;
              } // case 112
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

      private int reason_ = 0;
      /**
       * <code>.ReportReasonType reason = 12;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.ReportReasonType reason = 12;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ReportReasonType reason = 12;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType result = emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ReportReasonType reason = 12;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.ReportReasonType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ReportReasonType reason = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 8;</code>
       * @return The content.
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 8;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 8;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>string content = 8;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        content_ = value;
        onChanged();
        return this;
      }

      private int targetHomeModuleId_ ;
      /**
       * <code>uint32 target_home_module_id = 5;</code>
       * @return The targetHomeModuleId.
       */
      @java.lang.Override
      public int getTargetHomeModuleId() {
        return targetHomeModuleId_;
      }
      /**
       * <code>uint32 target_home_module_id = 5;</code>
       * @param value The targetHomeModuleId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetHomeModuleId(int value) {
        
        targetHomeModuleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_home_module_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetHomeModuleId() {
        
        targetHomeModuleId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object targetHomeModuleName_ = "";
      /**
       * <code>string target_home_module_name = 6;</code>
       * @return The targetHomeModuleName.
       */
      public java.lang.String getTargetHomeModuleName() {
        java.lang.Object ref = targetHomeModuleName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetHomeModuleName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_home_module_name = 6;</code>
       * @return The bytes for targetHomeModuleName.
       */
      public com.google.protobuf.ByteString
          getTargetHomeModuleNameBytes() {
        java.lang.Object ref = targetHomeModuleName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetHomeModuleName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_home_module_name = 6;</code>
       * @param value The targetHomeModuleName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetHomeModuleName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetHomeModuleName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_home_module_name = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetHomeModuleName() {
        
        targetHomeModuleName_ = getDefaultInstance().getTargetHomeModuleName();
        onChanged();
        return this;
      }
      /**
       * <code>string target_home_module_name = 6;</code>
       * @param value The bytes for targetHomeModuleName to set.
       * @return This builder for chaining.
       */
      public Builder setTargetHomeModuleNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetHomeModuleName_ = value;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerReportReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerReportReq)
    private static final emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq();
    }

    public static emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerReportReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerReportReq>() {
      @java.lang.Override
      public PlayerReportReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerReportReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerReportReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerReportReqOuterClass.PlayerReportReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerReportReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerReportReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PlayerReportReq.proto\032\026ReportReasonTyp" +
      "e.proto\"\231\001\n\017PlayerReportReq\022!\n\006reason\030\014 " +
      "\001(\0162\021.ReportReasonType\022\017\n\007content\030\010 \001(\t\022" +
      "\035\n\025target_home_module_id\030\005 \001(\r\022\037\n\027target" +
      "_home_module_name\030\006 \001(\t\022\022\n\ntarget_uid\030\016 " +
      "\001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerReportReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerReportReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerReportReq_descriptor,
        new java.lang.String[] { "Reason", "Content", "TargetHomeModuleId", "TargetHomeModuleName", "TargetUid", });
    emu.grasscutter.net.oldproto.ReportReasonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
