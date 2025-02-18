// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSyncSkillAnchorPosition.proto

package emu.grasscutter.net.oldproto;

public final class EvtSyncSkillAnchorPositionOuterClass {
  private EvtSyncSkillAnchorPositionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtSyncSkillAnchorPositionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtSyncSkillAnchorPosition)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    boolean hasSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     * @return The skillAnchorPosition.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder();
  }
  /**
   * Protobuf type {@code EvtSyncSkillAnchorPosition}
   */
  public static final class EvtSyncSkillAnchorPosition extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtSyncSkillAnchorPosition)
      EvtSyncSkillAnchorPositionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtSyncSkillAnchorPosition.newBuilder() to construct.
    private EvtSyncSkillAnchorPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtSyncSkillAnchorPosition() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtSyncSkillAnchorPosition();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.internal_static_EvtSyncSkillAnchorPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.internal_static_EvtSyncSkillAnchorPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.class, emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int SKILL_ANCHOR_POSITION_FIELD_NUMBER = 13;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector skillAnchorPosition_;
    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    @java.lang.Override
    public boolean hasSkillAnchorPosition() {
      return skillAnchorPosition_ != null;
    }
    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     * @return The skillAnchorPosition.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getSkillAnchorPosition() {
      return skillAnchorPosition_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
    }
    /**
     * <code>.Vector skill_anchor_position = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
      return getSkillAnchorPosition();
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
      if (entityId_ != 0) {
        output.writeUInt32(2, entityId_);
      }
      if (skillAnchorPosition_ != null) {
        output.writeMessage(13, getSkillAnchorPosition());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entityId_);
      }
      if (skillAnchorPosition_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getSkillAnchorPosition());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition other = (emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasSkillAnchorPosition() != other.hasSkillAnchorPosition()) return false;
      if (hasSkillAnchorPosition()) {
        if (!getSkillAnchorPosition()
            .equals(other.getSkillAnchorPosition())) return false;
      }
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasSkillAnchorPosition()) {
        hash = (37 * hash) + SKILL_ANCHOR_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getSkillAnchorPosition().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition prototype) {
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
     * Protobuf type {@code EvtSyncSkillAnchorPosition}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtSyncSkillAnchorPosition)
        emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.internal_static_EvtSyncSkillAnchorPosition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.internal_static_EvtSyncSkillAnchorPosition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.class, emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = null;
        } else {
          skillAnchorPosition_ = null;
          skillAnchorPositionBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.internal_static_EvtSyncSkillAnchorPosition_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition build() {
        emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition buildPartial() {
        emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition result = new emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition(this);
        result.entityId_ = entityId_;
        if (skillAnchorPositionBuilder_ == null) {
          result.skillAnchorPosition_ = skillAnchorPosition_;
        } else {
          result.skillAnchorPosition_ = skillAnchorPositionBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition) {
          return mergeFrom((emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition other) {
        if (other == emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasSkillAnchorPosition()) {
          mergeSkillAnchorPosition(other.getSkillAnchorPosition());
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
                entityId_ = input.readUInt32();

                break;
              } // case 16
              case 106: {
                input.readMessage(
                    getSkillAnchorPositionFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 106
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector skillAnchorPosition_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> skillAnchorPositionBuilder_;
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       * @return Whether the skillAnchorPosition field is set.
       */
      public boolean hasSkillAnchorPosition() {
        return skillAnchorPositionBuilder_ != null || skillAnchorPosition_ != null;
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       * @return The skillAnchorPosition.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getSkillAnchorPosition() {
        if (skillAnchorPositionBuilder_ == null) {
          return skillAnchorPosition_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        } else {
          return skillAnchorPositionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public Builder setSkillAnchorPosition(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          skillAnchorPosition_ = value;
          onChanged();
        } else {
          skillAnchorPositionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public Builder setSkillAnchorPosition(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = builderForValue.build();
          onChanged();
        } else {
          skillAnchorPositionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public Builder mergeSkillAnchorPosition(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (skillAnchorPosition_ != null) {
            skillAnchorPosition_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(skillAnchorPosition_).mergeFrom(value).buildPartial();
          } else {
            skillAnchorPosition_ = value;
          }
          onChanged();
        } else {
          skillAnchorPositionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public Builder clearSkillAnchorPosition() {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = null;
          onChanged();
        } else {
          skillAnchorPosition_ = null;
          skillAnchorPositionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getSkillAnchorPositionBuilder() {
        
        onChanged();
        return getSkillAnchorPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
        if (skillAnchorPositionBuilder_ != null) {
          return skillAnchorPositionBuilder_.getMessageOrBuilder();
        } else {
          return skillAnchorPosition_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getSkillAnchorPositionFieldBuilder() {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getSkillAnchorPosition(),
                  getParentForChildren(),
                  isClean());
          skillAnchorPosition_ = null;
        }
        return skillAnchorPositionBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtSyncSkillAnchorPosition)
    }

    // @@protoc_insertion_point(class_scope:EvtSyncSkillAnchorPosition)
    private static final emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition();
    }

    public static emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtSyncSkillAnchorPosition>
        PARSER = new com.google.protobuf.AbstractParser<EvtSyncSkillAnchorPosition>() {
      @java.lang.Override
      public EvtSyncSkillAnchorPosition parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtSyncSkillAnchorPosition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtSyncSkillAnchorPosition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EvtSyncSkillAnchorPositionOuterClass.EvtSyncSkillAnchorPosition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtSyncSkillAnchorPosition_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtSyncSkillAnchorPosition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtSyncSkillAnchorPosition.proto\032\014Vect" +
      "or.proto\"W\n\032EvtSyncSkillAnchorPosition\022\021" +
      "\n\tentity_id\030\002 \001(\r\022&\n\025skill_anchor_positi" +
      "on\030\r \001(\0132\007.VectorB\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtSyncSkillAnchorPosition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtSyncSkillAnchorPosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtSyncSkillAnchorPosition_descriptor,
        new java.lang.String[] { "EntityId", "SkillAnchorPosition", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
