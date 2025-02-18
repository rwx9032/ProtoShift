// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBlueprintInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class HomeBlueprintInfoNotifyOuterClass {
  private HomeBlueprintInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBlueprintInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBlueprintInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_allow_friend_copy = 15;</code>
     * @return The isAllowFriendCopy.
     */
    boolean getIsAllowFriendCopy();
  }
  /**
   * <pre>
   * CmdId: 4765
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code HomeBlueprintInfoNotify}
   */
  public static final class HomeBlueprintInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBlueprintInfoNotify)
      HomeBlueprintInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBlueprintInfoNotify.newBuilder() to construct.
    private HomeBlueprintInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBlueprintInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBlueprintInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.internal_static_HomeBlueprintInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.internal_static_HomeBlueprintInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.class, emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.Builder.class);
    }

    public static final int IS_ALLOW_FRIEND_COPY_FIELD_NUMBER = 15;
    private boolean isAllowFriendCopy_;
    /**
     * <code>bool is_allow_friend_copy = 15;</code>
     * @return The isAllowFriendCopy.
     */
    @java.lang.Override
    public boolean getIsAllowFriendCopy() {
      return isAllowFriendCopy_;
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
      if (isAllowFriendCopy_ != false) {
        output.writeBool(15, isAllowFriendCopy_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAllowFriendCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAllowFriendCopy_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify other = (emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify) obj;

      if (getIsAllowFriendCopy()
          != other.getIsAllowFriendCopy()) return false;
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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify prototype) {
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
     * CmdId: 4765
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code HomeBlueprintInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBlueprintInfoNotify)
        emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.internal_static_HomeBlueprintInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.internal_static_HomeBlueprintInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.class, emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.newBuilder()
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

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.internal_static_HomeBlueprintInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify build() {
        emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify result = new emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify(this);
        result.isAllowFriendCopy_ = isAllowFriendCopy_;
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
        if (other instanceof emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify.getDefaultInstance()) return this;
        if (other.getIsAllowFriendCopy() != false) {
          setIsAllowFriendCopy(other.getIsAllowFriendCopy());
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
              case 120: {
                isAllowFriendCopy_ = input.readBool();

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

      private boolean isAllowFriendCopy_ ;
      /**
       * <code>bool is_allow_friend_copy = 15;</code>
       * @return The isAllowFriendCopy.
       */
      @java.lang.Override
      public boolean getIsAllowFriendCopy() {
        return isAllowFriendCopy_;
      }
      /**
       * <code>bool is_allow_friend_copy = 15;</code>
       * @param value The isAllowFriendCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowFriendCopy(boolean value) {
        
        isAllowFriendCopy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_friend_copy = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowFriendCopy() {
        
        isAllowFriendCopy_ = false;
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


      // @@protoc_insertion_point(builder_scope:HomeBlueprintInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeBlueprintInfoNotify)
    private static final emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBlueprintInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeBlueprintInfoNotify>() {
      @java.lang.Override
      public HomeBlueprintInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeBlueprintInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBlueprintInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.HomeBlueprintInfoNotifyOuterClass.HomeBlueprintInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBlueprintInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBlueprintInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HomeBlueprintInfoNotify.proto\"7\n\027HomeB" +
      "lueprintInfoNotify\022\034\n\024is_allow_friend_co" +
      "py\030\017 \001(\010B\036\n\034emu.grasscutter.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeBlueprintInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBlueprintInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBlueprintInfoNotify_descriptor,
        new java.lang.String[] { "IsAllowFriendCopy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
