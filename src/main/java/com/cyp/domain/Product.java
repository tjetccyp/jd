package com.cyp.domain;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private String infor;
    private double price;
    private double discount;
    private int count;
    private ImgType imgType;
    private ProType proType;

    public Product() {
    }

    public Product(int id, String name, String infor, double price, double discount, int count, ImgType imgType, ProType proType) {
        this.id = id;
        this.name = name;
        this.infor = infor;
        this.price = price;
        this.discount = discount;
        this.count = count;
        this.imgType = imgType;
        this.proType = proType;
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

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public ImgType getImgType() {
        return imgType;
    }

    public void setImgType(ImgType imgType) {
        this.imgType = imgType;
    }

    public ProType getProType() {
        return proType;
    }

    public void setProType(ProType proType) {
        this.proType = proType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", infor='" + infor + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", count=" + count +
                ", imgType=" + imgType +
                ", proType=" + proType +
                '}';
    }
}
