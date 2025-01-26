package org.launchcode.java.studios.areaofacircle;

public class Main {
    public static void main(String[] args) {
        // Calling static method without creating an object
        Pet.increaseAge();  // Correct usage
//         Pet.makeNoise();  // Incorrect! Cannot call an instance method this way

        // Creating an object of Pet class
        Pet myPet = new Pet("Buddy");

        // Calling the instance method on the object
        System.out.println(myPet.makeNoise());  // Output: Buddy says Woof!

        // Calling static method using object (not recommended but possible)
        myPet.increaseAge();  // Output: Pet age increased to: 2 (though Pet.increaseAge() is preferred)

        String firstPet = "Fluffy";
        Pet secondPet = new Pet("Fluffy");
        Pet thirdPet = new Pet("Fluffy");

        //System.out.println(firstPet == secondPet);
        //System.out.println(secondPet == firstPet);
        System.out.println(thirdPet.getName().equals(firstPet));
        System.out.println(thirdPet.equals(secondPet));
    }
}
