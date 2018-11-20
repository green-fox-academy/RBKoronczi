package GreenFox;

public class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  Person() {
    this("Jane Doe", 30, "female");
  }

  void introduce() {
    System.out.println(
        "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender
    );
  }

  void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

}
