package Garden;

public class Plant {
  String color;
  String type;
  double waterLevel;
  double necessaryWaterLevel;
  double waterEfficiency;

  Plant(String color, String type, double necessaryWaterLevel, double waterEfficiency) {
    this.color = color;
    this.type = type;
    this.waterLevel = 0;
    this.necessaryWaterLevel = necessaryWaterLevel;
    this.waterEfficiency = waterEfficiency;
  }

  boolean needsWater() {
    return (necessaryWaterLevel > waterLevel);
  }

  void waterPlant(double waterAmount) {
    waterLevel += waterAmount * waterEfficiency;
  }

  String getStatus(){
    String result = "The " + color + " " + type;
    if(needsWater()) {
      result += " needs water";
    } else {
      result += " doesn't need water";
    }
    return result;
  }
}
