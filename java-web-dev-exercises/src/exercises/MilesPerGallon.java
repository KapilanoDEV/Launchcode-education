package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Double rate;
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? :");

        Double miles = input.nextDouble();

        System.out.println("How many gallons have you consumed? :");

        Double gallons = input.nextDouble();

        input.close();

        rate = miles / gallons;

        System.out.println("Your MPG is: " + rate);
    }
}
