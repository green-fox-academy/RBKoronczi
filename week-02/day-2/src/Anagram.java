import java.util.Scanner;

public class Anagram {
    //Create a function named is anagram following your current language's style guide.
    //It should take two strings and return a boolean value depending on whether its an anagram or not.
    public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.printf("Type in a word: ");
            String word1 = myScanner.nextLine();
            System.out.printf("Type in a second word: ");
            String word2 = myScanner.nextLine();
        if (anagram(word1, word2)) {
            System.out.println("Wow It's an Anagram!");
        }
        else {
            System.out.println("It's not an Anagram");
        }


    }
    public static boolean anagram(String input1, String input2) {
        char[] word1 = StringToCharr(input1);
        char[] word2 = StringToCharr(input2);
        return CharCompare(CharReverse(word1), word2);

    }
    public static char[] StringToCharr (String input) {
        char[] charArr = new char[input.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = input.charAt(i);
        }
        return charArr;
    }
    public static char[] CharReverse (char[] word1) {
        char[] swap = new char[word1.length];
        for (int i=0; i<word1.length; i++) {
        swap[i] = word1[word1.length-i-1];
        }
        return swap;
    }
    public static boolean CharCompare (char[] word1, char[] word2) {
        if (word1.length >= word2.length) {
        for (int i = 0; i < word1.length; i++){
            if (word1[i] != word2[i]) {
                return false;
            }
        } return true;
        }else {
            for (int i = 0; i < word2.length; i++){
                if (word2[i] != word1[i]) {
                    return false;
                }
            } return true;
        }
    }
}
