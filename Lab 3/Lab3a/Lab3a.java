/* 3 a)Write a Java program to read two integers a and b. Compute a/b and print, when b is not zero. Raise an exception when b is equal to zero. */

import java.util.*;
class threea
{ 
  public static void main(String args[])
  {
   Scanner inp=new Scanner(System.in); 
   try
    {
     System.out.println("Enter two numbers");
     int a=inp.nextInt();
     int b=inp.nextInt();
     float ans=a/b; 
     System.out.println("A/B="+ans);
    } 
   catch(ArithmeticException e)
   {
     System.out.println("**Raised Exception (Arithmetic):"+e);
   }
   catch(Exception e)
   {
     System.out.println("**Raised Exception (Other):"+e);
   }
  }
}
