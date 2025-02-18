// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemoveRandTaskInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class RemoveRandTaskInfoNotifyOuterClass {
  private RemoveRandTaskInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RemoveRandTaskInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RemoveRandTaskInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_succ = 9;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
     * @return The reason.
     */
    emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason getReason();

    /**
     * <code>uint32 rand_task_id = 13;</code>
     * @return The randTaskId.
     */
    int getRandTaskId();
  }
  /**
   * <pre>
   * CmdId: 161
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RemoveRandTaskInfoNotify}
   */
  public static final class RemoveRandTaskInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RemoveRandTaskInfoNotify)
      RemoveRandTaskInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveRandTaskInfoNotify.newBuilder() to construct.
    private RemoveRandTaskInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveRandTaskInfoNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RemoveRandTaskInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.class, emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code RemoveRandTaskInfoNotify.FinishReason}
     */
    public enum FinishReason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>FINISH_REASON_DEFAULT = 0;</code>
       */
      FINISH_REASON_DEFAULT(0),
      /**
       * <code>FINISH_REASON_CLEAR = 1;</code>
       */
      FINISH_REASON_CLEAR(1),
      /**
       * <code>FINISH_REASON_DISTANCE = 2;</code>
       */
      FINISH_REASON_DISTANCE(2),
      /**
       * <code>FINISH_REASON_FINISH = 3;</code>
       */
      FINISH_REASON_FINISH(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>FINISH_REASON_DEFAULT = 0;</code>
       */
      public static final int FINISH_REASON_DEFAULT_VALUE = 0;
      /**
       * <code>FINISH_REASON_CLEAR = 1;</code>
       */
      public static final int FINISH_REASON_CLEAR_VALUE = 1;
      /**
       * <code>FINISH_REASON_DISTANCE = 2;</code>
       */
      public static final int FINISH_REASON_DISTANCE_VALUE = 2;
      /**
       * <code>FINISH_REASON_FINISH = 3;</code>
       */
      public static final int FINISH_REASON_FINISH_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static FinishReason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FinishReason forNumber(int value) {
        switch (value) {
          case 0: return FINISH_REASON_DEFAULT;
          case 1: return FINISH_REASON_CLEAR;
          case 2: return FINISH_REASON_DISTANCE;
          case 3: return FINISH_REASON_FINISH;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FinishReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FinishReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FinishReason>() {
              public FinishReason findValueByNumber(int number) {
                return FinishReason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final FinishReason[] VALUES = values();

      public static FinishReason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private FinishReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RemoveRandTaskInfoNotify.FinishReason)
    }

    public static final int IS_SUCC_FIELD_NUMBER = 9;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 9;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int REASON_FIELD_NUMBER = 10;
    private int reason_;
    /**
     * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason result = emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.UNRECOGNIZED : result;
    }

    public static final int RAND_TASK_ID_FIELD_NUMBER = 13;
    private int randTaskId_;
    /**
     * <code>uint32 rand_task_id = 13;</code>
     * @return The randTaskId.
     */
    @java.lang.Override
    public int getRandTaskId() {
      return randTaskId_;
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
      if (isSucc_ != false) {
        output.writeBool(9, isSucc_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.FINISH_REASON_DEFAULT.getNumber()) {
        output.writeEnum(10, reason_);
      }
      if (randTaskId_ != 0) {
        output.writeUInt32(13, randTaskId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isSucc_);
      }
      if (reason_ != emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.FINISH_REASON_DEFAULT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, reason_);
      }
      if (randTaskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, randTaskId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify other = (emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify) obj;

      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (reason_ != other.reason_) return false;
      if (getRandTaskId()
          != other.getRandTaskId()) return false;
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
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + RAND_TASK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRandTaskId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify prototype) {
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
     * CmdId: 161
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RemoveRandTaskInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RemoveRandTaskInfoNotify)
        emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.class, emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isSucc_ = false;

        reason_ = 0;

        randTaskId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.internal_static_RemoveRandTaskInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify build() {
        emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify result = new emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify(this);
        result.isSucc_ = isSucc_;
        result.reason_ = reason_;
        result.randTaskId_ = randTaskId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.getDefaultInstance()) return this;
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getRandTaskId() != 0) {
          setRandTaskId(other.getRandTaskId());
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
                isSucc_ = input.readBool();

                break;
              } // case 72
              case 80: {
                reason_ = input.readEnum();

                break;
              } // case 80
              case 104: {
                randTaskId_ = input.readUInt32();

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

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 9;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 9;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason result = emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify.FinishReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RemoveRandTaskInfoNotify.FinishReason reason = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int randTaskId_ ;
      /**
       * <code>uint32 rand_task_id = 13;</code>
       * @return The randTaskId.
       */
      @java.lang.Override
      public int getRandTaskId() {
        return randTaskId_;
      }
      /**
       * <code>uint32 rand_task_id = 13;</code>
       * @param value The randTaskId to set.
       * @return This builder for chaining.
       */
      public Builder setRandTaskId(int value) {
        
        randTaskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rand_task_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandTaskId() {
        
        randTaskId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RemoveRandTaskInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:RemoveRandTaskInfoNotify)
    private static final emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RemoveRandTaskInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<RemoveRandTaskInfoNotify>() {
      @java.lang.Override
      public RemoveRandTaskInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RemoveRandTaskInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveRandTaskInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RemoveRandTaskInfoNotifyOuterClass.RemoveRandTaskInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveRandTaskInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RemoveRandTaskInfoNotify.proto\"\363\001\n\030Rem" +
      "oveRandTaskInfoNotify\022\017\n\007is_succ\030\t \001(\010\0226" +
      "\n\006reason\030\n \001(\0162&.RemoveRandTaskInfoNotif" +
      "y.FinishReason\022\024\n\014rand_task_id\030\r \001(\r\"x\n\014" +
      "FinishReason\022\031\n\025FINISH_REASON_DEFAULT\020\000\022" +
      "\027\n\023FINISH_REASON_CLEAR\020\001\022\032\n\026FINISH_REASO" +
      "N_DISTANCE\020\002\022\030\n\024FINISH_REASON_FINISH\020\003B\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RemoveRandTaskInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RemoveRandTaskInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveRandTaskInfoNotify_descriptor,
        new java.lang.String[] { "IsSucc", "Reason", "RandTaskId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
