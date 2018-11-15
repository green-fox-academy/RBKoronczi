public class String3 {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    String string = String1.getStringInput();
    System.out.println(putStarsInString(string));
  }

  public static String putStarsInString(String string){
    if(string.lastIndexOf("*") == string.length()-2) {
      return string;
    } else {
      int indexOfLastStar;
      if(string.contains("*")) {
        indexOfLastStar = string.lastIndexOf("*");
      } else {
        indexOfLastStar = -1;
      }
      string = string.substring(0, indexOfLastStar+2) + "*" + string.substring(indexOfLastStar+2);
      System.out.println(string);
      return putStarsInString(string);
    }
  }
}
