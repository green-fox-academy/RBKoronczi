public class bunnies {
  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {
    System.out.println(numberOfEars(30));
  }

  public static int numberOfEars (int numberOfBunnies){
    if(numberOfBunnies == 0) {
      return 0;
    } else {
      return 2 + numberOfEars(numberOfBunnies-1);
    }
  }
}
