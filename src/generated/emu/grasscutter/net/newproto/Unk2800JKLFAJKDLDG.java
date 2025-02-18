// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_JKLFAJKDLDG.proto

package emu.grasscutter.net.newproto;

public final class Unk2800JKLFAJKDLDG {
  private Unk2800JKLFAJKDLDG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_JKLFAJKDLDGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_JKLFAJKDLDG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 10;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 quest_id = 15;</code>
     * @return The questId.
     */
    int getQuestId();
  }
  /**
   * Protobuf type {@code Unk2800_JKLFAJKDLDG}
   */
  public static final class Unk2800_JKLFAJKDLDG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_JKLFAJKDLDG)
      Unk2800_JKLFAJKDLDGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_JKLFAJKDLDG.newBuilder() to construct.
    private Unk2800_JKLFAJKDLDG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_JKLFAJKDLDG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_JKLFAJKDLDG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.class, emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 10;
    private int pointId_;
    /**
     * <code>uint32 point_id = 10;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int QUEST_ID_FIELD_NUMBER = 15;
    private int questId_;
    /**
     * <code>uint32 quest_id = 15;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(10, pointId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(15, questId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, pointId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, questId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG other = (emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG prototype) {
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
     * Protobuf type {@code Unk2800_JKLFAJKDLDG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_JKLFAJKDLDG)
        emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.class, emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pointId_ = 0;

        questId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG build() {
        emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG buildPartial() {
        emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG result = new emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG(this);
        result.pointId_ = pointId_;
        result.questId_ = questId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG other) {
        if (other == emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
                pointId_ = input.readUInt32();

                break;
              } // case 80
              case 120: {
                questId_ = input.readUInt32();

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

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 10;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 10;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 15;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 15;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_JKLFAJKDLDG)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_JKLFAJKDLDG)
    private static final emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG();
    }

    public static emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_JKLFAJKDLDG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_JKLFAJKDLDG>() {
      @java.lang.Override
      public Unk2800_JKLFAJKDLDG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_JKLFAJKDLDG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_JKLFAJKDLDG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800JKLFAJKDLDG.Unk2800_JKLFAJKDLDG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_JKLFAJKDLDG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_JKLFAJKDLDG.proto\"9\n\023Unk2800_J" +
      "KLFAJKDLDG\022\020\n\010point_id\030\n \001(\r\022\020\n\010quest_id" +
      "\030\017 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_JKLFAJKDLDG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_JKLFAJKDLDG_descriptor,
        new java.lang.String[] { "PointId", "QuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
