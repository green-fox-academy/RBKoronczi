package Zoo.Animals;

public abstract class EggLayer extends Animal {
  public EggLayer(String name) {
    super(name);
  }

  public String breed() {
    return "laying eggs";
  }
}
