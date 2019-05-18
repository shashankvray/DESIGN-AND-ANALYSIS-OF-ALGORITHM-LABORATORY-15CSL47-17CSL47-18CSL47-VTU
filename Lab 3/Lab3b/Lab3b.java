/* 3 b) Write a Java program that implements a multi-thread application that has three threads. 
        First thread generates a random integer for every 1 second; second thread computes the square of the number andprints; 
        third thread will print the value of cube of the number. */
        
import java.util.*;
class first extends Thread
{
   first()
   {
     start();
   }
   public void run()
   {
    try
    {
     for(int i=0;i<5;i++)
     {
      Random r=new Random();
      int n=r.nextInt(100);
      System.out.println("Number is:"+n);
      new second(n);
      new third(n); 
      Thread.sleep(1000);
      }
    }
    catch(Exception e)
    { 
      System.out.println("First  thread interrupted");
     }
    System.out.println("First  thread exiting");
   }
}
class second extends Thread
{
  int x; 
  second(int n)
  {
   x=n;
   start();
  }
  public void run()
  {
   try
   {
    System.out.println("Square is:"+(x*x));
    }
    catch(Exception e)
    { 
      System.out.println("Second  thread interrupted");
     }
    System.out.println("Second thread exiting");
  }
}
class third extends Thread
{
  int x; 
  third(int n)
  {
   x=n;
   start();
  }
  public void run()
  {
   try
   {
    System.out.println("Cube is:"+(x*x*x));
    }
    catch(Exception e)
    { 
      System.out.println("Third  thread interrupted");
    }
    System.out.println("Third thread exiting");
  }
}
class multi
{
  public static void main(String args[])
  {
   new first();
  }
}
