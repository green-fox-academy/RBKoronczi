import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b & a > c) {
      return a;
    }
    else if(b > a & b > c) {
      return b;
    }
    else {
      return c;
    }
  }

  double median(List<Integer> pool) {
    if(pool.size() % 2 == 1) {
      return pool.get(pool.size()/2);
    }
    else {
      double average = 0;
      average += pool.get(pool.size()/2 - 1);
      average += pool.get(pool.size()/2);
      return average/2;
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'E', 'I', 'O', 'U').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = teve.substring(0, i) + c + "v" + c + teve.substring(i+1);
        length += 2;
        i += 2;
      }
    }
    return teve;
  }
}
