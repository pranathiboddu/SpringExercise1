package com.stackroute.springmvc;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
