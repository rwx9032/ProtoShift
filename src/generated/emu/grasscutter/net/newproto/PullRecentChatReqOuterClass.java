// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PullRecentChatReq.proto

package emu.grasscutter.net.newproto;

public final class PullRecentChatReqOuterClass {
  private PullRecentChatReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PullRecentChatReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PullRecentChatReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pull_num = 3;</code>
     * @return The pullNum.
     */
    int getPullNum();

    /**
     * <code>uint32 begin_sequence = 15;</code>
     * @return The beginSequence.
     */
    int getBeginSequence();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4997;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PullRecentChatReq}
   */
  public static final class PullRecentChatReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PullRecentChatReq)
      PullRecentChatReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PullRecentChatReq.newBuilder() to construct.
    private PullRecentChatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PullRecentChatReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PullRecentChatReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.internal_static_PullRecentChatReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.internal_static_PullRecentChatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.class, emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.Builder.class);
    }

    public static final int PULL_NUM_FIELD_NUMBER = 3;
    private int pullNum_;
    /**
     * <code>uint32 pull_num = 3;</code>
     * @return The pullNum.
     */
    @java.lang.Override
    public int getPullNum() {
      return pullNum_;
    }

    public static final int BEGIN_SEQUENCE_FIELD_NUMBER = 15;
    private int beginSequence_;
    /**
     * <code>uint32 begin_sequence = 15;</code>
     * @return The beginSequence.
     */
    @java.lang.Override
    public int getBeginSequence() {
      return beginSequence_;
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
      if (pullNum_ != 0) {
        output.writeUInt32(3, pullNum_);
      }
      if (beginSequence_ != 0) {
        output.writeUInt32(15, beginSequence_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pullNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, pullNum_);
      }
      if (beginSequence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, beginSequence_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq other = (emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq) obj;

      if (getPullNum()
          != other.getPullNum()) return false;
      if (getBeginSequence()
          != other.getBeginSequence()) return false;
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
      hash = (37 * hash) + PULL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getPullNum();
      hash = (37 * hash) + BEGIN_SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getBeginSequence();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq prototype) {
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
     *   CMD_ID = 4997;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PullRecentChatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PullRecentChatReq)
        emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.internal_static_PullRecentChatReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.internal_static_PullRecentChatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.class, emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pullNum_ = 0;

        beginSequence_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.internal_static_PullRecentChatReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq build() {
        emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq buildPartial() {
        emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq result = new emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq(this);
        result.pullNum_ = pullNum_;
        result.beginSequence_ = beginSequence_;
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
        if (other instanceof emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq) {
          return mergeFrom((emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq other) {
        if (other == emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq.getDefaultInstance()) return this;
        if (other.getPullNum() != 0) {
          setPullNum(other.getPullNum());
        }
        if (other.getBeginSequence() != 0) {
          setBeginSequence(other.getBeginSequence());
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
              case 24: {
                pullNum_ = input.readUInt32();

                break;
              } // case 24
              case 120: {
                beginSequence_ = input.readUInt32();

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

      private int pullNum_ ;
      /**
       * <code>uint32 pull_num = 3;</code>
       * @return The pullNum.
       */
      @java.lang.Override
      public int getPullNum() {
        return pullNum_;
      }
      /**
       * <code>uint32 pull_num = 3;</code>
       * @param value The pullNum to set.
       * @return This builder for chaining.
       */
      public Builder setPullNum(int value) {
        
        pullNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pull_num = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPullNum() {
        
        pullNum_ = 0;
        onChanged();
        return this;
      }

      private int beginSequence_ ;
      /**
       * <code>uint32 begin_sequence = 15;</code>
       * @return The beginSequence.
       */
      @java.lang.Override
      public int getBeginSequence() {
        return beginSequence_;
      }
      /**
       * <code>uint32 begin_sequence = 15;</code>
       * @param value The beginSequence to set.
       * @return This builder for chaining.
       */
      public Builder setBeginSequence(int value) {
        
        beginSequence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_sequence = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginSequence() {
        
        beginSequence_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PullRecentChatReq)
    }

    // @@protoc_insertion_point(class_scope:PullRecentChatReq)
    private static final emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq();
    }

    public static emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PullRecentChatReq>
        PARSER = new com.google.protobuf.AbstractParser<PullRecentChatReq>() {
      @java.lang.Override
      public PullRecentChatReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PullRecentChatReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PullRecentChatReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PullRecentChatReqOuterClass.PullRecentChatReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PullRecentChatReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PullRecentChatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PullRecentChatReq.proto\"=\n\021PullRecentC" +
      "hatReq\022\020\n\010pull_num\030\003 \001(\r\022\026\n\016begin_sequen" +
      "ce\030\017 \001(\rB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PullRecentChatReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PullRecentChatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PullRecentChatReq_descriptor,
        new java.lang.String[] { "PullNum", "BeginSequence", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
