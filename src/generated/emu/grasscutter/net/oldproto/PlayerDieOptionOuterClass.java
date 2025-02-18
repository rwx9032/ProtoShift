// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerDieOption.proto

package emu.grasscutter.net.oldproto;

public final class PlayerDieOptionOuterClass {
  private PlayerDieOptionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PlayerDieOption}
   */
  public enum PlayerDieOption
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PLAYER_DIE_OPTION_OPT_NONE = 0;</code>
     */
    PLAYER_DIE_OPTION_OPT_NONE(0),
    /**
     * <code>PLAYER_DIE_OPTION_OPT_REPLAY = 1;</code>
     */
    PLAYER_DIE_OPTION_OPT_REPLAY(1),
    /**
     * <code>PLAYER_DIE_OPTION_OPT_CANCEL = 2;</code>
     */
    PLAYER_DIE_OPTION_OPT_CANCEL(2),
    /**
     * <code>PLAYER_DIE_OPTION_OPT_REVIVE = 3;</code>
     */
    PLAYER_DIE_OPTION_OPT_REVIVE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PLAYER_DIE_OPTION_OPT_NONE = 0;</code>
     */
    public static final int PLAYER_DIE_OPTION_OPT_NONE_VALUE = 0;
    /**
     * <code>PLAYER_DIE_OPTION_OPT_REPLAY = 1;</code>
     */
    public static final int PLAYER_DIE_OPTION_OPT_REPLAY_VALUE = 1;
    /**
     * <code>PLAYER_DIE_OPTION_OPT_CANCEL = 2;</code>
     */
    public static final int PLAYER_DIE_OPTION_OPT_CANCEL_VALUE = 2;
    /**
     * <code>PLAYER_DIE_OPTION_OPT_REVIVE = 3;</code>
     */
    public static final int PLAYER_DIE_OPTION_OPT_REVIVE_VALUE = 3;


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
    public static PlayerDieOption valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerDieOption forNumber(int value) {
      switch (value) {
        case 0: return PLAYER_DIE_OPTION_OPT_NONE;
        case 1: return PLAYER_DIE_OPTION_OPT_REPLAY;
        case 2: return PLAYER_DIE_OPTION_OPT_CANCEL;
        case 3: return PLAYER_DIE_OPTION_OPT_REVIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerDieOption>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerDieOption> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerDieOption>() {
            public PlayerDieOption findValueByNumber(int number) {
              return PlayerDieOption.forNumber(number);
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
      return emu.grasscutter.net.oldproto.PlayerDieOptionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlayerDieOption[] VALUES = values();

    public static PlayerDieOption valueOf(
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

    private PlayerDieOption(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PlayerDieOption)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025PlayerDieOption.proto*\227\001\n\017PlayerDieOpt" +
      "ion\022\036\n\032PLAYER_DIE_OPTION_OPT_NONE\020\000\022 \n\034P" +
      "LAYER_DIE_OPTION_OPT_REPLAY\020\001\022 \n\034PLAYER_" +
      "DIE_OPTION_OPT_CANCEL\020\002\022 \n\034PLAYER_DIE_OP" +
      "TION_OPT_REVIVE\020\003B\036\n\034emu.grasscutter.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
