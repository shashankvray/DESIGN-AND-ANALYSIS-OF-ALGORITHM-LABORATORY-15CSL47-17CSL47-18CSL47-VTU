/* 10. Write Java programs to  (a) Implement All-Pairs Shortest Paths problem using Floyd's algorithm. */

import java.util.Scanner;
class floyd
{
  public static void main(String args[])
  {
    int a[][]=new int[100][100];
    System.out.println("Enter the no.  of nodes");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println("Enter the matrix");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
       a[i][j]=in.nextInt();
    }
    for(int k=0;k<n;k++)
    {
     for(int i=0;i<n;i++)
      {
       for(int j=0;j<n;j++)
          if(a[i][j]>a[i][k]+a[k][j])
             a[i][j]=a[i][k]+a[k][j]; 
      }
     }
     System.out.println("Shortest matrix is");
     for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
       System.out.print(a[i][j]+"\t");
       System.out.print("\n");
    }
   }
}
