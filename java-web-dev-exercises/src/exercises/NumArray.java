package exercises;
// Launchcode 3.7.1
public class NumArray {

    public static void main(String[] args) {

        Integer[] integerArray = {1,1,2,3,8};

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i]%2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
    }
}
