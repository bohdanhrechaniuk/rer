package com.example.tickets.data.model;

public class Tickets {
    private String picture;
    private int price;
    private String title;

    public Tickets(String title) {
        this.title = title;
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


}
