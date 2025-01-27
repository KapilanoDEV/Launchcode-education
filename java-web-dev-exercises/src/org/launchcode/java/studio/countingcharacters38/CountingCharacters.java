package org.launchcode.java.studio.countingcharacters38;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char aChar : myString.toCharArray()) {
//  Put a new letter in map where letter is the key.
//  When an item having that letter as key already exists, getOrDefault returns the value.
//  Then the put updates the letter (key) with what getOrDefault returns plus 1.
            characterCount.put(aChar,characterCount.getOrDefault(aChar, 0) + 1);
        }
        System.out.println("Character Occurences:");

        for (Map.Entry<Character,Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
