package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        Divide(5,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Louis", "accounts.xls");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()){
            int points = CheckFileExtension(student.getValue());
            System.out.println(student.getKey() + " gets " + points);
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
       try {
                System.out.println(x/y);
            } catch (ArithmeticException e) {
           System.out.println("You cannot divide by 0");
            }
    }


    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if(fileName == null || fileName.isEmpty()){
            try {
                throw new Exception("Filename is null or empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        } else if (fileName.endsWith("java")) {
            return 1;

        } return 0;



    }

}
