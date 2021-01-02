package com.qst.bean;

import java.util.Date;

public class Phone {
    private int phone_id;
    private String phone_name;
    private String phone_brand;
    private String phone_species;
    private int phone_price;
    private Date phone_date;

    public Phone(){}

    public Phone(int phone_id, String phone_name, String phone_brand, String phone_species, int phone_price, Date phone_date) {
        this.phone_id = phone_id;
        this.phone_name = phone_name;
        this.phone_brand = phone_brand;
        this.phone_species = phone_species;
        this.phone_price = phone_price;
        this.phone_date = phone_date;
    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public String getPhone_brand() {
        return phone_brand;
    }

    public void setPhone_brand(String phone_brand) {
        this.phone_brand = phone_brand;
    }

    public String getPhone_species() {
        return phone_species;
    }

    public void setPhone_species(String phone_species) {
        this.phone_species = phone_species;
    }

    public int getPhone_price() {
        return phone_price;
    }

    public void setPhone_price(int phone_price) {
        this.phone_price = phone_price;
    }

    public Date getPhone_date() {
        return phone_date;
    }

    public void setPhone_date(Date phone_date) {
        this.phone_date = phone_date;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone_id=" + phone_id +
                ", phone_name='" + phone_name + '\'' +
                ", phone_brand='" + phone_brand + '\'' +
                ", phone_species='" + phone_species + '\'' +
                ", phone_price=" + phone_price +
                ", phone_date=" + phone_date +
                '}';
    }
}
