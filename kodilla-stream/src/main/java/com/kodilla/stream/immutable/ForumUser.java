package com.kodilla.stream.immutable;

public class ForumUser {
    private final String username;
    private final String realName;

    private ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    private String getUsername() {
        return username;
    }

    private String getRealName() {
        return realName;
    }
}
