// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_HFMDKDHCJCM.proto

package emu.grasscutter.net.newproto;

public final class Unk2700HFMDKDHCJCM {
  private Unk2700HFMDKDHCJCM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_HFMDKDHCJCMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_HFMDKDHCJCM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     * @return Whether the unk2700CMOMNFNGCGB field is set.
     */
    boolean hasUnk2700CMOMNFNGCGB();
    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     * @return The unk2700CMOMNFNGCGB.
     */
    emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk2700CMOMNFNGCGB();
    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     */
    emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder();
  }
  /**
   * Protobuf type {@code Unk2700_HFMDKDHCJCM}
   */
  public static final class Unk2700_HFMDKDHCJCM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_HFMDKDHCJCM)
      Unk2700_HFMDKDHCJCMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_HFMDKDHCJCM.newBuilder() to construct.
    private Unk2700_HFMDKDHCJCM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_HFMDKDHCJCM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_HFMDKDHCJCM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.class, emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.Builder.class);
    }

    public static final int UNK2700_CMOMNFNGCGB_FIELD_NUMBER = 1;
    private emu.grasscutter.net.newproto.VectorOuterClass.Vector unk2700CMOMNFNGCGB_;
    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     * @return Whether the unk2700CMOMNFNGCGB field is set.
     */
    @java.lang.Override
    public boolean hasUnk2700CMOMNFNGCGB() {
      return unk2700CMOMNFNGCGB_ != null;
    }
    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     * @return The unk2700CMOMNFNGCGB.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk2700CMOMNFNGCGB() {
      return unk2700CMOMNFNGCGB_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk2700CMOMNFNGCGB_;
    }
    /**
     * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder() {
      return getUnk2700CMOMNFNGCGB();
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
      if (unk2700CMOMNFNGCGB_ != null) {
        output.writeMessage(1, getUnk2700CMOMNFNGCGB());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700CMOMNFNGCGB_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getUnk2700CMOMNFNGCGB());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM other = (emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM) obj;

      if (hasUnk2700CMOMNFNGCGB() != other.hasUnk2700CMOMNFNGCGB()) return false;
      if (hasUnk2700CMOMNFNGCGB()) {
        if (!getUnk2700CMOMNFNGCGB()
            .equals(other.getUnk2700CMOMNFNGCGB())) return false;
      }
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
      if (hasUnk2700CMOMNFNGCGB()) {
        hash = (37 * hash) + UNK2700_CMOMNFNGCGB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700CMOMNFNGCGB().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM prototype) {
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
     * Protobuf type {@code Unk2700_HFMDKDHCJCM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_HFMDKDHCJCM)
        emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.class, emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          unk2700CMOMNFNGCGB_ = null;
        } else {
          unk2700CMOMNFNGCGB_ = null;
          unk2700CMOMNFNGCGBBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.internal_static_Unk2700_HFMDKDHCJCM_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM build() {
        emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM buildPartial() {
        emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM result = new emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM(this);
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          result.unk2700CMOMNFNGCGB_ = unk2700CMOMNFNGCGB_;
        } else {
          result.unk2700CMOMNFNGCGB_ = unk2700CMOMNFNGCGBBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM other) {
        if (other == emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM.getDefaultInstance()) return this;
        if (other.hasUnk2700CMOMNFNGCGB()) {
          mergeUnk2700CMOMNFNGCGB(other.getUnk2700CMOMNFNGCGB());
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
              case 10: {
                input.readMessage(
                    getUnk2700CMOMNFNGCGBFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
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

      private emu.grasscutter.net.newproto.VectorOuterClass.Vector unk2700CMOMNFNGCGB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> unk2700CMOMNFNGCGBBuilder_;
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       * @return Whether the unk2700CMOMNFNGCGB field is set.
       */
      public boolean hasUnk2700CMOMNFNGCGB() {
        return unk2700CMOMNFNGCGBBuilder_ != null || unk2700CMOMNFNGCGB_ != null;
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       * @return The unk2700CMOMNFNGCGB.
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector getUnk2700CMOMNFNGCGB() {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          return unk2700CMOMNFNGCGB_ == null ? emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk2700CMOMNFNGCGB_;
        } else {
          return unk2700CMOMNFNGCGBBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public Builder setUnk2700CMOMNFNGCGB(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk2700CMOMNFNGCGB_ = value;
          onChanged();
        } else {
          unk2700CMOMNFNGCGBBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public Builder setUnk2700CMOMNFNGCGB(
          emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          unk2700CMOMNFNGCGB_ = builderForValue.build();
          onChanged();
        } else {
          unk2700CMOMNFNGCGBBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public Builder mergeUnk2700CMOMNFNGCGB(emu.grasscutter.net.newproto.VectorOuterClass.Vector value) {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          if (unk2700CMOMNFNGCGB_ != null) {
            unk2700CMOMNFNGCGB_ =
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.newBuilder(unk2700CMOMNFNGCGB_).mergeFrom(value).buildPartial();
          } else {
            unk2700CMOMNFNGCGB_ = value;
          }
          onChanged();
        } else {
          unk2700CMOMNFNGCGBBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public Builder clearUnk2700CMOMNFNGCGB() {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          unk2700CMOMNFNGCGB_ = null;
          onChanged();
        } else {
          unk2700CMOMNFNGCGB_ = null;
          unk2700CMOMNFNGCGBBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder getUnk2700CMOMNFNGCGBBuilder() {
        
        onChanged();
        return getUnk2700CMOMNFNGCGBFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      public emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder getUnk2700CMOMNFNGCGBOrBuilder() {
        if (unk2700CMOMNFNGCGBBuilder_ != null) {
          return unk2700CMOMNFNGCGBBuilder_.getMessageOrBuilder();
        } else {
          return unk2700CMOMNFNGCGB_ == null ?
              emu.grasscutter.net.newproto.VectorOuterClass.Vector.getDefaultInstance() : unk2700CMOMNFNGCGB_;
        }
      }
      /**
       * <code>.Vector Unk2700_CMOMNFNGCGB = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder> 
          getUnk2700CMOMNFNGCGBFieldBuilder() {
        if (unk2700CMOMNFNGCGBBuilder_ == null) {
          unk2700CMOMNFNGCGBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.VectorOuterClass.Vector, emu.grasscutter.net.newproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.newproto.VectorOuterClass.VectorOrBuilder>(
                  getUnk2700CMOMNFNGCGB(),
                  getParentForChildren(),
                  isClean());
          unk2700CMOMNFNGCGB_ = null;
        }
        return unk2700CMOMNFNGCGBBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_HFMDKDHCJCM)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_HFMDKDHCJCM)
    private static final emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM();
    }

    public static emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_HFMDKDHCJCM>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_HFMDKDHCJCM>() {
      @java.lang.Override
      public Unk2700_HFMDKDHCJCM parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_HFMDKDHCJCM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_HFMDKDHCJCM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700HFMDKDHCJCM.Unk2700_HFMDKDHCJCM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_HFMDKDHCJCM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_HFMDKDHCJCM.proto\032\014Vector.prot" +
      "o\";\n\023Unk2700_HFMDKDHCJCM\022$\n\023Unk2700_CMOM" +
      "NFNGCGB\030\001 \001(\0132\007.VectorB\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_Unk2700_HFMDKDHCJCM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_HFMDKDHCJCM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_HFMDKDHCJCM_descriptor,
        new java.lang.String[] { "Unk2700CMOMNFNGCGB", });
    emu.grasscutter.net.newproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
