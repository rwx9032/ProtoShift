// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientAbilityChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class ClientAbilityChangeNotifyOuterClass {
  private ClientAbilityChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientAbilityChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientAbilityChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_init_hash = 10;</code>
     * @return The isInitHash.
     */
    boolean getIsInitHash();

    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> 
        getInvokesList();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index);
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    int getInvokesCount();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
        getInvokesOrBuilderList();
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
        int index);

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1139;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientAbilityChangeNotify}
   */
  public static final class ClientAbilityChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientAbilityChangeNotify)
      ClientAbilityChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientAbilityChangeNotify.newBuilder() to construct.
    private ClientAbilityChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientAbilityChangeNotify() {
      invokes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientAbilityChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.internal_static_ClientAbilityChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.internal_static_ClientAbilityChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.class, emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.Builder.class);
    }

    public static final int IS_INIT_HASH_FIELD_NUMBER = 10;
    private boolean isInitHash_;
    /**
     * <code>bool is_init_hash = 10;</code>
     * @return The isInitHash.
     */
    @java.lang.Override
    public boolean getIsInitHash() {
      return isInitHash_;
    }

    public static final int INVOKES_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_;
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
      return invokes_;
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
        getInvokesOrBuilderList() {
      return invokes_;
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    @java.lang.Override
    public int getInvokesCount() {
      return invokes_.size();
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index) {
      return invokes_.get(index);
    }
    /**
     * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
        int index) {
      return invokes_.get(index);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (isInitHash_ != false) {
        output.writeBool(10, isInitHash_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      for (int i = 0; i < invokes_.size(); i++) {
        output.writeMessage(14, invokes_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInitHash_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isInitHash_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      for (int i = 0; i < invokes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, invokes_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify other = (emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify) obj;

      if (getIsInitHash()
          != other.getIsInitHash()) return false;
      if (!getInvokesList()
          .equals(other.getInvokesList())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + IS_INIT_HASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInitHash());
      if (getInvokesCount() > 0) {
        hash = (37 * hash) + INVOKES_FIELD_NUMBER;
        hash = (53 * hash) + getInvokesList().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify prototype) {
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
     *   CMD_ID = 1139;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientAbilityChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientAbilityChangeNotify)
        emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.internal_static_ClientAbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.internal_static_ClientAbilityChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.class, emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isInitHash_ = false;

        if (invokesBuilder_ == null) {
          invokes_ = java.util.Collections.emptyList();
        } else {
          invokes_ = null;
          invokesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.internal_static_ClientAbilityChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify build() {
        emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify result = new emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify(this);
        int from_bitField0_ = bitField0_;
        result.isInitHash_ = isInitHash_;
        if (invokesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            invokes_ = java.util.Collections.unmodifiableList(invokes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.invokes_ = invokes_;
        } else {
          result.invokes_ = invokesBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify.getDefaultInstance()) return this;
        if (other.getIsInitHash() != false) {
          setIsInitHash(other.getIsInitHash());
        }
        if (invokesBuilder_ == null) {
          if (!other.invokes_.isEmpty()) {
            if (invokes_.isEmpty()) {
              invokes_ = other.invokes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInvokesIsMutable();
              invokes_.addAll(other.invokes_);
            }
            onChanged();
          }
        } else {
          if (!other.invokes_.isEmpty()) {
            if (invokesBuilder_.isEmpty()) {
              invokesBuilder_.dispose();
              invokesBuilder_ = null;
              invokes_ = other.invokes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              invokesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInvokesFieldBuilder() : null;
            } else {
              invokesBuilder_.addAllMessages(other.invokes_);
            }
          }
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 80: {
                isInitHash_ = input.readBool();

                break;
              } // case 80
              case 88: {
                entityId_ = input.readUInt32();

                break;
              } // case 88
              case 114: {
                emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.parser(),
                        extensionRegistry);
                if (invokesBuilder_ == null) {
                  ensureInvokesIsMutable();
                  invokes_.add(m);
                } else {
                  invokesBuilder_.addMessage(m);
                }
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
      private int bitField0_;

      private boolean isInitHash_ ;
      /**
       * <code>bool is_init_hash = 10;</code>
       * @return The isInitHash.
       */
      @java.lang.Override
      public boolean getIsInitHash() {
        return isInitHash_;
      }
      /**
       * <code>bool is_init_hash = 10;</code>
       * @param value The isInitHash to set.
       * @return This builder for chaining.
       */
      public Builder setIsInitHash(boolean value) {
        
        isInitHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_init_hash = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInitHash() {
        
        isInitHash_ = false;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_ =
        java.util.Collections.emptyList();
      private void ensureInvokesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          invokes_ = new java.util.ArrayList<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry>(invokes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> invokesBuilder_;

      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
        if (invokesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(invokes_);
        } else {
          return invokesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public int getInvokesCount() {
        if (invokesBuilder_ == null) {
          return invokes_.size();
        } else {
          return invokesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(int index) {
        if (invokesBuilder_ == null) {
          return invokes_.get(index);
        } else {
          return invokesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder setInvokes(
          int index, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.set(index, value);
          onChanged();
        } else {
          invokesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder setInvokes(
          int index, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.set(index, builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder addInvokes(emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.add(value);
          onChanged();
        } else {
          invokesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder addInvokes(
          int index, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
        if (invokesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokesIsMutable();
          invokes_.add(index, value);
          onChanged();
        } else {
          invokesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder addInvokes(
          emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.add(builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder addInvokes(
          int index, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.add(index, builderForValue.build());
          onChanged();
        } else {
          invokesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder addAllInvokes(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry> values) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, invokes_);
          onChanged();
        } else {
          invokesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder clearInvokes() {
        if (invokesBuilder_ == null) {
          invokes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          invokesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public Builder removeInvokes(int index) {
        if (invokesBuilder_ == null) {
          ensureInvokesIsMutable();
          invokes_.remove(index);
          onChanged();
        } else {
          invokesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder getInvokesBuilder(
          int index) {
        return getInvokesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(
          int index) {
        if (invokesBuilder_ == null) {
          return invokes_.get(index);  } else {
          return invokesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
           getInvokesOrBuilderList() {
        if (invokesBuilder_ != null) {
          return invokesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(invokes_);
        }
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder() {
        return getInvokesFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder(
          int index) {
        return getInvokesFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityInvokeEntry invokes = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder> 
           getInvokesBuilderList() {
        return getInvokesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> 
          getInvokesFieldBuilder() {
        if (invokesBuilder_ == null) {
          invokesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder>(
                  invokes_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          invokes_ = null;
        }
        return invokesBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ClientAbilityChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientAbilityChangeNotify)
    private static final emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify();
    }

    public static emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientAbilityChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientAbilityChangeNotify>() {
      @java.lang.Override
      public ClientAbilityChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientAbilityChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientAbilityChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ClientAbilityChangeNotifyOuterClass.ClientAbilityChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAbilityChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAbilityChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ClientAbilityChangeNotify.proto\032\030Abili" +
      "tyInvokeEntry.proto\"j\n\031ClientAbilityChan" +
      "geNotify\022\024\n\014is_init_hash\030\n \001(\010\022$\n\007invoke" +
      "s\030\016 \003(\0132\023.AbilityInvokeEntry\022\021\n\tentity_i" +
      "d\030\013 \001(\rB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.getDescriptor(),
        });
    internal_static_ClientAbilityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientAbilityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAbilityChangeNotify_descriptor,
        new java.lang.String[] { "IsInitHash", "Invokes", "EntityId", });
    emu.grasscutter.net.newproto.AbilityInvokeEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
