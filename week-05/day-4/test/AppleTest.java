import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    Apple apple;

  @BeforeEach
  public void beforeEach() {
    apple = new Apple();
  }

  @Test
  public void testPrintMessage() {
    assertEquals("Apple", apple.getApple());
  }
}
