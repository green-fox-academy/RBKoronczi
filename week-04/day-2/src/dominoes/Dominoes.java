package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        System.out.println(dominoes);
        List<Domino> sortedDominoes = new ArrayList<>();
        boolean breakCondition = true;
        int runCounter = 0;
        while (breakCondition){
            for (Domino domino : dominoes){
                int addIndex = -1;
                if (sortedDominoes.size() == 0){
                    sortedDominoes.add(domino);
                } else if (!sortedDominoes.contains(domino)) {
                    for(Domino sortedDomino : sortedDominoes){
                        if (domino.getLeftSide() == sortedDomino.getRightSide()){
                            addIndex = sortedDominoes.indexOf(sortedDomino) + 1;
                        } else if (domino.getRightSide() == sortedDomino.getLeftSide()){
                            addIndex = sortedDominoes.indexOf(sortedDomino);
                        }
                    }
                    if (addIndex != -1){
                        sortedDominoes.add(addIndex, domino);
                    }
                }
            }
            runCounter++;
            breakCondition = sortedDominoes.size() != dominoes.size() &&  runCounter < dominoes.size()*2;
        }
        dominoes.clear();
        dominoes.addAll(sortedDominoes);
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        dominoes.add(new Domino(8, 8));
        return dominoes;
    }
}