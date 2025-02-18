// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientRemoveCombatEndModifierNotify.proto

package emu.grasscutter.net.newproto;

public final class ClientRemoveCombatEndModifierNotifyOuterClass {
  private ClientRemoveCombatEndModifierNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientRemoveCombatEndModifierNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientRemoveCombatEndModifierNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @return A list containing the combatEndTypeList.
     */
    java.util.List<java.lang.Integer> getCombatEndTypeListList();
    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @return The count of combatEndTypeList.
     */
    int getCombatEndTypeListCount();
    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @param index The index of the element to return.
     * @return The combatEndTypeList at the given index.
     */
    int getCombatEndTypeList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1190;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientRemoveCombatEndModifierNotify}
   */
  public static final class ClientRemoveCombatEndModifierNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientRemoveCombatEndModifierNotify)
      ClientRemoveCombatEndModifierNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientRemoveCombatEndModifierNotify.newBuilder() to construct.
    private ClientRemoveCombatEndModifierNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientRemoveCombatEndModifierNotify() {
      combatEndTypeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientRemoveCombatEndModifierNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.internal_static_ClientRemoveCombatEndModifierNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.internal_static_ClientRemoveCombatEndModifierNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.class, emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.Builder.class);
    }

    public static final int COMBAT_END_TYPE_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList combatEndTypeList_;
    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @return A list containing the combatEndTypeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCombatEndTypeListList() {
      return combatEndTypeList_;
    }
    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @return The count of combatEndTypeList.
     */
    public int getCombatEndTypeListCount() {
      return combatEndTypeList_.size();
    }
    /**
     * <code>repeated uint32 combat_end_type_list = 10;</code>
     * @param index The index of the element to return.
     * @return The combatEndTypeList at the given index.
     */
    public int getCombatEndTypeList(int index) {
      return combatEndTypeList_.getInt(index);
    }
    private int combatEndTypeListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getCombatEndTypeListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(combatEndTypeListMemoizedSerializedSize);
      }
      for (int i = 0; i < combatEndTypeList_.size(); i++) {
        output.writeUInt32NoTag(combatEndTypeList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < combatEndTypeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(combatEndTypeList_.getInt(i));
        }
        size += dataSize;
        if (!getCombatEndTypeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        combatEndTypeListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify other = (emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify) obj;

      if (!getCombatEndTypeListList()
          .equals(other.getCombatEndTypeListList())) return false;
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
      if (getCombatEndTypeListCount() > 0) {
        hash = (37 * hash) + COMBAT_END_TYPE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCombatEndTypeListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify prototype) {
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
     *   CMD_ID = 1190;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientRemoveCombatEndModifierNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientRemoveCombatEndModifierNotify)
        emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.internal_static_ClientRemoveCombatEndModifierNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.internal_static_ClientRemoveCombatEndModifierNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.class, emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        combatEndTypeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.internal_static_ClientRemoveCombatEndModifierNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify build() {
        emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify buildPartial() {
        emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify result = new emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          combatEndTypeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.combatEndTypeList_ = combatEndTypeList_;
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
        if (other instanceof emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify other) {
        if (other == emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify.getDefaultInstance()) return this;
        if (!other.combatEndTypeList_.isEmpty()) {
          if (combatEndTypeList_.isEmpty()) {
            combatEndTypeList_ = other.combatEndTypeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCombatEndTypeListIsMutable();
            combatEndTypeList_.addAll(other.combatEndTypeList_);
          }
          onChanged();
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
                int v = input.readUInt32();
                ensureCombatEndTypeListIsMutable();
                combatEndTypeList_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCombatEndTypeListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  combatEndTypeList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
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

      private com.google.protobuf.Internal.IntList combatEndTypeList_ = emptyIntList();
      private void ensureCombatEndTypeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          combatEndTypeList_ = mutableCopy(combatEndTypeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @return A list containing the combatEndTypeList.
       */
      public java.util.List<java.lang.Integer>
          getCombatEndTypeListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(combatEndTypeList_) : combatEndTypeList_;
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @return The count of combatEndTypeList.
       */
      public int getCombatEndTypeListCount() {
        return combatEndTypeList_.size();
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @param index The index of the element to return.
       * @return The combatEndTypeList at the given index.
       */
      public int getCombatEndTypeList(int index) {
        return combatEndTypeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The combatEndTypeList to set.
       * @return This builder for chaining.
       */
      public Builder setCombatEndTypeList(
          int index, int value) {
        ensureCombatEndTypeListIsMutable();
        combatEndTypeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @param value The combatEndTypeList to add.
       * @return This builder for chaining.
       */
      public Builder addCombatEndTypeList(int value) {
        ensureCombatEndTypeListIsMutable();
        combatEndTypeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @param values The combatEndTypeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCombatEndTypeList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCombatEndTypeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, combatEndTypeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combat_end_type_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombatEndTypeList() {
        combatEndTypeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:ClientRemoveCombatEndModifierNotify)
    }

    // @@protoc_insertion_point(class_scope:ClientRemoveCombatEndModifierNotify)
    private static final emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify();
    }

    public static emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientRemoveCombatEndModifierNotify>
        PARSER = new com.google.protobuf.AbstractParser<ClientRemoveCombatEndModifierNotify>() {
      @java.lang.Override
      public ClientRemoveCombatEndModifierNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientRemoveCombatEndModifierNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientRemoveCombatEndModifierNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ClientRemoveCombatEndModifierNotifyOuterClass.ClientRemoveCombatEndModifierNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientRemoveCombatEndModifierNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientRemoveCombatEndModifierNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)ClientRemoveCombatEndModifierNotify.pr" +
      "oto\"C\n#ClientRemoveCombatEndModifierNoti" +
      "fy\022\034\n\024combat_end_type_list\030\n \003(\rB\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientRemoveCombatEndModifierNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientRemoveCombatEndModifierNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientRemoveCombatEndModifierNotify_descriptor,
        new java.lang.String[] { "CombatEndTypeList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
