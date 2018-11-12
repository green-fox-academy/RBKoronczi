import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        System.out.println(fiveMostCommonLotteryNumbers("lottery.csv"));
    }

    public static ArrayList<Integer> fiveMostCommonLotteryNumbers(String filename) {
        List<String> source = fileRead.fileToStringList(filename);
        HashMap<Integer, Integer> lotteryNumbers = mapLotteryNumbers(source);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(orderKeysByValue(lotteryNumbers).get(i));
        }
        return result;
    }

    public static HashMap<Integer, Integer> mapLotteryNumbers(List<String> source) {
        HashMap<Integer, Integer> lotteryNumbers = new HashMap<>();
        for (String line : source) {
            int[] numbers = getLotteryNumbersInLine(line);
            for (int i = 0; i < 5; i++) {
                if (lotteryNumbers.containsKey(numbers[i])) {
                    int value = lotteryNumbers.get(numbers[i]);
                    lotteryNumbers.put(numbers[i], value + 1);
                } else {
                    lotteryNumbers.put(numbers[i], 1);
                }
            }
        }
        return lotteryNumbers;
    }

    public static ArrayList<Integer> orderKeysByValue(HashMap<Integer, Integer> lotteryNumbers) {
        ArrayList<Integer> orderedKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : lotteryNumbers.entrySet()) {
            for (int i = 0; i < orderedKeys.size(); i++) {
                if (lotteryNumbers.get(orderedKeys.get(i)) < entry.getValue()) {
                    orderedKeys.add(i, entry.getKey());
                    break;
                }
            }
            orderedKeys.add(entry.getKey());
        }
        return orderedKeys;
    }

    public static int[] getLotteryNumbersInLine(String source) {
        int[] result = new int[5];
        String[] lineElements = source.split(";");
        for (int i = lineElements.length - 1; i > lineElements.length - 6; i--) {
            result[(i - lineElements.length + 1) * -1] = Integer.parseInt(lineElements[i]);
        }
        return result;
    }
}