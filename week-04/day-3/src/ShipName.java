import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ShipName {
  private static final String shipNameSourceFileName = "ShipNames.txt";
  private static final Path shipNameSource = Paths.get(shipNameSourceFileName);
  private static List<String> usedShipNames = new ArrayList<>();
  private static int genericShipNameCounter = 0;

  String shipName;

  ShipName(String shipName) {
    this.shipName = shipName;
  }

  ShipName() {
    this.shipName = getRandomShipName();
  }

  private static String getRandomShipName() {
    List<String> shipNameList = getSourceContent();
    String randomShipName;
    if (shipNameList.size() != 0) {
      do {
        int index = (int)(Math.random() * shipNameList.size());
        randomShipName = shipNameList.get(index);
      } while (usedShipNames.contains(randomShipName));
      usedShipNames.add(randomShipName);
      return randomShipName;
    }
    return "Ship " + genericShipNameCounter++;
  }

  private static List<String> getSourceContent() {
    List<String> content;
    try {
      content = Files.readAllLines(shipNameSource);
    } catch (Exception e) {
      content = new ArrayList<>();
    }
    return content;
  }
}
