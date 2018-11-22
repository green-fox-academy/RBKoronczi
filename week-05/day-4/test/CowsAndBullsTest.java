import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowsAndBullsTest {

  CowsAndBulls cowsAndBulls;

  @BeforeEach
  void beforeEach() {
    cowsAndBulls = new CowsAndBulls();
  }

  @Test
  void checkNumber() {
  }

  @Test
  void getCounter() {
    int initcounter = cowsAndBulls.getCounter();
    cowsAndBulls.checkNumber(0);
    assertTrue(cowsAndBulls.getCounter() > initcounter);
  }

  @Test
  void isPlaying() {
  }
}
