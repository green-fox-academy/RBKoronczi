package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar () {
    this(6);
  }
  public ElectricGuitar (int number) {
    this.numberOfStrings = number;
    this.name = "Electric Guitar";
  }
  public String sound() {
    return "Twang";
  }
}
