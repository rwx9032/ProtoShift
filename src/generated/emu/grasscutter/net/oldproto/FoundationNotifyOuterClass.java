// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoundationNotify.proto

package emu.grasscutter.net.oldproto;

public final class FoundationNotifyOuterClass {
  private FoundationNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FoundationNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FoundationNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FoundationInfo info = 7;</code>
     * @return Whether the info field is set.
     */
    boolean hasInfo();
    /**
     * <code>.FoundationInfo info = 7;</code>
     * @return The info.
     */
    emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo getInfo();
    /**
     * <code>.FoundationInfo info = 7;</code>
     */
    emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder getInfoOrBuilder();

    /**
     * <code>uint32 gadget_entity_id = 9;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * CmdId: 847
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FoundationNotify}
   */
  public static final class FoundationNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FoundationNotify)
      FoundationNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FoundationNotify.newBuilder() to construct.
    private FoundationNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FoundationNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FoundationNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.internal_static_FoundationNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.internal_static_FoundationNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.class, emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 7;
    private emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo info_;
    /**
     * <code>.FoundationInfo info = 7;</code>
     * @return Whether the info field is set.
     */
    @java.lang.Override
    public boolean hasInfo() {
      return info_ != null;
    }
    /**
     * <code>.FoundationInfo info = 7;</code>
     * @return The info.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo getInfo() {
      return info_ == null ? emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.getDefaultInstance() : info_;
    }
    /**
     * <code>.FoundationInfo info = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder getInfoOrBuilder() {
      return getInfo();
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 9;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 9;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (info_ != null) {
        output.writeMessage(7, getInfo());
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(9, gadgetEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (info_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getInfo());
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gadgetEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify other = (emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify) obj;

      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
      }
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify prototype) {
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
     * CmdId: 847
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FoundationNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FoundationNotify)
        emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.internal_static_FoundationNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.internal_static_FoundationNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.class, emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          info_ = null;
          infoBuilder_ = null;
        }
        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.internal_static_FoundationNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify build() {
        emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify buildPartial() {
        emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify result = new emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify(this);
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
        }
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify other) {
        if (other == emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
              case 58: {
                input.readMessage(
                    getInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
              case 72: {
                gadgetEntityId_ = input.readUInt32();

                break;
              } // case 72
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

      private emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo info_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.Builder, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder> infoBuilder_;
      /**
       * <code>.FoundationInfo info = 7;</code>
       * @return Whether the info field is set.
       */
      public boolean hasInfo() {
        return infoBuilder_ != null || info_ != null;
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       * @return The info.
       */
      public emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public Builder setInfo(emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public Builder setInfo(
          emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public Builder mergeInfo(emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo value) {
        if (infoBuilder_ == null) {
          if (info_ != null) {
            info_ =
              emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          info_ = null;
          infoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.Builder getInfoBuilder() {
        
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      public emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>.FoundationInfo info = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.Builder, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfo.Builder, emu.grasscutter.net.oldproto.FoundationInfoOuterClass.FoundationInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 9;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 9;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FoundationNotify)
    }

    // @@protoc_insertion_point(class_scope:FoundationNotify)
    private static final emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify();
    }

    public static emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FoundationNotify>
        PARSER = new com.google.protobuf.AbstractParser<FoundationNotify>() {
      @java.lang.Override
      public FoundationNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FoundationNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FoundationNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.FoundationNotifyOuterClass.FoundationNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FoundationNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FoundationNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FoundationNotify.proto\032\024FoundationInfo" +
      ".proto\"K\n\020FoundationNotify\022\035\n\004info\030\007 \001(\013" +
      "2\017.FoundationInfo\022\030\n\020gadget_entity_id\030\t " +
      "\001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.FoundationInfoOuterClass.getDescriptor(),
        });
    internal_static_FoundationNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FoundationNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FoundationNotify_descriptor,
        new java.lang.String[] { "Info", "GadgetEntityId", });
    emu.grasscutter.net.oldproto.FoundationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
