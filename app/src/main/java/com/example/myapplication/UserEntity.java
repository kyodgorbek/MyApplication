package com.example.myapplication;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toUser(@NotNull User user) {

        user.setId(id);

        user.setName(name);
    }

    public static UserEntity fromUser(User user) {

        UserEntity entity = new UserEntity();

        entity.setName(user.getName());

        if(user.getId() != null && !user.getId().isEmpty()) {

            entity.setId(Integer.valueOf(user.getId()));
        }
        return entity;
    }
}






















































































































































































































