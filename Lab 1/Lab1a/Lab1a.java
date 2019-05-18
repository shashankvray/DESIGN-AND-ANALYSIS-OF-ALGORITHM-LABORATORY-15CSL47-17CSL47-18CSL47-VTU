/*1 a) Create a Java class called Student with the following details as variables within it. 
(i)  USN (ii)  Name (iii) Branch  (iv) Phone 
Write a Java program to create nStudent objects and print the USN, Name, Branch, and Phoneof these objects with suitable headings.*/

import java.util.Scanner;
class stdinfo
{
   Scanner in=new Scanner(System.in);
   String usn=new String();
   String name=new String();
   String branch=new String();
   String ph=new String();
   public void read()
   {
    System.out.println("Enter USN,Name,Branch,Phone no");
    usn=in.next();
    name=in.next();
    branch=in.next();
    ph=in.next();
   }
   public void prt()
   {
    System.out.print("USN:"+usn+"\tName:"+name+"\tBranch:"+branch+"\tPhone no:"+ph+"\n");
   }
}
class student
{
   public static void main(String args[])
  {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the number of students");
       int n=in.nextInt();
       stdinfo[] ob=new stdinfo[n];
       System.out.println("Enter the details of the students");
       for(int i=0;i<n;i++)
       {    
           System.out.println("Student:"+(i+1));
           ob[i]=new stdinfo();
           ob[i].read();
       }
       System.out.println("Student List is:");
       for(int i=0;i<n;i++)
       {   
           System.out.println("Student:"+(i+1));
           ob[i].prt();
       }
   }   
}
