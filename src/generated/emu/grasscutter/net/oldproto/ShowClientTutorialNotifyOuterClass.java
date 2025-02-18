// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowClientTutorialNotify.proto

package emu.grasscutter.net.oldproto;

public final class ShowClientTutorialNotifyOuterClass {
  private ShowClientTutorialNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowClientTutorialNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowClientTutorialNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 tutorial_id = 2;</code>
     * @return The tutorialId.
     */
    int getTutorialId();
  }
  /**
   * <pre>
   * CmdId: 3305
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ShowClientTutorialNotify}
   */
  public static final class ShowClientTutorialNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowClientTutorialNotify)
      ShowClientTutorialNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowClientTutorialNotify.newBuilder() to construct.
    private ShowClientTutorialNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowClientTutorialNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowClientTutorialNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.internal_static_ShowClientTutorialNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.internal_static_ShowClientTutorialNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.class, emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.Builder.class);
    }

    public static final int TUTORIAL_ID_FIELD_NUMBER = 2;
    private int tutorialId_;
    /**
     * <code>uint32 tutorial_id = 2;</code>
     * @return The tutorialId.
     */
    @java.lang.Override
    public int getTutorialId() {
      return tutorialId_;
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
      if (tutorialId_ != 0) {
        output.writeUInt32(2, tutorialId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tutorialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, tutorialId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify other = (emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify) obj;

      if (getTutorialId()
          != other.getTutorialId()) return false;
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
      hash = (37 * hash) + TUTORIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTutorialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify prototype) {
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
     * CmdId: 3305
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ShowClientTutorialNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowClientTutorialNotify)
        emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.internal_static_ShowClientTutorialNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.internal_static_ShowClientTutorialNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.class, emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tutorialId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.internal_static_ShowClientTutorialNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify build() {
        emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify buildPartial() {
        emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify result = new emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify(this);
        result.tutorialId_ = tutorialId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify other) {
        if (other == emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify.getDefaultInstance()) return this;
        if (other.getTutorialId() != 0) {
          setTutorialId(other.getTutorialId());
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
                tutorialId_ = input.readUInt32();

                break;
              } // case 16
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

      private int tutorialId_ ;
      /**
       * <code>uint32 tutorial_id = 2;</code>
       * @return The tutorialId.
       */
      @java.lang.Override
      public int getTutorialId() {
        return tutorialId_;
      }
      /**
       * <code>uint32 tutorial_id = 2;</code>
       * @param value The tutorialId to set.
       * @return This builder for chaining.
       */
      public Builder setTutorialId(int value) {
        
        tutorialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tutorial_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTutorialId() {
        
        tutorialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ShowClientTutorialNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowClientTutorialNotify)
    private static final emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify();
    }

    public static emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowClientTutorialNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowClientTutorialNotify>() {
      @java.lang.Override
      public ShowClientTutorialNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShowClientTutorialNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowClientTutorialNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ShowClientTutorialNotifyOuterClass.ShowClientTutorialNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowClientTutorialNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowClientTutorialNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036ShowClientTutorialNotify.proto\"/\n\030Show" +
      "ClientTutorialNotify\022\023\n\013tutorial_id\030\002 \001(" +
      "\rB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShowClientTutorialNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowClientTutorialNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowClientTutorialNotify_descriptor,
        new java.lang.String[] { "TutorialId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
