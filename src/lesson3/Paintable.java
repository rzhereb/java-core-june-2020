package lesson3;

import java.io.Serializable;

public interface Paintable  {

  int A = 4;

  void paint();

  default void method() {
    System.out.println("Default method");
  }


}
