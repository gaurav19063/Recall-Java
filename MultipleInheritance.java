class Test{
  public static void print()
  {
    System.out.println("Yeah it is printing");
  }
}


interface Walk{
  void canwalk();
}
interface Run{
  void canRun();
  default void printsomething()  // After java 8 speacial Functionality to interfaces.
  {
    System.out.println("hello i am running");
  }
}
class Animal implements Walk,Run{
public  void canRun()
  {
    System.out.println("Running");
  }
public  void canwalk()
  {
    System.out.println("Walking");
  }
}
class Human extends Animal{
  public void canTalk()
  {
    System.out.println("Talking");
  }
}
class MultipleInheritance{
  public static void main(String... args)
  {
    Human h1=new Human();
    h1.canRun();
    h1.canTalk();
    h1.canwalk();
    h1.printsomething();
    Test.print();
  }
}
