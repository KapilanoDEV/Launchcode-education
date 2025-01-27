package org.launchcode.java.restaurant;

import java.time.LocalDate;
import java.util.Date;

public class Item {
    private String name;
    private double price;
    private String description;
    private String category;
    Date d2 = new Date();
    private String dateAdded;

    public Item(String name, double price, String category, String description){
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.dateAdded = String.valueOf(d2);
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return this.dateAdded;
    }

    public String getInfo(){ //used in the menu's search method to find item based on key word
        return name + " " + price + " " + category + " " + description + " " + dateAdded;
    }
}
