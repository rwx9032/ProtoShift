// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_FMAOEPEBKHB.proto

package emu.grasscutter.net.newproto;

public final class Unk2800FMAOEPEBKHB {
  private Unk2800FMAOEPEBKHB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk2800_FMAOEPEBKHB}
   */
  public enum Unk2800_FMAOEPEBKHB
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO = 0;</code>
     */
    Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO(0),
    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_GFHGOAMCAJH = 1;</code>
     */
    Unk2800_FMAOEPEBKHB_Unk2800_GFHGOAMCAJH(1),
    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_FOBCHIGNEJB = 2;</code>
     */
    Unk2800_FMAOEPEBKHB_Unk2800_FOBCHIGNEJB(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO = 0;</code>
     */
    public static final int Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO_VALUE = 0;
    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_GFHGOAMCAJH = 1;</code>
     */
    public static final int Unk2800_FMAOEPEBKHB_Unk2800_GFHGOAMCAJH_VALUE = 1;
    /**
     * <code>Unk2800_FMAOEPEBKHB_Unk2800_FOBCHIGNEJB = 2;</code>
     */
    public static final int Unk2800_FMAOEPEBKHB_Unk2800_FOBCHIGNEJB_VALUE = 2;


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
    public static Unk2800_FMAOEPEBKHB valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk2800_FMAOEPEBKHB forNumber(int value) {
      switch (value) {
        case 0: return Unk2800_FMAOEPEBKHB_Unk2800_IBMPPHFLKEO;
        case 1: return Unk2800_FMAOEPEBKHB_Unk2800_GFHGOAMCAJH;
        case 2: return Unk2800_FMAOEPEBKHB_Unk2800_FOBCHIGNEJB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk2800_FMAOEPEBKHB>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk2800_FMAOEPEBKHB> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk2800_FMAOEPEBKHB>() {
            public Unk2800_FMAOEPEBKHB findValueByNumber(int number) {
              return Unk2800_FMAOEPEBKHB.forNumber(number);
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
      return emu.grasscutter.net.newproto.Unk2800FMAOEPEBKHB.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk2800_FMAOEPEBKHB[] VALUES = values();

    public static Unk2800_FMAOEPEBKHB valueOf(
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

    private Unk2800_FMAOEPEBKHB(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk2800_FMAOEPEBKHB)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_FMAOEPEBKHB.proto*\234\001\n\023Unk2800_" +
      "FMAOEPEBKHB\022+\n\'Unk2800_FMAOEPEBKHB_Unk28" +
      "00_IBMPPHFLKEO\020\000\022+\n\'Unk2800_FMAOEPEBKHB_" +
      "Unk2800_GFHGOAMCAJH\020\001\022+\n\'Unk2800_FMAOEPE" +
      "BKHB_Unk2800_FOBCHIGNEJB\020\002B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
