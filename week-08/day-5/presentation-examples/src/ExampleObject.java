public class ExampleObject implements Comparable<ExampleObject> {
  private String name;
  private int qty;

  public ExampleObject(String name, int qty) {
    this.name = name;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public int getQty() {
    return qty;
  }

  @Override
  public String toString() {
    return "[" + this.name + this.qty + "]";
  }

  @Override
  public int compareTo(ExampleObject o) {
    if(this.getQty() < o.getQty()) {
      return -1;
    } else if(this.getQty() > o.getQty()) {
      return 1;
    } else {
      return 0;
    }
  }
}
