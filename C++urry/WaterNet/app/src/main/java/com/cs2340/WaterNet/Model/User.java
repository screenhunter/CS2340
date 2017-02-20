package com.cs2340.WaterNet.Model;

/**
 * Created by rajatkhanna on 2/18/17.
 */

public class User {

    private String username, email;
    private static int userCount;
    private int userId;
    UserType userType = UserType.USER;


    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        userCount++;
        userId = userCount;
    }

    public String toString() {
        return username + " " + email;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getUserId() {
        return userId;
    }
}
