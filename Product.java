package com.company.character_file;

public class Product {
    private String nameProduct;
    private int price;
    private String description;

    public Product() {
    }

    public Product(String nameProduct, int price, String description) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return nameProduct +
                "," + price +
                "," + description;
    }
}
