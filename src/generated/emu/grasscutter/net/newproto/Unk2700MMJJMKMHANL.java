// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MMJJMKMHANL.proto

package emu.grasscutter.net.newproto;

public final class Unk2700MMJJMKMHANL {
  private Unk2700MMJJMKMHANL() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MMJJMKMHANLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MMJJMKMHANL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 Unk2700_FMOFEBIAOFO = 10;</code>
     * @return The unk2700FMOFEBIAOFO.
     */
    int getUnk2700FMOFEBIAOFO();
  }
  /**
   * Protobuf type {@code Unk2700_MMJJMKMHANL}
   */
  public static final class Unk2700_MMJJMKMHANL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MMJJMKMHANL)
      Unk2700_MMJJMKMHANLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MMJJMKMHANL.newBuilder() to construct.
    private Unk2700_MMJJMKMHANL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MMJJMKMHANL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MMJJMKMHANL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.internal_static_Unk2700_MMJJMKMHANL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.internal_static_Unk2700_MMJJMKMHANL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.class, emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 5;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int UNK2700_FMOFEBIAOFO_FIELD_NUMBER = 10;
    private int unk2700FMOFEBIAOFO_;
    /**
     * <code>uint32 Unk2700_FMOFEBIAOFO = 10;</code>
     * @return The unk2700FMOFEBIAOFO.
     */
    @java.lang.Override
    public int getUnk2700FMOFEBIAOFO() {
      return unk2700FMOFEBIAOFO_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(5, dungeonId_);
      }
      if (unk2700FMOFEBIAOFO_ != 0) {
        output.writeUInt32(10, unk2700FMOFEBIAOFO_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dungeonId_);
      }
      if (unk2700FMOFEBIAOFO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk2700FMOFEBIAOFO_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL other = (emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getUnk2700FMOFEBIAOFO()
          != other.getUnk2700FMOFEBIAOFO()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + UNK2700_FMOFEBIAOFO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700FMOFEBIAOFO();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL prototype) {
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
     * Protobuf type {@code Unk2700_MMJJMKMHANL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MMJJMKMHANL)
        emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.internal_static_Unk2700_MMJJMKMHANL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.internal_static_Unk2700_MMJJMKMHANL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.class, emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        unk2700FMOFEBIAOFO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.internal_static_Unk2700_MMJJMKMHANL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL build() {
        emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL buildPartial() {
        emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL result = new emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL(this);
        result.dungeonId_ = dungeonId_;
        result.unk2700FMOFEBIAOFO_ = unk2700FMOFEBIAOFO_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL other) {
        if (other == emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getUnk2700FMOFEBIAOFO() != 0) {
          setUnk2700FMOFEBIAOFO(other.getUnk2700FMOFEBIAOFO());
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
              case 40: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 40
              case 80: {
                unk2700FMOFEBIAOFO_ = input.readUInt32();

                break;
              } // case 80
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int unk2700FMOFEBIAOFO_ ;
      /**
       * <code>uint32 Unk2700_FMOFEBIAOFO = 10;</code>
       * @return The unk2700FMOFEBIAOFO.
       */
      @java.lang.Override
      public int getUnk2700FMOFEBIAOFO() {
        return unk2700FMOFEBIAOFO_;
      }
      /**
       * <code>uint32 Unk2700_FMOFEBIAOFO = 10;</code>
       * @param value The unk2700FMOFEBIAOFO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700FMOFEBIAOFO(int value) {
        
        unk2700FMOFEBIAOFO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_FMOFEBIAOFO = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700FMOFEBIAOFO() {
        
        unk2700FMOFEBIAOFO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MMJJMKMHANL)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MMJJMKMHANL)
    private static final emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL();
    }

    public static emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MMJJMKMHANL>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MMJJMKMHANL>() {
      @java.lang.Override
      public Unk2700_MMJJMKMHANL parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_MMJJMKMHANL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MMJJMKMHANL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700MMJJMKMHANL.Unk2700_MMJJMKMHANL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MMJJMKMHANL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MMJJMKMHANL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_MMJJMKMHANL.proto\"F\n\023Unk2700_M" +
      "MJJMKMHANL\022\022\n\ndungeon_id\030\005 \001(\r\022\033\n\023Unk270" +
      "0_FMOFEBIAOFO\030\n \001(\rB\036\n\034emu.grasscutter.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_MMJJMKMHANL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MMJJMKMHANL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MMJJMKMHANL_descriptor,
        new java.lang.String[] { "DungeonId", "Unk2700FMOFEBIAOFO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
