// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_CGODFDDALAG.proto

package emu.grasscutter.net.newproto;

public final class Unk2800CGODFDDALAG {
  private Unk2800CGODFDDALAG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_CGODFDDALAGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_CGODFDDALAG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 1;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    int getUnk3250AMEEFGKPPFA();

    /**
     * <code>bool Unk2800_GCPNBJIJEDA = 2;</code>
     * @return The unk2800GCPNBJIJEDA.
     */
    boolean getUnk2800GCPNBJIJEDA();

    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code Unk2800_CGODFDDALAG}
   */
  public static final class Unk2800_CGODFDDALAG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_CGODFDDALAG)
      Unk2800_CGODFDDALAGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_CGODFDDALAG.newBuilder() to construct.
    private Unk2800_CGODFDDALAG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_CGODFDDALAG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_CGODFDDALAG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.internal_static_Unk2800_CGODFDDALAG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.internal_static_Unk2800_CGODFDDALAG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.class, emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.Builder.class);
    }

    public static final int UNK3250_AMEEFGKPPFA_FIELD_NUMBER = 1;
    private int unk3250AMEEFGKPPFA_;
    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 1;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    @java.lang.Override
    public int getUnk3250AMEEFGKPPFA() {
      return unk3250AMEEFGKPPFA_;
    }

    public static final int UNK2800_GCPNBJIJEDA_FIELD_NUMBER = 2;
    private boolean unk2800GCPNBJIJEDA_;
    /**
     * <code>bool Unk2800_GCPNBJIJEDA = 2;</code>
     * @return The unk2800GCPNBJIJEDA.
     */
    @java.lang.Override
    public boolean getUnk2800GCPNBJIJEDA() {
      return unk2800GCPNBJIJEDA_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 9;
    private int openTime_;
    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 4;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (unk3250AMEEFGKPPFA_ != 0) {
        output.writeUInt32(1, unk3250AMEEFGKPPFA_);
      }
      if (unk2800GCPNBJIJEDA_ != false) {
        output.writeBool(2, unk2800GCPNBJIJEDA_);
      }
      if (isOpen_ != false) {
        output.writeBool(4, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(9, openTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250AMEEFGKPPFA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250AMEEFGKPPFA_);
      }
      if (unk2800GCPNBJIJEDA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, unk2800GCPNBJIJEDA_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, openTime_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG other = (emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG) obj;

      if (getUnk3250AMEEFGKPPFA()
          != other.getUnk3250AMEEFGKPPFA()) return false;
      if (getUnk2800GCPNBJIJEDA()
          != other.getUnk2800GCPNBJIJEDA()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + UNK3250_AMEEFGKPPFA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250AMEEFGKPPFA();
      hash = (37 * hash) + UNK2800_GCPNBJIJEDA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2800GCPNBJIJEDA());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG prototype) {
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
     * Protobuf type {@code Unk2800_CGODFDDALAG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_CGODFDDALAG)
        emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.internal_static_Unk2800_CGODFDDALAG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.internal_static_Unk2800_CGODFDDALAG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.class, emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250AMEEFGKPPFA_ = 0;

        unk2800GCPNBJIJEDA_ = false;

        openTime_ = 0;

        isOpen_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.internal_static_Unk2800_CGODFDDALAG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG build() {
        emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG buildPartial() {
        emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG result = new emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG(this);
        result.unk3250AMEEFGKPPFA_ = unk3250AMEEFGKPPFA_;
        result.unk2800GCPNBJIJEDA_ = unk2800GCPNBJIJEDA_;
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG other) {
        if (other == emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG.getDefaultInstance()) return this;
        if (other.getUnk3250AMEEFGKPPFA() != 0) {
          setUnk3250AMEEFGKPPFA(other.getUnk3250AMEEFGKPPFA());
        }
        if (other.getUnk2800GCPNBJIJEDA() != false) {
          setUnk2800GCPNBJIJEDA(other.getUnk2800GCPNBJIJEDA());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                unk3250AMEEFGKPPFA_ = input.readUInt32();

                break;
              } // case 8
              case 16: {
                unk2800GCPNBJIJEDA_ = input.readBool();

                break;
              } // case 16
              case 32: {
                isOpen_ = input.readBool();

                break;
              } // case 32
              case 72: {
                openTime_ = input.readUInt32();

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

      private int unk3250AMEEFGKPPFA_ ;
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 1;</code>
       * @return The unk3250AMEEFGKPPFA.
       */
      @java.lang.Override
      public int getUnk3250AMEEFGKPPFA() {
        return unk3250AMEEFGKPPFA_;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 1;</code>
       * @param value The unk3250AMEEFGKPPFA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250AMEEFGKPPFA(int value) {
        
        unk3250AMEEFGKPPFA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250AMEEFGKPPFA() {
        
        unk3250AMEEFGKPPFA_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2800GCPNBJIJEDA_ ;
      /**
       * <code>bool Unk2800_GCPNBJIJEDA = 2;</code>
       * @return The unk2800GCPNBJIJEDA.
       */
      @java.lang.Override
      public boolean getUnk2800GCPNBJIJEDA() {
        return unk2800GCPNBJIJEDA_;
      }
      /**
       * <code>bool Unk2800_GCPNBJIJEDA = 2;</code>
       * @param value The unk2800GCPNBJIJEDA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800GCPNBJIJEDA(boolean value) {
        
        unk2800GCPNBJIJEDA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2800_GCPNBJIJEDA = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800GCPNBJIJEDA() {
        
        unk2800GCPNBJIJEDA_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 9;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 4;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_CGODFDDALAG)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_CGODFDDALAG)
    private static final emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG();
    }

    public static emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_CGODFDDALAG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_CGODFDDALAG>() {
      @java.lang.Override
      public Unk2800_CGODFDDALAG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_CGODFDDALAG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_CGODFDDALAG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800CGODFDDALAG.Unk2800_CGODFDDALAG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_CGODFDDALAG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_CGODFDDALAG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_CGODFDDALAG.proto\"s\n\023Unk2800_C" +
      "GODFDDALAG\022\033\n\023Unk3250_AMEEFGKPPFA\030\001 \001(\r\022" +
      "\033\n\023Unk2800_GCPNBJIJEDA\030\002 \001(\010\022\021\n\topen_tim" +
      "e\030\t \001(\r\022\017\n\007is_open\030\004 \001(\010B\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_CGODFDDALAG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_CGODFDDALAG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_CGODFDDALAG_descriptor,
        new java.lang.String[] { "Unk3250AMEEFGKPPFA", "Unk2800GCPNBJIJEDA", "OpenTime", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
