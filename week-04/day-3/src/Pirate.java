public class Pirate {
    int intoxication;
    boolean isAlive;
    boolean isConscious;
    Parrot parrot;

    private static final String deathMessage = "he's dead";

    Pirate(){
        intoxication = 0;
        isAlive = true;
        isConscious = true;
        parrot = new Parrot();
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
        if(isAlive){
            String result = "";
            int caseNumber = (int)Math.random()*3;
            switch (caseNumber){
                case 0:
                    this.die();
                    result = "The pirate died";
                    break;
                case 1:
                    brawlMate.die();
                    result = "The other pirate died";
                    break;
                case 2:
                    this.isConscious = false;
                    brawlMate.isConscious = false;
                    result = "They both passed out";
                    break;
            }
            return result;
        }
        return deathMessage;
    }

}
