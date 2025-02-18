// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterMonsterDetail.proto

package emu.grasscutter.net.newproto;

public final class FungusFighterMonsterDetailOuterClass {
  private FungusFighterMonsterDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterMonsterDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterMonsterDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float cur_hp_percentage = 9;</code>
     * @return The curHpPercentage.
     */
    float getCurHpPercentage();

    /**
     * <code>bool is_alive = 10;</code>
     * @return The isAlive.
     */
    boolean getIsAlive();

    /**
     * <code>uint32 fungus_id = 13;</code>
     * @return The fungusId.
     */
    int getFungusId();
  }
  /**
   * Protobuf type {@code FungusFighterMonsterDetail}
   */
  public static final class FungusFighterMonsterDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterMonsterDetail)
      FungusFighterMonsterDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterMonsterDetail.newBuilder() to construct.
    private FungusFighterMonsterDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterMonsterDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterMonsterDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.class, emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.Builder.class);
    }

    public static final int CUR_HP_PERCENTAGE_FIELD_NUMBER = 9;
    private float curHpPercentage_;
    /**
     * <code>float cur_hp_percentage = 9;</code>
     * @return The curHpPercentage.
     */
    @java.lang.Override
    public float getCurHpPercentage() {
      return curHpPercentage_;
    }

    public static final int IS_ALIVE_FIELD_NUMBER = 10;
    private boolean isAlive_;
    /**
     * <code>bool is_alive = 10;</code>
     * @return The isAlive.
     */
    @java.lang.Override
    public boolean getIsAlive() {
      return isAlive_;
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 13;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 13;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
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
      if (java.lang.Float.floatToRawIntBits(curHpPercentage_) != 0) {
        output.writeFloat(9, curHpPercentage_);
      }
      if (isAlive_ != false) {
        output.writeBool(10, isAlive_);
      }
      if (fungusId_ != 0) {
        output.writeUInt32(13, fungusId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(curHpPercentage_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, curHpPercentage_);
      }
      if (isAlive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isAlive_);
      }
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, fungusId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail other = (emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail) obj;

      if (java.lang.Float.floatToIntBits(getCurHpPercentage())
          != java.lang.Float.floatToIntBits(
              other.getCurHpPercentage())) return false;
      if (getIsAlive()
          != other.getIsAlive()) return false;
      if (getFungusId()
          != other.getFungusId()) return false;
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
      hash = (37 * hash) + CUR_HP_PERCENTAGE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurHpPercentage());
      hash = (37 * hash) + IS_ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlive());
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail prototype) {
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
     * Protobuf type {@code FungusFighterMonsterDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterMonsterDetail)
        emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.class, emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        curHpPercentage_ = 0F;

        isAlive_ = false;

        fungusId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.internal_static_FungusFighterMonsterDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail build() {
        emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail buildPartial() {
        emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail result = new emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail(this);
        result.curHpPercentage_ = curHpPercentage_;
        result.isAlive_ = isAlive_;
        result.fungusId_ = fungusId_;
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
        if (other instanceof emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail) {
          return mergeFrom((emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail other) {
        if (other == emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail.getDefaultInstance()) return this;
        if (other.getCurHpPercentage() != 0F) {
          setCurHpPercentage(other.getCurHpPercentage());
        }
        if (other.getIsAlive() != false) {
          setIsAlive(other.getIsAlive());
        }
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
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
              case 77: {
                curHpPercentage_ = input.readFloat();

                break;
              } // case 77
              case 80: {
                isAlive_ = input.readBool();

                break;
              } // case 80
              case 104: {
                fungusId_ = input.readUInt32();

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

      private float curHpPercentage_ ;
      /**
       * <code>float cur_hp_percentage = 9;</code>
       * @return The curHpPercentage.
       */
      @java.lang.Override
      public float getCurHpPercentage() {
        return curHpPercentage_;
      }
      /**
       * <code>float cur_hp_percentage = 9;</code>
       * @param value The curHpPercentage to set.
       * @return This builder for chaining.
       */
      public Builder setCurHpPercentage(float value) {
        
        curHpPercentage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_hp_percentage = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurHpPercentage() {
        
        curHpPercentage_ = 0F;
        onChanged();
        return this;
      }

      private boolean isAlive_ ;
      /**
       * <code>bool is_alive = 10;</code>
       * @return The isAlive.
       */
      @java.lang.Override
      public boolean getIsAlive() {
        return isAlive_;
      }
      /**
       * <code>bool is_alive = 10;</code>
       * @param value The isAlive to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlive(boolean value) {
        
        isAlive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_alive = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlive() {
        
        isAlive_ = false;
        onChanged();
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 13;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 13;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FungusFighterMonsterDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterMonsterDetail)
    private static final emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail();
    }

    public static emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterMonsterDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterMonsterDetail>() {
      @java.lang.Override
      public FungusFighterMonsterDetail parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterMonsterDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterMonsterDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.FungusFighterMonsterDetailOuterClass.FungusFighterMonsterDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterMonsterDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterMonsterDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FungusFighterMonsterDetail.proto\"\\\n\032Fu" +
      "ngusFighterMonsterDetail\022\031\n\021cur_hp_perce" +
      "ntage\030\t \001(\002\022\020\n\010is_alive\030\n \001(\010\022\021\n\tfungus_" +
      "id\030\r \001(\rB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterMonsterDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterMonsterDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterMonsterDetail_descriptor,
        new java.lang.String[] { "CurHpPercentage", "IsAlive", "FungusId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
