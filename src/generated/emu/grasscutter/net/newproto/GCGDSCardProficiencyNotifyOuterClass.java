// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardProficiencyNotify.proto

package emu.grasscutter.net.newproto;

public final class GCGDSCardProficiencyNotifyOuterClass {
  private GCGDSCardProficiencyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardProficiencyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardProficiencyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 proficiency = 10;</code>
     * @return The proficiency.
     */
    int getProficiency();

    /**
     * <code>uint32 card_id = 13;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7969;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGDSCardProficiencyNotify}
   */
  public static final class GCGDSCardProficiencyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardProficiencyNotify)
      GCGDSCardProficiencyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardProficiencyNotify.newBuilder() to construct.
    private GCGDSCardProficiencyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardProficiencyNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardProficiencyNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.class, emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.Builder.class);
    }

    public static final int PROFICIENCY_FIELD_NUMBER = 10;
    private int proficiency_;
    /**
     * <code>uint32 proficiency = 10;</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 13;
    private int cardId_;
    /**
     * <code>uint32 card_id = 13;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (proficiency_ != 0) {
        output.writeUInt32(10, proficiency_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(13, cardId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (proficiency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, proficiency_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cardId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify other = (emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify) obj;

      if (getProficiency()
          != other.getProficiency()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
      hash = (53 * hash) + getProficiency();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify prototype) {
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
     *   CMD_ID = 7969;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGDSCardProficiencyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardProficiencyNotify)
        emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.class, emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        proficiency_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify build() {
        emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify buildPartial() {
        emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify result = new emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify(this);
        result.proficiency_ = proficiency_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify other) {
        if (other == emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.getDefaultInstance()) return this;
        if (other.getProficiency() != 0) {
          setProficiency(other.getProficiency());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
                proficiency_ = input.readUInt32();

                break;
              } // case 80
              case 104: {
                cardId_ = input.readUInt32();

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

      private int proficiency_ ;
      /**
       * <code>uint32 proficiency = 10;</code>
       * @return The proficiency.
       */
      @java.lang.Override
      public int getProficiency() {
        return proficiency_;
      }
      /**
       * <code>uint32 proficiency = 10;</code>
       * @param value The proficiency to set.
       * @return This builder for chaining.
       */
      public Builder setProficiency(int value) {
        
        proficiency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 proficiency = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearProficiency() {
        
        proficiency_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 13;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardProficiencyNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardProficiencyNotify)
    private static final emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify();
    }

    public static emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardProficiencyNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardProficiencyNotify>() {
      @java.lang.Override
      public GCGDSCardProficiencyNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGDSCardProficiencyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardProficiencyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardProficiencyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GCGDSCardProficiencyNotify.proto\"B\n\032GC" +
      "GDSCardProficiencyNotify\022\023\n\013proficiency\030" +
      "\n \001(\r\022\017\n\007card_id\030\r \001(\rB\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardProficiencyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardProficiencyNotify_descriptor,
        new java.lang.String[] { "Proficiency", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
