// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftInviteResultNotify.proto

package emu.grasscutter.net.newproto;

public final class DraftInviteResultNotifyOuterClass {
  private DraftInviteResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftInviteResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftInviteResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_all_agree = 11;</code>
     * @return The isAllAgree.
     */
    boolean getIsAllAgree();

    /**
     * <code>uint32 draft_id = 12;</code>
     * @return The draftId.
     */
    int getDraftId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5478;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DraftInviteResultNotify}
   */
  public static final class DraftInviteResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftInviteResultNotify)
      DraftInviteResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftInviteResultNotify.newBuilder() to construct.
    private DraftInviteResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftInviteResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftInviteResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.internal_static_DraftInviteResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.internal_static_DraftInviteResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.class, emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.Builder.class);
    }

    public static final int IS_ALL_AGREE_FIELD_NUMBER = 11;
    private boolean isAllAgree_;
    /**
     * <code>bool is_all_agree = 11;</code>
     * @return The isAllAgree.
     */
    @java.lang.Override
    public boolean getIsAllAgree() {
      return isAllAgree_;
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 12;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 12;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
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
      if (isAllAgree_ != false) {
        output.writeBool(11, isAllAgree_);
      }
      if (draftId_ != 0) {
        output.writeUInt32(12, draftId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAllAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isAllAgree_);
      }
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, draftId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify other = (emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify) obj;

      if (getIsAllAgree()
          != other.getIsAllAgree()) return false;
      if (getDraftId()
          != other.getDraftId()) return false;
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
      hash = (37 * hash) + IS_ALL_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllAgree());
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify prototype) {
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
     *   CMD_ID = 5478;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DraftInviteResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftInviteResultNotify)
        emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.internal_static_DraftInviteResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.internal_static_DraftInviteResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.class, emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAllAgree_ = false;

        draftId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.internal_static_DraftInviteResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify build() {
        emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify buildPartial() {
        emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify result = new emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify(this);
        result.isAllAgree_ = isAllAgree_;
        result.draftId_ = draftId_;
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
        if (other instanceof emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify other) {
        if (other == emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify.getDefaultInstance()) return this;
        if (other.getIsAllAgree() != false) {
          setIsAllAgree(other.getIsAllAgree());
        }
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
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
              case 88: {
                isAllAgree_ = input.readBool();

                break;
              } // case 88
              case 96: {
                draftId_ = input.readUInt32();

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

      private boolean isAllAgree_ ;
      /**
       * <code>bool is_all_agree = 11;</code>
       * @return The isAllAgree.
       */
      @java.lang.Override
      public boolean getIsAllAgree() {
        return isAllAgree_;
      }
      /**
       * <code>bool is_all_agree = 11;</code>
       * @param value The isAllAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllAgree(boolean value) {
        
        isAllAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_all_agree = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllAgree() {
        
        isAllAgree_ = false;
        onChanged();
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 12;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 12;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftInviteResultNotify)
    }

    // @@protoc_insertion_point(class_scope:DraftInviteResultNotify)
    private static final emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify();
    }

    public static emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftInviteResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<DraftInviteResultNotify>() {
      @java.lang.Override
      public DraftInviteResultNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DraftInviteResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftInviteResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.DraftInviteResultNotifyOuterClass.DraftInviteResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftInviteResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftInviteResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035DraftInviteResultNotify.proto\"A\n\027Draft" +
      "InviteResultNotify\022\024\n\014is_all_agree\030\013 \001(\010" +
      "\022\020\n\010draft_id\030\014 \001(\rB\036\n\034emu.grasscutter.ne" +
      "t.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftInviteResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftInviteResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftInviteResultNotify_descriptor,
        new java.lang.String[] { "IsAllAgree", "DraftId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
