// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneAreaWeatherNotify.proto

package emu.grasscutter.net.newproto;

public final class SceneAreaWeatherNotifyOuterClass {
  private SceneAreaWeatherNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneAreaWeatherNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneAreaWeatherNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 weather_gadget_id = 6;</code>
     * @return The weatherGadgetId.
     */
    int getWeatherGadgetId();

    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    int getWeatherValueMapCount();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    boolean containsWeatherValueMap(
        int key);
    /**
     * Use {@link #getWeatherValueMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.String>
    getWeatherValueMap();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.String>
    getWeatherValueMapMap();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */

    /* nullable */
java.lang.String getWeatherValueMapOrDefault(
        int key,
        /* nullable */
java.lang.String defaultValue);
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */

    java.lang.String getWeatherValueMapOrThrow(
        int key);

    /**
     * <code>uint32 climate_type = 7;</code>
     * @return The climateType.
     */
    int getClimateType();

    /**
     * <code>float trans_duration = 10;</code>
     * @return The transDuration.
     */
    float getTransDuration();

    /**
     * <code>uint32 weather_area_id = 15;</code>
     * @return The weatherAreaId.
     */
    int getWeatherAreaId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 250;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneAreaWeatherNotify}
   */
  public static final class SceneAreaWeatherNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneAreaWeatherNotify)
      SceneAreaWeatherNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneAreaWeatherNotify.newBuilder() to construct.
    private SceneAreaWeatherNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneAreaWeatherNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneAreaWeatherNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetWeatherValueMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.class, emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.Builder.class);
    }

    public static final int WEATHER_GADGET_ID_FIELD_NUMBER = 6;
    private int weatherGadgetId_;
    /**
     * <code>uint32 weather_gadget_id = 6;</code>
     * @return The weatherGadgetId.
     */
    @java.lang.Override
    public int getWeatherGadgetId() {
      return weatherGadgetId_;
    }

    public static final int WEATHER_VALUE_MAP_FIELD_NUMBER = 11;
    private static final class WeatherValueMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.String>newDefaultInstance(
                  emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.String> weatherValueMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
    internalGetWeatherValueMap() {
      if (weatherValueMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            WeatherValueMapDefaultEntryHolder.defaultEntry);
      }
      return weatherValueMap_;
    }

    public int getWeatherValueMapCount() {
      return internalGetWeatherValueMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */

    @java.lang.Override
    public boolean containsWeatherValueMap(
        int key) {
      
      return internalGetWeatherValueMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getWeatherValueMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMap() {
      return getWeatherValueMapMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMapMap() {
      return internalGetWeatherValueMap().getMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    @java.lang.Override

    public java.lang.String getWeatherValueMapOrDefault(
        int key,
        java.lang.String defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetWeatherValueMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
     */
    @java.lang.Override

    public java.lang.String getWeatherValueMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetWeatherValueMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int CLIMATE_TYPE_FIELD_NUMBER = 7;
    private int climateType_;
    /**
     * <code>uint32 climate_type = 7;</code>
     * @return The climateType.
     */
    @java.lang.Override
    public int getClimateType() {
      return climateType_;
    }

    public static final int TRANS_DURATION_FIELD_NUMBER = 10;
    private float transDuration_;
    /**
     * <code>float trans_duration = 10;</code>
     * @return The transDuration.
     */
    @java.lang.Override
    public float getTransDuration() {
      return transDuration_;
    }

    public static final int WEATHER_AREA_ID_FIELD_NUMBER = 15;
    private int weatherAreaId_;
    /**
     * <code>uint32 weather_area_id = 15;</code>
     * @return The weatherAreaId.
     */
    @java.lang.Override
    public int getWeatherAreaId() {
      return weatherAreaId_;
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
      if (weatherGadgetId_ != 0) {
        output.writeUInt32(6, weatherGadgetId_);
      }
      if (climateType_ != 0) {
        output.writeUInt32(7, climateType_);
      }
      if (java.lang.Float.floatToRawIntBits(transDuration_) != 0) {
        output.writeFloat(10, transDuration_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetWeatherValueMap(),
          WeatherValueMapDefaultEntryHolder.defaultEntry,
          11);
      if (weatherAreaId_ != 0) {
        output.writeUInt32(15, weatherAreaId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (weatherGadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, weatherGadgetId_);
      }
      if (climateType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, climateType_);
      }
      if (java.lang.Float.floatToRawIntBits(transDuration_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(10, transDuration_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
           : internalGetWeatherValueMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
        weatherValueMap__ = WeatherValueMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(11, weatherValueMap__);
      }
      if (weatherAreaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, weatherAreaId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify other = (emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify) obj;

      if (getWeatherGadgetId()
          != other.getWeatherGadgetId()) return false;
      if (!internalGetWeatherValueMap().equals(
          other.internalGetWeatherValueMap())) return false;
      if (getClimateType()
          != other.getClimateType()) return false;
      if (java.lang.Float.floatToIntBits(getTransDuration())
          != java.lang.Float.floatToIntBits(
              other.getTransDuration())) return false;
      if (getWeatherAreaId()
          != other.getWeatherAreaId()) return false;
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
      hash = (37 * hash) + WEATHER_GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherGadgetId();
      if (!internalGetWeatherValueMap().getMap().isEmpty()) {
        hash = (37 * hash) + WEATHER_VALUE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetWeatherValueMap().hashCode();
      }
      hash = (37 * hash) + CLIMATE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getClimateType();
      hash = (37 * hash) + TRANS_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getTransDuration());
      hash = (37 * hash) + WEATHER_AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherAreaId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify prototype) {
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
     *   CMD_ID = 250;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneAreaWeatherNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneAreaWeatherNotify)
        emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetWeatherValueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetMutableWeatherValueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.class, emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        weatherGadgetId_ = 0;

        internalGetMutableWeatherValueMap().clear();
        climateType_ = 0;

        transDuration_ = 0F;

        weatherAreaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.internal_static_SceneAreaWeatherNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify build() {
        emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify buildPartial() {
        emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify result = new emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify(this);
        int from_bitField0_ = bitField0_;
        result.weatherGadgetId_ = weatherGadgetId_;
        result.weatherValueMap_ = internalGetWeatherValueMap();
        result.weatherValueMap_.makeImmutable();
        result.climateType_ = climateType_;
        result.transDuration_ = transDuration_;
        result.weatherAreaId_ = weatherAreaId_;
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
        if (other instanceof emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify other) {
        if (other == emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify.getDefaultInstance()) return this;
        if (other.getWeatherGadgetId() != 0) {
          setWeatherGadgetId(other.getWeatherGadgetId());
        }
        internalGetMutableWeatherValueMap().mergeFrom(
            other.internalGetWeatherValueMap());
        if (other.getClimateType() != 0) {
          setClimateType(other.getClimateType());
        }
        if (other.getTransDuration() != 0F) {
          setTransDuration(other.getTransDuration());
        }
        if (other.getWeatherAreaId() != 0) {
          setWeatherAreaId(other.getWeatherAreaId());
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
              case 48: {
                weatherGadgetId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                climateType_ = input.readUInt32();

                break;
              } // case 56
              case 85: {
                transDuration_ = input.readFloat();

                break;
              } // case 85
              case 90: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
                weatherValueMap__ = input.readMessage(
                    WeatherValueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableWeatherValueMap().getMutableMap().put(
                    weatherValueMap__.getKey(), weatherValueMap__.getValue());
                break;
              } // case 90
              case 120: {
                weatherAreaId_ = input.readUInt32();

                break;
              } // case 120
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

      private int weatherGadgetId_ ;
      /**
       * <code>uint32 weather_gadget_id = 6;</code>
       * @return The weatherGadgetId.
       */
      @java.lang.Override
      public int getWeatherGadgetId() {
        return weatherGadgetId_;
      }
      /**
       * <code>uint32 weather_gadget_id = 6;</code>
       * @param value The weatherGadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherGadgetId(int value) {
        
        weatherGadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_gadget_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherGadgetId() {
        
        weatherGadgetId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.String> weatherValueMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
      internalGetWeatherValueMap() {
        if (weatherValueMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              WeatherValueMapDefaultEntryHolder.defaultEntry);
        }
        return weatherValueMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
      internalGetMutableWeatherValueMap() {
        onChanged();;
        if (weatherValueMap_ == null) {
          weatherValueMap_ = com.google.protobuf.MapField.newMapField(
              WeatherValueMapDefaultEntryHolder.defaultEntry);
        }
        if (!weatherValueMap_.isMutable()) {
          weatherValueMap_ = weatherValueMap_.copy();
        }
        return weatherValueMap_;
      }

      public int getWeatherValueMapCount() {
        return internalGetWeatherValueMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */

      @java.lang.Override
      public boolean containsWeatherValueMap(
          int key) {
        
        return internalGetWeatherValueMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getWeatherValueMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMap() {
        return getWeatherValueMapMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMapMap() {
        return internalGetWeatherValueMap().getMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */
      @java.lang.Override

      public java.lang.String getWeatherValueMapOrDefault(
          int key,
          java.lang.String defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetWeatherValueMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */
      @java.lang.Override

      public java.lang.String getWeatherValueMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetWeatherValueMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearWeatherValueMap() {
        internalGetMutableWeatherValueMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */

      public Builder removeWeatherValueMap(
          int key) {
        
        internalGetMutableWeatherValueMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String>
      getMutableWeatherValueMap() {
        return internalGetMutableWeatherValueMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */
      public Builder putWeatherValueMap(
          int key,
          java.lang.String value) {
        
        if (value == null) {
  throw new NullPointerException("map value");
}

        internalGetMutableWeatherValueMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 11;</code>
       */

      public Builder putAllWeatherValueMap(
          java.util.Map<java.lang.Integer, java.lang.String> values) {
        internalGetMutableWeatherValueMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int climateType_ ;
      /**
       * <code>uint32 climate_type = 7;</code>
       * @return The climateType.
       */
      @java.lang.Override
      public int getClimateType() {
        return climateType_;
      }
      /**
       * <code>uint32 climate_type = 7;</code>
       * @param value The climateType to set.
       * @return This builder for chaining.
       */
      public Builder setClimateType(int value) {
        
        climateType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 climate_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearClimateType() {
        
        climateType_ = 0;
        onChanged();
        return this;
      }

      private float transDuration_ ;
      /**
       * <code>float trans_duration = 10;</code>
       * @return The transDuration.
       */
      @java.lang.Override
      public float getTransDuration() {
        return transDuration_;
      }
      /**
       * <code>float trans_duration = 10;</code>
       * @param value The transDuration to set.
       * @return This builder for chaining.
       */
      public Builder setTransDuration(float value) {
        
        transDuration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float trans_duration = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTransDuration() {
        
        transDuration_ = 0F;
        onChanged();
        return this;
      }

      private int weatherAreaId_ ;
      /**
       * <code>uint32 weather_area_id = 15;</code>
       * @return The weatherAreaId.
       */
      @java.lang.Override
      public int getWeatherAreaId() {
        return weatherAreaId_;
      }
      /**
       * <code>uint32 weather_area_id = 15;</code>
       * @param value The weatherAreaId to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherAreaId(int value) {
        
        weatherAreaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_area_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherAreaId() {
        
        weatherAreaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneAreaWeatherNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneAreaWeatherNotify)
    private static final emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify();
    }

    public static emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneAreaWeatherNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneAreaWeatherNotify>() {
      @java.lang.Override
      public SceneAreaWeatherNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneAreaWeatherNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneAreaWeatherNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.SceneAreaWeatherNotifyOuterClass.SceneAreaWeatherNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneAreaWeatherNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneAreaWeatherNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneAreaWeatherNotify.proto\"\373\001\n\026Scene" +
      "AreaWeatherNotify\022\031\n\021weather_gadget_id\030\006" +
      " \001(\r\022G\n\021weather_value_map\030\013 \003(\0132,.SceneA" +
      "reaWeatherNotify.WeatherValueMapEntry\022\024\n" +
      "\014climate_type\030\007 \001(\r\022\026\n\016trans_duration\030\n " +
      "\001(\002\022\027\n\017weather_area_id\030\017 \001(\r\0326\n\024WeatherV" +
      "alueMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\t" +
      ":\0028\001B\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneAreaWeatherNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneAreaWeatherNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneAreaWeatherNotify_descriptor,
        new java.lang.String[] { "WeatherGadgetId", "WeatherValueMap", "ClimateType", "TransDuration", "WeatherAreaId", });
    internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor =
      internal_static_SceneAreaWeatherNotify_descriptor.getNestedTypes().get(0);
    internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneAreaWeatherNotify_WeatherValueMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
