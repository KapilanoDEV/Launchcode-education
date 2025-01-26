package exercises;

import java.util.Scanner;
public class AreaRectangle {

    public static void main(String[] args) {
        Double area;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? :");

        Double length = input.nextDouble();

        System.out.println("What is the width of the rectangle? :");

        Double width = input.nextDouble();

        input.close();

        area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
