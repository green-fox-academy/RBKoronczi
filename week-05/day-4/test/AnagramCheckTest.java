import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckTest {

  @Test
  public void anagramTest1() {
    assertTrue(AnagramCheck.anagramCheck("Binary", "Brainy"));
  }

}
