import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
  List<ExampleObject> objectList;

  public static void main(String[] args) {
    Example example = new Example();
    System.out.println(example.getObjectList());
    System.out.println();
    System.out.println(example.Filter());
    System.out.println();
    System.out.println(example.Distinct());
    System.out.println();
    System.out.println(example.SortWithComparable());
    System.out.println();
    System.out.println(example.Map());
    System.out.println();
    System.out.println(example.Statistics());
    System.out.println();
    System.out.println(example.Chain());
  }

  public List<ExampleObject> getObjectList() {
    return objectList;
  }

  public Example() {
    objectList = new ArrayList<>();
    ExampleObject Béla = new ExampleObject("Béla", 4);
    objectList.add(new ExampleObject("Józsi", 1));
    objectList.add(new ExampleObject("Whatever", 0));
    objectList.add(Béla);
    objectList.add(new ExampleObject("GreenFox", 1));
    objectList.add(new ExampleObject("Beer", 1));
    objectList.add(Béla);
    objectList.add(new ExampleObject("Béla", 5));
  }

  List Filter() {
    return
        this.objectList.stream()
            .filter(exampleObject -> exampleObject.getQty() > 2)
            .collect(Collectors.toList());
  }

  List Distinct() {
    return
        this.objectList.stream()
            .distinct()
            .collect(Collectors.toList());
  }

  List SortWithComparable() {
    return
        this.objectList.stream()
            .sorted(ExampleObject::compareTo)
            .collect(Collectors.toList());
  }

  List Map() {
    return
        this.objectList.stream()
            .map(exampleObject -> exampleObject.getName())
            .collect(Collectors.toList());
  }

  String Statistics() {
    DoubleSummaryStatistics stat =
        this.objectList.stream()
            .mapToDouble(exampleObject -> exampleObject.getQty())
            .summaryStatistics();
    stat.getAverage();
    stat.getCount();
    stat.getMax();
    stat.getMin();
    stat.getSum();
    stat.toString();
    return stat.toString();
  }

  List Chain() {
    return
        this.objectList.stream()
            .map(exampleObject -> exampleObject.getName())
            .distinct()
            .sorted(String::compareTo)
            .filter(name -> name.equals("Béla"))
            .collect(Collectors.toList());
  }
}
