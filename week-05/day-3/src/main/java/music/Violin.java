package main.java.music;

public class Violin extends StringedInstrument {
  Violin() {
    this(4);
  }
  Violin(int number) {
    this.numberOfStrings = number;
    this.name = "Violin";
  }
  public String sound() {
    return "Screech";
  }
}
