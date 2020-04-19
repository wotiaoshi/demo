package com.example.demo1.iotest;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class User implements Serializable {
    private static final long seriousVersionUid = 1;
    private transient String userName;
    private String email;
    static String notes = "你好";
    private Integer password;
    private User1 user1;

    public User(String userName, String email, Integer password, User1 user1) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.user1 = user1;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", user1=" + user1 +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
