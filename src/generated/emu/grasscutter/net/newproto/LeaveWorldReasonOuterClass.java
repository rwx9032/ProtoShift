// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LeaveWorldReason.proto

package emu.grasscutter.net.newproto;

public final class LeaveWorldReasonOuterClass {
  private LeaveWorldReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code LeaveWorldReason}
   */
  public enum LeaveWorldReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>LEAVE_WORLD_REASON_NONE = 0;</code>
     */
    LEAVE_WORLD_REASON_NONE(0),
    /**
     * <code>LEAVE_WORLD_REASON_LOGOUT = 1;</code>
     */
    LEAVE_WORLD_REASON_LOGOUT(1),
    /**
     * <code>LEAVE_WORLD_REASON_BACK_MY_WORLD = 2;</code>
     */
    LEAVE_WORLD_REASON_BACK_MY_WORLD(2),
    /**
     * <code>LEAVE_WORLD_REASON_KICK_BY_OWNER = 3;</code>
     */
    LEAVE_WORLD_REASON_KICK_BY_OWNER(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>LEAVE_WORLD_REASON_NONE = 0;</code>
     */
    public static final int LEAVE_WORLD_REASON_NONE_VALUE = 0;
    /**
     * <code>LEAVE_WORLD_REASON_LOGOUT = 1;</code>
     */
    public static final int LEAVE_WORLD_REASON_LOGOUT_VALUE = 1;
    /**
     * <code>LEAVE_WORLD_REASON_BACK_MY_WORLD = 2;</code>
     */
    public static final int LEAVE_WORLD_REASON_BACK_MY_WORLD_VALUE = 2;
    /**
     * <code>LEAVE_WORLD_REASON_KICK_BY_OWNER = 3;</code>
     */
    public static final int LEAVE_WORLD_REASON_KICK_BY_OWNER_VALUE = 3;


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
    public static LeaveWorldReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LeaveWorldReason forNumber(int value) {
      switch (value) {
        case 0: return LEAVE_WORLD_REASON_NONE;
        case 1: return LEAVE_WORLD_REASON_LOGOUT;
        case 2: return LEAVE_WORLD_REASON_BACK_MY_WORLD;
        case 3: return LEAVE_WORLD_REASON_KICK_BY_OWNER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LeaveWorldReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LeaveWorldReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LeaveWorldReason>() {
            public LeaveWorldReason findValueByNumber(int number) {
              return LeaveWorldReason.forNumber(number);
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
      return emu.grasscutter.net.newproto.LeaveWorldReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final LeaveWorldReason[] VALUES = values();

    public static LeaveWorldReason valueOf(
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

    private LeaveWorldReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:LeaveWorldReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026LeaveWorldReason.proto*\232\001\n\020LeaveWorldR" +
      "eason\022\033\n\027LEAVE_WORLD_REASON_NONE\020\000\022\035\n\031LE" +
      "AVE_WORLD_REASON_LOGOUT\020\001\022$\n LEAVE_WORLD" +
      "_REASON_BACK_MY_WORLD\020\002\022$\n LEAVE_WORLD_R" +
      "EASON_KICK_BY_OWNER\020\003B\036\n\034emu.grasscutter" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
