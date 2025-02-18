// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarCardChangeReq.proto

package emu.grasscutter.net.oldproto;

public final class AvatarCardChangeReqOuterClass {
  private AvatarCardChangeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarCardChangeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarCardChangeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 6;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 count = 7;</code>
     * @return The count.
     */
    int getCount();
  }
  /**
   * <pre>
   * CmdId: 688
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code AvatarCardChangeReq}
   */
  public static final class AvatarCardChangeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarCardChangeReq)
      AvatarCardChangeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarCardChangeReq.newBuilder() to construct.
    private AvatarCardChangeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarCardChangeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarCardChangeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.internal_static_AvatarCardChangeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.internal_static_AvatarCardChangeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.class, emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 6;
    private int itemId_;
    /**
     * <code>uint32 item_id = 6;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 14;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 14;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int COUNT_FIELD_NUMBER = 7;
    private int count_;
    /**
     * <code>uint32 count = 7;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
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
      if (itemId_ != 0) {
        output.writeUInt32(6, itemId_);
      }
      if (count_ != 0) {
        output.writeUInt32(7, count_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(14, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, itemId_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, count_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq other = (emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getCount()
          != other.getCount()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq prototype) {
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
     * CmdId: 688
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code AvatarCardChangeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarCardChangeReq)
        emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.internal_static_AvatarCardChangeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.internal_static_AvatarCardChangeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.class, emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        itemId_ = 0;

        avatarGuid_ = 0L;

        count_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.internal_static_AvatarCardChangeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq build() {
        emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq buildPartial() {
        emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq result = new emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq(this);
        result.itemId_ = itemId_;
        result.avatarGuid_ = avatarGuid_;
        result.count_ = count_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq other) {
        if (other == emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
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
                itemId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                count_ = input.readUInt32();

                break;
              } // case 56
              case 112: {
                avatarGuid_ = input.readUInt64();

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

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 6;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 6;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 7;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 7;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarCardChangeReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarCardChangeReq)
    private static final emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq();
    }

    public static emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarCardChangeReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarCardChangeReq>() {
      @java.lang.Override
      public AvatarCardChangeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarCardChangeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarCardChangeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AvatarCardChangeReqOuterClass.AvatarCardChangeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarCardChangeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarCardChangeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AvatarCardChangeReq.proto\"J\n\023AvatarCar" +
      "dChangeReq\022\017\n\007item_id\030\006 \001(\r\022\023\n\013avatar_gu" +
      "id\030\016 \001(\004\022\r\n\005count\030\007 \001(\rB\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarCardChangeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarCardChangeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarCardChangeReq_descriptor,
        new java.lang.String[] { "ItemId", "AvatarGuid", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
