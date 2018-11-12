import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reversedOrder("reversed-order.txt");
    }
    public static void reversedOrder(String filename){
        List<String> content = fileRead.fileToStringList(filename);
        List<String> result = new ArrayList<>();
        for (String contentLine : content ) {
            result.add(0, contentLine);
        }
        System.out.println(result);
    }
}
