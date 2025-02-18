// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessPickCardReq.proto

package emu.grasscutter.net.oldproto;

public final class ChessPickCardReqOuterClass {
  private ChessPickCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessPickCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessPickCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 card_index = 4;</code>
     * @return The cardIndex.
     */
    int getCardIndex();
  }
  /**
   * <pre>
   * CmdId: 5333
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ChessPickCardReq}
   */
  public static final class ChessPickCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessPickCardReq)
      ChessPickCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessPickCardReq.newBuilder() to construct.
    private ChessPickCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessPickCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessPickCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.internal_static_ChessPickCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.internal_static_ChessPickCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.class, emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 1;
    private int cardId_;
    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int CARD_INDEX_FIELD_NUMBER = 4;
    private int cardIndex_;
    /**
     * <code>uint32 card_index = 4;</code>
     * @return The cardIndex.
     */
    @java.lang.Override
    public int getCardIndex() {
      return cardIndex_;
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
      if (cardId_ != 0) {
        output.writeUInt32(1, cardId_);
      }
      if (cardIndex_ != 0) {
        output.writeUInt32(4, cardIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cardId_);
      }
      if (cardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cardIndex_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq other = (emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getCardIndex()
          != other.getCardIndex()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + CARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getCardIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq prototype) {
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
     * CmdId: 5333
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ChessPickCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessPickCardReq)
        emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.internal_static_ChessPickCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.internal_static_ChessPickCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.class, emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cardId_ = 0;

        cardIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.internal_static_ChessPickCardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq build() {
        emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq buildPartial() {
        emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq result = new emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq(this);
        result.cardId_ = cardId_;
        result.cardIndex_ = cardIndex_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq other) {
        if (other == emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getCardIndex() != 0) {
          setCardIndex(other.getCardIndex());
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
                cardId_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                cardIndex_ = input.readUInt32();

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

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 1;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int cardIndex_ ;
      /**
       * <code>uint32 card_index = 4;</code>
       * @return The cardIndex.
       */
      @java.lang.Override
      public int getCardIndex() {
        return cardIndex_;
      }
      /**
       * <code>uint32 card_index = 4;</code>
       * @param value The cardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setCardIndex(int value) {
        
        cardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_index = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardIndex() {
        
        cardIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessPickCardReq)
    }

    // @@protoc_insertion_point(class_scope:ChessPickCardReq)
    private static final emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq();
    }

    public static emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessPickCardReq>
        PARSER = new com.google.protobuf.AbstractParser<ChessPickCardReq>() {
      @java.lang.Override
      public ChessPickCardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChessPickCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessPickCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ChessPickCardReqOuterClass.ChessPickCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessPickCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessPickCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ChessPickCardReq.proto\"7\n\020ChessPickCar" +
      "dReq\022\017\n\007card_id\030\001 \001(\r\022\022\n\ncard_index\030\004 \001(" +
      "\rB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessPickCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessPickCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessPickCardReq_descriptor,
        new java.lang.String[] { "CardId", "CardIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
