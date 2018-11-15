import java.util.Scanner;

public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    String input = getStringInput();
    System.out.println(changeX(input));
  }

  public static String changeX(String input){
    if (input.contains("x")){
      input = input.replaceFirst("x", "y");
      return changeX(input);
    } else {
      return input;
    }
  }

  public static String getStringInput() {
    System.out.println("Please give me a string: ");
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }
}
