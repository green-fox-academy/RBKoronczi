package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plantsOfGarden;

  Garden() {
    plantsOfGarden = new ArrayList<>();
  }

  void water(double waterAmount) {
    System.out.println("Watering with: " + waterAmount);
    List<Plant> plantsNeedingWater = new ArrayList<>();
    for (Plant plant : plantsOfGarden) {
     if(plant.needsWater()){
       plantsNeedingWater.add(plant);
     }
    }
    waterAmount /= plantsNeedingWater.size();
    for (Plant plant : plantsNeedingWater) {
      plant.waterPlant(waterAmount);
    }
  }

  void printStatus() {
    for(Plant plant: plantsOfGarden){
      System.out.println(plant.getStatus());
    }
  }

  void addPlant(Plant plant) {
    plantsOfGarden.add(plant);
  }
}
