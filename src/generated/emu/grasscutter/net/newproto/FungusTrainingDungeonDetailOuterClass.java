// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusTrainingDungeonDetail.proto

package emu.grasscutter.net.newproto;

public final class FungusTrainingDungeonDetailOuterClass {
  private FungusTrainingDungeonDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusTrainingDungeonDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusTrainingDungeonDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 best_score = 8;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 dungeon_id = 6;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code FungusTrainingDungeonDetail}
   */
  public static final class FungusTrainingDungeonDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusTrainingDungeonDetail)
      FungusTrainingDungeonDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusTrainingDungeonDetail.newBuilder() to construct.
    private FungusTrainingDungeonDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusTrainingDungeonDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusTrainingDungeonDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.class, emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.Builder.class);
    }

    public static final int BEST_SCORE_FIELD_NUMBER = 8;
    private int bestScore_;
    /**
     * <code>uint32 best_score = 8;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 6;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 6;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 13;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(6, dungeonId_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(8, bestScore_);
      }
      if (isOpen_ != false) {
        output.writeBool(13, isOpen_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, dungeonId_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, bestScore_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isOpen_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail other = (emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail) obj;

      if (getBestScore()
          != other.getBestScore()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail prototype) {
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
     * Protobuf type {@code FungusTrainingDungeonDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusTrainingDungeonDetail)
        emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.class, emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bestScore_ = 0;

        dungeonId_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.internal_static_FungusTrainingDungeonDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail build() {
        emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail buildPartial() {
        emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail result = new emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail(this);
        result.bestScore_ = bestScore_;
        result.dungeonId_ = dungeonId_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail) {
          return mergeFrom((emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail other) {
        if (other == emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail.getDefaultInstance()) return this;
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                dungeonId_ = input.readUInt32();

                break;
              } // case 48
              case 64: {
                bestScore_ = input.readUInt32();

                break;
              } // case 64
              case 104: {
                isOpen_ = input.readBool();

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

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 8;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 8;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {
        
        bestScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 6;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 6;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 13;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:FungusTrainingDungeonDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusTrainingDungeonDetail)
    private static final emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail();
    }

    public static emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusTrainingDungeonDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusTrainingDungeonDetail>() {
      @java.lang.Override
      public FungusTrainingDungeonDetail parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusTrainingDungeonDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusTrainingDungeonDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FungusTrainingDungeonDetailOuterClass.FungusTrainingDungeonDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusTrainingDungeonDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusTrainingDungeonDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FungusTrainingDungeonDetail.proto\"V\n\033F" +
      "ungusTrainingDungeonDetail\022\022\n\nbest_score" +
      "\030\010 \001(\r\022\022\n\ndungeon_id\030\006 \001(\r\022\017\n\007is_open\030\r " +
      "\001(\010B\036\n\034emu.grasscutter.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusTrainingDungeonDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusTrainingDungeonDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusTrainingDungeonDetail_descriptor,
        new java.lang.String[] { "BestScore", "DungeonId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
