// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DropSubfieldType.proto

package emu.grasscutter.net.newproto;

public final class DropSubfieldTypeOuterClass {
  private DropSubfieldTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DropSubfieldType}
   */
  public enum DropSubfieldType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DROP_SUBFIELD_TYPE_NONE = 0;</code>
     */
    DROP_SUBFIELD_TYPE_NONE(0),
    /**
     * <code>DROP_SUBFIELD_TYPE_ONE = 1;</code>
     */
    DROP_SUBFIELD_TYPE_ONE(1),
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_NNGMHCEADHE = 2;</code>
     */
    DROP_SUBFIELD_TYPE_Unk2700_NNGMHCEADHE(2),
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_MKIJPEHKAJI = 3;</code>
     */
    DROP_SUBFIELD_TYPE_Unk2700_MKIJPEHKAJI(3),
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_DJDNENLGIEB = 4;</code>
     */
    DROP_SUBFIELD_TYPE_Unk2700_DJDNENLGIEB(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DROP_SUBFIELD_TYPE_NONE = 0;</code>
     */
    public static final int DROP_SUBFIELD_TYPE_NONE_VALUE = 0;
    /**
     * <code>DROP_SUBFIELD_TYPE_ONE = 1;</code>
     */
    public static final int DROP_SUBFIELD_TYPE_ONE_VALUE = 1;
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_NNGMHCEADHE = 2;</code>
     */
    public static final int DROP_SUBFIELD_TYPE_Unk2700_NNGMHCEADHE_VALUE = 2;
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_MKIJPEHKAJI = 3;</code>
     */
    public static final int DROP_SUBFIELD_TYPE_Unk2700_MKIJPEHKAJI_VALUE = 3;
    /**
     * <code>DROP_SUBFIELD_TYPE_Unk2700_DJDNENLGIEB = 4;</code>
     */
    public static final int DROP_SUBFIELD_TYPE_Unk2700_DJDNENLGIEB_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DropSubfieldType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DropSubfieldType forNumber(int value) {
      switch (value) {
        case 0: return DROP_SUBFIELD_TYPE_NONE;
        case 1: return DROP_SUBFIELD_TYPE_ONE;
        case 2: return DROP_SUBFIELD_TYPE_Unk2700_NNGMHCEADHE;
        case 3: return DROP_SUBFIELD_TYPE_Unk2700_MKIJPEHKAJI;
        case 4: return DROP_SUBFIELD_TYPE_Unk2700_DJDNENLGIEB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DropSubfieldType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DropSubfieldType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DropSubfieldType>() {
            public DropSubfieldType findValueByNumber(int number) {
              return DropSubfieldType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.DropSubfieldTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DropSubfieldType[] VALUES = values();

    public static DropSubfieldType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DropSubfieldType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DropSubfieldType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DropSubfieldType.proto*\317\001\n\020DropSubfiel" +
      "dType\022\033\n\027DROP_SUBFIELD_TYPE_NONE\020\000\022\032\n\026DR" +
      "OP_SUBFIELD_TYPE_ONE\020\001\022*\n&DROP_SUBFIELD_" +
      "TYPE_Unk2700_NNGMHCEADHE\020\002\022*\n&DROP_SUBFI" +
      "ELD_TYPE_Unk2700_MKIJPEHKAJI\020\003\022*\n&DROP_S" +
      "UBFIELD_TYPE_Unk2700_DJDNENLGIEB\020\004B\036\n\034em" +
      "u.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
