package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;

  public void play() {
    System.out.println(
        this.name + ", a "
        + numberOfStrings + "-stringed instrument that goes"
        + this.sound()
    );
  }

  public abstract String sound();
}
