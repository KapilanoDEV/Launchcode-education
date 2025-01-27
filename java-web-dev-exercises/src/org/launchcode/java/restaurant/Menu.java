package org.launchcode.java.restaurant;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Item> menuItems;
    private ArrayList<Item> results; //search results from searchMenu method

    public Menu() {
        this.menuItems = new ArrayList<Item>();
    }

    public void addItem(Item item){
        menuItems.add(item);
    }

    public String toString() {
        for (Item it : menuItems){
            String nameItem = it.getName();
            double priceItem = it.getPrice();
            String desc = it.getDescription();
            String type = it.getCategory();
//            String mI = String.format("%s costs %d",nameItem,priceItem);
            System.out.println(nameItem + " (Description:" + desc+ ") is a " + type +
                    " that costs " + priceItem + ". It was added on " +it.getDate());
        }
        return "done";
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

    public ArrayList<Item> searchMenu(String str){
        results.clear();
        for(Item item : menuItems){
            if(item.getInfo().contains(str)){
                results.add(item);
            }
        }
        return results;
    }
}
