import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int gameNumber = getRandomInRange(Initialize());
        boolean gameNotOver = true;
        int lives = 5;
        while (gameNotOver){
            gameNotOver = GameLoop(gameNumber, lives);
            lives--;
            if(lives == 0){
                System.out.println("GAME OVER");
                gameNotOver = false;
            }
        }
    }
    public static int[] Initialize (){
        System.out.println("Welcome to \"Guess My Number\"");
        System.out.println("What range do you want to play in?");
        int[] range = getRange();
        return range;
    }
    public static int[] getRange(){
        int[] range = new int[2];
        boolean notRange = true;
        while (notRange) {
            System.out.printf("Start of range: ");
            range[0] = getIntNumber();
            System.out.printf("End of range: ");
            range[1] = getIntNumber();
            notRange = range[0] > range[1];
            if (notRange){
                System.out.println("\nInvalid range\nAdd new values\n");
            }
        }
        return range;
    }
    public static int getIntNumber(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int getRandomInRange(int[] range){
        int random = (int)(Math.random()*(range[1]-range[0])) + range[0];
        return random;
    }
    public static boolean GameLoop(int gameNumber, int lives){
            System.out.println("You've got " + lives + " lives left");
            System.out.println("Guess a Number: ");
            int guess = getIntNumber();
            if(guess == gameNumber){
                System.out.println("Congratulations. You won!");
                return false;
            }

            if (guess > gameNumber){
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
            return true;
    }

}
