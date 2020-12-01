package lesson3;

public abstract class GeometricFigure implements Paintable {

  private int perimeter;
  private int square;

  public abstract int calculatePerimeter();

  public abstract int calculateSquare();

  public int getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(int perimeter) {
    this.perimeter = perimeter;
  }

  public int getSquare() {
    return square;
  }

  public void setSquare(int square) {
    this.square = square;
  }

}
