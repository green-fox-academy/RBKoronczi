public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops)
  // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
  public static void main(String[] args) {
    for (int i = 0; i < 32; i++) {
      System.out.println(power(2, i));
    }
  }

  public static int power(int base, int n){
    if(n == 0){
      return 1;
    } else {
      return base * power(base, n - 1);
    }
  }
}
