import java.io.*;

class FileHndling
{
  public static void main(String... args)
  {
    try{
    File f=new File("/home/gaurav/github/Recall-Java/Test.java");
    PrintWriter fileinfo=new PrintWriter(f);
    System.out.println(fileinfo);
}
catch(Exception e)
{
  System.out.println(e);
}
  }
}
