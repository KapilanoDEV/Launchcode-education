package org.launchcode.java.demos.lsn6inheritance;

public class Main {
//    HouseCat garfield = new HouseCat("Garfield", 12);
//    garfield.eat();
//    System.out.println(garfield.isTired());   // prints true
    public static void main(String[] args) {
//        HouseCat garfield = new HouseCat("Garfield",12);
//        garfield.eat();
//        System.out.println(garfield.isTired());
//
//        HouseCat spike = new HouseCat("Spike"); //calls the no arg constructor in Cat.
//        //If a base class constructor takes no arguments,
//        // then the no-argument constructor is implicitly called for you in the subclass.
//        System.out.println(spike.getWeight());
//
//        Cat plainCat = new Cat(8.6);
//        HouseCat cheshireCat = new HouseCat("Cheshire",12);
//        cheshireCat.eat();
//
//        System.out.println(plainCat.noise());
//        System.out.println(cheshireCat.noise());
        Cat salem = new HouseCat("Salem",8);
        System.out.println(salem.noise());
        System.out.println(((HouseCat) salem).purr());

    }

}
