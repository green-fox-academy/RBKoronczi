package GreenFox;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  void getGoal() {
    System.out.println("Be a junior software developer");
  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + this.name
        + ", a " + this.age
        + " year old " + this.gender
        + " from " + this.previousOrganization
        + " who skipped " + this.skippedDays
        + " days from the course already."
    );
  }

  void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}
