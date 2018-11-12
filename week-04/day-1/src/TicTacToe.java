import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
    public static String ticTacResult(String fileName){
        List<String> content = Logs.fileToStringList(fileName);
        char[][] ticTacToe = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                ticTacToe[i][j] = content.get(i).charAt(j);
            }
        }
        String result = "";
        for (int i = 0; i < 3; i++){
            if (ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe [i][0] == ticTacToe[i][2]){
                result += ticTacToe[i][0];
                break;
            } else if (ticTacToe[0][i] == ticTacToe[1][i] && ticTacToe [0][i] == ticTacToe[2][i]){
                result += ticTacToe[0][i];
                break;
            } else if (
                    (ticTacToe[1][1] == ticTacToe[0][0] && ticTacToe[1][1] == ticTacToe[2][2])
                    || (ticTacToe[1][1] == ticTacToe[0][2] && ticTacToe[1][1] == ticTacToe[2][0])
            ) {
                result += ticTacToe[1][1];
                break;
            }
        }
        if (result.isEmpty()){
            return "Draw";
        }
        return result;
    }
}