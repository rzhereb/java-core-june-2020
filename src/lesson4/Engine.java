package lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engine {

  private int volume;
  private int cylinderNumber;


  public void startEngine() {
    System.out.println("Engine started!");
  }

}
