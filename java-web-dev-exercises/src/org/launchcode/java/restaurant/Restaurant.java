package org.launchcode.java.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu novos = new Menu();
        Item papadum = new Item("Papadum",2.0,"Starter",
                "Crispy bean snack");
        novos.addItem(papadum);

        Item butCh = new Item("Butter Chicken",12.0,"Main",
                "Chicken with spicy tomato and butter sauce");
        novos.addItem(butCh);

        System.out.println(novos);
        novos.removeItem("papadam");

        System.out.println(novos);
    }
}
