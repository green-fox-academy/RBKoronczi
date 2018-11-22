import java.util.Scanner;

public class CowsAndBullsApp {
  public static void main(String[] args) {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    Scanner input = new Scanner(System.in);
    do {
      System.out.println("Guess: ");
      int number = input.nextInt();
      System.out.println(cowsAndBulls.checkNumber(number));
      System.out.println(cowsAndBulls.getCounter());
    } while (cowsAndBulls.isPlaying());
  }
}
