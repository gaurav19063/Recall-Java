interface Shape{
  void area();
}
class Circle implements Shape{
  public Circle()
  {
    System.out.println("inside circle");
  }
  public void area()
  {
    System.out.println("Area of Circle.");

  }
}


class interfaces{
  public static void main(String... args)
  {
Circle c1=new Circle();
c1.area();
Shape s1=new Circle();
s1.area();
  }
}
