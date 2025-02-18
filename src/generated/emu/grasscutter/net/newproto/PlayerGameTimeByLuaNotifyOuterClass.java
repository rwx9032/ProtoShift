// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerGameTimeByLuaNotify.proto

package emu.grasscutter.net.newproto;

public final class PlayerGameTimeByLuaNotifyOuterClass {
  private PlayerGameTimeByLuaNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerGameTimeByLuaNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerGameTimeByLuaNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    int getGameTime();

    /**
     * <code>uint32 uid = 8;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 sim_speed = 14;</code>
     * @return The simSpeed.
     */
    int getSimSpeed();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 186;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerGameTimeByLuaNotify}
   */
  public static final class PlayerGameTimeByLuaNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerGameTimeByLuaNotify)
      PlayerGameTimeByLuaNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerGameTimeByLuaNotify.newBuilder() to construct.
    private PlayerGameTimeByLuaNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerGameTimeByLuaNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerGameTimeByLuaNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.internal_static_PlayerGameTimeByLuaNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.internal_static_PlayerGameTimeByLuaNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.class, emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.Builder.class);
    }

    public static final int GAME_TIME_FIELD_NUMBER = 12;
    private int gameTime_;
    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
    }

    public static final int UID_FIELD_NUMBER = 8;
    private int uid_;
    /**
     * <code>uint32 uid = 8;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SIM_SPEED_FIELD_NUMBER = 14;
    private int simSpeed_;
    /**
     * <code>uint32 sim_speed = 14;</code>
     * @return The simSpeed.
     */
    @java.lang.Override
    public int getSimSpeed() {
      return simSpeed_;
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
      if (uid_ != 0) {
        output.writeUInt32(8, uid_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(12, gameTime_);
      }
      if (simSpeed_ != 0) {
        output.writeUInt32(14, simSpeed_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, uid_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gameTime_);
      }
      if (simSpeed_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, simSpeed_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify other = (emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify) obj;

      if (getGameTime()
          != other.getGameTime()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getSimSpeed()
          != other.getSimSpeed()) return false;
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
      hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SIM_SPEED_FIELD_NUMBER;
      hash = (53 * hash) + getSimSpeed();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify prototype) {
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
     *   CMD_ID = 186;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerGameTimeByLuaNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerGameTimeByLuaNotify)
        emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.internal_static_PlayerGameTimeByLuaNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.internal_static_PlayerGameTimeByLuaNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.class, emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gameTime_ = 0;

        uid_ = 0;

        simSpeed_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.internal_static_PlayerGameTimeByLuaNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify build() {
        emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify buildPartial() {
        emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify result = new emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify(this);
        result.gameTime_ = gameTime_;
        result.uid_ = uid_;
        result.simSpeed_ = simSpeed_;
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
        if (other instanceof emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify other) {
        if (other == emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify.getDefaultInstance()) return this;
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getSimSpeed() != 0) {
          setSimSpeed(other.getSimSpeed());
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
              case 64: {
                uid_ = input.readUInt32();

                break;
              } // case 64
              case 96: {
                gameTime_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                simSpeed_ = input.readUInt32();

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

      private int gameTime_ ;
      /**
       * <code>uint32 game_time = 12;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        
        gameTime_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 8;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 8;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int simSpeed_ ;
      /**
       * <code>uint32 sim_speed = 14;</code>
       * @return The simSpeed.
       */
      @java.lang.Override
      public int getSimSpeed() {
        return simSpeed_;
      }
      /**
       * <code>uint32 sim_speed = 14;</code>
       * @param value The simSpeed to set.
       * @return This builder for chaining.
       */
      public Builder setSimSpeed(int value) {
        
        simSpeed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sim_speed = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSimSpeed() {
        
        simSpeed_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerGameTimeByLuaNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerGameTimeByLuaNotify)
    private static final emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify();
    }

    public static emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerGameTimeByLuaNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerGameTimeByLuaNotify>() {
      @java.lang.Override
      public PlayerGameTimeByLuaNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerGameTimeByLuaNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerGameTimeByLuaNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PlayerGameTimeByLuaNotifyOuterClass.PlayerGameTimeByLuaNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerGameTimeByLuaNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerGameTimeByLuaNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037PlayerGameTimeByLuaNotify.proto\"N\n\031Pla" +
      "yerGameTimeByLuaNotify\022\021\n\tgame_time\030\014 \001(" +
      "\r\022\013\n\003uid\030\010 \001(\r\022\021\n\tsim_speed\030\016 \001(\rB\036\n\034emu" +
      ".grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerGameTimeByLuaNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerGameTimeByLuaNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerGameTimeByLuaNotify_descriptor,
        new java.lang.String[] { "GameTime", "Uid", "SimSpeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
