package lesson4;

public class User<I> {

  private I id;

  public User(I id) {
    this.id = id;
  }

  public I getId() {
    return id;
  }

  //  public void print(int i) {
//    System.out.println(i);
//  }
//
//  public void print(String s) {
//    System.out.println(s);
//  }

  public <T> void print(T s) {
    System.out.println(s);
  }
}
