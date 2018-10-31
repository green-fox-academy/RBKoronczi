import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeSearcher {
    //Create a function named search palindrome following your current language's style guide.
    // It should take a string, search for palindromes that at least 3 characters long
    // and return a list with the found palindromes.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(PalindromeSearcher("dog goat dad duck doodle never")));

    }
    public static Object[] PalindromeSearcher (String input) {
        char[] word = Anagram.StringToCharr(input);
        List<String> palindromeList = new ArrayList<>();
        for (int i = 0; i < word.length; i++) { //Starting from Char[i] Odd palindromes
            for (int j = i-1, k = i+1; j >=0 && k < word.length; j--, k++) {

                if (word[j] == word[k] ) {

                    String adder = "";
                    for (int cc = j; cc <= k; cc++) {
                        adder += Character.toString(word[cc]);
                    }
                    palindromeList.add(adder);
                }  else {
                    break;
                }

            }

        }
        for (int i = 0; i < word.length; i++) { //Starting from Char[i] Even palindromes
            for (int j = i-1, k = i+2; j >=0 && k < word.length; j--, k++) {

                if (word[j] == word[k] && word[i] == word[i+1] ) {

                    String adder = "";
                    for (int cc = j; cc <= k; cc++) {
                        adder += Character.toString(word[cc]);
                    }
                    palindromeList.add(adder);
                }  else {
                    break;
                }

            }

        }
        return (palindromeList.toArray());
    }
}
