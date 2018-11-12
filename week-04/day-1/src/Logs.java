import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueIp("log.txt")));
        System.out.println("The GET/POST ratio is: " + getPostRatio("log.txt"));
    }
    public static String[] uniqueIp(String fileName){
        List<String> log = fileToStringList(fileName);
        ArrayList<String> addresses = new ArrayList<>();
        for (String logLine: log) {
            String ipAddress = getIpFromLog(logLine);
            if (!addresses.contains(ipAddress)) {
                addresses.add(ipAddress);
            }
        }
        String[] result = addresses.toArray(new String[addresses.size()]);
        return result;
    }
    public static double getPostRatio(String filename){
        List<String> log = fileToStringList(filename);
        int GetCount = 0;
        int PostCount = 0;
        for (String logLine: log) {
            String GetPost = getGetPostFromLog(logLine);
            if (GetPost.equals("GET")){
                GetCount++;
            } else if (GetPost.equals("POST")){
                PostCount++;
            }
        }
        return GetCount/PostCount;
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
        return splitLog(logLine)[8];
    }
    public static String getGetPostFromLog (String logLine){
        return splitLog(logLine)[11];
    }
    public static String[] splitLog (String logLine){
        return logLine.split(" ");
    }
}
