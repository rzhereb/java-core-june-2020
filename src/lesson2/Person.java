package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class Person {

  private int id;
  private String name;

  public Person() {}

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void saySmth(String smth) {
    final int a;
    System.out.println(smth);
    System.out.println(smth);
    System.out.println(smth);
  }

  public void saySmth(int smth) {
    System.out.println(smth);
    System.out.println(smth);
    System.out.println(smth);
  }

  public void saySmth(String smth, int a) {
    System.out.println(smth);
    System.out.println(smth);
    System.out.println(smth);
  }

  public String combineIdAndName() {
    return id + ": " + name;
  }

  public static void persomM() {}

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
