// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryFlowerCatchNotify.proto

package emu.grasscutter.net.newproto;

public final class GalleryFlowerCatchNotifyOuterClass {
  private GalleryFlowerCatchNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryFlowerCatchNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryFlowerCatchNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 cur_score = 2;</code>
     * @return The curScore.
     */
    int getCurScore();

    /**
     * <code>uint32 add_score = 12;</code>
     * @return The addScore.
     */
    int getAddScore();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5578;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GalleryFlowerCatchNotify}
   */
  public static final class GalleryFlowerCatchNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryFlowerCatchNotify)
      GalleryFlowerCatchNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryFlowerCatchNotify.newBuilder() to construct.
    private GalleryFlowerCatchNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryFlowerCatchNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryFlowerCatchNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.internal_static_GalleryFlowerCatchNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.internal_static_GalleryFlowerCatchNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.class, emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 13;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 2;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 2;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }

    public static final int ADD_SCORE_FIELD_NUMBER = 12;
    private int addScore_;
    /**
     * <code>uint32 add_score = 12;</code>
     * @return The addScore.
     */
    @java.lang.Override
    public int getAddScore() {
      return addScore_;
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
      if (curScore_ != 0) {
        output.writeUInt32(2, curScore_);
      }
      if (addScore_ != 0) {
        output.writeUInt32(12, addScore_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(13, galleryId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, curScore_);
      }
      if (addScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, addScore_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify other = (emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
      if (getAddScore()
          != other.getAddScore()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (37 * hash) + ADD_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getAddScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 5578;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GalleryFlowerCatchNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryFlowerCatchNotify)
        emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.internal_static_GalleryFlowerCatchNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.internal_static_GalleryFlowerCatchNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.class, emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        galleryId_ = 0;

        curScore_ = 0;

        addScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.internal_static_GalleryFlowerCatchNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify build() {
        emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify buildPartial() {
        emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify result = new emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify(this);
        result.galleryId_ = galleryId_;
        result.curScore_ = curScore_;
        result.addScore_ = addScore_;
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
        if (other instanceof emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify other) {
        if (other == emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
        }
        if (other.getAddScore() != 0) {
          setAddScore(other.getAddScore());
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
                curScore_ = input.readUInt32();

                break;
              } // case 16
              case 96: {
                addScore_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                galleryId_ = input.readUInt32();

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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 2;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 2;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
        onChanged();
        return this;
      }

      private int addScore_ ;
      /**
       * <code>uint32 add_score = 12;</code>
       * @return The addScore.
       */
      @java.lang.Override
      public int getAddScore() {
        return addScore_;
      }
      /**
       * <code>uint32 add_score = 12;</code>
       * @param value The addScore to set.
       * @return This builder for chaining.
       */
      public Builder setAddScore(int value) {
        
        addScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddScore() {
        
        addScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryFlowerCatchNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryFlowerCatchNotify)
    private static final emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify();
    }

    public static emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryFlowerCatchNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryFlowerCatchNotify>() {
      @java.lang.Override
      public GalleryFlowerCatchNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryFlowerCatchNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryFlowerCatchNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GalleryFlowerCatchNotifyOuterClass.GalleryFlowerCatchNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryFlowerCatchNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryFlowerCatchNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GalleryFlowerCatchNotify.proto\"T\n\030Gall" +
      "eryFlowerCatchNotify\022\022\n\ngallery_id\030\r \001(\r" +
      "\022\021\n\tcur_score\030\002 \001(\r\022\021\n\tadd_score\030\014 \001(\rB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryFlowerCatchNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryFlowerCatchNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryFlowerCatchNotify_descriptor,
        new java.lang.String[] { "GalleryId", "CurScore", "AddScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
