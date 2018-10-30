import java.util.Scanner;

public class PalindromeBuilder {
    //Create a function named create palindrome following your current language's style guide.
    // It should take a string, create a palindrome from it and then return it.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Give me a word plz: ");
        String word = input.nextLine();
        System.out.println("It became a Palindrome:" + PalindromeBuilder(word));
    }
    public static String PalindromeBuilder (String input) {
        char[] secondpart = Anagram.StringToCharr(input);
        secondpart = Anagram.CharReverse(secondpart);
        for (int i=0; i<secondpart.length;i++) {
            input += secondpart[i];
        }
        return input;
    }
}
