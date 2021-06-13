class Base{

  Base()
  {
    System.out.println("Inside The Base");
  }

  public void fun1()
  {
    System.out.println("Fun1 Base");
  }
}
class Child1 extends Base{
Child1()
{
  System.out.println("Inside the child1");
}
public void fun1()
{
  System.out.println("Fun1 Child1");
}
}
class Child2 extends Base{
Child2()
{
  System.out.println("Inside the child2");
}
public void fun1()
{
  System.out.println("Fun1 Child2");
}
}
class Main{

  public static void main(String... args)
  {
    Child1 ch=new Child1();

    // polymorphism
    Base ch1=new Child1();
    Base ch2=new Child2();
    ch1.fun1();
    ch2.fun1();
    Base b1=new Base();
    ch.fun1();
    ch1.fun1();
    ch2.fun1();
    b1.fun1();
  }
}
