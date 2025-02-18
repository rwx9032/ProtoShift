// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainSnapshot.proto

package emu.grasscutter.net.oldproto;

public final class BargainSnapshotOuterClass {
  private BargainSnapshotOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainSnapshotOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainSnapshot)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 expected_price = 3;</code>
     * @return The expectedPrice.
     */
    int getExpectedPrice();

    /**
     * <code>int32 cur_mood = 14;</code>
     * @return The curMood.
     */
    int getCurMood();

    /**
     * <code>uint32 price_low_limit = 2;</code>
     * @return The priceLowLimit.
     */
    int getPriceLowLimit();

    /**
     * <code>uint32 bargain_id = 5;</code>
     * @return The bargainId.
     */
    int getBargainId();
  }
  /**
   * Protobuf type {@code BargainSnapshot}
   */
  public static final class BargainSnapshot extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainSnapshot)
      BargainSnapshotOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainSnapshot.newBuilder() to construct.
    private BargainSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainSnapshot() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainSnapshot();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
    }

    public static final int EXPECTED_PRICE_FIELD_NUMBER = 3;
    private int expectedPrice_;
    /**
     * <code>uint32 expected_price = 3;</code>
     * @return The expectedPrice.
     */
    @java.lang.Override
    public int getExpectedPrice() {
      return expectedPrice_;
    }

    public static final int CUR_MOOD_FIELD_NUMBER = 14;
    private int curMood_;
    /**
     * <code>int32 cur_mood = 14;</code>
     * @return The curMood.
     */
    @java.lang.Override
    public int getCurMood() {
      return curMood_;
    }

    public static final int PRICE_LOW_LIMIT_FIELD_NUMBER = 2;
    private int priceLowLimit_;
    /**
     * <code>uint32 price_low_limit = 2;</code>
     * @return The priceLowLimit.
     */
    @java.lang.Override
    public int getPriceLowLimit() {
      return priceLowLimit_;
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 5;
    private int bargainId_;
    /**
     * <code>uint32 bargain_id = 5;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
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
      if (priceLowLimit_ != 0) {
        output.writeUInt32(2, priceLowLimit_);
      }
      if (expectedPrice_ != 0) {
        output.writeUInt32(3, expectedPrice_);
      }
      if (bargainId_ != 0) {
        output.writeUInt32(5, bargainId_);
      }
      if (curMood_ != 0) {
        output.writeInt32(14, curMood_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (priceLowLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, priceLowLimit_);
      }
      if (expectedPrice_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, expectedPrice_);
      }
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bargainId_);
      }
      if (curMood_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, curMood_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot other = (emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot) obj;

      if (getExpectedPrice()
          != other.getExpectedPrice()) return false;
      if (getCurMood()
          != other.getCurMood()) return false;
      if (getPriceLowLimit()
          != other.getPriceLowLimit()) return false;
      if (getBargainId()
          != other.getBargainId()) return false;
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
      hash = (37 * hash) + EXPECTED_PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getExpectedPrice();
      hash = (37 * hash) + CUR_MOOD_FIELD_NUMBER;
      hash = (53 * hash) + getCurMood();
      hash = (37 * hash) + PRICE_LOW_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getPriceLowLimit();
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot prototype) {
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
     * Protobuf type {@code BargainSnapshot}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainSnapshot)
        emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.class, emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        expectedPrice_ = 0;

        curMood_ = 0;

        priceLowLimit_ = 0;

        bargainId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.internal_static_BargainSnapshot_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot build() {
        emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot buildPartial() {
        emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot result = new emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot(this);
        result.expectedPrice_ = expectedPrice_;
        result.curMood_ = curMood_;
        result.priceLowLimit_ = priceLowLimit_;
        result.bargainId_ = bargainId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot) {
          return mergeFrom((emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot other) {
        if (other == emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance()) return this;
        if (other.getExpectedPrice() != 0) {
          setExpectedPrice(other.getExpectedPrice());
        }
        if (other.getCurMood() != 0) {
          setCurMood(other.getCurMood());
        }
        if (other.getPriceLowLimit() != 0) {
          setPriceLowLimit(other.getPriceLowLimit());
        }
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
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
                priceLowLimit_ = input.readUInt32();

                break;
              } // case 16
              case 24: {
                expectedPrice_ = input.readUInt32();

                break;
              } // case 24
              case 40: {
                bargainId_ = input.readUInt32();

                break;
              } // case 40
              case 112: {
                curMood_ = input.readInt32();

                break;
              } // case 112
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

      private int expectedPrice_ ;
      /**
       * <code>uint32 expected_price = 3;</code>
       * @return The expectedPrice.
       */
      @java.lang.Override
      public int getExpectedPrice() {
        return expectedPrice_;
      }
      /**
       * <code>uint32 expected_price = 3;</code>
       * @param value The expectedPrice to set.
       * @return This builder for chaining.
       */
      public Builder setExpectedPrice(int value) {
        
        expectedPrice_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 expected_price = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpectedPrice() {
        
        expectedPrice_ = 0;
        onChanged();
        return this;
      }

      private int curMood_ ;
      /**
       * <code>int32 cur_mood = 14;</code>
       * @return The curMood.
       */
      @java.lang.Override
      public int getCurMood() {
        return curMood_;
      }
      /**
       * <code>int32 cur_mood = 14;</code>
       * @param value The curMood to set.
       * @return This builder for chaining.
       */
      public Builder setCurMood(int value) {
        
        curMood_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cur_mood = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurMood() {
        
        curMood_ = 0;
        onChanged();
        return this;
      }

      private int priceLowLimit_ ;
      /**
       * <code>uint32 price_low_limit = 2;</code>
       * @return The priceLowLimit.
       */
      @java.lang.Override
      public int getPriceLowLimit() {
        return priceLowLimit_;
      }
      /**
       * <code>uint32 price_low_limit = 2;</code>
       * @param value The priceLowLimit to set.
       * @return This builder for chaining.
       */
      public Builder setPriceLowLimit(int value) {
        
        priceLowLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 price_low_limit = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceLowLimit() {
        
        priceLowLimit_ = 0;
        onChanged();
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 5;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 5;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainSnapshot)
    }

    // @@protoc_insertion_point(class_scope:BargainSnapshot)
    private static final emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot();
    }

    public static emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainSnapshot>
        PARSER = new com.google.protobuf.AbstractParser<BargainSnapshot>() {
      @java.lang.Override
      public BargainSnapshot parsePartialFrom(
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

    public static com.google.protobuf.Parser<BargainSnapshot> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainSnapshot> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.BargainSnapshotOuterClass.BargainSnapshot getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainSnapshot_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainSnapshot_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BargainSnapshot.proto\"h\n\017BargainSnapsh" +
      "ot\022\026\n\016expected_price\030\003 \001(\r\022\020\n\010cur_mood\030\016" +
      " \001(\005\022\027\n\017price_low_limit\030\002 \001(\r\022\022\n\nbargain" +
      "_id\030\005 \001(\rB\036\n\034emu.grasscutter.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BargainSnapshot_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainSnapshot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainSnapshot_descriptor,
        new java.lang.String[] { "ExpectedPrice", "CurMood", "PriceLowLimit", "BargainId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
