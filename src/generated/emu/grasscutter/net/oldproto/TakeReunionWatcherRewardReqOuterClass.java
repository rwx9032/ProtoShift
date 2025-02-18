// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeReunionWatcherRewardReq.proto

package emu.grasscutter.net.oldproto;

public final class TakeReunionWatcherRewardReqOuterClass {
  private TakeReunionWatcherRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeReunionWatcherRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeReunionWatcherRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 watcher_id = 12;</code>
     * @return The watcherId.
     */
    int getWatcherId();

    /**
     * <code>uint32 mission_id = 15;</code>
     * @return The missionId.
     */
    int getMissionId();
  }
  /**
   * <pre>
   * CmdId: 5070
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeReunionWatcherRewardReq}
   */
  public static final class TakeReunionWatcherRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeReunionWatcherRewardReq)
      TakeReunionWatcherRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeReunionWatcherRewardReq.newBuilder() to construct.
    private TakeReunionWatcherRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeReunionWatcherRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeReunionWatcherRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.internal_static_TakeReunionWatcherRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.internal_static_TakeReunionWatcherRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.class, emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.Builder.class);
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 12;
    private int watcherId_;
    /**
     * <code>uint32 watcher_id = 12;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
    }

    public static final int MISSION_ID_FIELD_NUMBER = 15;
    private int missionId_;
    /**
     * <code>uint32 mission_id = 15;</code>
     * @return The missionId.
     */
    @java.lang.Override
    public int getMissionId() {
      return missionId_;
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
      if (watcherId_ != 0) {
        output.writeUInt32(12, watcherId_);
      }
      if (missionId_ != 0) {
        output.writeUInt32(15, missionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, watcherId_);
      }
      if (missionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, missionId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq other = (emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq) obj;

      if (getWatcherId()
          != other.getWatcherId()) return false;
      if (getMissionId()
          != other.getMissionId()) return false;
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
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (37 * hash) + MISSION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMissionId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq prototype) {
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
     * CmdId: 5070
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeReunionWatcherRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeReunionWatcherRewardReq)
        emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.internal_static_TakeReunionWatcherRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.internal_static_TakeReunionWatcherRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.class, emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        watcherId_ = 0;

        missionId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.internal_static_TakeReunionWatcherRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq build() {
        emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq buildPartial() {
        emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq result = new emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq(this);
        result.watcherId_ = watcherId_;
        result.missionId_ = missionId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq other) {
        if (other == emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq.getDefaultInstance()) return this;
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
        }
        if (other.getMissionId() != 0) {
          setMissionId(other.getMissionId());
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
              case 96: {
                watcherId_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                missionId_ = input.readUInt32();

                break;
              } // case 120
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

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        
        watcherId_ = 0;
        onChanged();
        return this;
      }

      private int missionId_ ;
      /**
       * <code>uint32 mission_id = 15;</code>
       * @return The missionId.
       */
      @java.lang.Override
      public int getMissionId() {
        return missionId_;
      }
      /**
       * <code>uint32 mission_id = 15;</code>
       * @param value The missionId to set.
       * @return This builder for chaining.
       */
      public Builder setMissionId(int value) {
        
        missionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mission_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMissionId() {
        
        missionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeReunionWatcherRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeReunionWatcherRewardReq)
    private static final emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq();
    }

    public static emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeReunionWatcherRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeReunionWatcherRewardReq>() {
      @java.lang.Override
      public TakeReunionWatcherRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeReunionWatcherRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeReunionWatcherRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TakeReunionWatcherRewardReqOuterClass.TakeReunionWatcherRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeReunionWatcherRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeReunionWatcherRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TakeReunionWatcherRewardReq.proto\"E\n\033T" +
      "akeReunionWatcherRewardReq\022\022\n\nwatcher_id" +
      "\030\014 \001(\r\022\022\n\nmission_id\030\017 \001(\rB\036\n\034emu.grassc" +
      "utter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeReunionWatcherRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeReunionWatcherRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeReunionWatcherRewardReq_descriptor,
        new java.lang.String[] { "WatcherId", "MissionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
