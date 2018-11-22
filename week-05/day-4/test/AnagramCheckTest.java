import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckTest {

  @Test
  public void anagramTest1() {
    assertTrue(AnagramCheck.anagramCheck("Binary", "Brainy"));
  }

  @Test
  public void anagramTest2() {
    assertTrue(AnagramCheck.anagramCheck("roast beef", "eat for BSE"));
  }

  @Test
  public void anagramTest3() {
    assertTrue(AnagramCheck.anagramCheck("forty five", "over fifty"));
  }

  @Test
  public void anagramTest4() {
    assertTrue(AnagramCheck.anagramCheck("William Shakespeare", "I am a weakish speller"));
  }

  @Test
  public void anagramTest5() {
    assertTrue(AnagramCheck.anagramCheck("Madam Curie", "Radium came"));
  }

}
