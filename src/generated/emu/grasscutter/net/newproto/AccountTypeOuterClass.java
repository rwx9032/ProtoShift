// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AccountType.proto

package emu.grasscutter.net.newproto;

public final class AccountTypeOuterClass {
  private AccountTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AccountType}
   */
  public enum AccountType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ACCOUNT_TYPE_MIHOYO_GUEST = 0;</code>
     */
    ACCOUNT_TYPE_MIHOYO_GUEST(0),
    /**
     * <code>ACCOUNT_TYPE_MIHOYO = 1;</code>
     */
    ACCOUNT_TYPE_MIHOYO(1),
    /**
     * <code>ACCOUNT_TYPE_XIAOMI = 11;</code>
     */
    ACCOUNT_TYPE_XIAOMI(11),
    /**
     * <code>ACCOUNT_TYPE_COOLPAD = 12;</code>
     */
    ACCOUNT_TYPE_COOLPAD(12),
    /**
     * <code>ACCOUNT_TYPE_YYB = 13;</code>
     */
    ACCOUNT_TYPE_YYB(13),
    /**
     * <code>ACCOUNT_TYPE_BILI = 14;</code>
     */
    ACCOUNT_TYPE_BILI(14),
    /**
     * <code>ACCOUNT_TYPE_HUAWEI = 15;</code>
     */
    ACCOUNT_TYPE_HUAWEI(15),
    /**
     * <code>ACCOUNT_TYPE_MEIZU = 16;</code>
     */
    ACCOUNT_TYPE_MEIZU(16),
    /**
     * <code>ACCOUNT_TYPE_360 = 17;</code>
     */
    ACCOUNT_TYPE_360(17),
    /**
     * <code>ACCOUNT_TYPE_OPPO = 18;</code>
     */
    ACCOUNT_TYPE_OPPO(18),
    /**
     * <code>ACCOUNT_TYPE_VIVO = 19;</code>
     */
    ACCOUNT_TYPE_VIVO(19),
    /**
     * <code>ACCOUNT_TYPE_UC = 20;</code>
     */
    ACCOUNT_TYPE_UC(20),
    /**
     * <code>ACCOUNT_TYPE_WANDOJIA = 21;</code>
     */
    ACCOUNT_TYPE_WANDOJIA(21),
    /**
     * <code>ACCOUNT_TYPE_LENOVO = 22;</code>
     */
    ACCOUNT_TYPE_LENOVO(22),
    /**
     * <code>ACCOUNT_TYPE_JINLI = 23;</code>
     */
    ACCOUNT_TYPE_JINLI(23),
    /**
     * <code>ACCOUNT_TYPE_BAIDU = 25;</code>
     */
    ACCOUNT_TYPE_BAIDU(25),
    /**
     * <code>ACCOUNT_TYPE_DANGLE = 26;</code>
     */
    ACCOUNT_TYPE_DANGLE(26),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ACCOUNT_TYPE_MIHOYO_GUEST = 0;</code>
     */
    public static final int ACCOUNT_TYPE_MIHOYO_GUEST_VALUE = 0;
    /**
     * <code>ACCOUNT_TYPE_MIHOYO = 1;</code>
     */
    public static final int ACCOUNT_TYPE_MIHOYO_VALUE = 1;
    /**
     * <code>ACCOUNT_TYPE_XIAOMI = 11;</code>
     */
    public static final int ACCOUNT_TYPE_XIAOMI_VALUE = 11;
    /**
     * <code>ACCOUNT_TYPE_COOLPAD = 12;</code>
     */
    public static final int ACCOUNT_TYPE_COOLPAD_VALUE = 12;
    /**
     * <code>ACCOUNT_TYPE_YYB = 13;</code>
     */
    public static final int ACCOUNT_TYPE_YYB_VALUE = 13;
    /**
     * <code>ACCOUNT_TYPE_BILI = 14;</code>
     */
    public static final int ACCOUNT_TYPE_BILI_VALUE = 14;
    /**
     * <code>ACCOUNT_TYPE_HUAWEI = 15;</code>
     */
    public static final int ACCOUNT_TYPE_HUAWEI_VALUE = 15;
    /**
     * <code>ACCOUNT_TYPE_MEIZU = 16;</code>
     */
    public static final int ACCOUNT_TYPE_MEIZU_VALUE = 16;
    /**
     * <code>ACCOUNT_TYPE_360 = 17;</code>
     */
    public static final int ACCOUNT_TYPE_360_VALUE = 17;
    /**
     * <code>ACCOUNT_TYPE_OPPO = 18;</code>
     */
    public static final int ACCOUNT_TYPE_OPPO_VALUE = 18;
    /**
     * <code>ACCOUNT_TYPE_VIVO = 19;</code>
     */
    public static final int ACCOUNT_TYPE_VIVO_VALUE = 19;
    /**
     * <code>ACCOUNT_TYPE_UC = 20;</code>
     */
    public static final int ACCOUNT_TYPE_UC_VALUE = 20;
    /**
     * <code>ACCOUNT_TYPE_WANDOJIA = 21;</code>
     */
    public static final int ACCOUNT_TYPE_WANDOJIA_VALUE = 21;
    /**
     * <code>ACCOUNT_TYPE_LENOVO = 22;</code>
     */
    public static final int ACCOUNT_TYPE_LENOVO_VALUE = 22;
    /**
     * <code>ACCOUNT_TYPE_JINLI = 23;</code>
     */
    public static final int ACCOUNT_TYPE_JINLI_VALUE = 23;
    /**
     * <code>ACCOUNT_TYPE_BAIDU = 25;</code>
     */
    public static final int ACCOUNT_TYPE_BAIDU_VALUE = 25;
    /**
     * <code>ACCOUNT_TYPE_DANGLE = 26;</code>
     */
    public static final int ACCOUNT_TYPE_DANGLE_VALUE = 26;


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
    public static AccountType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccountType forNumber(int value) {
      switch (value) {
        case 0: return ACCOUNT_TYPE_MIHOYO_GUEST;
        case 1: return ACCOUNT_TYPE_MIHOYO;
        case 11: return ACCOUNT_TYPE_XIAOMI;
        case 12: return ACCOUNT_TYPE_COOLPAD;
        case 13: return ACCOUNT_TYPE_YYB;
        case 14: return ACCOUNT_TYPE_BILI;
        case 15: return ACCOUNT_TYPE_HUAWEI;
        case 16: return ACCOUNT_TYPE_MEIZU;
        case 17: return ACCOUNT_TYPE_360;
        case 18: return ACCOUNT_TYPE_OPPO;
        case 19: return ACCOUNT_TYPE_VIVO;
        case 20: return ACCOUNT_TYPE_UC;
        case 21: return ACCOUNT_TYPE_WANDOJIA;
        case 22: return ACCOUNT_TYPE_LENOVO;
        case 23: return ACCOUNT_TYPE_JINLI;
        case 25: return ACCOUNT_TYPE_BAIDU;
        case 26: return ACCOUNT_TYPE_DANGLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccountType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AccountType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccountType>() {
            public AccountType findValueByNumber(int number) {
              return AccountType.forNumber(number);
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
      return emu.grasscutter.net.newproto.AccountTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccountType[] VALUES = values();

    public static AccountType valueOf(
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

    private AccountType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AccountType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AccountType.proto*\254\003\n\013AccountType\022\035\n\031A" +
      "CCOUNT_TYPE_MIHOYO_GUEST\020\000\022\027\n\023ACCOUNT_TY" +
      "PE_MIHOYO\020\001\022\027\n\023ACCOUNT_TYPE_XIAOMI\020\013\022\030\n\024" +
      "ACCOUNT_TYPE_COOLPAD\020\014\022\024\n\020ACCOUNT_TYPE_Y" +
      "YB\020\r\022\025\n\021ACCOUNT_TYPE_BILI\020\016\022\027\n\023ACCOUNT_T" +
      "YPE_HUAWEI\020\017\022\026\n\022ACCOUNT_TYPE_MEIZU\020\020\022\024\n\020" +
      "ACCOUNT_TYPE_360\020\021\022\025\n\021ACCOUNT_TYPE_OPPO\020" +
      "\022\022\025\n\021ACCOUNT_TYPE_VIVO\020\023\022\023\n\017ACCOUNT_TYPE" +
      "_UC\020\024\022\031\n\025ACCOUNT_TYPE_WANDOJIA\020\025\022\027\n\023ACCO" +
      "UNT_TYPE_LENOVO\020\026\022\026\n\022ACCOUNT_TYPE_JINLI\020" +
      "\027\022\026\n\022ACCOUNT_TYPE_BAIDU\020\031\022\027\n\023ACCOUNT_TYP" +
      "E_DANGLE\020\032B\036\n\034emu.grasscutter.net.newpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
