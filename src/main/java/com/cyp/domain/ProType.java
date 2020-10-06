package com.cyp.domain;

public class ProType {
    private int id;
    private String name;

    public ProType() {
    }

    public ProType(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "ProType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
