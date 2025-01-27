package org.launchcode.java.restaurant;

public class Item {
    private String name;
    private double price;
    private String description;
    private String category;
    private String dateAdded;

    public Item(String name, double price, String category, String description){
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
    public String getName(){
        return name;
    }
}
