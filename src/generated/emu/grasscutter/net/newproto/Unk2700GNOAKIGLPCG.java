// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_GNOAKIGLPCG.proto

package emu.grasscutter.net.newproto;

public final class Unk2700GNOAKIGLPCG {
  private Unk2700GNOAKIGLPCG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_GNOAKIGLPCGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_GNOAKIGLPCG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @return A list containing the unk2700IIJKCKNHPKD.
     */
    java.util.List<java.lang.Integer> getUnk2700IIJKCKNHPKDList();
    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @return The count of unk2700IIJKCKNHPKD.
     */
    int getUnk2700IIJKCKNHPKDCount();
    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @param index The index of the element to return.
     * @return The unk2700IIJKCKNHPKD at the given index.
     */
    int getUnk2700IIJKCKNHPKD(int index);
  }
  /**
   * <pre>
   * CmdId: 8043
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_GNOAKIGLPCG}
   */
  public static final class Unk2700_GNOAKIGLPCG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_GNOAKIGLPCG)
      Unk2700_GNOAKIGLPCGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_GNOAKIGLPCG.newBuilder() to construct.
    private Unk2700_GNOAKIGLPCG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_GNOAKIGLPCG() {
      unk2700IIJKCKNHPKD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_GNOAKIGLPCG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.internal_static_Unk2700_GNOAKIGLPCG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.internal_static_Unk2700_GNOAKIGLPCG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.class, emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.Builder.class);
    }

    public static final int UNK2700_IIJKCKNHPKD_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList unk2700IIJKCKNHPKD_;
    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @return A list containing the unk2700IIJKCKNHPKD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2700IIJKCKNHPKDList() {
      return unk2700IIJKCKNHPKD_;
    }
    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @return The count of unk2700IIJKCKNHPKD.
     */
    public int getUnk2700IIJKCKNHPKDCount() {
      return unk2700IIJKCKNHPKD_.size();
    }
    /**
     * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
     * @param index The index of the element to return.
     * @return The unk2700IIJKCKNHPKD at the given index.
     */
    public int getUnk2700IIJKCKNHPKD(int index) {
      return unk2700IIJKCKNHPKD_.getInt(index);
    }
    private int unk2700IIJKCKNHPKDMemoizedSerializedSize = -1;

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
      if (getUnk2700IIJKCKNHPKDList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(unk2700IIJKCKNHPKDMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2700IIJKCKNHPKD_.size(); i++) {
        output.writeUInt32NoTag(unk2700IIJKCKNHPKD_.getInt(i));
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
        for (int i = 0; i < unk2700IIJKCKNHPKD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2700IIJKCKNHPKD_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2700IIJKCKNHPKDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2700IIJKCKNHPKDMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG other = (emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG) obj;

      if (!getUnk2700IIJKCKNHPKDList()
          .equals(other.getUnk2700IIJKCKNHPKDList())) return false;
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
      if (getUnk2700IIJKCKNHPKDCount() > 0) {
        hash = (37 * hash) + UNK2700_IIJKCKNHPKD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700IIJKCKNHPKDList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG prototype) {
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
     * CmdId: 8043
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_GNOAKIGLPCG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_GNOAKIGLPCG)
        emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.internal_static_Unk2700_GNOAKIGLPCG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.internal_static_Unk2700_GNOAKIGLPCG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.class, emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700IIJKCKNHPKD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.internal_static_Unk2700_GNOAKIGLPCG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG build() {
        emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG buildPartial() {
        emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG result = new emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2700IIJKCKNHPKD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2700IIJKCKNHPKD_ = unk2700IIJKCKNHPKD_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG other) {
        if (other == emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG.getDefaultInstance()) return this;
        if (!other.unk2700IIJKCKNHPKD_.isEmpty()) {
          if (unk2700IIJKCKNHPKD_.isEmpty()) {
            unk2700IIJKCKNHPKD_ = other.unk2700IIJKCKNHPKD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2700IIJKCKNHPKDIsMutable();
            unk2700IIJKCKNHPKD_.addAll(other.unk2700IIJKCKNHPKD_);
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
              case 72: {
                int v = input.readUInt32();
                ensureUnk2700IIJKCKNHPKDIsMutable();
                unk2700IIJKCKNHPKD_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk2700IIJKCKNHPKDIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk2700IIJKCKNHPKD_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
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

      private com.google.protobuf.Internal.IntList unk2700IIJKCKNHPKD_ = emptyIntList();
      private void ensureUnk2700IIJKCKNHPKDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700IIJKCKNHPKD_ = mutableCopy(unk2700IIJKCKNHPKD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @return A list containing the unk2700IIJKCKNHPKD.
       */
      public java.util.List<java.lang.Integer>
          getUnk2700IIJKCKNHPKDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2700IIJKCKNHPKD_) : unk2700IIJKCKNHPKD_;
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @return The count of unk2700IIJKCKNHPKD.
       */
      public int getUnk2700IIJKCKNHPKDCount() {
        return unk2700IIJKCKNHPKD_.size();
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @param index The index of the element to return.
       * @return The unk2700IIJKCKNHPKD at the given index.
       */
      public int getUnk2700IIJKCKNHPKD(int index) {
        return unk2700IIJKCKNHPKD_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @param index The index to set the value at.
       * @param value The unk2700IIJKCKNHPKD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700IIJKCKNHPKD(
          int index, int value) {
        ensureUnk2700IIJKCKNHPKDIsMutable();
        unk2700IIJKCKNHPKD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @param value The unk2700IIJKCKNHPKD to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2700IIJKCKNHPKD(int value) {
        ensureUnk2700IIJKCKNHPKDIsMutable();
        unk2700IIJKCKNHPKD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @param values The unk2700IIJKCKNHPKD to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2700IIJKCKNHPKD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2700IIJKCKNHPKDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2700IIJKCKNHPKD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2700_IIJKCKNHPKD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700IIJKCKNHPKD() {
        unk2700IIJKCKNHPKD_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk2700_GNOAKIGLPCG)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_GNOAKIGLPCG)
    private static final emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG();
    }

    public static emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_GNOAKIGLPCG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_GNOAKIGLPCG>() {
      @java.lang.Override
      public Unk2700_GNOAKIGLPCG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_GNOAKIGLPCG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_GNOAKIGLPCG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700GNOAKIGLPCG.Unk2700_GNOAKIGLPCG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_GNOAKIGLPCG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_GNOAKIGLPCG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_GNOAKIGLPCG.proto\"2\n\023Unk2700_G" +
      "NOAKIGLPCG\022\033\n\023Unk2700_IIJKCKNHPKD\030\t \003(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_GNOAKIGLPCG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_GNOAKIGLPCG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_GNOAKIGLPCG_descriptor,
        new java.lang.String[] { "Unk2700IIJKCKNHPKD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
