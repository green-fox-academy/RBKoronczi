import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
  @Test
  public void testFibonacci1() {
    assertEquals(Fibonacci.fibonacci(0), 0);
  }

  @Test
  public void testFibonacci2() {
    assertEquals(Fibonacci.fibonacci(1), 1);
  }

  @Test
  public void testFibonacci3() {
    assertEquals(Fibonacci.fibonacci(2), 1);
  }

  @Test
  public void testFibonacci4() {
    assertEquals(Fibonacci.fibonacci(3), 2);
  }

  @Test
  public void testFibonacci5() {
    assertEquals(Fibonacci.fibonacci(20), 6765);
  }
}
