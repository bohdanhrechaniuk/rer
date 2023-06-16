package com.example.tickets.data.model;

public class Tickets {
    private String picture;
    private int price;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Tickets(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Tickets(String category,String picture,int price) {
        this.picture = picture;
        this.price = price;
        this.category = category;
    }
}
