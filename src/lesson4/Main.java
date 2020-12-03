package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

//    for (CarType carType : CarType.values()) {
//      if (carType.getUkrainianTranslation().equals("Хетчбек")) {
//        carType.setUkrainianTranslation("Хетчбеккк");
//      }
//      System.out.println(carType.getUkrainianTranslation());
//      carType.paint();
//    }

//    Engine engine = new Engine(2, 4);
//    Car car = new Car(engine, "Audi", 32000, CarType.SEDAN);

//    Car car = new Car(new Engine(2, 4), "Audi", Math.max(30000, 32000), CarType.SEDAN);
//    Car car1 = new Car(new Engine(2, 4), "Volkswagen", 30000, CarType.HATCHBACK);


//    car.getEngine().setCylinderNumber(car.getEngine().getCylinderNumber() + 1);
//
//    System.out.println(car);
//    System.out.println(car1);

//    car.getEngine().startEngine();
//    car.startCar();

    User<Integer> user = new User<>(4);
    System.out.println(user.getId());

    User<String> user1 = new User<>("Four");
    System.out.println(user.getId());

//    user.print(3);
//    user.print("sdfsdf");

  }

}
