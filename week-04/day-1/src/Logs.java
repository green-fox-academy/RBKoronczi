import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        uniqueIp("log.txt");
    }
    public static String[] uniqueIp(String fileName){
        List<String> log = fileToStringList(fileName);
        for (String logLine: log) {

        }
        return null;
    }
    public static double getPostRatio(String filename){
        return 0;
    }
    public static List<String> fileToStringList(String fileName) {
        Path source = Paths.get(fileName);
        try {
            List<String> content = Files.readAllLines(source);
            return content;
        } catch (Exception e){
            return null;
        }
    }
    public static String getIpFromLog (String logLine){
        String[] result = logLine.split(" ");
        return result[8];
    }
}
