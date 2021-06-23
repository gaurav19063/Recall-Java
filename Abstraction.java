
abstract class Shape{
  public Shape()
  {
    System.out.println("Shape constructor");
  }
  abstract void area();
}
class Circle extends Shape{
  public void print()
  {
    System.out.println("Inside Circle");
  }
  public void area()
  {
    System.out.println("Area printed");
  }
  public Circle()
  {
    System.out.println("Circle constructor");
  }
}

class Abstraction{

  public static void main(String... args)
  {
System.out.println("Inside Main");
// Circle c1=new Circle();

// c1.area();
// Shape s1=c1;
Shape s1=new Circle();
s1.area();
  }
}
