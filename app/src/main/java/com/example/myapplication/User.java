package com.example.myapplication;


import android.graphics.Bitmap;


import androidx.room.Ignore;

import com.github.bassaer.chatmessageview.model.IChatUser;



public class User implements IChatUser {
    private Integer id;

    private String name;

    @Ignore
    Bitmap icon;

    public User() {
    }

    public User(int id, String name, Bitmap icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    @Override
    public String getId() {
        return this.id.toString();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Bitmap getIcon() {
        return this.icon;
    }


    @Override
    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}