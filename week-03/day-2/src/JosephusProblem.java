import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        int[] testParameters = {1, 2, 3, 7, 12, 41};
        for (int i=0; i < testParameters.length; i++){
            int result = JosephusProblem(testParameters[i]);
            System.out.println("Number of people: " + testParameters[i] + " Winning Chair is: " + result);
        }
    }
    public static int JosephusProblem(int numberOfPeople){
        int result = 0;
        ArrayList<Integer> people = new ArrayList<>();
        for (int i = 0; i<numberOfPeople; i++){
            people.add(i+1);
        }
        boolean isHighlander = false;
        while (!isHighlander) {
            for (int i = 0; i < people.size(); i++)
            {
                if (people.size() == 1) {
                    isHighlander = true;
                    break;
                }
                if (i+1 < people.size()) {
                    people.remove(i + 1);
                } else if (i == people.size()-1) {
                    people.remove(0);
                }

            }

        }
        result = people.get(0);
        return result;
    }
}
