package org.launchcode.java.restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<Item>();
    }

    public void addItem(Item item){
        menuItems.add(item);
    }

    public void removeItem(String name){
        for(Item item : menuItems){
            if(name.equals(item.getName())){
                System.out.println(item.getName() + " has been removed from the menu.");
                menuItems.remove(item);
                break;
            }
        }
        System.out.println("No item found");
    }
}
