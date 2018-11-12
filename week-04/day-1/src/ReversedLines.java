import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decryptReversed("reversed-lines.txt");
    }
    public static void decryptReversed(String filename){
        List<String> content = fileRead.fileToStringList(filename);
        List<String> result = new ArrayList<>();
        for (String reversedLine : content){
            String normalLine = "";
            for (int i = 0; i < reversedLine.length(); i++){
                normalLine = reversedLine.charAt(i) + normalLine;
            }
            result.add(normalLine);
        }
        System.out.println(result);
    }
}