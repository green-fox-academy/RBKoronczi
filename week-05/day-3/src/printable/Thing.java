package printable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  public int compareTo(Thing otherThing) {
    if(this.completed) {
      if (otherThing.completed) {
        return this.name.compareTo(otherThing.name);
      } else {
        return 1;
      }
    } else {
      if (!otherThing.completed) {
        return this.name.compareTo(otherThing.name);
      } else {
        return -1;
      }
    }
  }

  public void printAllFields() {
    System.out.println("Name: " + this.name);
    System.out.println("Completed: " + this.completed);
  }
}
