// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WatcherEventNotify.proto

package emu.grasscutter.net.oldproto;

public final class WatcherEventNotifyOuterClass {
  private WatcherEventNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WatcherEventNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WatcherEventNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 add_progress = 6;</code>
     * @return The addProgress.
     */
    int getAddProgress();

    /**
     * <code>uint32 watcher_id = 9;</code>
     * @return The watcherId.
     */
    int getWatcherId();
  }
  /**
   * <pre>
   * CmdId: 2212
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code WatcherEventNotify}
   */
  public static final class WatcherEventNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WatcherEventNotify)
      WatcherEventNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WatcherEventNotify.newBuilder() to construct.
    private WatcherEventNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WatcherEventNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WatcherEventNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.internal_static_WatcherEventNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.internal_static_WatcherEventNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.class, emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.Builder.class);
    }

    public static final int ADD_PROGRESS_FIELD_NUMBER = 6;
    private int addProgress_;
    /**
     * <code>uint32 add_progress = 6;</code>
     * @return The addProgress.
     */
    @java.lang.Override
    public int getAddProgress() {
      return addProgress_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 9;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 9;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
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
      if (addProgress_ != 0) {
        output.writeUInt32(6, addProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(9, watcherId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (addProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, addProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, watcherId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify other = (emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify) obj;

      if (getAddProgress()
          != other.getAddProgress()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + ADD_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddProgress();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify prototype) {
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
     * CmdId: 2212
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code WatcherEventNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WatcherEventNotify)
        emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.internal_static_WatcherEventNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.internal_static_WatcherEventNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.class, emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        addProgress_ = 0;

        watcherId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.internal_static_WatcherEventNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify build() {
        emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify buildPartial() {
        emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify result = new emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify(this);
        result.addProgress_ = addProgress_;
        result.watcherId_ = watcherId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify other) {
        if (other == emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify.getDefaultInstance()) return this;
        if (other.getAddProgress() != 0) {
          setAddProgress(other.getAddProgress());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
                addProgress_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                watcherId_ = input.readUInt32();

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

      private int addProgress_ ;
      /**
       * <code>uint32 add_progress = 6;</code>
       * @return The addProgress.
       */
      @java.lang.Override
      public int getAddProgress() {
        return addProgress_;
      }
      /**
       * <code>uint32 add_progress = 6;</code>
       * @param value The addProgress to set.
       * @return This builder for chaining.
       */
      public Builder setAddProgress(int value) {
        
        addProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_progress = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddProgress() {
        
        addProgress_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WatcherEventNotify)
    }

    // @@protoc_insertion_point(class_scope:WatcherEventNotify)
    private static final emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify();
    }

    public static emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WatcherEventNotify>
        PARSER = new com.google.protobuf.AbstractParser<WatcherEventNotify>() {
      @java.lang.Override
      public WatcherEventNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WatcherEventNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WatcherEventNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WatcherEventNotifyOuterClass.WatcherEventNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WatcherEventNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WatcherEventNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030WatcherEventNotify.proto\">\n\022WatcherEve" +
      "ntNotify\022\024\n\014add_progress\030\006 \001(\r\022\022\n\nwatche" +
      "r_id\030\t \001(\rB\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WatcherEventNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WatcherEventNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WatcherEventNotify_descriptor,
        new java.lang.String[] { "AddProgress", "WatcherId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
