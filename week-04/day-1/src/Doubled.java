import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decryptDoubled("duplicated-chars.txt");
    }
    public static void decryptDoubled (String fileName){
        List<String> content = fileRead.fileToStringList(fileName);
        List<String> decrypted = new ArrayList<>();
        for (String doubledLine: content) {
            String singleLine = "";
            for (int i = 0; i < doubledLine.length(); i++){
                if (i%2 == 1){
                    singleLine += doubledLine.charAt(i);
                }
            }
            decrypted.add(singleLine);
        }
        System.out.println(decrypted);
    }
}