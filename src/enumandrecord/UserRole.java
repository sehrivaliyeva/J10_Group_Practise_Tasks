package enumandrecord;

public enum UserRole {
    ADMIN(4),
    MODERATOR(3),
    USER(2),
    GUEST(1);

    final int permissionLevel;

    UserRole(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    boolean hasPermission(int requiredLevel){
        return permissionLevel >= requiredLevel;
    }
}
