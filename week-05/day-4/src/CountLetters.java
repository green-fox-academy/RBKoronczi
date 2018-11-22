import java.util.HashMap;

public class CountLetters {
  public static HashMap<Character, Integer> countLetters(String string) {
    return AnagramCheck.createHashMapFromString(string);
  }
}
