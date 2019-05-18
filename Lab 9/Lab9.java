/* 9. Find Minimum Cost Spanning Tree of a given connected undirected graph using  Prim's algorithm. */

import java.util.*;
class prims
{
 static int cost[][]=new int[100][100];
 static int vi[]=new int[100];
 static int n,ne=1,min=999;
 static int mincost=0;
 public static void main(String args[])
 {
  System.out.println("Enter the number of nodes");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  System.out.println("Enter the matrix");
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n;j++)
     cost[i][j]=in.nextInt();
  }
  prm();
 }
 public static void prm()
 {
  int u=1,v=1;
  while(ne<n)
  {
   min=999;
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=n;j++)
    {
     if(cost[i][j]<min)
     {
      min=cost[i][j];
      u=i;
      v=j;
     }
    }
   }
   if((vi[u]==0)||(vi[v]==0))
   {
      System.out.println("Cost of "+u+" and "+v+" is "+cost[u][v]);
      mincost=mincost+cost[u][v];
      vi[v]=1;
      ne++;
   }
   cost[u][v]=cost[v][u]=999;
  } 
  System.out.println("Total cost="+mincost);
 }
}
