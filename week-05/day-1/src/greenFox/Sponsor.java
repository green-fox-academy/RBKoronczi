package greenFox;

public class Sponsor extends Person{
  String company;
  int hiredStudents;

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  Sponsor() {
    super();
    this.company = "Google";
  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + this.name
        + ", a " + this.age
        + " year old " + this.gender
        + " who represents " + this.company
        + " and hired " + this.hiredStudents
        + " students so far."
    );
  }

  void hire() {
    hiredStudents++;
  }

  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
