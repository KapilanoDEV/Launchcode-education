package org.launchcode.java.demos.lsn6inheritance;

//public class HouseCat extends Cat {
public class HouseCat extends Cat {
//    private double weight;
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
//        weight=aWeight;
        name = aName;
    }
//    public HouseCat(String aName) {
//        name = aName;
//    }
//
//    public HouseCat(double aWeight) {
////        super(aWeight);
//    }

//    public boolean isSatisfied() {
//        return !isHungry() && !isTired();
//    }

    @Override
    public String noise() {

//        if(isSatisfied()) {
            return "Hello, my name is " + name + "!";
//        }
////        } else {
////            return super.noise();
////        }
//
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
