package com.epam.quiz.management.model;

import com.epam.quiz.management.util.SeedDatabase;

public class User {
    private String userName;
    private String password;
    private Boolean isAdmin=true;
    private  int id;

    public User(String userName, String password, Boolean isAdmin) {
        this.id= SeedDatabase.idGenerator++;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public int getId(){
        return this.id;
    }
}
