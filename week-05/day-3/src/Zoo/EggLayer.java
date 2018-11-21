package Zoo;

public abstract class EggLayer extends Animal {
  public EggLayer(String name) {
    super(name);
  }

  public String breed() {
    return "laying eggs";
  }
}
