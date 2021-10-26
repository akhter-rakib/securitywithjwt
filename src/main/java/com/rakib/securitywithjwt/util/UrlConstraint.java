package com.rakib.securitywithjwt.util;

public final class UrlConstraint {
    private UrlConstraint() {
    }

    private static final String VERSION = "/v1";
    private static final String API = "/api";

    public static class UserManagement {
        public static final String ROOT = VERSION + API + "/users";
    }

    public static class RoleManagement {
        public static final String ROOT = VERSION + API + "/roles";
    }
}
