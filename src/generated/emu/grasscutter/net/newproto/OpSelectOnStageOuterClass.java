// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpSelectOnStage.proto

package emu.grasscutter.net.newproto;

public final class OpSelectOnStageOuterClass {
  private OpSelectOnStageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpSelectOnStageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpSelectOnStage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
     * @return The unk3150IPBCLBMCHJL.
     */
    int getUnk3150IPBCLBMCHJL();

    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @return A list containing the unk3150OFHEJEGJLJD.
     */
    java.util.List<java.lang.Integer> getUnk3150OFHEJEGJLJDList();
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @return The count of unk3150OFHEJEGJLJD.
     */
    int getUnk3150OFHEJEGJLJDCount();
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3150OFHEJEGJLJD at the given index.
     */
    int getUnk3150OFHEJEGJLJD(int index);
  }
  /**
   * Protobuf type {@code OpSelectOnStage}
   */
  public static final class OpSelectOnStage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpSelectOnStage)
      OpSelectOnStageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpSelectOnStage.newBuilder() to construct.
    private OpSelectOnStage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpSelectOnStage() {
      unk3150OFHEJEGJLJD_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpSelectOnStage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.internal_static_OpSelectOnStage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.internal_static_OpSelectOnStage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.class, emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.Builder.class);
    }

    public static final int UNK3150_IPBCLBMCHJL_FIELD_NUMBER = 1;
    private int unk3150IPBCLBMCHJL_;
    /**
     * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
     * @return The unk3150IPBCLBMCHJL.
     */
    @java.lang.Override
    public int getUnk3150IPBCLBMCHJL() {
      return unk3150IPBCLBMCHJL_;
    }

    public static final int UNK3150_OFHEJEGJLJD_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList unk3150OFHEJEGJLJD_;
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @return A list containing the unk3150OFHEJEGJLJD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3150OFHEJEGJLJDList() {
      return unk3150OFHEJEGJLJD_;
    }
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @return The count of unk3150OFHEJEGJLJD.
     */
    public int getUnk3150OFHEJEGJLJDCount() {
      return unk3150OFHEJEGJLJD_.size();
    }
    /**
     * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
     * @param index The index of the element to return.
     * @return The unk3150OFHEJEGJLJD at the given index.
     */
    public int getUnk3150OFHEJEGJLJD(int index) {
      return unk3150OFHEJEGJLJD_.getInt(index);
    }
    private int unk3150OFHEJEGJLJDMemoizedSerializedSize = -1;

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
      if (unk3150IPBCLBMCHJL_ != 0) {
        output.writeUInt32(1, unk3150IPBCLBMCHJL_);
      }
      if (getUnk3150OFHEJEGJLJDList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(unk3150OFHEJEGJLJDMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3150OFHEJEGJLJD_.size(); i++) {
        output.writeUInt32NoTag(unk3150OFHEJEGJLJD_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150IPBCLBMCHJL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3150IPBCLBMCHJL_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk3150OFHEJEGJLJD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3150OFHEJEGJLJD_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3150OFHEJEGJLJDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3150OFHEJEGJLJDMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage other = (emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage) obj;

      if (getUnk3150IPBCLBMCHJL()
          != other.getUnk3150IPBCLBMCHJL()) return false;
      if (!getUnk3150OFHEJEGJLJDList()
          .equals(other.getUnk3150OFHEJEGJLJDList())) return false;
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
      hash = (37 * hash) + UNK3150_IPBCLBMCHJL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150IPBCLBMCHJL();
      if (getUnk3150OFHEJEGJLJDCount() > 0) {
        hash = (37 * hash) + UNK3150_OFHEJEGJLJD_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3150OFHEJEGJLJDList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage prototype) {
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
     * Protobuf type {@code OpSelectOnStage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpSelectOnStage)
        emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.internal_static_OpSelectOnStage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.internal_static_OpSelectOnStage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.class, emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150IPBCLBMCHJL_ = 0;

        unk3150OFHEJEGJLJD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.internal_static_OpSelectOnStage_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage build() {
        emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage buildPartial() {
        emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage result = new emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage(this);
        int from_bitField0_ = bitField0_;
        result.unk3150IPBCLBMCHJL_ = unk3150IPBCLBMCHJL_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3150OFHEJEGJLJD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3150OFHEJEGJLJD_ = unk3150OFHEJEGJLJD_;
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
        if (other instanceof emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage) {
          return mergeFrom((emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage other) {
        if (other == emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage.getDefaultInstance()) return this;
        if (other.getUnk3150IPBCLBMCHJL() != 0) {
          setUnk3150IPBCLBMCHJL(other.getUnk3150IPBCLBMCHJL());
        }
        if (!other.unk3150OFHEJEGJLJD_.isEmpty()) {
          if (unk3150OFHEJEGJLJD_.isEmpty()) {
            unk3150OFHEJEGJLJD_ = other.unk3150OFHEJEGJLJD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3150OFHEJEGJLJDIsMutable();
            unk3150OFHEJEGJLJD_.addAll(other.unk3150OFHEJEGJLJD_);
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
              case 8: {
                unk3150IPBCLBMCHJL_ = input.readUInt32();

                break;
              } // case 8
              case 56: {
                int v = input.readUInt32();
                ensureUnk3150OFHEJEGJLJDIsMutable();
                unk3150OFHEJEGJLJD_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3150OFHEJEGJLJDIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3150OFHEJEGJLJD_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
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

      private int unk3150IPBCLBMCHJL_ ;
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @return The unk3150IPBCLBMCHJL.
       */
      @java.lang.Override
      public int getUnk3150IPBCLBMCHJL() {
        return unk3150IPBCLBMCHJL_;
      }
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @param value The unk3150IPBCLBMCHJL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150IPBCLBMCHJL(int value) {
        
        unk3150IPBCLBMCHJL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_IPBCLBMCHJL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150IPBCLBMCHJL() {
        
        unk3150IPBCLBMCHJL_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3150OFHEJEGJLJD_ = emptyIntList();
      private void ensureUnk3150OFHEJEGJLJDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3150OFHEJEGJLJD_ = mutableCopy(unk3150OFHEJEGJLJD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @return A list containing the unk3150OFHEJEGJLJD.
       */
      public java.util.List<java.lang.Integer>
          getUnk3150OFHEJEGJLJDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3150OFHEJEGJLJD_) : unk3150OFHEJEGJLJD_;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @return The count of unk3150OFHEJEGJLJD.
       */
      public int getUnk3150OFHEJEGJLJDCount() {
        return unk3150OFHEJEGJLJD_.size();
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @param index The index of the element to return.
       * @return The unk3150OFHEJEGJLJD at the given index.
       */
      public int getUnk3150OFHEJEGJLJD(int index) {
        return unk3150OFHEJEGJLJD_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @param index The index to set the value at.
       * @param value The unk3150OFHEJEGJLJD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OFHEJEGJLJD(
          int index, int value) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        unk3150OFHEJEGJLJD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @param value The unk3150OFHEJEGJLJD to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3150OFHEJEGJLJD(int value) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        unk3150OFHEJEGJLJD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @param values The unk3150OFHEJEGJLJD to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3150OFHEJEGJLJD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3150OFHEJEGJLJDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3150OFHEJEGJLJD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3150_OFHEJEGJLJD = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150OFHEJEGJLJD() {
        unk3150OFHEJEGJLJD_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:OpSelectOnStage)
    }

    // @@protoc_insertion_point(class_scope:OpSelectOnStage)
    private static final emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage();
    }

    public static emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpSelectOnStage>
        PARSER = new com.google.protobuf.AbstractParser<OpSelectOnStage>() {
      @java.lang.Override
      public OpSelectOnStage parsePartialFrom(
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

    public static com.google.protobuf.Parser<OpSelectOnStage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpSelectOnStage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.OpSelectOnStageOuterClass.OpSelectOnStage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpSelectOnStage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpSelectOnStage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025OpSelectOnStage.proto\"K\n\017OpSelectOnSta" +
      "ge\022\033\n\023Unk3150_IPBCLBMCHJL\030\001 \001(\r\022\033\n\023Unk31" +
      "50_OFHEJEGJLJD\030\007 \003(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpSelectOnStage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpSelectOnStage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpSelectOnStage_descriptor,
        new java.lang.String[] { "Unk3150IPBCLBMCHJL", "Unk3150OFHEJEGJLJD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
