// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDieAnimationEndReq.proto

package emu.grasscutter.net.newproto;

public final class AvatarDieAnimationEndReqOuterClass {
  private AvatarDieAnimationEndReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDieAnimationEndReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 die_guid = 13;</code>
     * @return The dieGuid.
     */
    long getDieGuid();

    /**
     * <code>.Vector reborn_pos = 14;</code>
     * @return Whether the rebornPos field is set.
     */
    boolean hasRebornPos();
    /**
     * <code>.Vector reborn_pos = 14;</code>
     * @return The rebornPos.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getRebornPos();
    /**
     * <code>.Vector reborn_pos = 14;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder();

    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    int getSkillId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1695;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarDieAnimationEndReq}
   */
  public static final class AvatarDieAnimationEndReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDieAnimationEndReq)
      AvatarDieAnimationEndReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDieAnimationEndReq.newBuilder() to construct.
    private AvatarDieAnimationEndReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDieAnimationEndReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDieAnimationEndReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
    }

    public static final int DIE_GUID_FIELD_NUMBER = 13;
    private long dieGuid_;
    /**
     * <code>uint64 die_guid = 13;</code>
     * @return The dieGuid.
     */
    @java.lang.Override
    public long getDieGuid() {
      return dieGuid_;
    }

    public static final int REBORN_POS_FIELD_NUMBER = 14;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector rebornPos_;
    /**
     * <code>.Vector reborn_pos = 14;</code>
     * @return Whether the rebornPos field is set.
     */
    @java.lang.Override
    public boolean hasRebornPos() {
      return rebornPos_ != null;
    }
    /**
     * <code>.Vector reborn_pos = 14;</code>
     * @return The rebornPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRebornPos() {
      return rebornPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
    }
    /**
     * <code>.Vector reborn_pos = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
      return getRebornPos();
    }

    public static final int SKILL_ID_FIELD_NUMBER = 9;
    private int skillId_;
    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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
      if (skillId_ != 0) {
        output.writeUInt32(9, skillId_);
      }
      if (dieGuid_ != 0L) {
        output.writeUInt64(13, dieGuid_);
      }
      if (rebornPos_ != null) {
        output.writeMessage(14, getRebornPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, skillId_);
      }
      if (dieGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, dieGuid_);
      }
      if (rebornPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getRebornPos());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other = (emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) obj;

      if (getDieGuid()
          != other.getDieGuid()) return false;
      if (hasRebornPos() != other.hasRebornPos()) return false;
      if (hasRebornPos()) {
        if (!getRebornPos()
            .equals(other.getRebornPos())) return false;
      }
      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + DIE_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDieGuid());
      if (hasRebornPos()) {
        hash = (37 * hash) + REBORN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getRebornPos().hashCode();
      }
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq prototype) {
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
     *   CMD_ID = 1695;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarDieAnimationEndReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDieAnimationEndReq)
        emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.class, emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dieGuid_ = 0L;

        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }
        skillId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.internal_static_AvatarDieAnimationEndReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq build() {
        emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq buildPartial() {
        emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq result = new emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq(this);
        result.dieGuid_ = dieGuid_;
        if (rebornPosBuilder_ == null) {
          result.rebornPos_ = rebornPos_;
        } else {
          result.rebornPos_ = rebornPosBuilder_.build();
        }
        result.skillId_ = skillId_;
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
        if (other instanceof emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq) {
          return mergeFrom((emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq other) {
        if (other == emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq.getDefaultInstance()) return this;
        if (other.getDieGuid() != 0L) {
          setDieGuid(other.getDieGuid());
        }
        if (other.hasRebornPos()) {
          mergeRebornPos(other.getRebornPos());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
              case 72: {
                skillId_ = input.readUInt32();

                break;
              } // case 72
              case 104: {
                dieGuid_ = input.readUInt64();

                break;
              } // case 104
              case 114: {
                input.readMessage(
                    getRebornPosFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 114
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

      private long dieGuid_ ;
      /**
       * <code>uint64 die_guid = 13;</code>
       * @return The dieGuid.
       */
      @java.lang.Override
      public long getDieGuid() {
        return dieGuid_;
      }
      /**
       * <code>uint64 die_guid = 13;</code>
       * @param value The dieGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDieGuid(long value) {
        
        dieGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 die_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieGuid() {
        
        dieGuid_ = 0L;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector rebornPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> rebornPosBuilder_;
      /**
       * <code>.Vector reborn_pos = 14;</code>
       * @return Whether the rebornPos field is set.
       */
      public boolean hasRebornPos() {
        return rebornPosBuilder_ != null || rebornPos_ != null;
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       * @return The rebornPos.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getRebornPos() {
        if (rebornPosBuilder_ == null) {
          return rebornPos_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        } else {
          return rebornPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public Builder setRebornPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rebornPos_ = value;
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public Builder setRebornPos(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = builderForValue.build();
          onChanged();
        } else {
          rebornPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public Builder mergeRebornPos(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (rebornPosBuilder_ == null) {
          if (rebornPos_ != null) {
            rebornPos_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(rebornPos_).mergeFrom(value).buildPartial();
          } else {
            rebornPos_ = value;
          }
          onChanged();
        } else {
          rebornPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public Builder clearRebornPos() {
        if (rebornPosBuilder_ == null) {
          rebornPos_ = null;
          onChanged();
        } else {
          rebornPos_ = null;
          rebornPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getRebornPosBuilder() {
        
        onChanged();
        return getRebornPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getRebornPosOrBuilder() {
        if (rebornPosBuilder_ != null) {
          return rebornPosBuilder_.getMessageOrBuilder();
        } else {
          return rebornPos_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : rebornPos_;
        }
      }
      /**
       * <code>.Vector reborn_pos = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getRebornPosFieldBuilder() {
        if (rebornPosBuilder_ == null) {
          rebornPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getRebornPos(),
                  getParentForChildren(),
                  isClean());
          rebornPos_ = null;
        }
        return rebornPosBuilder_;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarDieAnimationEndReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarDieAnimationEndReq)
    private static final emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq();
    }

    public static emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDieAnimationEndReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDieAnimationEndReq>() {
      @java.lang.Override
      public AvatarDieAnimationEndReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarDieAnimationEndReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDieAnimationEndReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AvatarDieAnimationEndReqOuterClass.AvatarDieAnimationEndReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDieAnimationEndReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDieAnimationEndReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarDieAnimationEndReq.proto\032\014Vector" +
      ".proto\"[\n\030AvatarDieAnimationEndReq\022\020\n\010di" +
      "e_guid\030\r \001(\004\022\033\n\nreborn_pos\030\016 \001(\0132\007.Vecto" +
      "r\022\020\n\010skill_id\030\t \001(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AvatarDieAnimationEndReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDieAnimationEndReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDieAnimationEndReq_descriptor,
        new java.lang.String[] { "DieGuid", "RebornPos", "SkillId", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
