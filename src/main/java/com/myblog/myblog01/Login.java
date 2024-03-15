package com.myblog.myblog01;

public class Login {

    private String userName;
    private String password;

    public Login(String userName, String password) {//instead of setters use constructor based injection
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
