/* 10. Write Java programs to (b) Implement Travelling Sales Person problem using Dynamic programming. */

import java.util.*;
public class tsp
{
	static int max=10,i,j;
	static final int infinity=999;
	static Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
		int cost=infinity;
		int c[][]=new int[max][max];
		int tour[]=new int[max];
		int n;
		System.out.println("Enter the number of nodes");
		n=in.nextInt();
		System.out.println("Enter the cost matrix:");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		c[i][j]=in.nextInt();
		for(i=0;i<n;i++)
		tour[i]=i;
		cost=tspdp(c,tour,0,n);
		System.out.println("Tour:");
		for(i=0;i<n;i++)
		System.out.print((tour[i]+1)+"->");
		System.out.println((tour[0]+1));
		System.out.println("Cost:"+cost);
	}
	static int tspdp(int c[][],int tour[],int start,int n)
	{
		int i,j,k;
		int temp[]=new int[max];
		int mintour[]=new int[max];
		int mincost;
		int cost;
		if(start==n-2)
		return c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0];
		mincost=infinity;
		for(i=start+1;i<n;i++)
		{
				for(j=0;j<n;j++)
				temp[j]=tour[j];
				temp[start+1]=tour[i];
				temp[i]=tour[start+1];
				if(((c[tour[start]][tour[i]])+(cost=tspdp(c,temp,start+1,n)))<mincost)
				{
					mincost=c[tour[start]][tour[i]]+cost;
					for(k=0;k<n;k++)
					mintour[k]=temp[k];
				}
		}
		for(i=0;i<n;i++)
		tour[i]=mintour[i];
		return mincost;
	}
}
