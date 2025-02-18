// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSatiationData.proto

package emu.grasscutter.net.oldproto;

public final class AvatarSatiationDataOuterClass {
  private AvatarSatiationDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSatiationDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSatiationData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float finish_time = 14;</code>
     * @return The finishTime.
     */
    float getFinishTime();

    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>float penalty_finish_time = 12;</code>
     * @return The penaltyFinishTime.
     */
    float getPenaltyFinishTime();
  }
  /**
   * Protobuf type {@code AvatarSatiationData}
   */
  public static final class AvatarSatiationData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSatiationData)
      AvatarSatiationDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSatiationData.newBuilder() to construct.
    private AvatarSatiationData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSatiationData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSatiationData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.internal_static_AvatarSatiationData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.internal_static_AvatarSatiationData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.class, emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder.class);
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 14;
    private float finishTime_;
    /**
     * <code>float finish_time = 14;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public float getFinishTime() {
      return finishTime_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 13;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int PENALTY_FINISH_TIME_FIELD_NUMBER = 12;
    private float penaltyFinishTime_;
    /**
     * <code>float penalty_finish_time = 12;</code>
     * @return The penaltyFinishTime.
     */
    @java.lang.Override
    public float getPenaltyFinishTime() {
      return penaltyFinishTime_;
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
      if (java.lang.Float.floatToRawIntBits(penaltyFinishTime_) != 0) {
        output.writeFloat(12, penaltyFinishTime_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(13, avatarGuid_);
      }
      if (java.lang.Float.floatToRawIntBits(finishTime_) != 0) {
        output.writeFloat(14, finishTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(penaltyFinishTime_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(12, penaltyFinishTime_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, avatarGuid_);
      }
      if (java.lang.Float.floatToRawIntBits(finishTime_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, finishTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData other = (emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData) obj;

      if (java.lang.Float.floatToIntBits(getFinishTime())
          != java.lang.Float.floatToIntBits(
              other.getFinishTime())) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (java.lang.Float.floatToIntBits(getPenaltyFinishTime())
          != java.lang.Float.floatToIntBits(
              other.getPenaltyFinishTime())) return false;
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
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFinishTime());
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + PENALTY_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getPenaltyFinishTime());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData prototype) {
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
     * Protobuf type {@code AvatarSatiationData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSatiationData)
        emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.internal_static_AvatarSatiationData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.internal_static_AvatarSatiationData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.class, emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishTime_ = 0F;

        avatarGuid_ = 0L;

        penaltyFinishTime_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.internal_static_AvatarSatiationData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData build() {
        emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData buildPartial() {
        emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData result = new emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData(this);
        result.finishTime_ = finishTime_;
        result.avatarGuid_ = avatarGuid_;
        result.penaltyFinishTime_ = penaltyFinishTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData) {
          return mergeFrom((emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData other) {
        if (other == emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData.getDefaultInstance()) return this;
        if (other.getFinishTime() != 0F) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getPenaltyFinishTime() != 0F) {
          setPenaltyFinishTime(other.getPenaltyFinishTime());
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
              case 101: {
                penaltyFinishTime_ = input.readFloat();

                break;
              } // case 101
              case 104: {
                avatarGuid_ = input.readUInt64();

                break;
              } // case 104
              case 117: {
                finishTime_ = input.readFloat();

                break;
              } // case 117
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

      private float finishTime_ ;
      /**
       * <code>float finish_time = 14;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public float getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>float finish_time = 14;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(float value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float finish_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0F;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private float penaltyFinishTime_ ;
      /**
       * <code>float penalty_finish_time = 12;</code>
       * @return The penaltyFinishTime.
       */
      @java.lang.Override
      public float getPenaltyFinishTime() {
        return penaltyFinishTime_;
      }
      /**
       * <code>float penalty_finish_time = 12;</code>
       * @param value The penaltyFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setPenaltyFinishTime(float value) {
        
        penaltyFinishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float penalty_finish_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPenaltyFinishTime() {
        
        penaltyFinishTime_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AvatarSatiationData)
    }

    // @@protoc_insertion_point(class_scope:AvatarSatiationData)
    private static final emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData();
    }

    public static emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSatiationData>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSatiationData>() {
      @java.lang.Override
      public AvatarSatiationData parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarSatiationData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSatiationData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AvatarSatiationDataOuterClass.AvatarSatiationData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSatiationData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSatiationData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AvatarSatiationData.proto\"\\\n\023AvatarSat" +
      "iationData\022\023\n\013finish_time\030\016 \001(\002\022\023\n\013avata" +
      "r_guid\030\r \001(\004\022\033\n\023penalty_finish_time\030\014 \001(" +
      "\002B\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSatiationData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSatiationData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSatiationData_descriptor,
        new java.lang.String[] { "FinishTime", "AvatarGuid", "PenaltyFinishTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
