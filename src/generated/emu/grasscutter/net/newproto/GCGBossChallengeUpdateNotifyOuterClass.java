// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGBossChallengeUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class GCGBossChallengeUpdateNotifyOuterClass {
  private GCGBossChallengeUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGBossChallengeUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGBossChallengeUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     * @return Whether the bossChallenge field is set.
     */
    boolean hasBossChallenge();
    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     * @return The bossChallenge.
     */
    emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getBossChallenge();
    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     */
    emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getBossChallengeOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7852;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGBossChallengeUpdateNotify}
   */
  public static final class GCGBossChallengeUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGBossChallengeUpdateNotify)
      GCGBossChallengeUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGBossChallengeUpdateNotify.newBuilder() to construct.
    private GCGBossChallengeUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGBossChallengeUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGBossChallengeUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.class, emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.Builder.class);
    }

    public static final int BOSS_CHALLENGE_FIELD_NUMBER = 7;
    private emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData bossChallenge_;
    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     * @return Whether the bossChallenge field is set.
     */
    @java.lang.Override
    public boolean hasBossChallenge() {
      return bossChallenge_ != null;
    }
    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     * @return The bossChallenge.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getBossChallenge() {
      return bossChallenge_ == null ? emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : bossChallenge_;
    }
    /**
     * <code>.GCGBossChallengeData boss_challenge = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getBossChallengeOrBuilder() {
      return getBossChallenge();
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
      if (bossChallenge_ != null) {
        output.writeMessage(7, getBossChallenge());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bossChallenge_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getBossChallenge());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify other = (emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify) obj;

      if (hasBossChallenge() != other.hasBossChallenge()) return false;
      if (hasBossChallenge()) {
        if (!getBossChallenge()
            .equals(other.getBossChallenge())) return false;
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
      if (hasBossChallenge()) {
        hash = (37 * hash) + BOSS_CHALLENGE_FIELD_NUMBER;
        hash = (53 * hash) + getBossChallenge().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify prototype) {
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
     *   CMD_ID = 7852;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGBossChallengeUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGBossChallengeUpdateNotify)
        emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.class, emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (bossChallengeBuilder_ == null) {
          bossChallenge_ = null;
        } else {
          bossChallenge_ = null;
          bossChallengeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.internal_static_GCGBossChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify build() {
        emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify result = new emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify(this);
        if (bossChallengeBuilder_ == null) {
          result.bossChallenge_ = bossChallenge_;
        } else {
          result.bossChallenge_ = bossChallengeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.getDefaultInstance()) return this;
        if (other.hasBossChallenge()) {
          mergeBossChallenge(other.getBossChallenge());
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
              case 58: {
                input.readMessage(
                    getBossChallengeFieldBuilder().getBuilder(),
                    extensionRegistry);

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

      private emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData bossChallenge_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder> bossChallengeBuilder_;
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       * @return Whether the bossChallenge field is set.
       */
      public boolean hasBossChallenge() {
        return bossChallengeBuilder_ != null || bossChallenge_ != null;
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       * @return The bossChallenge.
       */
      public emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData getBossChallenge() {
        if (bossChallengeBuilder_ == null) {
          return bossChallenge_ == null ? emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : bossChallenge_;
        } else {
          return bossChallengeBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public Builder setBossChallenge(emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
        if (bossChallengeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bossChallenge_ = value;
          onChanged();
        } else {
          bossChallengeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public Builder setBossChallenge(
          emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder builderForValue) {
        if (bossChallengeBuilder_ == null) {
          bossChallenge_ = builderForValue.build();
          onChanged();
        } else {
          bossChallengeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public Builder mergeBossChallenge(emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
        if (bossChallengeBuilder_ == null) {
          if (bossChallenge_ != null) {
            bossChallenge_ =
              emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.newBuilder(bossChallenge_).mergeFrom(value).buildPartial();
          } else {
            bossChallenge_ = value;
          }
          onChanged();
        } else {
          bossChallengeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public Builder clearBossChallenge() {
        if (bossChallengeBuilder_ == null) {
          bossChallenge_ = null;
          onChanged();
        } else {
          bossChallenge_ = null;
          bossChallengeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder getBossChallengeBuilder() {
        
        onChanged();
        return getBossChallengeFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      public emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder getBossChallengeOrBuilder() {
        if (bossChallengeBuilder_ != null) {
          return bossChallengeBuilder_.getMessageOrBuilder();
        } else {
          return bossChallenge_ == null ?
              emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.getDefaultInstance() : bossChallenge_;
        }
      }
      /**
       * <code>.GCGBossChallengeData boss_challenge = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder> 
          getBossChallengeFieldBuilder() {
        if (bossChallengeBuilder_ == null) {
          bossChallengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder, emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder>(
                  getBossChallenge(),
                  getParentForChildren(),
                  isClean());
          bossChallenge_ = null;
        }
        return bossChallengeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGBossChallengeUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGBossChallengeUpdateNotify)
    private static final emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGBossChallengeUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGBossChallengeUpdateNotify>() {
      @java.lang.Override
      public GCGBossChallengeUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGBossChallengeUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GCGBossChallengeUpdateNotify.proto\032\032GC" +
      "GBossChallengeData.proto\"M\n\034GCGBossChall" +
      "engeUpdateNotify\022-\n\016boss_challenge\030\007 \001(\013" +
      "2\025.GCGBossChallengeDataB\036\n\034emu.grasscutt" +
      "er.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGBossChallengeUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGBossChallengeUpdateNotify_descriptor,
        new java.lang.String[] { "BossChallenge", });
    emu.grasscutter.net.newproto.GCGBossChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
