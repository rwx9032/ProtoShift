// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ContentAuditField.proto

package emu.grasscutter.net.newproto;

public final class ContentAuditFieldOuterClass {
  private ContentAuditFieldOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ContentAuditFieldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ContentAuditField)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> 
        getSegmentListList();
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData getSegmentList(int index);
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    int getSegmentListCount();
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder> 
        getSegmentListOrBuilderList();
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder getSegmentListOrBuilder(
        int index);

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code ContentAuditField}
   */
  public static final class ContentAuditField extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ContentAuditField)
      ContentAuditFieldOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ContentAuditField.newBuilder() to construct.
    private ContentAuditField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ContentAuditField() {
      segmentList_ = java.util.Collections.emptyList();
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ContentAuditField();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.internal_static_ContentAuditField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.internal_static_ContentAuditField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.class, emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.Builder.class);
    }

    public static final int SEGMENT_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> segmentList_;
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> getSegmentListList() {
      return segmentList_;
    }
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder> 
        getSegmentListOrBuilderList() {
      return segmentList_;
    }
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    @java.lang.Override
    public int getSegmentListCount() {
      return segmentList_.size();
    }
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData getSegmentList(int index) {
      return segmentList_.get(index);
    }
    /**
     * <code>repeated .ContentAuditData segment_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder getSegmentListOrBuilder(
        int index) {
      return segmentList_.get(index);
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      for (int i = 0; i < segmentList_.size(); i++) {
        output.writeMessage(1, segmentList_.get(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < segmentList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, segmentList_.get(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField other = (emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField) obj;

      if (!getSegmentListList()
          .equals(other.getSegmentListList())) return false;
      if (!getName()
          .equals(other.getName())) return false;
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
      if (getSegmentListCount() > 0) {
        hash = (37 * hash) + SEGMENT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSegmentListList().hashCode();
      }
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField prototype) {
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
     * Protobuf type {@code ContentAuditField}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ContentAuditField)
        emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditFieldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.internal_static_ContentAuditField_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.internal_static_ContentAuditField_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.class, emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (segmentListBuilder_ == null) {
          segmentList_ = java.util.Collections.emptyList();
        } else {
          segmentList_ = null;
          segmentListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.internal_static_ContentAuditField_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField build() {
        emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField buildPartial() {
        emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField result = new emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField(this);
        int from_bitField0_ = bitField0_;
        if (segmentListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            segmentList_ = java.util.Collections.unmodifiableList(segmentList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.segmentList_ = segmentList_;
        } else {
          result.segmentList_ = segmentListBuilder_.build();
        }
        result.name_ = name_;
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
        if (other instanceof emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField) {
          return mergeFrom((emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField other) {
        if (other == emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField.getDefaultInstance()) return this;
        if (segmentListBuilder_ == null) {
          if (!other.segmentList_.isEmpty()) {
            if (segmentList_.isEmpty()) {
              segmentList_ = other.segmentList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSegmentListIsMutable();
              segmentList_.addAll(other.segmentList_);
            }
            onChanged();
          }
        } else {
          if (!other.segmentList_.isEmpty()) {
            if (segmentListBuilder_.isEmpty()) {
              segmentListBuilder_.dispose();
              segmentListBuilder_ = null;
              segmentList_ = other.segmentList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              segmentListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSegmentListFieldBuilder() : null;
            } else {
              segmentListBuilder_.addAllMessages(other.segmentList_);
            }
          }
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
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
                emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.parser(),
                        extensionRegistry);
                if (segmentListBuilder_ == null) {
                  ensureSegmentListIsMutable();
                  segmentList_.add(m);
                } else {
                  segmentListBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 18: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 18
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
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> segmentList_ =
        java.util.Collections.emptyList();
      private void ensureSegmentListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          segmentList_ = new java.util.ArrayList<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData>(segmentList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder> segmentListBuilder_;

      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> getSegmentListList() {
        if (segmentListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(segmentList_);
        } else {
          return segmentListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public int getSegmentListCount() {
        if (segmentListBuilder_ == null) {
          return segmentList_.size();
        } else {
          return segmentListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData getSegmentList(int index) {
        if (segmentListBuilder_ == null) {
          return segmentList_.get(index);
        } else {
          return segmentListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder setSegmentList(
          int index, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData value) {
        if (segmentListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSegmentListIsMutable();
          segmentList_.set(index, value);
          onChanged();
        } else {
          segmentListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder setSegmentList(
          int index, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder builderForValue) {
        if (segmentListBuilder_ == null) {
          ensureSegmentListIsMutable();
          segmentList_.set(index, builderForValue.build());
          onChanged();
        } else {
          segmentListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder addSegmentList(emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData value) {
        if (segmentListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSegmentListIsMutable();
          segmentList_.add(value);
          onChanged();
        } else {
          segmentListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder addSegmentList(
          int index, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData value) {
        if (segmentListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSegmentListIsMutable();
          segmentList_.add(index, value);
          onChanged();
        } else {
          segmentListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder addSegmentList(
          emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder builderForValue) {
        if (segmentListBuilder_ == null) {
          ensureSegmentListIsMutable();
          segmentList_.add(builderForValue.build());
          onChanged();
        } else {
          segmentListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder addSegmentList(
          int index, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder builderForValue) {
        if (segmentListBuilder_ == null) {
          ensureSegmentListIsMutable();
          segmentList_.add(index, builderForValue.build());
          onChanged();
        } else {
          segmentListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder addAllSegmentList(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData> values) {
        if (segmentListBuilder_ == null) {
          ensureSegmentListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, segmentList_);
          onChanged();
        } else {
          segmentListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder clearSegmentList() {
        if (segmentListBuilder_ == null) {
          segmentList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          segmentListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public Builder removeSegmentList(int index) {
        if (segmentListBuilder_ == null) {
          ensureSegmentListIsMutable();
          segmentList_.remove(index);
          onChanged();
        } else {
          segmentListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder getSegmentListBuilder(
          int index) {
        return getSegmentListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder getSegmentListOrBuilder(
          int index) {
        if (segmentListBuilder_ == null) {
          return segmentList_.get(index);  } else {
          return segmentListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder> 
           getSegmentListOrBuilderList() {
        if (segmentListBuilder_ != null) {
          return segmentListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(segmentList_);
        }
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder addSegmentListBuilder() {
        return getSegmentListFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.getDefaultInstance());
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder addSegmentListBuilder(
          int index) {
        return getSegmentListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.getDefaultInstance());
      }
      /**
       * <code>repeated .ContentAuditData segment_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder> 
           getSegmentListBuilderList() {
        return getSegmentListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder> 
          getSegmentListFieldBuilder() {
        if (segmentListBuilder_ == null) {
          segmentListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditData.Builder, emu.grasscutter.net.newproto.ContentAuditDataOuterClass.ContentAuditDataOrBuilder>(
                  segmentList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          segmentList_ = null;
        }
        return segmentListBuilder_;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:ContentAuditField)
    }

    // @@protoc_insertion_point(class_scope:ContentAuditField)
    private static final emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField();
    }

    public static emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ContentAuditField>
        PARSER = new com.google.protobuf.AbstractParser<ContentAuditField>() {
      @java.lang.Override
      public ContentAuditField parsePartialFrom(
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

    public static com.google.protobuf.Parser<ContentAuditField> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ContentAuditField> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ContentAuditFieldOuterClass.ContentAuditField getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ContentAuditField_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ContentAuditField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ContentAuditField.proto\032\026ContentAuditD" +
      "ata.proto\"J\n\021ContentAuditField\022\'\n\014segmen" +
      "t_list\030\001 \003(\0132\021.ContentAuditData\022\014\n\004name\030" +
      "\002 \001(\tB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ContentAuditDataOuterClass.getDescriptor(),
        });
    internal_static_ContentAuditField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ContentAuditField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ContentAuditField_descriptor,
        new java.lang.String[] { "SegmentList", "Name", });
    emu.grasscutter.net.newproto.ContentAuditDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
