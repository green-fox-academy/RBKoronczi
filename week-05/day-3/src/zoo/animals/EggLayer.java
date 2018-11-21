package zoo.animals;

public abstract class EggLayer extends Animal {
  public EggLayer(String name) {
    super(name);
  }

  public String breed() {
    return "laying eggs";
  }
}
