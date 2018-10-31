import sun.security.krb5.internal.crypto.Des;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }
    public static String bubble (int[] numbers) {
        return Arrays.toString(AscSortArray(numbers));
    }
    public static String advancedBubble (int[] numbers, boolean isDescending) {
        if (isDescending) {
         return Arrays.toString(DescSortArray(numbers));
        }
        return Arrays.toString(AscSortArray(numbers));

    }

    public static int[] AscSortArray (int[] numbers) {
        int[] result = new  int[numbers.length];

        for(int i = 0; i<result.length; i++) {
            result[i] = Integer.MAX_VALUE;
            for(int j = 0; j<result.length; j++) {
                if (numbers[j] < result[i]) {
                    if (i == 0) {
                        result[i] = numbers[j];
                    } else if (numbers[j] > result[i-1]) {
                        result[i] = numbers[j];
                    }
                }

            }
        } return result;
    }
    public static int[] DescSortArray (int[] numbers) {
        int[] result = new  int[numbers.length];

        for(int i = 0; i<result.length; i++) {
            result[i] = Integer.MIN_VALUE;
            for(int j = 0; j<result.length; j++) {
                if (numbers[j] > result[i]) {
                    if (i == 0) {
                        result[i] = numbers[j];
                    } else if (numbers[j] < result[i-1]) {
                        result[i] = numbers[j];
                    }
                }

            }
        } return result;
    }
}

