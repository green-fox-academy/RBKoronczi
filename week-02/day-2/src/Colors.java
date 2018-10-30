import java.util.Arrays;

public class Colors {
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`
    public static void main(String[] args) { //Sorry for the ugly code!
        String[] greens = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] reds = {"orange red", "red", "tomato", "", "",};
        String[] pinks = {"orchid", "violet", "pink", "hot pink", "", ""};
        String[][] colors = new String[3][5];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (i == 0) {
                    colors[i][j] = greens[j];
                } else if (i == 1)                {
                    colors[i][j] = reds[j];
                } else if (i == 2) {
                    colors[i][j] = pinks[j];
                }

            }
            System.out.println(Arrays.toString(colors[i]));
        }

    }
}
