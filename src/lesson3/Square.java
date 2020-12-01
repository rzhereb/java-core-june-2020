package lesson3;

public class Square extends GeometricFigure {

  private int a;

  public Square(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  // static polymorphism
  public void setA(String a) {
    this.a = Integer.parseInt(a);
  }

  @Override
  public int calculatePerimeter() {
    return a * 4;
  }

  @Override
  public int calculateSquare() {
    return a * a;
  }

  @Override
  public void paint() {
    System.out.println("Square is painted");
  }
}
