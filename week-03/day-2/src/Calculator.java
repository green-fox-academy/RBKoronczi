import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        calculate(scanner.nextLine());
    }
    public static void calculate(String input){
        String[] characters = input.split(" ");
        if (characters[1].equals("") || characters[2].equals("")){
            System.out.println("Incorrect Formatting");
            return;
        }
        int number1 = Integer.parseInt(characters[1]);
        int number2 = Integer.parseInt(characters[2]);
        int result = 0;
        if (characters[0].equals("+")){
            result = number1 + number2;
        }else if (characters[0].equals("-")) {
            result = number1 - number2;
        }else if (characters[0].equals("*")) {
            result = number1 * number2;
        }else if (characters[0].equals("/")) {
            if(number2 == 0) {
                System.out.println("You can't divide by zero!!!");
                return;
            }
            result = number1 / number2;
        }else if (characters[0].equals("%")) {
            result = number1 % number2;
        }else {
            System.out.println("Operation not recognized");
            return;
        }
        System.out.println(result);
        return;
    }
}