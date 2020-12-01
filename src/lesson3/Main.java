package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Triangle triangle1 = new Triangle(2, 3, 5);
    Triangle triangle2 = new Triangle(1, 6, 5);
    Square square1 = new Square(3);
    Square square2 = new Square(4);

//    Triangle[] triangles = new Triangle [] {triangle1, triangle2};
//    Square[] squares = new Square[] {square1, square2};
//
//    int ts= 0;
//    int ss = 0;
//
//    for (Triangle triangle : triangles) {
//      ts += triangle.calculateSquare();
//    }
//    for (Square square : squares) {
//      ss += square.calculateSquare();
//    }
//
//    System.out.println(ts + ss);

    int totalSquare = 0;
    List<GeometricFigure> figures = new ArrayList<>();
    figures.add(triangle1); // GeometricFigure triangle1 = new Triangle(...)
    figures.add(triangle2);
    figures.add(square1);
    figures.add(square2);

    for (GeometricFigure figure : figures) {
      totalSquare += figure.calculateSquare();
      figure.paint();
      figure.method();
    }
    System.out.println("Total square: " + totalSquare);

  }

}
