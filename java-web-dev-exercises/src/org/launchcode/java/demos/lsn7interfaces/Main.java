package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();
        Comparator comparator2 = new ToppingComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before: \n");
        for( Flavor item : flavors){
            System.out.println(item.getName() + ": Number of allergens " + item.getAllergens().size());
        }
        flavors.sort(comparator);

        System.out.println("\nAfter: \n");
        for( Flavor item : flavors){
            System.out.println(item.getName() + ": Number of allergens " + item.getAllergens().size());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nBefore: \n");
        for ( Cone item : cones) {
            System.out.println(item.getName() + ": $" +item.getCost());
        }
//        cones.sort(comparator1);
        Collections.sort(cones,comparator1);
        System.out.println("\nAfter: \n");
        for ( Cone item : cones) {
            System.out.println(item.getName() + ": $" +item.getCost());
        }




        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
//        System.out.println(flavors);

        System.out.println("Before: \n");
        for( Topping item : toppings){
            System.out.println(item.getName() + ": Number of allergens " + item.getAllergens().size());
        }
        toppings.sort(comparator2);

        System.out.println("\nAfter: \n");
        for( Topping item : toppings){
            System.out.println(item.getName() + ": Number of allergens " + item.getAllergens().size());
        }
    }
}
