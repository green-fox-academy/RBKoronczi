package charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.charAt(1));
// should print out: l
    System.out.println(g);
    System.out.println(g.subSequence(1, 4));
    System.out.println(g.length());
  }
}
