import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
  @Test
  public void countLettersTest1() {
    String string = "Ezegyteszt";
    HashMap<Character, Integer> test = new HashMap<>();
    test.put('e', 3);
    test.put('z', 2);
    test.put('g', 1);
    test.put('y', 1);
    test.put('t', 2);
    test.put('s', 1);
    assertEquals(CountLetters.countLetters(string), test);
  }
}
