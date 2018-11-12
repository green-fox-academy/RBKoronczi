import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {

    }
    public static boolean CopyFile (String source, String output) {
        Path sourcePath = Paths.get(source);
        Path outputPath = Paths.get(output);
        try {
            Files.copy(sourcePath, outputPath );
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

