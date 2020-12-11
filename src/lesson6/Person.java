package lesson6;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {

  private int id;
  private String name;
  private LocalDate birthDate;

  public Person() {}

  public Person(int id, String name, LocalDate birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public boolean equals(Object o) {
//    System.out.println("equals");
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return id == person.id &&
            Objects.equals(name, person.name) &&
            Objects.equals(birthDate, person.birthDate);
  }

  @Override
  public int hashCode() {
//    System.out.println("hashcode");
    return Objects.hash(id, name, birthDate);
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", birthDate=" + birthDate +
            '}';
  }

  @Override
  public int compareTo(Person o) {
    System.out.println("compareto");
    int compareId = this.id - o.getId();
    int compareName = this.name.compareTo(o.getName());
    int compareDate = this.birthDate.compareTo(o.getBirthDate());

    if (compareId != 0) {
      return compareId;
    } else if (compareName != 0) {
      return compareName;
    } else return compareDate;
  }
}
