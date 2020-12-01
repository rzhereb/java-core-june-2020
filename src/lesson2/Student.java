package lesson2;

import lombok.Data;
import lombok.ToString;

public class Student extends Person {

  private String group;

  public Student() {
    super();
  }

  public Student(int id, String name, String group) {
    super(id, name);
    this.group = group;
  }



  @Override
  public void saySmth(String smth) {
    System.out.println("Student method:");
    super.saySmth(smth);
  }

  public void session() {
    System.out.println("I'm crying");
  }

  @Override
  public String toString() {

    return super.toString() + " " + "Student{" +
        "group='" + group + '\'' +
        '}';
  }
}
