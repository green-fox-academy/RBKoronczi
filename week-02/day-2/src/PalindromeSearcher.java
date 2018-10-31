import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
    //Create a function named search palindrome following your current language's style guide.
    // It should take a string, search for palindromes that at least 3 characters long
    // and return a list with the found palindromes.
    public static void main(String[] args) {
        System.out.println(PalindromeSearcher("dog goat dad duck doodle never"));
    }
    public static Object[] PalindromeSearcher (String input) {
        char[] word = Anagram.StringToCharr(input);
        List<String> anagramList = new ArrayList<>();
        for (int i = 0; i < word.length; i++) { //Starting from Char[i]
            for (int j = i+2; j < word.length; j++) {
                if (word[i] == word[j]){
                    String adder = "";
                    for (int k=0;(k+i) < j; k++) {
                        if (word[k + i] != word[j - k]) {
                            adder += word[k + i];
                        } else {

                        }
                    }

                    anagramList.add(adder);
                }

            }
        }
        return anagramList.toArray();
    }
}
