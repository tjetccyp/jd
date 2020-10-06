package com.cyp.domain;

import java.util.Date;

public class Indent {
    private long id;
    private Date date;
    private Product product;
    private User user;

    public Indent() {
    }

    public Indent(long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Indent{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}
