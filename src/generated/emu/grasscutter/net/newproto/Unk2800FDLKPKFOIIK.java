// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_FDLKPKFOIIK.proto

package emu.grasscutter.net.newproto;

public final class Unk2800FDLKPKFOIIK {
  private Unk2800FDLKPKFOIIK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk2800_FDLKPKFOIIK}
   */
  public enum Unk2800_FDLKPKFOIIK
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk2800_FDLKPKFOIIK_NONE = 0;</code>
     */
    Unk2800_FDLKPKFOIIK_NONE(0),
    /**
     * <code>Unk2800_FDLKPKFOIIK_START = 1;</code>
     */
    Unk2800_FDLKPKFOIIK_START(1),
    /**
     * <code>Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO = 2;</code>
     */
    Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk2800_FDLKPKFOIIK_NONE = 0;</code>
     */
    public static final int Unk2800_FDLKPKFOIIK_NONE_VALUE = 0;
    /**
     * <code>Unk2800_FDLKPKFOIIK_START = 1;</code>
     */
    public static final int Unk2800_FDLKPKFOIIK_START_VALUE = 1;
    /**
     * <code>Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO = 2;</code>
     */
    public static final int Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO_VALUE = 2;


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
    public static Unk2800_FDLKPKFOIIK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk2800_FDLKPKFOIIK forNumber(int value) {
      switch (value) {
        case 0: return Unk2800_FDLKPKFOIIK_NONE;
        case 1: return Unk2800_FDLKPKFOIIK_START;
        case 2: return Unk2800_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk2800_FDLKPKFOIIK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk2800_FDLKPKFOIIK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk2800_FDLKPKFOIIK>() {
            public Unk2800_FDLKPKFOIIK findValueByNumber(int number) {
              return Unk2800_FDLKPKFOIIK.forNumber(number);
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
      return emu.grasscutter.net.newproto.Unk2800FDLKPKFOIIK.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk2800_FDLKPKFOIIK[] VALUES = values();

    public static Unk2800_FDLKPKFOIIK valueOf(
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

    private Unk2800_FDLKPKFOIIK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk2800_FDLKPKFOIIK)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_FDLKPKFOIIK.proto*\177\n\023Unk2800_F" +
      "DLKPKFOIIK\022\034\n\030Unk2800_FDLKPKFOIIK_NONE\020\000" +
      "\022\035\n\031Unk2800_FDLKPKFOIIK_START\020\001\022+\n\'Unk28" +
      "00_FDLKPKFOIIK_Unk2800_FDPBDHDHAKO\020\002B\036\n\034" +
      "emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
