// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionSaveDungeonResultReq.proto

package emu.grasscutter.net.newproto;

public final class PotionSaveDungeonResultReqOuterClass {
  private PotionSaveDungeonResultReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionSaveDungeonResultReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionSaveDungeonResultReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8672;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PotionSaveDungeonResultReq}
   */
  public static final class PotionSaveDungeonResultReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionSaveDungeonResultReq)
      PotionSaveDungeonResultReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionSaveDungeonResultReq.newBuilder() to construct.
    private PotionSaveDungeonResultReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionSaveDungeonResultReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionSaveDungeonResultReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.internal_static_PotionSaveDungeonResultReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.internal_static_PotionSaveDungeonResultReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.class, emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 7;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
        output.writeUInt32(7, stageId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
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
          .computeUInt32Size(7, stageId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq other = (emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq prototype) {
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
     *   CMD_ID = 8672;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PotionSaveDungeonResultReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionSaveDungeonResultReq)
        emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.internal_static_PotionSaveDungeonResultReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.internal_static_PotionSaveDungeonResultReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.class, emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.internal_static_PotionSaveDungeonResultReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq build() {
        emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq buildPartial() {
        emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq result = new emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq(this);
        result.levelId_ = levelId_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq) {
          return mergeFrom((emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq other) {
        if (other == emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
              case 56: {
                stageId_ = input.readUInt32();

                break;
              } // case 56
              case 112: {
                levelId_ = input.readUInt32();

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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PotionSaveDungeonResultReq)
    }

    // @@protoc_insertion_point(class_scope:PotionSaveDungeonResultReq)
    private static final emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq();
    }

    public static emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionSaveDungeonResultReq>
        PARSER = new com.google.protobuf.AbstractParser<PotionSaveDungeonResultReq>() {
      @java.lang.Override
      public PotionSaveDungeonResultReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PotionSaveDungeonResultReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionSaveDungeonResultReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PotionSaveDungeonResultReqOuterClass.PotionSaveDungeonResultReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionSaveDungeonResultReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionSaveDungeonResultReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n PotionSaveDungeonResultReq.proto\"@\n\032Po" +
      "tionSaveDungeonResultReq\022\020\n\010level_id\030\016 \001" +
      "(\r\022\020\n\010stage_id\030\007 \001(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionSaveDungeonResultReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionSaveDungeonResultReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionSaveDungeonResultReq_descriptor,
        new java.lang.String[] { "LevelId", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
