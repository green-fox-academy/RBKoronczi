public class SumDigit {
  // Given a non-negative int n, return the sum of its digits recursively (no loops).
  // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
  // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  public static void main(String[] args) {
    System.out.println(SumDigit(126));
  }

  public static int SumDigit(int n) {
    System.out.println("parameter " + n);
    if (n / 10 == 0) {
      return n;
    } else {
      System.out.println("current part of sum " + n % 10);
      return (n % 10 + SumDigit(n / 10));
    }
  }
}
