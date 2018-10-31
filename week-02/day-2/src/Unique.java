import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

    }
    public static String unique(int... numbers) {
        String uniquePrint ="";
        int uniqueCount =0;
        // Counting Unique Elements
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j] && i > j) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        //Creating Array of Unique Elements
        int[] uniqueArray = new int[uniqueCount];
        int shift = 0;
        for (int i = 0; i < uniqueArray.length+shift; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && i > j) {
                    isUnique = false;
                }

            }
            if (isUnique) {
                uniqueArray[i-shift] = numbers[i];
            } else        {
                shift++;
            }
        }
        //Preparing string
        uniquePrint = Arrays.toString(uniqueArray);
        return uniquePrint;
    }
}
