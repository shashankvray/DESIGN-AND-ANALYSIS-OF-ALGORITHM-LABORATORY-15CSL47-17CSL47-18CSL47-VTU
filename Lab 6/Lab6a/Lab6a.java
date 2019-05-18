/* 6. Implement in Java, the 0/1 Knapsack problem using (a) Dynamic Programming method */

import java.util.Scanner;
class KnapsackDP
{
  static int wt[]=new int[10];
  static int pr[]=new int[10];
  public static int knapsack(int n,int m)
  {
    if(n==0||m==0)
     return 0;
    else if(wt[n]>m)
     return knapsack(n-1,m);
    else 
     return max(pr[n]+knapsack(n-1,m-wt[n]),knapsack(n-1,m));
  }
  public static int max(int a,int b)
  {
    if(a>b)
     return a;
    else
     return b;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter number of objects");
    int n=in.nextInt();
    System.out.println("Enter profit array");
    for(int i=1;i<=n;i++)
      pr[i]=in.nextInt();
    System.out.println("Enter weight array");
    for(int i=1;i<=n;i++)
      wt[i]=in.nextInt();
    System.out.println("Enter maximum weight");
    int m=in.nextInt();
    int maxwt=knapsack(n,m);
    System.out.println("Maximum profit = "+maxwt);
   }
}
