// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LPKGGIANHKA.proto

package emu.grasscutter.net.newproto;

public final class Unk3150LPKGGIANHKA {
  private Unk3150LPKGGIANHKA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LPKGGIANHKAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LPKGGIANHKA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 exp = 9;</code>
     * @return The exp.
     */
    int getExp();
  }
  /**
   * <pre>
   * CmdId: 7229
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_LPKGGIANHKA}
   */
  public static final class Unk3150_LPKGGIANHKA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LPKGGIANHKA)
      Unk3150_LPKGGIANHKAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LPKGGIANHKA.newBuilder() to construct.
    private Unk3150_LPKGGIANHKA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LPKGGIANHKA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LPKGGIANHKA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.internal_static_Unk3150_LPKGGIANHKA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.internal_static_Unk3150_LPKGGIANHKA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.class, emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_;
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int EXP_FIELD_NUMBER = 9;
    private int exp_;
    /**
     * <code>uint32 exp = 9;</code>
     * @return The exp.
     */
    @java.lang.Override
    public int getExp() {
      return exp_;
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
      if (level_ != 0) {
        output.writeUInt32(1, level_);
      }
      if (exp_ != 0) {
        output.writeUInt32(9, exp_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, level_);
      }
      if (exp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, exp_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA other = (emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getExp()
          != other.getExp()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + EXP_FIELD_NUMBER;
      hash = (53 * hash) + getExp();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA prototype) {
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
     * CmdId: 7229
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_LPKGGIANHKA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LPKGGIANHKA)
        emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.internal_static_Unk3150_LPKGGIANHKA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.internal_static_Unk3150_LPKGGIANHKA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.class, emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        level_ = 0;

        exp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.internal_static_Unk3150_LPKGGIANHKA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA build() {
        emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA buildPartial() {
        emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA result = new emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA(this);
        result.level_ = level_;
        result.exp_ = exp_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA other) {
        if (other == emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
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
                level_ = input.readUInt32();

                break;
              } // case 8
              case 72: {
                exp_ = input.readUInt32();

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

      private int level_ ;
      /**
       * <code>uint32 level = 1;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>uint32 exp = 9;</code>
       * @return The exp.
       */
      @java.lang.Override
      public int getExp() {
        return exp_;
      }
      /**
       * <code>uint32 exp = 9;</code>
       * @param value The exp to set.
       * @return This builder for chaining.
       */
      public Builder setExp(int value) {
        
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearExp() {
        
        exp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LPKGGIANHKA)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LPKGGIANHKA)
    private static final emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA();
    }

    public static emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LPKGGIANHKA>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LPKGGIANHKA>() {
      @java.lang.Override
      public Unk3150_LPKGGIANHKA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_LPKGGIANHKA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LPKGGIANHKA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150LPKGGIANHKA.Unk3150_LPKGGIANHKA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LPKGGIANHKA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LPKGGIANHKA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LPKGGIANHKA.proto\"1\n\023Unk3150_L" +
      "PKGGIANHKA\022\r\n\005level\030\001 \001(\r\022\013\n\003exp\030\t \001(\rB\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LPKGGIANHKA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LPKGGIANHKA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LPKGGIANHKA_descriptor,
        new java.lang.String[] { "Level", "Exp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
