package com.feignEntity;

import java.util.Date;

public class Book {


    private int id;
    private String name;
    private Date lausnch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLausnch() {
        return lausnch;
    }

    public void setLausnch(Date lausnch) {
        this.lausnch = lausnch;
    }
}
