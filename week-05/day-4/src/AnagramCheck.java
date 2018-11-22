import java.util.HashMap;

public class AnagramCheck {
  public static boolean anagramCheck(String wordOne, String wordTwo) {
    wordOne = wordOne.toLowerCase();
    wordTwo = wordTwo.toLowerCase();
    HashMap<Character, Integer> wordOneCharacterSet = createHashMapFromString(wordOne);
    HashMap<Character, Integer> wordTwoCharacterSet = createHashMapFromString(wordTwo);
    return (wordOneCharacterSet.equals(wordTwoCharacterSet));
  }

  private static HashMap<Character, Integer> createHashMapFromString(String string){
    HashMap<Character, Integer> characterMap = new HashMap();
    char[] characters = string.toCharArray();
    for (char character : characters) {
      if(character == ' ') {
      } else if(characterMap.containsKey(character)) {
        int qty = characterMap.get(character);
        characterMap.put(character, qty + 1);
      } else {
        characterMap.put(character, 1);
      }
    }
      return characterMap;
  }
}
