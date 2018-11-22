import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CowsAndBulls {
  private ArrayList<Integer> secretNumber;
  private boolean isPlaying;
  private int counter;

  CowsAndBulls() {
    secretNumber = new ArrayList<>();
    generateSecretNumber();
    isPlaying = true;
    counter = 0;
  }

  private void generateSecretNumber() {
    ArrayList<Integer> usedNumerals = new ArrayList();
    int number;
    for (int i = 0; i <4; i++) {
      do {
        number = getRandomNumeral();
      } while (usedNumerals.contains(number) || (i == 0 && number == 0));
      usedNumerals.add(number);
    }
    this.secretNumber = usedNumerals;
  }

  private int getRandomNumeral() {
    return (int)(Math.round(Math.random()*9));
  }


  public String checkNumber(int number){
    counter++;
    if (number / 10000 > 0 || number / 1000 == 0){
      return "Invalid secretNumber";
    } else {
      return getCowsAndBulls(number);
    }
  }

  private String getCowsAndBulls(int number) {
    ArrayList<Integer> userNum = numberToListOfNumerals(number);
    int numberOfBulls = 0;
    int numberOfCows = 0;
    for (int i = 0; i < 4; i++) {
      if(userNum.get(i) == this.secretNumber.get(i)) {
        numberOfBulls++;
      } else if (this.secretNumber.contains(userNum.get(i))) {
        numberOfCows++;
      }
    }
    isPlaying = numberOfBulls != 4;
    String result = "You've got " + numberOfBulls + " Bulls and " + numberOfCows + " Cows.";
    return result;
  }

  private ArrayList<Integer> numberToListOfNumerals(int number) {
    ArrayList<Integer> userNum = new ArrayList<>();
    for(int i = 0; i < 4; i++) {
      int numeral = number / (1000 / (int)Math.pow(10, i));
      number -= numeral * (1000 / (int)Math.pow(10, i));
      userNum.add(numeral);
    }
    return userNum;
  }

  public int getCounter() {
    return counter;
  }

  public boolean isPlaying() {
    return isPlaying;
  }
}
