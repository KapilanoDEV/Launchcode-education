package org.launchcode.java.studios.areaofacircle;

class Pet {
    // Instance variable
    private String name;

    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // Instance method (requires an object to be called)
    public String makeNoise() {
        return name + " says Woof!";
    }

    public String getName() {
        return name;
    }

    // Static variable
    private static int age = 0;

    // Static method (can be called without an object)
    public static void increaseAge() {
        age++;
        System.out.println("Pet age increased to: " + age);
    }

    public boolean equals(Object petToCheck) {

        if (petToCheck == this) {
            return true;
        }

        if (petToCheck == null) {
            return false;
        }

        if (petToCheck.getClass() != getClass()) {
            return false;
        }

        Pet thePet = (Pet) petToCheck;
        return thePet.getName() == getName();
    }
}

