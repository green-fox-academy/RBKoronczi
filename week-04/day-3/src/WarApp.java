public class WarApp {
  public static void main(String[] args) {
    Armada firstArmada = new Armada();
    Armada secondArmada = new Armada();
    firstArmada.fillArmada();
    secondArmada.fillArmada();

    if (firstArmada.war(secondArmada)) {
      System.out.println("The first armada won!");
    } else {
      System.out.println("The second armada won!");
    }
  }
}
