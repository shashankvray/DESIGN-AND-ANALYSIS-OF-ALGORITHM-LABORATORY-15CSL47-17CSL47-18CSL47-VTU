/* 11. Design and implement in Java to find a subset of a given set S = {Sl, S2,.....,Sn} of n positive integers whose SUM is 
       equal to a given positive integer d. For example, if S ={1, 2, 5, 6, 8} and d= 9, there are two solutions {1,2,6}and {1,8}. 
       Display a suitable message, if the given problem instance doesn't have a solution. */

import java.util.*;
class sub
{
 public static int flag=0;
 public static int org[]=new int[10];
 public static int sol[]=new int[10];
 public static void subset(int org[],int sol[],int cursum,int sum,int i)
 {
  if(cursum==sum)
  {
   for(i=0;i<org.length;i++)
    if(sol[i]==1)
       System.out.print(org[i]+"\t");
    flag=1;System.out.print("\n");
    return;
  }
  if(i==org.length)
    return;
  else
    {
     sol[i]=1;
     cursum+=org[i];
     subset(org,sol,cursum,sum,i+1);
     sol[i]=0;
     cursum-=org[i];
     subset(org,sol,cursum,sum,i+1);
     }
 }
 public static void main(String args[])
 {
  int i=0,size;
  int cursum=0;
  int sum;
  System.out.println("Enter the number of elements in the set");
  Scanner in=new Scanner(System.in);
  size=in.nextInt();
  System.out.println("Enter the elements of the set");
  for(int x=0;x<size;x++)
     org[x]=in.nextInt();
  System.out.println("Enter the sum");
  sum=in.nextInt();
  subset(org,sol,cursum,sum,i);
  if(flag==0)
    System.out.println("Subset not found");
 }
}   
