public class Sum {

  public int sum(int[] numbers) {
    int result = 0;
    try {
      for (int number : numbers) {
        result += number;
      }
    } catch (NullPointerException e) {

    }
    return result;
  }
}
