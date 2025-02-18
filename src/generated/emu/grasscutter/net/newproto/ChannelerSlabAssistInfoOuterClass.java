// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabAssistInfo.proto

package emu.grasscutter.net.newproto;

public final class ChannelerSlabAssistInfoOuterClass {
  private ChannelerSlabAssistInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabAssistInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabAssistInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_level = 10;</code>
     * @return The avatarLevel.
     */
    int getAvatarLevel();

    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 avatar_id = 6;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * Protobuf type {@code ChannelerSlabAssistInfo}
   */
  public static final class ChannelerSlabAssistInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabAssistInfo)
      ChannelerSlabAssistInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabAssistInfo.newBuilder() to construct.
    private ChannelerSlabAssistInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabAssistInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabAssistInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.internal_static_ChannelerSlabAssistInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.internal_static_ChannelerSlabAssistInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.class, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder.class);
    }

    public static final int AVATAR_LEVEL_FIELD_NUMBER = 10;
    private int avatarLevel_;
    /**
     * <code>uint32 avatar_level = 10;</code>
     * @return The avatarLevel.
     */
    @java.lang.Override
    public int getAvatarLevel() {
      return avatarLevel_;
    }

    public static final int UID_FIELD_NUMBER = 11;
    private int uid_;
    /**
     * <code>uint32 uid = 11;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 6;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 6;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (avatarId_ != 0) {
        output.writeUInt32(6, avatarId_);
      }
      if (avatarLevel_ != 0) {
        output.writeUInt32(10, avatarLevel_);
      }
      if (uid_ != 0) {
        output.writeUInt32(11, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, avatarId_);
      }
      if (avatarLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, avatarLevel_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo other = (emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo) obj;

      if (getAvatarLevel()
          != other.getAvatarLevel()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + AVATAR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarLevel();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo prototype) {
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
     * Protobuf type {@code ChannelerSlabAssistInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabAssistInfo)
        emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.internal_static_ChannelerSlabAssistInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.internal_static_ChannelerSlabAssistInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.class, emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarLevel_ = 0;

        uid_ = 0;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.internal_static_ChannelerSlabAssistInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo build() {
        emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo buildPartial() {
        emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo result = new emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo(this);
        result.avatarLevel_ = avatarLevel_;
        result.uid_ = uid_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo other) {
        if (other == emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo.getDefaultInstance()) return this;
        if (other.getAvatarLevel() != 0) {
          setAvatarLevel(other.getAvatarLevel());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
                avatarId_ = input.readUInt32();

                break;
              } // case 48
              case 80: {
                avatarLevel_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                uid_ = input.readUInt32();

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

      private int avatarLevel_ ;
      /**
       * <code>uint32 avatar_level = 10;</code>
       * @return The avatarLevel.
       */
      @java.lang.Override
      public int getAvatarLevel() {
        return avatarLevel_;
      }
      /**
       * <code>uint32 avatar_level = 10;</code>
       * @param value The avatarLevel to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarLevel(int value) {
        
        avatarLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_level = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarLevel() {
        
        avatarLevel_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 11;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabAssistInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabAssistInfo)
    private static final emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo();
    }

    public static emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabAssistInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabAssistInfo>() {
      @java.lang.Override
      public ChannelerSlabAssistInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabAssistInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabAssistInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ChannelerSlabAssistInfoOuterClass.ChannelerSlabAssistInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabAssistInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabAssistInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ChannelerSlabAssistInfo.proto\"O\n\027Chann" +
      "elerSlabAssistInfo\022\024\n\014avatar_level\030\n \001(\r" +
      "\022\013\n\003uid\030\013 \001(\r\022\021\n\tavatar_id\030\006 \001(\rB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabAssistInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabAssistInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabAssistInfo_descriptor,
        new java.lang.String[] { "AvatarLevel", "Uid", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
