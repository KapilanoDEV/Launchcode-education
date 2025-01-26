package exercises;
// Launchcode 3.7.1
import java.util.Arrays;

public class StriSplit {

    public static void main(String[] args) {

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = str.split("\\.");
        //String[] wordArray = str.split("\\ "); //divide at each space.
        System.out.println(Arrays.toString(wordArray));
    }
}
