// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_ANFAJPBIFHN.proto

package emu.grasscutter.net.newproto;

public final class Unk3250ANFAJPBIFHN {
  private Unk3250ANFAJPBIFHN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_ANFAJPBIFHNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_ANFAJPBIFHN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_DACNCBLFENP = 1;</code>
     * @return The unk3250DACNCBLFENP.
     */
    int getUnk3250DACNCBLFENP();

    /**
     * <code>uint32 Unk3250_HJACLKHJCEL = 2;</code>
     * @return The unk3250HJACLKHJCEL.
     */
    int getUnk3250HJACLKHJCEL();
  }
  /**
   * Protobuf type {@code Unk3250_ANFAJPBIFHN}
   */
  public static final class Unk3250_ANFAJPBIFHN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_ANFAJPBIFHN)
      Unk3250_ANFAJPBIFHNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_ANFAJPBIFHN.newBuilder() to construct.
    private Unk3250_ANFAJPBIFHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_ANFAJPBIFHN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_ANFAJPBIFHN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.internal_static_Unk3250_ANFAJPBIFHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.internal_static_Unk3250_ANFAJPBIFHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.class, emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.Builder.class);
    }

    public static final int UNK3250_DACNCBLFENP_FIELD_NUMBER = 1;
    private int unk3250DACNCBLFENP_;
    /**
     * <code>uint32 Unk3250_DACNCBLFENP = 1;</code>
     * @return The unk3250DACNCBLFENP.
     */
    @java.lang.Override
    public int getUnk3250DACNCBLFENP() {
      return unk3250DACNCBLFENP_;
    }

    public static final int UNK3250_HJACLKHJCEL_FIELD_NUMBER = 2;
    private int unk3250HJACLKHJCEL_;
    /**
     * <code>uint32 Unk3250_HJACLKHJCEL = 2;</code>
     * @return The unk3250HJACLKHJCEL.
     */
    @java.lang.Override
    public int getUnk3250HJACLKHJCEL() {
      return unk3250HJACLKHJCEL_;
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
      if (unk3250DACNCBLFENP_ != 0) {
        output.writeUInt32(1, unk3250DACNCBLFENP_);
      }
      if (unk3250HJACLKHJCEL_ != 0) {
        output.writeUInt32(2, unk3250HJACLKHJCEL_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250DACNCBLFENP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250DACNCBLFENP_);
      }
      if (unk3250HJACLKHJCEL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3250HJACLKHJCEL_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN other = (emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN) obj;

      if (getUnk3250DACNCBLFENP()
          != other.getUnk3250DACNCBLFENP()) return false;
      if (getUnk3250HJACLKHJCEL()
          != other.getUnk3250HJACLKHJCEL()) return false;
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
      hash = (37 * hash) + UNK3250_DACNCBLFENP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250DACNCBLFENP();
      hash = (37 * hash) + UNK3250_HJACLKHJCEL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250HJACLKHJCEL();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN prototype) {
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
     * Protobuf type {@code Unk3250_ANFAJPBIFHN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_ANFAJPBIFHN)
        emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.internal_static_Unk3250_ANFAJPBIFHN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.internal_static_Unk3250_ANFAJPBIFHN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.class, emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250DACNCBLFENP_ = 0;

        unk3250HJACLKHJCEL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.internal_static_Unk3250_ANFAJPBIFHN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN build() {
        emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN buildPartial() {
        emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN result = new emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN(this);
        result.unk3250DACNCBLFENP_ = unk3250DACNCBLFENP_;
        result.unk3250HJACLKHJCEL_ = unk3250HJACLKHJCEL_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN other) {
        if (other == emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN.getDefaultInstance()) return this;
        if (other.getUnk3250DACNCBLFENP() != 0) {
          setUnk3250DACNCBLFENP(other.getUnk3250DACNCBLFENP());
        }
        if (other.getUnk3250HJACLKHJCEL() != 0) {
          setUnk3250HJACLKHJCEL(other.getUnk3250HJACLKHJCEL());
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
                unk3250DACNCBLFENP_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                unk3250HJACLKHJCEL_ = input.readUInt32();

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

      private int unk3250DACNCBLFENP_ ;
      /**
       * <code>uint32 Unk3250_DACNCBLFENP = 1;</code>
       * @return The unk3250DACNCBLFENP.
       */
      @java.lang.Override
      public int getUnk3250DACNCBLFENP() {
        return unk3250DACNCBLFENP_;
      }
      /**
       * <code>uint32 Unk3250_DACNCBLFENP = 1;</code>
       * @param value The unk3250DACNCBLFENP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250DACNCBLFENP(int value) {
        
        unk3250DACNCBLFENP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_DACNCBLFENP = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250DACNCBLFENP() {
        
        unk3250DACNCBLFENP_ = 0;
        onChanged();
        return this;
      }

      private int unk3250HJACLKHJCEL_ ;
      /**
       * <code>uint32 Unk3250_HJACLKHJCEL = 2;</code>
       * @return The unk3250HJACLKHJCEL.
       */
      @java.lang.Override
      public int getUnk3250HJACLKHJCEL() {
        return unk3250HJACLKHJCEL_;
      }
      /**
       * <code>uint32 Unk3250_HJACLKHJCEL = 2;</code>
       * @param value The unk3250HJACLKHJCEL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250HJACLKHJCEL(int value) {
        
        unk3250HJACLKHJCEL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_HJACLKHJCEL = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250HJACLKHJCEL() {
        
        unk3250HJACLKHJCEL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3250_ANFAJPBIFHN)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_ANFAJPBIFHN)
    private static final emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN();
    }

    public static emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_ANFAJPBIFHN>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_ANFAJPBIFHN>() {
      @java.lang.Override
      public Unk3250_ANFAJPBIFHN parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_ANFAJPBIFHN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_ANFAJPBIFHN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250ANFAJPBIFHN.Unk3250_ANFAJPBIFHN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_ANFAJPBIFHN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_ANFAJPBIFHN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_ANFAJPBIFHN.proto\"O\n\023Unk3250_A" +
      "NFAJPBIFHN\022\033\n\023Unk3250_DACNCBLFENP\030\001 \001(\r\022" +
      "\033\n\023Unk3250_HJACLKHJCEL\030\002 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_ANFAJPBIFHN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_ANFAJPBIFHN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_ANFAJPBIFHN_descriptor,
        new java.lang.String[] { "Unk3250DACNCBLFENP", "Unk3250HJACLKHJCEL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
