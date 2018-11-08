import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = GetNumber();
        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number!");
        } else {
            System.out.println(number + " is not an Armstrong number!");
        }
    }
    public static int GetNumber() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Give me a number: ");
        int result = input.nextInt();
        System.out.println();
        return result;
    }
    public static boolean isArmstrongNumber(int input){
        if (input == ArmstrongValue(input)){
            return true;
        } else {
            return false;
        }
    }
    public static int ArmstrongValue(int input){
        return ArrayToPow(SplitNumber(input));
    }
    public static int[] SplitNumber(int input) {
        int length = String.valueOf(input).length();
        int[] result = new int[length];
        for (int i = length-1; i >= 0; i--) {
            int tenPow = (int)Math.pow(10, i);
            result[i] = input/(tenPow);
            input -= result[i]*tenPow;
        }
        return result;
    }
    public static int ArrayToPow(int[] input){
        int result = 0;
        for (int element : input){
            result += (int)Math.pow(element, input.length);
        }
        return result;
    }
}
