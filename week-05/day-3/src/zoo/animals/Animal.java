package zoo.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;
  protected int hunger;
  protected int thirst;

  protected Animal(String name) {
    this(name, 0, "female");
  }

  protected Animal(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
    hunger = 0;
    thirst = 0;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void age() {
    age++;
  }
}
