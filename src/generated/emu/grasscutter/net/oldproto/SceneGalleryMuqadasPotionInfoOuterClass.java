// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryMuqadasPotionInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryMuqadasPotionInfoOuterClass {
  private SceneGalleryMuqadasPotionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryMuqadasPotionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryMuqadasPotionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 capture_weakness_count = 4;</code>
     * @return The captureWeaknessCount.
     */
    int getCaptureWeaknessCount();

    /**
     * <code>uint32 skill_energy = 10;</code>
     * @return The skillEnergy.
     */
    int getSkillEnergy();

    /**
     * <code>uint32 skill_use_limit = 9;</code>
     * @return The skillUseLimit.
     */
    int getSkillUseLimit();
  }
  /**
   * Protobuf type {@code SceneGalleryMuqadasPotionInfo}
   */
  public static final class SceneGalleryMuqadasPotionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryMuqadasPotionInfo)
      SceneGalleryMuqadasPotionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryMuqadasPotionInfo.newBuilder() to construct.
    private SceneGalleryMuqadasPotionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryMuqadasPotionInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryMuqadasPotionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.class, emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 6;
    private int score_;
    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER = 4;
    private int captureWeaknessCount_;
    /**
     * <code>uint32 capture_weakness_count = 4;</code>
     * @return The captureWeaknessCount.
     */
    @java.lang.Override
    public int getCaptureWeaknessCount() {
      return captureWeaknessCount_;
    }

    public static final int SKILL_ENERGY_FIELD_NUMBER = 10;
    private int skillEnergy_;
    /**
     * <code>uint32 skill_energy = 10;</code>
     * @return The skillEnergy.
     */
    @java.lang.Override
    public int getSkillEnergy() {
      return skillEnergy_;
    }

    public static final int SKILL_USE_LIMIT_FIELD_NUMBER = 9;
    private int skillUseLimit_;
    /**
     * <code>uint32 skill_use_limit = 9;</code>
     * @return The skillUseLimit.
     */
    @java.lang.Override
    public int getSkillUseLimit() {
      return skillUseLimit_;
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
      if (captureWeaknessCount_ != 0) {
        output.writeUInt32(4, captureWeaknessCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(6, score_);
      }
      if (skillUseLimit_ != 0) {
        output.writeUInt32(9, skillUseLimit_);
      }
      if (skillEnergy_ != 0) {
        output.writeUInt32(10, skillEnergy_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (captureWeaknessCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, captureWeaknessCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, score_);
      }
      if (skillUseLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, skillUseLimit_);
      }
      if (skillEnergy_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, skillEnergy_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo other = (emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getCaptureWeaknessCount()
          != other.getCaptureWeaknessCount()) return false;
      if (getSkillEnergy()
          != other.getSkillEnergy()) return false;
      if (getSkillUseLimit()
          != other.getSkillUseLimit()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + CAPTURE_WEAKNESS_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCaptureWeaknessCount();
      hash = (37 * hash) + SKILL_ENERGY_FIELD_NUMBER;
      hash = (53 * hash) + getSkillEnergy();
      hash = (37 * hash) + SKILL_USE_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getSkillUseLimit();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo prototype) {
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
     * Protobuf type {@code SceneGalleryMuqadasPotionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryMuqadasPotionInfo)
        emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.class, emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        score_ = 0;

        captureWeaknessCount_ = 0;

        skillEnergy_ = 0;

        skillUseLimit_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo result = new emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo(this);
        result.score_ = score_;
        result.captureWeaknessCount_ = captureWeaknessCount_;
        result.skillEnergy_ = skillEnergy_;
        result.skillUseLimit_ = skillUseLimit_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getCaptureWeaknessCount() != 0) {
          setCaptureWeaknessCount(other.getCaptureWeaknessCount());
        }
        if (other.getSkillEnergy() != 0) {
          setSkillEnergy(other.getSkillEnergy());
        }
        if (other.getSkillUseLimit() != 0) {
          setSkillUseLimit(other.getSkillUseLimit());
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
              case 32: {
                captureWeaknessCount_ = input.readUInt32();

                break;
              } // case 32
              case 48: {
                score_ = input.readUInt32();

                break;
              } // case 48
              case 72: {
                skillUseLimit_ = input.readUInt32();

                break;
              } // case 72
              case 80: {
                skillEnergy_ = input.readUInt32();

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

      private int score_ ;
      /**
       * <code>uint32 score = 6;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int captureWeaknessCount_ ;
      /**
       * <code>uint32 capture_weakness_count = 4;</code>
       * @return The captureWeaknessCount.
       */
      @java.lang.Override
      public int getCaptureWeaknessCount() {
        return captureWeaknessCount_;
      }
      /**
       * <code>uint32 capture_weakness_count = 4;</code>
       * @param value The captureWeaknessCount to set.
       * @return This builder for chaining.
       */
      public Builder setCaptureWeaknessCount(int value) {
        
        captureWeaknessCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 capture_weakness_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCaptureWeaknessCount() {
        
        captureWeaknessCount_ = 0;
        onChanged();
        return this;
      }

      private int skillEnergy_ ;
      /**
       * <code>uint32 skill_energy = 10;</code>
       * @return The skillEnergy.
       */
      @java.lang.Override
      public int getSkillEnergy() {
        return skillEnergy_;
      }
      /**
       * <code>uint32 skill_energy = 10;</code>
       * @param value The skillEnergy to set.
       * @return This builder for chaining.
       */
      public Builder setSkillEnergy(int value) {
        
        skillEnergy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_energy = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillEnergy() {
        
        skillEnergy_ = 0;
        onChanged();
        return this;
      }

      private int skillUseLimit_ ;
      /**
       * <code>uint32 skill_use_limit = 9;</code>
       * @return The skillUseLimit.
       */
      @java.lang.Override
      public int getSkillUseLimit() {
        return skillUseLimit_;
      }
      /**
       * <code>uint32 skill_use_limit = 9;</code>
       * @param value The skillUseLimit to set.
       * @return This builder for chaining.
       */
      public Builder setSkillUseLimit(int value) {
        
        skillUseLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_use_limit = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillUseLimit() {
        
        skillUseLimit_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryMuqadasPotionInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryMuqadasPotionInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryMuqadasPotionInfo>() {
      @java.lang.Override
      public SceneGalleryMuqadasPotionInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryMuqadasPotionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryMuqadasPotionInfoOuterClass.SceneGalleryMuqadasPotionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryMuqadasPotionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryMuqadasPotionInfo.proto\"}\n" +
      "\035SceneGalleryMuqadasPotionInfo\022\r\n\005score\030" +
      "\006 \001(\r\022\036\n\026capture_weakness_count\030\004 \001(\r\022\024\n" +
      "\014skill_energy\030\n \001(\r\022\027\n\017skill_use_limit\030\t" +
      " \001(\rB\036\n\034emu.grasscutter.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryMuqadasPotionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryMuqadasPotionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryMuqadasPotionInfo_descriptor,
        new java.lang.String[] { "Score", "CaptureWeaknessCount", "SkillEnergy", "SkillUseLimit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
