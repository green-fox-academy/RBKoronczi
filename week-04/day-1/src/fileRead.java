import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class fileRead {
    public static void main(String[] args) {

    }
    public static List<String> fileToStringList(String fileName) {
        Path source = Paths.get(fileName);
        try {
            List<String> content = Files.readAllLines(source);
            return content;
        }catch (IOException e) {
            List<String> error = new ArrayList<>();
            error.add("READ ERROR!!!");
            return error;
        } catch (Exception e){
            return null;
        }
    }
}
