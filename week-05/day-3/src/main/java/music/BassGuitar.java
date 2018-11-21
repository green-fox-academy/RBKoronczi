package main.java.music;

public class BassGuitar extends StringedInstrument {
  BassGuitar() {
    this(4);
  }
  BassGuitar(int number) {
    this.numberOfStrings = number;
    this.name = "Bass Guitar";
  }
  public String sound() {
    return "Duum-duum-duum";
  }
}
