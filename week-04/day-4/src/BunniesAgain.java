public class BunniesAgain {
  // We have Bunnies standing in a line, numbered 1, 2, ... The odd Bunnies
  // (1, 3, ..) have the normal 2 ears. The even Bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(bunniesAgain(i));
    }
  }

  public static int bunniesAgain(int n) {
    if(n == 0){
      return 0;
    } else if (n % 2 == 1) {
      return 2 + bunniesAgain(n-1);
    } else {
      return 3 + bunniesAgain(n-1);
    }
  }
}
