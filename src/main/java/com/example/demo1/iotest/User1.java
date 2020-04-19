package com.example.demo1.iotest;

import java.io.Serializable;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class User1 implements Serializable {
    private static final long seriousVersionUid = 56;
    private String username;

    public User1(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
