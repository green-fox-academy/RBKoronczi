public class Counter {
  public static void main(String[] args) {
    counter(10);
  }

  public static void  counter(int number) {
    System.out.println(number);
    if(number == 0) {
    } else {
      counter(number-1);
    }
  }
}
