package com.cyp.domain;

import java.util.Date;

public class Car {
    private int id;
    private int count;
    private User uid;
    private Product pid;

    public Car() {
    }

    public Car(int id, int count, User uid, Product pid) {
        this.id = id;
        this.count = count;
        this.uid = uid;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public Product getPid() {
        return pid;
    }

    public void setPid(Product pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", count=" + count +
                ", uid=" + uid +
                ", pid=" + pid +
                '}';
    }
}
