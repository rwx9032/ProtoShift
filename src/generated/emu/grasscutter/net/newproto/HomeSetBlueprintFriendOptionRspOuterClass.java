// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSetBlueprintFriendOptionRsp.proto

package emu.grasscutter.net.newproto;

public final class HomeSetBlueprintFriendOptionRspOuterClass {
  private HomeSetBlueprintFriendOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSetBlueprintFriendOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSetBlueprintFriendOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_allow_friend_copy = 14;</code>
     * @return The isAllowFriendCopy.
     */
    boolean getIsAllowFriendCopy();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4615;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeSetBlueprintFriendOptionRsp}
   */
  public static final class HomeSetBlueprintFriendOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSetBlueprintFriendOptionRsp)
      HomeSetBlueprintFriendOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSetBlueprintFriendOptionRsp.newBuilder() to construct.
    private HomeSetBlueprintFriendOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSetBlueprintFriendOptionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSetBlueprintFriendOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.internal_static_HomeSetBlueprintFriendOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.internal_static_HomeSetBlueprintFriendOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.class, emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.Builder.class);
    }

    public static final int IS_ALLOW_FRIEND_COPY_FIELD_NUMBER = 14;
    private boolean isAllowFriendCopy_;
    /**
     * <code>bool is_allow_friend_copy = 14;</code>
     * @return The isAllowFriendCopy.
     */
    @java.lang.Override
    public boolean getIsAllowFriendCopy() {
      return isAllowFriendCopy_;
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
        output.writeInt32(13, retcode_);
      }
      if (isAllowFriendCopy_ != false) {
        output.writeBool(14, isAllowFriendCopy_);
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
          .computeInt32Size(13, retcode_);
      }
      if (isAllowFriendCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isAllowFriendCopy_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp other = (emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp) obj;

      if (getIsAllowFriendCopy()
          != other.getIsAllowFriendCopy()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_ALLOW_FRIEND_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowFriendCopy());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp prototype) {
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
     *   CMD_ID = 4615;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeSetBlueprintFriendOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSetBlueprintFriendOptionRsp)
        emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.internal_static_HomeSetBlueprintFriendOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.internal_static_HomeSetBlueprintFriendOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.class, emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isAllowFriendCopy_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.internal_static_HomeSetBlueprintFriendOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp build() {
        emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp buildPartial() {
        emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp result = new emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp(this);
        result.isAllowFriendCopy_ = isAllowFriendCopy_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp other) {
        if (other == emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp.getDefaultInstance()) return this;
        if (other.getIsAllowFriendCopy() != false) {
          setIsAllowFriendCopy(other.getIsAllowFriendCopy());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 104: {
                retcode_ = input.readInt32();

                break;
              } // case 104
              case 112: {
                isAllowFriendCopy_ = input.readBool();

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

      private boolean isAllowFriendCopy_ ;
      /**
       * <code>bool is_allow_friend_copy = 14;</code>
       * @return The isAllowFriendCopy.
       */
      @java.lang.Override
      public boolean getIsAllowFriendCopy() {
        return isAllowFriendCopy_;
      }
      /**
       * <code>bool is_allow_friend_copy = 14;</code>
       * @param value The isAllowFriendCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowFriendCopy(boolean value) {
        
        isAllowFriendCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_friend_copy = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowFriendCopy() {
        
        isAllowFriendCopy_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeSetBlueprintFriendOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSetBlueprintFriendOptionRsp)
    private static final emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp();
    }

    public static emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSetBlueprintFriendOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSetBlueprintFriendOptionRsp>() {
      @java.lang.Override
      public HomeSetBlueprintFriendOptionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSetBlueprintFriendOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSetBlueprintFriendOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeSetBlueprintFriendOptionRspOuterClass.HomeSetBlueprintFriendOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSetBlueprintFriendOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSetBlueprintFriendOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HomeSetBlueprintFriendOptionRsp.proto\"" +
      "P\n\037HomeSetBlueprintFriendOptionRsp\022\034\n\024is" +
      "_allow_friend_copy\030\016 \001(\010\022\017\n\007retcode\030\r \001(" +
      "\005B\036\n\034emu.grasscutter.net.newprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSetBlueprintFriendOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSetBlueprintFriendOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSetBlueprintFriendOptionRsp_descriptor,
        new java.lang.String[] { "IsAllowFriendCopy", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
