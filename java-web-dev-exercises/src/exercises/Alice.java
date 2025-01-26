package exercises;

import javax.swing.plaf.synth.SynthStyleFactory;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was reading, but it" +
                " had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What term do you want to search for? :");

        String term = input.nextLine();
        input.close();

        //System.out.println(sentence.contains(term)); //case sensitive
        System.out.println(sentence.toLowerCase().contains(term.toLowerCase()));

        Integer index = sentence.indexOf(term);
        Integer length = term.length();

        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");

        //String changedSentence = sentence.replaceFirst(term, "");
        String changedSentence = sentence.replace(term, "");

        System.out.println(changedSentence);
    }
}
