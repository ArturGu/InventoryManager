package org.example;

public class Product {
    private final String name;
    private final String category;

    private  final Double price;
    private final int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
