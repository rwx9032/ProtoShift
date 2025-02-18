// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartRogueEliteCellChallengeReq.proto

package emu.grasscutter.net.newproto;

public final class StartRogueEliteCellChallengeReqOuterClass {
  private StartRogueEliteCellChallengeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartRogueEliteCellChallengeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartRogueEliteCellChallengeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
     * @return The enum numeric value on the wire for difficulty.
     */
    int getDifficultyValue();
    /**
     * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
     * @return The difficulty.
     */
    emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType getDifficulty();

    /**
     * <code>uint32 cell_id = 10;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint32 dungeon_id = 11;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8485;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code StartRogueEliteCellChallengeReq}
   */
  public static final class StartRogueEliteCellChallengeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartRogueEliteCellChallengeReq)
      StartRogueEliteCellChallengeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartRogueEliteCellChallengeReq.newBuilder() to construct.
    private StartRogueEliteCellChallengeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartRogueEliteCellChallengeReq() {
      difficulty_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartRogueEliteCellChallengeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.internal_static_StartRogueEliteCellChallengeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.internal_static_StartRogueEliteCellChallengeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.class, emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.Builder.class);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 6;
    private int difficulty_;
    /**
     * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
     * @return The enum numeric value on the wire for difficulty.
     */
    @java.lang.Override public int getDifficultyValue() {
      return difficulty_;
    }
    /**
     * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
     * @return The difficulty.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType getDifficulty() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType result = emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.valueOf(difficulty_);
      return result == null ? emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.UNRECOGNIZED : result;
    }

    public static final int CELL_ID_FIELD_NUMBER = 10;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 10;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 11;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 11;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (difficulty_ != emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL.getNumber()) {
        output.writeEnum(6, difficulty_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(10, cellId_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(11, dungeonId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.ROGUE_ELITE_CELL_DIFFICULTY_TYPE_NORMAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, difficulty_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cellId_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dungeonId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq other = (emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq) obj;

      if (difficulty_ != other.difficulty_) return false;
      if (getCellId()
          != other.getCellId()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + difficulty_;
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq prototype) {
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
     *   CMD_ID = 8485;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code StartRogueEliteCellChallengeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartRogueEliteCellChallengeReq)
        emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.internal_static_StartRogueEliteCellChallengeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.internal_static_StartRogueEliteCellChallengeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.class, emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        difficulty_ = 0;

        cellId_ = 0;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.internal_static_StartRogueEliteCellChallengeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq build() {
        emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq buildPartial() {
        emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq result = new emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq(this);
        result.difficulty_ = difficulty_;
        result.cellId_ = cellId_;
        result.dungeonId_ = dungeonId_;
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
        if (other instanceof emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq) {
          return mergeFrom((emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq other) {
        if (other == emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq.getDefaultInstance()) return this;
        if (other.difficulty_ != 0) {
          setDifficultyValue(other.getDifficultyValue());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
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
                difficulty_ = input.readEnum();

                break;
              } // case 48
              case 80: {
                cellId_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 88
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

      private int difficulty_ = 0;
      /**
       * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
       * @return The enum numeric value on the wire for difficulty.
       */
      @java.lang.Override public int getDifficultyValue() {
        return difficulty_;
      }
      /**
       * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
       * @param value The enum numeric value on the wire for difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyValue(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType getDifficulty() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType result = emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.valueOf(difficulty_);
        return result == null ? emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType.UNRECOGNIZED : result;
      }
      /**
       * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.RogueEliteCellDifficultyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        difficulty_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RogueEliteCellDifficultyType difficulty = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 10;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 10;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartRogueEliteCellChallengeReq)
    }

    // @@protoc_insertion_point(class_scope:StartRogueEliteCellChallengeReq)
    private static final emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq();
    }

    public static emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartRogueEliteCellChallengeReq>
        PARSER = new com.google.protobuf.AbstractParser<StartRogueEliteCellChallengeReq>() {
      @java.lang.Override
      public StartRogueEliteCellChallengeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartRogueEliteCellChallengeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartRogueEliteCellChallengeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.StartRogueEliteCellChallengeReqOuterClass.StartRogueEliteCellChallengeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartRogueEliteCellChallengeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartRogueEliteCellChallengeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%StartRogueEliteCellChallengeReq.proto\032" +
      "\"RogueEliteCellDifficultyType.proto\"y\n\037S" +
      "tartRogueEliteCellChallengeReq\0221\n\ndiffic" +
      "ulty\030\006 \001(\0162\035.RogueEliteCellDifficultyTyp" +
      "e\022\017\n\007cell_id\030\n \001(\r\022\022\n\ndungeon_id\030\013 \001(\rB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.getDescriptor(),
        });
    internal_static_StartRogueEliteCellChallengeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartRogueEliteCellChallengeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartRogueEliteCellChallengeReq_descriptor,
        new java.lang.String[] { "Difficulty", "CellId", "DungeonId", });
    emu.grasscutter.net.newproto.RogueEliteCellDifficultyTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
