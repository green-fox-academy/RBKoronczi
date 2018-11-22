import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  Sharpie pen;

  @BeforeEach
  public void beforeEach() {
    pen = new Sharpie("Red", 1.5);
  }
  @Test
  public void useTest() {
    double initInk = pen.inkAmount;
    pen.Use();
    assertEquals(pen.inkAmount, initInk -1);
  }
}
