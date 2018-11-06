import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
        System.out.println(checkNums(list));
        System.out.println(checkNums2(list));
    }
    public static boolean checkNums(ArrayList<Integer> list){
        return (list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16));
    }
    public static boolean checkNums2(ArrayList<Integer> list){
        ArrayList<Integer> checkList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        return (list.containsAll(checkList));
    }
}