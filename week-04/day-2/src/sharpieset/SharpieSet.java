package sharpieset;
import sharpie.Sharpie;

import java.util.List;

public class SharpieSet {
    List<Sharpie> set;

    int countUsable(){
        int counter = 0;
        for(Sharpie sharpie : set){
            if (sharpie.inkAmount > 0){
                counter++;
            }
        }
        return counter;
    }

    void removeTrash(){
        for (Sharpie sharpie : set){
            if (sharpie.inkAmount == 0){
                set.remove(sharpie);
            }
        }
    }
}
