package charsequence;

public class Shifter implements CharSequence {
  String string;
  int shift;

  Shifter(String string, int shift) {
    this.shift = shift;
    this.string = string;
  }

  public int length() {
    return string.length() - shift;
  }

  public char charAt(int index) {
    try {
      return string.charAt(index + shift);
    } catch (Exception e) {
      System.out.println("Error: " + e.toString());
      return '\u0000';
    }
  }

  public CharSequence subSequence(int a, int b){
    try {
      return string.subSequence(a + shift, b + shift);
    } catch (Exception e) {
      return "Error: " + e.toString();
    }
  }

  public String toString() {
    return this.subSequence(0, string.length() - shift).toString();
  }
}
