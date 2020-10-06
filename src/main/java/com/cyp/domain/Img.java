package com.cyp.domain;

public class Img {
    private int id;
    private String img;
    private ImgType imgType;

    public Img() {
    }

    public Img(int id, String img, ImgType imgType) {
        this.id = id;
        this.img = img;
        this.imgType = imgType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ImgType getImgType() {
        return imgType;
    }

    public void setImgType(ImgType imgType) {
        this.imgType = imgType;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", imgType=" + imgType +
                '}';
    }
}
