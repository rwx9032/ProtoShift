// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGGameBriefDataNotify.proto

package emu.grasscutter.net.newproto;

public final class GCGGameBriefDataNotifyOuterClass {
  private GCGGameBriefDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGGameBriefDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGGameBriefDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     * @return Whether the gcgBriefData field is set.
     */
    boolean hasGcgBriefData();
    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     * @return The gcgBriefData.
     */
    emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData getGcgBriefData();
    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     */
    emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getGcgBriefDataOrBuilder();

    /**
     * <code>bool is_new_game = 4;</code>
     * @return The isNewGame.
     */
    boolean getIsNewGame();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7824;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGGameBriefDataNotify}
   */
  public static final class GCGGameBriefDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGGameBriefDataNotify)
      GCGGameBriefDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGGameBriefDataNotify.newBuilder() to construct.
    private GCGGameBriefDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGGameBriefDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGGameBriefDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.internal_static_GCGGameBriefDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.internal_static_GCGGameBriefDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.class, emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.Builder.class);
    }

    public static final int GCG_BRIEF_DATA_FIELD_NUMBER = 3;
    private emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData gcgBriefData_;
    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     * @return Whether the gcgBriefData field is set.
     */
    @java.lang.Override
    public boolean hasGcgBriefData() {
      return gcgBriefData_ != null;
    }
    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     * @return The gcgBriefData.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData getGcgBriefData() {
      return gcgBriefData_ == null ? emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : gcgBriefData_;
    }
    /**
     * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getGcgBriefDataOrBuilder() {
      return getGcgBriefData();
    }

    public static final int IS_NEW_GAME_FIELD_NUMBER = 4;
    private boolean isNewGame_;
    /**
     * <code>bool is_new_game = 4;</code>
     * @return The isNewGame.
     */
    @java.lang.Override
    public boolean getIsNewGame() {
      return isNewGame_;
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
      if (gcgBriefData_ != null) {
        output.writeMessage(3, getGcgBriefData());
      }
      if (isNewGame_ != false) {
        output.writeBool(4, isNewGame_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gcgBriefData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getGcgBriefData());
      }
      if (isNewGame_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNewGame_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify other = (emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify) obj;

      if (hasGcgBriefData() != other.hasGcgBriefData()) return false;
      if (hasGcgBriefData()) {
        if (!getGcgBriefData()
            .equals(other.getGcgBriefData())) return false;
      }
      if (getIsNewGame()
          != other.getIsNewGame()) return false;
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
      if (hasGcgBriefData()) {
        hash = (37 * hash) + GCG_BRIEF_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getGcgBriefData().hashCode();
      }
      hash = (37 * hash) + IS_NEW_GAME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewGame());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify prototype) {
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
     *   CMD_ID = 7824;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGGameBriefDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGGameBriefDataNotify)
        emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.internal_static_GCGGameBriefDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.internal_static_GCGGameBriefDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.class, emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (gcgBriefDataBuilder_ == null) {
          gcgBriefData_ = null;
        } else {
          gcgBriefData_ = null;
          gcgBriefDataBuilder_ = null;
        }
        isNewGame_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.internal_static_GCGGameBriefDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify build() {
        emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify buildPartial() {
        emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify result = new emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify(this);
        if (gcgBriefDataBuilder_ == null) {
          result.gcgBriefData_ = gcgBriefData_;
        } else {
          result.gcgBriefData_ = gcgBriefDataBuilder_.build();
        }
        result.isNewGame_ = isNewGame_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify other) {
        if (other == emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify.getDefaultInstance()) return this;
        if (other.hasGcgBriefData()) {
          mergeGcgBriefData(other.getGcgBriefData());
        }
        if (other.getIsNewGame() != false) {
          setIsNewGame(other.getIsNewGame());
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
              case 26: {
                input.readMessage(
                    getGcgBriefDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 26
              case 32: {
                isNewGame_ = input.readBool();

                break;
              } // case 32
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

      private emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData gcgBriefData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder> gcgBriefDataBuilder_;
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       * @return Whether the gcgBriefData field is set.
       */
      public boolean hasGcgBriefData() {
        return gcgBriefDataBuilder_ != null || gcgBriefData_ != null;
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       * @return The gcgBriefData.
       */
      public emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData getGcgBriefData() {
        if (gcgBriefDataBuilder_ == null) {
          return gcgBriefData_ == null ? emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : gcgBriefData_;
        } else {
          return gcgBriefDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public Builder setGcgBriefData(emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
        if (gcgBriefDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gcgBriefData_ = value;
          onChanged();
        } else {
          gcgBriefDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public Builder setGcgBriefData(
          emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder builderForValue) {
        if (gcgBriefDataBuilder_ == null) {
          gcgBriefData_ = builderForValue.build();
          onChanged();
        } else {
          gcgBriefDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public Builder mergeGcgBriefData(emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
        if (gcgBriefDataBuilder_ == null) {
          if (gcgBriefData_ != null) {
            gcgBriefData_ =
              emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.newBuilder(gcgBriefData_).mergeFrom(value).buildPartial();
          } else {
            gcgBriefData_ = value;
          }
          onChanged();
        } else {
          gcgBriefDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public Builder clearGcgBriefData() {
        if (gcgBriefDataBuilder_ == null) {
          gcgBriefData_ = null;
          onChanged();
        } else {
          gcgBriefData_ = null;
          gcgBriefDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder getGcgBriefDataBuilder() {
        
        onChanged();
        return getGcgBriefDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      public emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getGcgBriefDataOrBuilder() {
        if (gcgBriefDataBuilder_ != null) {
          return gcgBriefDataBuilder_.getMessageOrBuilder();
        } else {
          return gcgBriefData_ == null ?
              emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : gcgBriefData_;
        }
      }
      /**
       * <code>.GCGGameBriefData gcg_brief_data = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder> 
          getGcgBriefDataFieldBuilder() {
        if (gcgBriefDataBuilder_ == null) {
          gcgBriefDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder>(
                  getGcgBriefData(),
                  getParentForChildren(),
                  isClean());
          gcgBriefData_ = null;
        }
        return gcgBriefDataBuilder_;
      }

      private boolean isNewGame_ ;
      /**
       * <code>bool is_new_game = 4;</code>
       * @return The isNewGame.
       */
      @java.lang.Override
      public boolean getIsNewGame() {
        return isNewGame_;
      }
      /**
       * <code>bool is_new_game = 4;</code>
       * @param value The isNewGame to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewGame(boolean value) {
        
        isNewGame_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_game = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewGame() {
        
        isNewGame_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGGameBriefDataNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGGameBriefDataNotify)
    private static final emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify();
    }

    public static emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGGameBriefDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGGameBriefDataNotify>() {
      @java.lang.Override
      public GCGGameBriefDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGGameBriefDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGGameBriefDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGGameBriefDataNotifyOuterClass.GCGGameBriefDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGGameBriefDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGGameBriefDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGGameBriefDataNotify.proto\032\026GCGGameB" +
      "riefData.proto\"X\n\026GCGGameBriefDataNotify" +
      "\022)\n\016gcg_brief_data\030\003 \001(\0132\021.GCGGameBriefD" +
      "ata\022\023\n\013is_new_game\030\004 \001(\010B\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.getDescriptor(),
        });
    internal_static_GCGGameBriefDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGGameBriefDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGGameBriefDataNotify_descriptor,
        new java.lang.String[] { "GcgBriefData", "IsNewGame", });
    emu.grasscutter.net.newproto.GCGGameBriefDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
