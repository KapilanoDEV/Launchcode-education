package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Double area, number;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a positive number!");
            while (!input.hasNextDouble()) {
                System.out.println("That's not a number!");
                input.next();
            }
            number = input.nextDouble();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);

        input.close();

        area = Circle.getArea(number);

        System.out.println("The area of the circle is: " + area);
    }
}
