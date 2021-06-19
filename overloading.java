class PrivateConstr{
  int a=0;
  public PrivateConstr()
  {
    a=1;
  }
};

class Main{

  static void print(int a)
  {
    System.out.println(a);
  }
  static void print(double a)
  {
    System.out.println(a+3);
  }

  public static void main(String... args)
  {
    int a=9;
    print(a);
    double b=3;
    print(b);
    PrivateConstr pc=new PrivateConstr();
    System.out.println(pc.a);

  }

}
