import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        decodeFile("encoded-lines.txt");
    }
    public static void decodeFile(String filename){ //ASCII+1 cipher
        List<String> content = fileRead.fileToStringList(filename);
        List<String> result = new ArrayList<>();
        for (String encodedLine : content) {
            String decodedLine = "";
            for (int i = 0; i < encodedLine.length(); i++){
                char encodedChar = encodedLine.charAt(i);
                if(encodedChar != ' '){
                    encodedChar--;
                }
                decodedLine += encodedChar;
            }
            result.add(decodedLine);
        }
        System.out.println(result);
    }
}