package reservation;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {
  private String dowBooking;
  private String codeBooking;
  private static List<String> usedCodes = new ArrayList<>();

  public Reservation(String dow){
    this.dowBooking = dow;
    this.codeBooking = generateCode();
    usedCodes.add(this.codeBooking);
  }

  public String getDowBooking() {
    return dowBooking;
  }

  public String getCodeBooking() {
    return codeBooking;
  }

  public String toString(){
    return "Booking# " + codeBooking + " for " + dowBooking;
  }

  private static String generateCode() {
    String result;
    do {
      result = "";
     for(int i = 0; i < 8; i++){
       result += getRandomUppercaseChar();
     }
    } while (usedCodes.contains(result));
    return result;
  }

  private static char getRandomUppercaseChar() {
    String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int charCode = (int)(Math.random() * alphabet.length());
    return alphabet.charAt(charCode);
  }
}
