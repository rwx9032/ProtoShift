// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_NCMPMILICGJ.proto

package emu.grasscutter.net.newproto;

public final class Unk2700NCMPMILICGJ {
  private Unk2700NCMPMILICGJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_NCMPMILICGJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_NCMPMILICGJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_CIHIAJEGCBO = 1;</code>
     * @return The unk3250CIHIAJEGCBO.
     */
    int getUnk3250CIHIAJEGCBO();

    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 Unk3250_LAKPMMIPBMI = 13;</code>
     * @return The unk3250LAKPMMIPBMI.
     */
    int getUnk3250LAKPMMIPBMI();
  }
  /**
   * <pre>
   * CmdId: 8208
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_NCMPMILICGJ}
   */
  public static final class Unk2700_NCMPMILICGJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_NCMPMILICGJ)
      Unk2700_NCMPMILICGJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_NCMPMILICGJ.newBuilder() to construct.
    private Unk2700_NCMPMILICGJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_NCMPMILICGJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_NCMPMILICGJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.class, emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.Builder.class);
    }

    public static final int UNK3250_CIHIAJEGCBO_FIELD_NUMBER = 1;
    private int unk3250CIHIAJEGCBO_;
    /**
     * <code>uint32 Unk3250_CIHIAJEGCBO = 1;</code>
     * @return The unk3250CIHIAJEGCBO.
     */
    @java.lang.Override
    public int getUnk3250CIHIAJEGCBO() {
      return unk3250CIHIAJEGCBO_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 12;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int UNK3250_LAKPMMIPBMI_FIELD_NUMBER = 13;
    private int unk3250LAKPMMIPBMI_;
    /**
     * <code>uint32 Unk3250_LAKPMMIPBMI = 13;</code>
     * @return The unk3250LAKPMMIPBMI.
     */
    @java.lang.Override
    public int getUnk3250LAKPMMIPBMI() {
      return unk3250LAKPMMIPBMI_;
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
      if (unk3250CIHIAJEGCBO_ != 0) {
        output.writeUInt32(1, unk3250CIHIAJEGCBO_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(12, avatarId_);
      }
      if (unk3250LAKPMMIPBMI_ != 0) {
        output.writeUInt32(13, unk3250LAKPMMIPBMI_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250CIHIAJEGCBO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250CIHIAJEGCBO_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, avatarId_);
      }
      if (unk3250LAKPMMIPBMI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3250LAKPMMIPBMI_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ other = (emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ) obj;

      if (getUnk3250CIHIAJEGCBO()
          != other.getUnk3250CIHIAJEGCBO()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getUnk3250LAKPMMIPBMI()
          != other.getUnk3250LAKPMMIPBMI()) return false;
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
      hash = (37 * hash) + UNK3250_CIHIAJEGCBO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250CIHIAJEGCBO();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + UNK3250_LAKPMMIPBMI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250LAKPMMIPBMI();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ prototype) {
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
     * CmdId: 8208
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_NCMPMILICGJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_NCMPMILICGJ)
        emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.class, emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250CIHIAJEGCBO_ = 0;

        avatarId_ = 0;

        unk3250LAKPMMIPBMI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ build() {
        emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ buildPartial() {
        emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ result = new emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ(this);
        result.unk3250CIHIAJEGCBO_ = unk3250CIHIAJEGCBO_;
        result.avatarId_ = avatarId_;
        result.unk3250LAKPMMIPBMI_ = unk3250LAKPMMIPBMI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ other) {
        if (other == emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.getDefaultInstance()) return this;
        if (other.getUnk3250CIHIAJEGCBO() != 0) {
          setUnk3250CIHIAJEGCBO(other.getUnk3250CIHIAJEGCBO());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getUnk3250LAKPMMIPBMI() != 0) {
          setUnk3250LAKPMMIPBMI(other.getUnk3250LAKPMMIPBMI());
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
                unk3250CIHIAJEGCBO_ = input.readUInt32();

                break;
              } // case 8
              case 96: {
                avatarId_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                unk3250LAKPMMIPBMI_ = input.readUInt32();

                break;
              } // case 104
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

      private int unk3250CIHIAJEGCBO_ ;
      /**
       * <code>uint32 Unk3250_CIHIAJEGCBO = 1;</code>
       * @return The unk3250CIHIAJEGCBO.
       */
      @java.lang.Override
      public int getUnk3250CIHIAJEGCBO() {
        return unk3250CIHIAJEGCBO_;
      }
      /**
       * <code>uint32 Unk3250_CIHIAJEGCBO = 1;</code>
       * @param value The unk3250CIHIAJEGCBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250CIHIAJEGCBO(int value) {
        
        unk3250CIHIAJEGCBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_CIHIAJEGCBO = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250CIHIAJEGCBO() {
        
        unk3250CIHIAJEGCBO_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int unk3250LAKPMMIPBMI_ ;
      /**
       * <code>uint32 Unk3250_LAKPMMIPBMI = 13;</code>
       * @return The unk3250LAKPMMIPBMI.
       */
      @java.lang.Override
      public int getUnk3250LAKPMMIPBMI() {
        return unk3250LAKPMMIPBMI_;
      }
      /**
       * <code>uint32 Unk3250_LAKPMMIPBMI = 13;</code>
       * @param value The unk3250LAKPMMIPBMI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250LAKPMMIPBMI(int value) {
        
        unk3250LAKPMMIPBMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_LAKPMMIPBMI = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250LAKPMMIPBMI() {
        
        unk3250LAKPMMIPBMI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_NCMPMILICGJ)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_NCMPMILICGJ)
    private static final emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ();
    }

    public static emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_NCMPMILICGJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_NCMPMILICGJ>() {
      @java.lang.Override
      public Unk2700_NCMPMILICGJ parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_NCMPMILICGJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_NCMPMILICGJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_NCMPMILICGJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_NCMPMILICGJ.proto\"b\n\023Unk2700_N" +
      "CMPMILICGJ\022\033\n\023Unk3250_CIHIAJEGCBO\030\001 \001(\r\022" +
      "\021\n\tavatar_id\030\014 \001(\r\022\033\n\023Unk3250_LAKPMMIPBM" +
      "I\030\r \001(\rB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_NCMPMILICGJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_NCMPMILICGJ_descriptor,
        new java.lang.String[] { "Unk3250CIHIAJEGCBO", "AvatarId", "Unk3250LAKPMMIPBMI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
