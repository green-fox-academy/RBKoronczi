import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
  @Test
  public void countLettersTest1() {
    String string = "Ezegyteszt";
    HashMap<Character, Integer> testMap = new HashMap<>();
    testMap.put('e', 3);
    testMap.put('z', 2);
    testMap.put('g', 1);
    testMap.put('y', 1);
    testMap.put('t', 2);
    testMap.put('s', 1);
    assertEquals(CountLetters.countLetters(string), testMap);
  }
}
