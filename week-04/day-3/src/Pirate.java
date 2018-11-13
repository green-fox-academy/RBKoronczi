public class Pirate {
    int intoxication;
    boolean isAlive;

    private static final String deathMessage = "he's dead";

    Pirate(){
        intoxication = 0;
        isAlive = true;
    }

    String drinkSomeRum(){
        if (isAlive) {
            intoxication++;
            return "The pirate drank.";
        }
        return deathMessage;
    }

    String howsItGoingMate(){
        if(isAlive) {
            String result = "";
            if (intoxication > 0){
                int numberOfYells = (int)Math.random()*4 + 1;
                for (int i = 0; i < numberOfYells; i++){
                    result += "Pour me anudder!\n";
                }
            } else {
                result += "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            }
            return result;
        }
        return deathMessage;
    }

    String die(){
        if (isAlive) {
            isAlive = false;
        }
        return deathMessage;
    }

    String brawl(Pirate brawlMate){
        return deathMessage;
    }

}
