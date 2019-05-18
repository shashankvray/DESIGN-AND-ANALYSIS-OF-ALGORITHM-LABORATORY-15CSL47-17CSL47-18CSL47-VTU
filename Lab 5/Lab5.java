/* 5. Sort a given set of n integer elements using Merge Sort method and compute its time complexity. 
      Run the program for varied values of n> 5000, and record the time taken to sort. Plot a graph of the time taken versus non graph sheet.
      The elements can be read from a file or can be generated using the random number generator. Demonstrate using Java how the 
      divide and-conquer method works along with its time complexity analysis: worst case, average case and best case.  */

import java.util.Random;
import java.util.Scanner;
public class mrgsrt
{
	static final int MAX=10000;
	static int a[]=new int[MAX];
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=input.nextInt();
		Random random=new Random();
		for(int i=0;i<n;i++)
		a[i]=random.nextInt(5000);
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		System.out.println();
		long startTime=System.nanoTime();
		MergeSortAlgorithm(a,0,n-1);
		long stopTime=System.nanoTime();
		long ElapsedTime=stopTime-startTime;
		System.out.println("Sorted array is");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		input.close();
		System.out.println();
		System.out.println("Time complexity(ms) for n= "+n+" is "+(double)ElapsedTime/1000000);
	}
 public static void MergeSortAlgorithm(int a[],int low,int high)
 {
	int mid;
	if(low<high)
	{
		mid=(low+high)/2;
		MergeSortAlgorithm(a,low,mid);
		MergeSortAlgorithm(a,mid+1,high);
		Merge(a,low,mid,high);
	}
 }
 public static void Merge(int a[],int low,int mid,int high)
 {
	int i,j,k;
	int b[]=new int[MAX];
	i=low;
	j=mid+1;
	k=low;
	while((i<=mid)&&(j<=high))
	{
		if(a[i]<a[j])
		b[k++]=a[i++];
		else
		b[k++]=a[j++];
	}
	while(i<=mid)
	 b[k++]=a[i++];
	while(j<=high)
	 b[k++]=a[j++];
	for(i=low;i<=high;i++)
	 a[i]=b[i];
 }
}
