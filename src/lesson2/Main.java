package lesson2;

public class Main {

  public static final String CONSTANT_STRING = "sdf";

  public static void main(String[] args) {


//    Person p = new Person();
//    Student s = new Student();

//    s.saySmth("bla");

//    System.out.println(p.combineIdAndName());


//    Person p1 = new Student(1, "Nazar", "CS-45");
//
//    Student s1 = (Student) p1;

//    p1.saySmth("bla-bla");
//
//    s1.session();

//    System.out.println(p1);
//    System.out.println(s1);


    ForStatic.staticA = 11;
    ForStatic forStatic = new ForStatic();
    forStatic.a = 10;
    ForStatic forStatic1 = new ForStatic();
    forStatic.a = 11;
    System.out.println(ForStatic.staticA);
    ForStatic.staticA = 15;
    System.out.println(ForStatic.staticA);

    ForStatic.methodStatic();

  }

}
