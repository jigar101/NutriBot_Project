package com.apps.utils;

import java.io.Serializable;

public class ItemUser implements Serializable {

    String id,name,username,pass,email,contact;

    public ItemUser(String id,String name,String username,String pass,String email,String contact) {
        this.id= id;
        this.name= name;
        this.username= username;
        this.pass= pass;
        this.email= email;
        this.contact= contact;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }
}