
class Base{
  public void print()
  {
    System.out.println("Inside Base");
  }
  public void print2()
  {
    System.out.println("Inside Base Print2");
  }
}
class Child1 extends Base{
  public void print()
  {
    System.out.println("Inside Child1");
  }
}
class Child2 extends Base{
  public void print()
  {
    System.out.println("Inside Child2");
  }
}
class Poly
{


  public static void main(String... args)
  {
    Child1 c1=new Child1();
    Child2 c2=new Child2();
    Base b1=new Base();

    c1.print();
    c2.print();
    b1.print();
    c1.print2();
    b1=c1;

    b1.print();
    b1.print2();

  }
}
