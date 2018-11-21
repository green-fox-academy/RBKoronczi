package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  ElectricGuitar () {
    this(6);
  }
  ElectricGuitar (int number) {
    this.numberOfStrings = number;
    this.name = "Electric Guitar";
  }
  public String sound() {
    return "Twang";
  }
}
