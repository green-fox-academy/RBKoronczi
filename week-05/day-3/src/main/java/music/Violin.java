package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    this(4);
  }
  public Violin(int number) {
    this.numberOfStrings = number;
    this.name = "Violin";
  }
  public String sound() {
    return "Screech";
  }
}
