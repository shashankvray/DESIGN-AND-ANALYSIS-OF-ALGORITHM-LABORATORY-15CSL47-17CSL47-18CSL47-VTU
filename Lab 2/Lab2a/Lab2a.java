/* 2 a)Design a superclass called Staff with details as StaffId, Name, Phone, Salary. 
       Extend this class by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract (period). 
       Write a Java program to read and display at least 3 staff objects of all three categories. */
       
import java.util.*;
class staff 
{
  String stid=new String();
  String stname=new String();
  String stph=new String();
  String stsal=new String();
  Scanner in= new Scanner(System.in);
 public  void read()
 {
  System.out.println("Enter Staff Details(Staff ID,Name,Phone no.and Salary)");
  stid=in.nextLine();
  stname=in.nextLine();
  stph=in.nextLine();
  stsal=in.nextLine();
 }
 public  void display()
 {
  System.out.println("\nStaff Details:");
  System.out.println("Staff ID:"+stid+"\nName:"+stname+"\nPhone:"+stph+"\nSalary:"+stsal);
 }
}
class teaching extends staff
{
   String tdom=new String();
   String tpbl=new String();
  public  void tread()
  {
   super.read();
   System.out.println("Enter Teaching Details(Domain and Publications)");
   tdom=in.nextLine();
   tpbl=in.nextLine();
  }
 public  void tdisplay()
 {
  super.display();
  System.out.println("\nTeaching Details:");
  System.out.println("Domain:"+tdom+"\nPublications:"+tpbl);
 }
}
class technical extends staff
{ 
   String skills=new String();
  public  void teread()
  {
   super.read();
   System.out.println("Enter Technical Details(Skills)");
   skills=in.nextLine();
  }
 public  void tedisplay()
 {
  super.display();
  System.out.println("\nTechnical Details:");
  System.out.println("Skills:"+skills);
 }
}
class contract extends staff
{ 
   String con=new String();
  public  void cnread()
  {
   super.read();
   System.out.println("Enter Contract Details(Period in years)");
   con=in.nextLine();
  }
 public  void cndisplay()
 {
  super.display();
  System.out.println("\nContract Details:");
  System.out.println("Period:"+con+"years");
 }
}
class twoa
{
 public static void main(String args[])
 { 
  Scanner in= new Scanner(System.in);
  teaching a[]=new teaching[10];
  technical b[]=new technical[10];
  contract c[]=new contract[10];
  System.out.println("Enter no. of staffs");
  int n=in.nextInt();
  for(int i=0;i<n;i++)
  {
   a[i]=new teaching();
   a[i].tread();
  }
    for(int i=0;i<n;i++)
  {
   b[i]=new technical();
   b[i].teread();
  }
   for(int i=0;i<n;i++)
  {
   c[i]=new contract();
   c[i].cnread();
  }
  for(int i=0;i<n;i++)
  {
   a[i].tdisplay();
  }
    for(int i=0;i<n;i++)
  {
   b[i].tedisplay();
  }
   for(int i=0;i<n;i++)
  {
   c[i].cndisplay();
  }
 }
}
