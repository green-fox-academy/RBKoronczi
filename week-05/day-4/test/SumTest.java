import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
    Sum sum;

    @BeforeEach
  public void beforeEach() {
      sum = new Sum();
    }

    @Test
  public void sumTest() {
      int[] numbers = {1, 2, 3, 4, 5};
      assertEquals(15, sum.sum(numbers));
    }

    @Test
  public void sumTest2() {
      int[] numbers = new int[0];
      assertEquals(0, sum.sum(numbers));
    }

    @Test
  public void sumTest3() {
      int[] numbers = {666};
      assertEquals(666, sum.sum(numbers));
    }

    @Test
  public void sumTest4() {
      int[] numbers =  null;
      assertEquals(0, sum.sum(numbers));
    }
}
