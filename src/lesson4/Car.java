package lesson4;

import lombok.Data;

@Data
public class Car {

  private Engine engine;
  private String brand;
  private int price;
  private CarType carType;

  public Car(Engine engine, String brand, int price, CarType carType) {
    this.engine = engine;
    this.brand = brand;
    this.price = price;
    this.carType = carType;
  }

  public void startCar() {
    this.engine.startEngine();
  }
}
