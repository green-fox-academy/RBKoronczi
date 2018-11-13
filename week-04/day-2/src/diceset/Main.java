package diceset;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DiceSet dice = new DiceSet();
        int[] sixArray = {6, 6, 6, 6, 6, 6};
        dice.reroll();
        while (!Arrays.equals(dice.getCurrent(), sixArray)){
            for (int i = 0; i < 6; i++){
                if(dice.getCurrent(i) != 6){
                    dice.reroll(i);
                }
            }
            System.out.println(Arrays.toString(dice.getCurrent()));
        }
    }
}
