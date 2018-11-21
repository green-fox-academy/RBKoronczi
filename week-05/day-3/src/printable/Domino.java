package printable;

public class Domino implements Comparable<Domino>, Printable{
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  public int compareTo(Domino domino) {
    if(this.getLeftSide() < domino.getLeftSide()) {
      return -1;
    } else if (this.getLeftSide() > domino.getLeftSide()) {
      return 1;
    } else if (this.getRightSide() < domino.getRightSide()) {
      return -1;
    } else if (this.getRightSide() > domino.getRightSide()) {
      return 1;
    } else {
      return 0;
    }
  }

  public void printAllFields() {
    System.out.println("left: " + this.left);
    System.out.println("right: " + this.right);
  }
}
