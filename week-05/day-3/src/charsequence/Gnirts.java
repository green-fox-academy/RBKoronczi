package charsequence;

public class Gnirts implements CharSequence {
  String gnirts;

  Gnirts(String gnirts) {
    this.gnirts = gnirts;
  }

  public int length() {
    return gnirts.length();
  }

  public char charAt(int index) {
    return gnirts.charAt(gnirts.length() - 1 - index);
  }

  public CharSequence subSequence(int a, int b) {
    String result = "";
    for(int i = gnirts.length() - 1 - a; i >= gnirts.length() - 1 - b; i--) {
      result += gnirts.charAt(i);
    }
    return result;
  }

  public String toString() {
    String result = "";
    for(int i = gnirts.length() - 1 ; i >= 0; i--) {
      result += gnirts.charAt(i);
    }
    return result;
  }
}
