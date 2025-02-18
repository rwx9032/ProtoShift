// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabStageOneofDungeonNotify.proto

package emu.grasscutter.net.oldproto;

public final class ChannelerSlabStageOneofDungeonNotifyOuterClass {
  private ChannelerSlabStageOneofDungeonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabStageOneofDungeonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabStageOneofDungeonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_done = 8;</code>
     * @return The isDone.
     */
    boolean getIsDone();
  }
  /**
   * <pre>
   * CmdId: 8203
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabStageOneofDungeonNotify}
   */
  public static final class ChannelerSlabStageOneofDungeonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabStageOneofDungeonNotify)
      ChannelerSlabStageOneofDungeonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabStageOneofDungeonNotify.newBuilder() to construct.
    private ChannelerSlabStageOneofDungeonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabStageOneofDungeonNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabStageOneofDungeonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneofDungeonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.class, emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 2;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_DONE_FIELD_NUMBER = 8;
    private boolean isDone_;
    /**
     * <code>bool is_done = 8;</code>
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
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
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      if (isDone_ != false) {
        output.writeBool(8, isDone_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      if (isDone_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isDone_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify other = (emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getIsDone()
          != other.getIsDone()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDone());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify prototype) {
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
     * CmdId: 8203
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabStageOneofDungeonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabStageOneofDungeonNotify)
        emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneofDungeonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.class, emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        isDone_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify build() {
        emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify buildPartial() {
        emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify result = new emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify(this);
        result.stageId_ = stageId_;
        result.isDone_ = isDone_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify other) {
        if (other == emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsDone() != false) {
          setIsDone(other.getIsDone());
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
              case 16: {
                stageId_ = input.readUInt32();

                break;
              } // case 16
              case 64: {
                isDone_ = input.readBool();

                break;
              } // case 64
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isDone_ ;
      /**
       * <code>bool is_done = 8;</code>
       * @return The isDone.
       */
      @java.lang.Override
      public boolean getIsDone() {
        return isDone_;
      }
      /**
       * <code>bool is_done = 8;</code>
       * @param value The isDone to set.
       * @return This builder for chaining.
       */
      public Builder setIsDone(boolean value) {
        
        isDone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_done = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDone() {
        
        isDone_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabStageOneofDungeonNotify)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabStageOneofDungeonNotify)
    private static final emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify();
    }

    public static emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabStageOneofDungeonNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabStageOneofDungeonNotify>() {
      @java.lang.Override
      public ChannelerSlabStageOneofDungeonNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabStageOneofDungeonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabStageOneofDungeonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ChannelerSlabStageOneofDungeonNotifyOuterClass.ChannelerSlabStageOneofDungeonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabStageOneofDungeonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*ChannelerSlabStageOneofDungeonNotify.p" +
      "roto\"I\n$ChannelerSlabStageOneofDungeonNo" +
      "tify\022\020\n\010stage_id\030\002 \001(\r\022\017\n\007is_done\030\010 \001(\010B" +
      "\036\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabStageOneofDungeonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabStageOneofDungeonNotify_descriptor,
        new java.lang.String[] { "StageId", "IsDone", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
