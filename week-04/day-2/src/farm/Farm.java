package farm;
import animal.Animal;

import java.util.List;

public class Farm {
    List<Animal> animals;
    int slots;

    void breed(){
        if(animals.size() < slots){
            animals.add(new Animal());
        }
    }

    void slaughter(){
        int indexOfMin = 0;
        int minHunger = animals.get(0).hunger;
        for (Animal animal : animals){
            if(animal.hunger < minHunger){
                minHunger = animal.hunger;
                indexOfMin = animals.indexOf(animal) ;
            }
        }
        animals.remove(indexOfMin);

    }
}
