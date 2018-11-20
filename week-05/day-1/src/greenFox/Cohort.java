package greenFox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student> students;
  List<Mentor> mentors;

  Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  void addStudent(Student student) {
    this.students.add(student);
  }

  void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }

  void info(){
    System.out.println(
        "The " + this.name
        + " cohort has " + this.students.size()
        + " students and " + this.mentors.size()
        + " mentors."
    );
  }
}
