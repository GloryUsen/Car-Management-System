package org.example.model;

import java.io.Serializable;

public class User implements Serializable {
    private static int isCounter = 1;
    private int userId;
    private String userName;

    public User(String userName) {
        this.userId = isCounter++;
        this.userName = userName;
    }

    public User(){

    }

    public static int getIsCounter() {
        return isCounter;
    }

    public static void setIsCounter(int isCounter) {
        User.isCounter = isCounter;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
