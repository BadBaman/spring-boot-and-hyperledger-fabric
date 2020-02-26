package com.example.contact.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-02-25 23:33:18
 */
public class User implements Serializable {
    private static final long serialVersionUID = 150759008588936178L;
    
    private String username;
    
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}