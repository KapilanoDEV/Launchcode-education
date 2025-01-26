package exercises;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");

        //String name = input.nextLine(); //If I enter Amit Kapila then it println Amit Kapila
        String name = input.next(); //If I enter Amit Kapila then it println Amit and NOT Kapila

        System.out.println("Hello " + name);
    }
}
