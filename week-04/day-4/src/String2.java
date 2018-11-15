public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {
    String string = String1.getStringInput();
    System.out.println(removeX(string));
  }

  public static String removeX(String string){
    if (string.contains("x")){
      string = string.replaceFirst("x", "");
      return removeX(string);
    } else {
      return string;
    }
  }
}
