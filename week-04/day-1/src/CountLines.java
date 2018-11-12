import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountLines {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {
        System.out.println("File name: ");
        Scanner input = new Scanner(System.in);
        System.out.println("There are " + countLines(input.nextLine()) + " lines in your file");
    }

    public static int countLines (String fileName){
        Path source = Paths.get(fileName);
        try {
            return (int)Files.lines(source).count();
        } catch (Exception e) {
            return 0;
        }
    }
}
