package lesson3;

public class Triangle extends GeometricFigure {

  private int a;
  private int b;
  private int c;

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  @Override
  public int calculatePerimeter() {
    return a + b + c;
  }

  @Override
  public int calculateSquare() {
    return a * b * a/c;
  }

  @Override
  public void paint() {
    System.out.println("Triangle is painted");
  }

  @Override
  public void method() {
    System.out.println("Default method from Triangle");
  }
}
