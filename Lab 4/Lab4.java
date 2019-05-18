/* 4. Sort a given set of n integer elements using Quick Sort method and compute its time complexity. 
      Run the program for varied values of n> 5000 and record the time taken to sort. Plot a graph of the time taken versus non graph sheet.
      The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the 
      divideand-conquer method works along with its time complexity analysis: worst case, average case and best case */

import java.util.Random;
import java.util.Scanner;
class quick
{	
	static int  a[]=new int[10000];
	static Random r=new Random();
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=5000+r.nextInt(1000);
		}
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+"\t");
                System.out.print("\n");
		}
		long startTime=System.nanoTime();
		quicksrt(a,0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		for(int i=0;i<n;i++)
		{
		System.out.print(a[i]+"\t");
		}
		System.out.print("\n");
		System.out.println("Time complexity is \t"+(double)elapsedTime/1000000+" Milliseconds");
	}
				
	public static int part(int a[],int l,int h)
	{
	int pv=h;
	int i=l-1;
	int j=l;
	while(j<=pv)
	{
		while(a[j]<a[pv])
		{
			j++;
		}
		while(a[j]>a[pv])
		{
			i++;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j++;
		}
		if(a[j]==a[pv])
		{
			i++;
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j++;
			}
	}
	return i;
   }
   public static void quicksrt(int a[],int l,int h)
   {
		if(l<=h)
		{
			int i=part(a,l,h);
			quicksrt(a,0,i-1);
			quicksrt(a,i+1,h);
		}
   }
}
