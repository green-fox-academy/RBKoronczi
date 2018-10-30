import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Reverse {
    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`
    public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] swap = new int[aj.length];
    for (int i = 0; i < aj.length ; i++) {
        swap[i] = aj[aj.length-i-1];
    }

        for (int i = 0; i < aj.length ; i++) {
            aj[i] = swap[i];
        }
        System.out.println(Arrays.toString(aj));
    }
}
