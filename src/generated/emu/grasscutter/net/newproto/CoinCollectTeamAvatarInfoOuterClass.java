// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectTeamAvatarInfo.proto

package emu.grasscutter.net.newproto;

public final class CoinCollectTeamAvatarInfoOuterClass {
  private CoinCollectTeamAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectTeamAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectTeamAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 costume_id = 1;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * Protobuf type {@code CoinCollectTeamAvatarInfo}
   */
  public static final class CoinCollectTeamAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectTeamAvatarInfo)
      CoinCollectTeamAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectTeamAvatarInfo.newBuilder() to construct.
    private CoinCollectTeamAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectTeamAvatarInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectTeamAvatarInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.internal_static_CoinCollectTeamAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.internal_static_CoinCollectTeamAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.class, emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 1;
    private int costumeId_;
    /**
     * <code>uint32 costume_id = 1;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
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
      if (costumeId_ != 0) {
        output.writeUInt32(1, costumeId_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, costumeId_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo other = (emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo prototype) {
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
     * Protobuf type {@code CoinCollectTeamAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectTeamAvatarInfo)
        emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.internal_static_CoinCollectTeamAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.internal_static_CoinCollectTeamAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.class, emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarId_ = 0;

        costumeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.internal_static_CoinCollectTeamAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo build() {
        emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo buildPartial() {
        emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo result = new emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo(this);
        result.avatarId_ = avatarId_;
        result.costumeId_ = costumeId_;
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
        if (other instanceof emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo other) {
        if (other == emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
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
              case 8: {
                costumeId_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                avatarId_ = input.readUInt32();

                break;
              } // case 40
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 1;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 1;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {
        
        costumeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        
        costumeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectTeamAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectTeamAvatarInfo)
    private static final emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo();
    }

    public static emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectTeamAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectTeamAvatarInfo>() {
      @java.lang.Override
      public CoinCollectTeamAvatarInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CoinCollectTeamAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectTeamAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.CoinCollectTeamAvatarInfoOuterClass.CoinCollectTeamAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectTeamAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectTeamAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CoinCollectTeamAvatarInfo.proto\"B\n\031Coi" +
      "nCollectTeamAvatarInfo\022\021\n\tavatar_id\030\005 \001(" +
      "\r\022\022\n\ncostume_id\030\001 \001(\rB\036\n\034emu.grasscutter" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CoinCollectTeamAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectTeamAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectTeamAvatarInfo_descriptor,
        new java.lang.String[] { "AvatarId", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
