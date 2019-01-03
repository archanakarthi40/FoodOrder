package com.example.dell.foodorder;

public class Product {


    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image;
    public Product(int image,String title) {

        this.image = image;
        this.title = title;
    }




    public int getImage() {
        return image;
    }
    public String getTitle() {
        return title;
    }

}
