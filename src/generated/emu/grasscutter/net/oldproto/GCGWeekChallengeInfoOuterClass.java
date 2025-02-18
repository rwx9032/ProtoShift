// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGWeekChallengeInfo.proto

package emu.grasscutter.net.oldproto;

public final class GCGWeekChallengeInfoOuterClass {
  private GCGWeekChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGWeekChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGWeekChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_id = 4;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 unlock_time = 1;</code>
     * @return The unlockTime.
     */
    int getUnlockTime();
  }
  /**
   * Protobuf type {@code GCGWeekChallengeInfo}
   */
  public static final class GCGWeekChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGWeekChallengeInfo)
      GCGWeekChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGWeekChallengeInfo.newBuilder() to construct.
    private GCGWeekChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGWeekChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGWeekChallengeInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.internal_static_GCGWeekChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.internal_static_GCGWeekChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.class, emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.Builder.class);
    }

    public static final int NPC_ID_FIELD_NUMBER = 4;
    private int npcId_;
    /**
     * <code>uint32 npc_id = 4;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 7;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 7;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int UNLOCK_TIME_FIELD_NUMBER = 1;
    private int unlockTime_;
    /**
     * <code>uint32 unlock_time = 1;</code>
     * @return The unlockTime.
     */
    @java.lang.Override
    public int getUnlockTime() {
      return unlockTime_;
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
      if (unlockTime_ != 0) {
        output.writeUInt32(1, unlockTime_);
      }
      if (npcId_ != 0) {
        output.writeUInt32(4, npcId_);
      }
      if (isFinished_ != false) {
        output.writeBool(7, isFinished_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unlockTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unlockTime_);
      }
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, npcId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isFinished_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo other = (emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo) obj;

      if (getNpcId()
          != other.getNpcId()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getUnlockTime()
          != other.getUnlockTime()) return false;
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
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + UNLOCK_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUnlockTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo prototype) {
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
     * Protobuf type {@code GCGWeekChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGWeekChallengeInfo)
        emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.internal_static_GCGWeekChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.internal_static_GCGWeekChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.class, emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        npcId_ = 0;

        isFinished_ = false;

        unlockTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.internal_static_GCGWeekChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo build() {
        emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo buildPartial() {
        emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo result = new emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo(this);
        result.npcId_ = npcId_;
        result.isFinished_ = isFinished_;
        result.unlockTime_ = unlockTime_;
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo other) {
        if (other == emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo.getDefaultInstance()) return this;
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getUnlockTime() != 0) {
          setUnlockTime(other.getUnlockTime());
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
                unlockTime_ = input.readUInt32();

                break;
              } // case 8
              case 32: {
                npcId_ = input.readUInt32();

                break;
              } // case 32
              case 56: {
                isFinished_ = input.readBool();

                break;
              } // case 56
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

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 4;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 4;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        
        npcId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 7;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int unlockTime_ ;
      /**
       * <code>uint32 unlock_time = 1;</code>
       * @return The unlockTime.
       */
      @java.lang.Override
      public int getUnlockTime() {
        return unlockTime_;
      }
      /**
       * <code>uint32 unlock_time = 1;</code>
       * @param value The unlockTime to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockTime(int value) {
        
        unlockTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 unlock_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockTime() {
        
        unlockTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGWeekChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGWeekChallengeInfo)
    private static final emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo();
    }

    public static emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGWeekChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGWeekChallengeInfo>() {
      @java.lang.Override
      public GCGWeekChallengeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGWeekChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGWeekChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGWeekChallengeInfoOuterClass.GCGWeekChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGWeekChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGWeekChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGWeekChallengeInfo.proto\"P\n\024GCGWeekC" +
      "hallengeInfo\022\016\n\006npc_id\030\004 \001(\r\022\023\n\013is_finis" +
      "hed\030\007 \001(\010\022\023\n\013unlock_time\030\001 \001(\rB\036\n\034emu.gr" +
      "asscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGWeekChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGWeekChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGWeekChallengeInfo_descriptor,
        new java.lang.String[] { "NpcId", "IsFinished", "UnlockTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
