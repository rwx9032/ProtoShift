// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_CEEONDKDIHH_ClientReq.proto

package emu.grasscutter.net.newproto;

public final class Unk2700CEEONDKDIHHClientReq {
  private Unk2700CEEONDKDIHHClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_CEEONDKDIHH_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_CEEONDKDIHH_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk2700_MAPEEDEBLKN = 6;</code>
     * @return The unk2700MAPEEDEBLKN.
     */
    boolean getUnk2700MAPEEDEBLKN();

    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 2;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    long getUnk2700ONOOJBEABOE();
  }
  /**
   * <pre>
   * CmdId: 6241
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_CEEONDKDIHH_ClientReq}
   */
  public static final class Unk2700_CEEONDKDIHH_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_CEEONDKDIHH_ClientReq)
      Unk2700_CEEONDKDIHH_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_CEEONDKDIHH_ClientReq.newBuilder() to construct.
    private Unk2700_CEEONDKDIHH_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_CEEONDKDIHH_ClientReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_CEEONDKDIHH_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.internal_static_Unk2700_CEEONDKDIHH_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.class, emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.Builder.class);
    }

    public static final int UNK2700_MAPEEDEBLKN_FIELD_NUMBER = 6;
    private boolean unk2700MAPEEDEBLKN_;
    /**
     * <code>bool Unk2700_MAPEEDEBLKN = 6;</code>
     * @return The unk2700MAPEEDEBLKN.
     */
    @java.lang.Override
    public boolean getUnk2700MAPEEDEBLKN() {
      return unk2700MAPEEDEBLKN_;
    }

    public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 2;
    private long unk2700ONOOJBEABOE_;
    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 2;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    @java.lang.Override
    public long getUnk2700ONOOJBEABOE() {
      return unk2700ONOOJBEABOE_;
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
      if (unk2700ONOOJBEABOE_ != 0L) {
        output.writeUInt64(2, unk2700ONOOJBEABOE_);
      }
      if (unk2700MAPEEDEBLKN_ != false) {
        output.writeBool(6, unk2700MAPEEDEBLKN_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700ONOOJBEABOE_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, unk2700ONOOJBEABOE_);
      }
      if (unk2700MAPEEDEBLKN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk2700MAPEEDEBLKN_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq other = (emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq) obj;

      if (getUnk2700MAPEEDEBLKN()
          != other.getUnk2700MAPEEDEBLKN()) return false;
      if (getUnk2700ONOOJBEABOE()
          != other.getUnk2700ONOOJBEABOE()) return false;
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
      hash = (37 * hash) + UNK2700_MAPEEDEBLKN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700MAPEEDEBLKN());
      hash = (37 * hash) + UNK2700_ONOOJBEABOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700ONOOJBEABOE());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq prototype) {
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
     * CmdId: 6241
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_CEEONDKDIHH_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_CEEONDKDIHH_ClientReq)
        emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.internal_static_Unk2700_CEEONDKDIHH_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.class, emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700MAPEEDEBLKN_ = false;

        unk2700ONOOJBEABOE_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq build() {
        emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq buildPartial() {
        emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq result = new emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq(this);
        result.unk2700MAPEEDEBLKN_ = unk2700MAPEEDEBLKN_;
        result.unk2700ONOOJBEABOE_ = unk2700ONOOJBEABOE_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq other) {
        if (other == emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq.getDefaultInstance()) return this;
        if (other.getUnk2700MAPEEDEBLKN() != false) {
          setUnk2700MAPEEDEBLKN(other.getUnk2700MAPEEDEBLKN());
        }
        if (other.getUnk2700ONOOJBEABOE() != 0L) {
          setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
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
                unk2700ONOOJBEABOE_ = input.readUInt64();

                break;
              } // case 16
              case 48: {
                unk2700MAPEEDEBLKN_ = input.readBool();

                break;
              } // case 48
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

      private boolean unk2700MAPEEDEBLKN_ ;
      /**
       * <code>bool Unk2700_MAPEEDEBLKN = 6;</code>
       * @return The unk2700MAPEEDEBLKN.
       */
      @java.lang.Override
      public boolean getUnk2700MAPEEDEBLKN() {
        return unk2700MAPEEDEBLKN_;
      }
      /**
       * <code>bool Unk2700_MAPEEDEBLKN = 6;</code>
       * @param value The unk2700MAPEEDEBLKN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MAPEEDEBLKN(boolean value) {
        
        unk2700MAPEEDEBLKN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_MAPEEDEBLKN = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MAPEEDEBLKN() {
        
        unk2700MAPEEDEBLKN_ = false;
        onChanged();
        return this;
      }

      private long unk2700ONOOJBEABOE_ ;
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 2;</code>
       * @return The unk2700ONOOJBEABOE.
       */
      @java.lang.Override
      public long getUnk2700ONOOJBEABOE() {
        return unk2700ONOOJBEABOE_;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 2;</code>
       * @param value The unk2700ONOOJBEABOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ONOOJBEABOE(long value) {
        
        unk2700ONOOJBEABOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ONOOJBEABOE() {
        
        unk2700ONOOJBEABOE_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_CEEONDKDIHH_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_CEEONDKDIHH_ClientReq)
    private static final emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq();
    }

    public static emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_CEEONDKDIHH_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_CEEONDKDIHH_ClientReq>() {
      @java.lang.Override
      public Unk2700_CEEONDKDIHH_ClientReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_CEEONDKDIHH_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_CEEONDKDIHH_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700CEEONDKDIHHClientReq.Unk2700_CEEONDKDIHH_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_CEEONDKDIHH_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_CEEONDKDIHH_ClientReq.proto\"Y\n" +
      "\035Unk2700_CEEONDKDIHH_ClientReq\022\033\n\023Unk270" +
      "0_MAPEEDEBLKN\030\006 \001(\010\022\033\n\023Unk2700_ONOOJBEAB" +
      "OE\030\002 \001(\004B\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_CEEONDKDIHH_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_CEEONDKDIHH_ClientReq_descriptor,
        new java.lang.String[] { "Unk2700MAPEEDEBLKN", "Unk2700ONOOJBEABOE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
