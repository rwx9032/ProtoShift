// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_ANGBJGAOMHF_ClientReq.proto

package emu.grasscutter.net.newproto;

public final class Unk2700ANGBJGAOMHFClientReq {
  private Unk2700ANGBJGAOMHFClientReq() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_ANGBJGAOMHF_ClientReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_ANGBJGAOMHF_ClientReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
     * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
     */
    int getUnk2700KHBDAPGDOJAValue();
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
     * @return The unk2700KHBDAPGDOJA.
     */
    emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA();

    /**
     * <code>uint64 Unk2700_CEPGMKAHHCD = 12;</code>
     * @return The unk2700CEPGMKAHHCD.
     */
    long getUnk2700CEPGMKAHHCD();
  }
  /**
   * <pre>
   * CmdId: 6309
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_ANGBJGAOMHF_ClientReq}
   */
  public static final class Unk2700_ANGBJGAOMHF_ClientReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_ANGBJGAOMHF_ClientReq)
      Unk2700_ANGBJGAOMHF_ClientReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_ANGBJGAOMHF_ClientReq.newBuilder() to construct.
    private Unk2700_ANGBJGAOMHF_ClientReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_ANGBJGAOMHF_ClientReq() {
      unk2700KHBDAPGDOJA_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_ANGBJGAOMHF_ClientReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.internal_static_Unk2700_ANGBJGAOMHF_ClientReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.class, emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.Builder.class);
    }

    public static final int UNK2700_KHBDAPGDOJA_FIELD_NUMBER = 13;
    private int unk2700KHBDAPGDOJA_;
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
     * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
     */
    @java.lang.Override public int getUnk2700KHBDAPGDOJAValue() {
      return unk2700KHBDAPGDOJA_;
    }
    /**
     * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
     * @return The unk2700KHBDAPGDOJA.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL result = emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.valueOf(unk2700KHBDAPGDOJA_);
      return result == null ? emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.UNRECOGNIZED : result;
    }

    public static final int UNK2700_CEPGMKAHHCD_FIELD_NUMBER = 12;
    private long unk2700CEPGMKAHHCD_;
    /**
     * <code>uint64 Unk2700_CEPGMKAHHCD = 12;</code>
     * @return The unk2700CEPGMKAHHCD.
     */
    @java.lang.Override
    public long getUnk2700CEPGMKAHHCD() {
      return unk2700CEPGMKAHHCD_;
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
      if (unk2700CEPGMKAHHCD_ != 0L) {
        output.writeUInt64(12, unk2700CEPGMKAHHCD_);
      }
      if (unk2700KHBDAPGDOJA_ != emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.Unk2700_OPEBMJPOOBL_NONE.getNumber()) {
        output.writeEnum(13, unk2700KHBDAPGDOJA_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700CEPGMKAHHCD_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, unk2700CEPGMKAHHCD_);
      }
      if (unk2700KHBDAPGDOJA_ != emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.Unk2700_OPEBMJPOOBL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, unk2700KHBDAPGDOJA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq other = (emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq) obj;

      if (unk2700KHBDAPGDOJA_ != other.unk2700KHBDAPGDOJA_) return false;
      if (getUnk2700CEPGMKAHHCD()
          != other.getUnk2700CEPGMKAHHCD()) return false;
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
      hash = (37 * hash) + UNK2700_KHBDAPGDOJA_FIELD_NUMBER;
      hash = (53 * hash) + unk2700KHBDAPGDOJA_;
      hash = (37 * hash) + UNK2700_CEPGMKAHHCD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700CEPGMKAHHCD());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq prototype) {
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
     * CmdId: 6309
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_ANGBJGAOMHF_ClientReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_ANGBJGAOMHF_ClientReq)
        emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.internal_static_Unk2700_ANGBJGAOMHF_ClientReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.class, emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700KHBDAPGDOJA_ = 0;

        unk2700CEPGMKAHHCD_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq build() {
        emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq buildPartial() {
        emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq result = new emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq(this);
        result.unk2700KHBDAPGDOJA_ = unk2700KHBDAPGDOJA_;
        result.unk2700CEPGMKAHHCD_ = unk2700CEPGMKAHHCD_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq other) {
        if (other == emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq.getDefaultInstance()) return this;
        if (other.unk2700KHBDAPGDOJA_ != 0) {
          setUnk2700KHBDAPGDOJAValue(other.getUnk2700KHBDAPGDOJAValue());
        }
        if (other.getUnk2700CEPGMKAHHCD() != 0L) {
          setUnk2700CEPGMKAHHCD(other.getUnk2700CEPGMKAHHCD());
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
                unk2700CEPGMKAHHCD_ = input.readUInt64();

                break;
              } // case 96
              case 104: {
                unk2700KHBDAPGDOJA_ = input.readEnum();

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

      private int unk2700KHBDAPGDOJA_ = 0;
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
       * @return The enum numeric value on the wire for unk2700KHBDAPGDOJA.
       */
      @java.lang.Override public int getUnk2700KHBDAPGDOJAValue() {
        return unk2700KHBDAPGDOJA_;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
       * @param value The enum numeric value on the wire for unk2700KHBDAPGDOJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KHBDAPGDOJAValue(int value) {
        
        unk2700KHBDAPGDOJA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
       * @return The unk2700KHBDAPGDOJA.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL getUnk2700KHBDAPGDOJA() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL result = emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.valueOf(unk2700KHBDAPGDOJA_);
        return result == null ? emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
       * @param value The unk2700KHBDAPGDOJA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KHBDAPGDOJA(emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.Unk2700_OPEBMJPOOBL value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2700KHBDAPGDOJA_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_OPEBMJPOOBL Unk2700_KHBDAPGDOJA = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KHBDAPGDOJA() {
        
        unk2700KHBDAPGDOJA_ = 0;
        onChanged();
        return this;
      }

      private long unk2700CEPGMKAHHCD_ ;
      /**
       * <code>uint64 Unk2700_CEPGMKAHHCD = 12;</code>
       * @return The unk2700CEPGMKAHHCD.
       */
      @java.lang.Override
      public long getUnk2700CEPGMKAHHCD() {
        return unk2700CEPGMKAHHCD_;
      }
      /**
       * <code>uint64 Unk2700_CEPGMKAHHCD = 12;</code>
       * @param value The unk2700CEPGMKAHHCD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700CEPGMKAHHCD(long value) {
        
        unk2700CEPGMKAHHCD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_CEPGMKAHHCD = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700CEPGMKAHHCD() {
        
        unk2700CEPGMKAHHCD_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_ANGBJGAOMHF_ClientReq)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_ANGBJGAOMHF_ClientReq)
    private static final emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq();
    }

    public static emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_ANGBJGAOMHF_ClientReq>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_ANGBJGAOMHF_ClientReq>() {
      @java.lang.Override
      public Unk2700_ANGBJGAOMHF_ClientReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_ANGBJGAOMHF_ClientReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_ANGBJGAOMHF_ClientReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700ANGBJGAOMHFClientReq.Unk2700_ANGBJGAOMHF_ClientReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_ANGBJGAOMHF_ClientReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_ANGBJGAOMHF_ClientReq.proto\032\031U" +
      "nk2700_OPEBMJPOOBL.proto\"o\n\035Unk2700_ANGB" +
      "JGAOMHF_ClientReq\0221\n\023Unk2700_KHBDAPGDOJA" +
      "\030\r \001(\0162\024.Unk2700_OPEBMJPOOBL\022\033\n\023Unk2700_" +
      "CEPGMKAHHCD\030\014 \001(\004B\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.getDescriptor(),
        });
    internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_ANGBJGAOMHF_ClientReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_ANGBJGAOMHF_ClientReq_descriptor,
        new java.lang.String[] { "Unk2700KHBDAPGDOJA", "Unk2700CEPGMKAHHCD", });
    emu.grasscutter.net.newproto.Unk2700OPEBMJPOOBL.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
