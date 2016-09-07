package com.github.arashiq.model;

import java.util.Date;

/**
 * Created by arashiQ on 2016/03/09.
 */

public class CouponInfo {
    private int id;
    private String name;
    private String title;
    private String image;
    private float price;
    private float discount;
    private String url;
    private Float extraFee;
    private String lat;
    private String lon;

    public CouponInfo() {
    }

    public CouponInfo(int id, String name, String title, String image, float price, float discount, String url, Float extraFee, String lat, String lon) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.image = image;
        this.price = price;
        this.discount = discount;
        this.url = url;
        this.extraFee = extraFee;
        this.lat = lat;
        this.lon = lon;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Float getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(Float extraFee) {
        this.extraFee = extraFee;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "CouponInfo{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", url='" + url + '\'' +
                ", extraFee=" + extraFee +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}
