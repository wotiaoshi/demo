package com.example.demo1.clonetest;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class User implements Cloneable{
    private String userName;
    private Integer password;
    private Cat cat;

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, Integer password, Cat cat) {
        this.userName = userName;
        this.password = password;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", cat=" + cat +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
    public User clone(){
        User user = null;
        try {
             user = (User) super.clone();
             user.setCat(cat.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
