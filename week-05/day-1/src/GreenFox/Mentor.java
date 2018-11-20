package GreenFox;

public class Mentor extends Person{
  String level;

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super();
    this.level = "intermediate";
  }

  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + this.name
        + ", a " + this.age
        + " year old " + this.gender
        + " " + this.level + " mentor"
    );
  }
}
