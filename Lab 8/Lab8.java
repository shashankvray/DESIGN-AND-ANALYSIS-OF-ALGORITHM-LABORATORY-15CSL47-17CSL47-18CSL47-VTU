/* 8. Find Minimum Cost Spanning Tree of a given connected undirected graph using  Kruskal'salgorithm. 
      Use Union-Find algorithms in your program. */

import java.util.Scanner;
class Krusk
{
 static int n,ne=1,min=999,mincost=0;
 static int parent[]=new int[11];
 static int cost[][]=new int[10][10];
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the number of nodes");
   n=in.nextInt();
   System.out.println("Enter the cost matrix");
   for(int i=1;i<=n;i++)
    for(int j=1;j<=n;j++)
      cost[i][j]=in.nextInt();
   krusk(cost);
 }

 public static void krusk(int cost[][])
 {
   int i,j,u=1,v=1,a=1,b=1,flag=0;
    while(ne<n)
   {
     min=999;
     for(i=1;i<=n;i++)
     {
      for(j=1;j<=n;j++)
      {
         if(cost[i][j]<min)
        {
          min=cost[i][j];
          a=u=i;
          b=v=j;
        }
      }
    }
    u=find(u);
    v=find(v);
    if(uni(u,v))
    {
     System.out.println("Edge "+a+" to "+b+" with cost "+cost[a][b]);
     mincost=mincost+cost[a][b];
     ne++;
    }
     cost[a][b]=cost[b][a]=999;
  }
  System.out.println("Total cost is = "+mincost);
 }
 public static boolean uni(int r,int s)
 {
   if(r!=s)
   {
     parent[s]=r;
     return true;
   }
   return false;
 }
 public static int find(int i)
 {
   while(parent[i]!=0)
     i=parent[i];
   return i;
 }
}
