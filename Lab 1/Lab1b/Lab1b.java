/*1 b) Write a Java program to implement the Stack using arrays. Write Push(), Pop(), and Display() methods to demonstrate its working. */

import java.util.Scanner;
class stack
{
 static int size=4;
 int s[]=new int[size];
 int top=-1;
 public void push(int x)
 {
  if(top<size-1)
    s[++top]=x;
  else 
    System.out.println("Overflow");
 }
 public void pop()
 {
  int ele;
  if(top==-1)
    System.out.println("Underflow");
  else 
   {
    ele=s[top--];
    System.out.println("Deleted Element is"+ele);
   }
 }
 public void dis()
 {
  if(top==-1)
    System.out.println("Stack is empty");
  else  
  {
   System.out.println("Stack is");
   for(int i=0;i<=top;i++)
     System.out.print(s[i]+"\t");
   System.out.print("\n");
  }
 }
}
class stk
{
 public static void main(String args[])
 {
  stack ob=new stack();
  Scanner in=new Scanner(System.in);
  System.out.println("Enter 1:Push,2:Pop,3:Display,4:Exit");
  int flag=1;
  while(flag==1)
  {
   System.out.println("Enter Option:");
   int op=in.nextInt();
   switch(op)
   {
     case 1: System.out.println("Enter the element to be inserted");
             int x= in.nextInt();
             ob.push(x);
             break;
     case 2: ob.pop();
             break;
     case 3: ob.dis();
             break;
     case 4: System.out.println("Thank You");
             flag=0;
             break;
     default:System.out.println("Invalid Option");
   }
  }
 }
}
