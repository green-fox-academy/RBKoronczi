import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        try {
            System.out.println("Ten divided by your number is: " + 10/getNumber());
        } catch (Exception e) {
            System.out.println("fail");
        }
    }
    public static int getNumber () {
        System.out.print("Number please: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
