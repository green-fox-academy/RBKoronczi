package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this(4);
  }
  public BassGuitar(int number) {
    this.numberOfStrings = number;
    this.name = "Bass Guitar";
  }
  public String sound() {
    return "Duum-duum-duum";
  }
}
