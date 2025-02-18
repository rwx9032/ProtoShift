// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestVarOp.proto

package emu.grasscutter.net.newproto;

public final class QuestVarOpOuterClass {
  private QuestVarOpOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestVarOpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestVarOp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 9;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>bool is_add = 3;</code>
     * @return The isAdd.
     */
    boolean getIsAdd();

    /**
     * <code>int32 value = 8;</code>
     * @return The value.
     */
    int getValue();
  }
  /**
   * Protobuf type {@code QuestVarOp}
   */
  public static final class QuestVarOp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestVarOp)
      QuestVarOpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestVarOp.newBuilder() to construct.
    private QuestVarOp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestVarOp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestVarOp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.QuestVarOpOuterClass.internal_static_QuestVarOp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.class, emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 9;
    private int index_;
    /**
     * <code>uint32 index = 9;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int IS_ADD_FIELD_NUMBER = 3;
    private boolean isAdd_;
    /**
     * <code>bool is_add = 3;</code>
     * @return The isAdd.
     */
    @java.lang.Override
    public boolean getIsAdd() {
      return isAdd_;
    }

    public static final int VALUE_FIELD_NUMBER = 8;
    private int value_;
    /**
     * <code>int32 value = 8;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
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
      if (isAdd_ != false) {
        output.writeBool(3, isAdd_);
      }
      if (value_ != 0) {
        output.writeInt32(8, value_);
      }
      if (index_ != 0) {
        output.writeUInt32(9, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAdd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isAdd_);
      }
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, value_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, index_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp other = (emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getIsAdd()
          != other.getIsAdd()) return false;
      if (getValue()
          != other.getValue()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAdd());
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp prototype) {
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
     * Protobuf type {@code QuestVarOp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestVarOp)
        emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.QuestVarOpOuterClass.internal_static_QuestVarOp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.class, emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        index_ = 0;

        isAdd_ = false;

        value_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.QuestVarOpOuterClass.internal_static_QuestVarOp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp build() {
        emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp buildPartial() {
        emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp result = new emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp(this);
        result.index_ = index_;
        result.isAdd_ = isAdd_;
        result.value_ = value_;
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
        if (other instanceof emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp) {
          return mergeFrom((emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp other) {
        if (other == emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getIsAdd() != false) {
          setIsAdd(other.getIsAdd());
        }
        if (other.getValue() != 0) {
          setValue(other.getValue());
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
              case 24: {
                isAdd_ = input.readBool();

                break;
              } // case 24
              case 64: {
                value_ = input.readInt32();

                break;
              } // case 64
              case 72: {
                index_ = input.readUInt32();

                break;
              } // case 72
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

      private int index_ ;
      /**
       * <code>uint32 index = 9;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 9;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private boolean isAdd_ ;
      /**
       * <code>bool is_add = 3;</code>
       * @return The isAdd.
       */
      @java.lang.Override
      public boolean getIsAdd() {
        return isAdd_;
      }
      /**
       * <code>bool is_add = 3;</code>
       * @param value The isAdd to set.
       * @return This builder for chaining.
       */
      public Builder setIsAdd(boolean value) {
        
        isAdd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_add = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAdd() {
        
        isAdd_ = false;
        onChanged();
        return this;
      }

      private int value_ ;
      /**
       * <code>int32 value = 8;</code>
       * @return The value.
       */
      @java.lang.Override
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 8;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(int value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        
        value_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestVarOp)
    }

    // @@protoc_insertion_point(class_scope:QuestVarOp)
    private static final emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp();
    }

    public static emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestVarOp>
        PARSER = new com.google.protobuf.AbstractParser<QuestVarOp>() {
      @java.lang.Override
      public QuestVarOp parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestVarOp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestVarOp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestVarOpOuterClass.QuestVarOp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestVarOp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestVarOp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020QuestVarOp.proto\":\n\nQuestVarOp\022\r\n\005inde" +
      "x\030\t \001(\r\022\016\n\006is_add\030\003 \001(\010\022\r\n\005value\030\010 \001(\005B\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestVarOp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestVarOp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestVarOp_descriptor,
        new java.lang.String[] { "Index", "IsAdd", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
