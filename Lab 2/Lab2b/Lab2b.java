/* 2 a) Write a Java class called Customer to store their name and date_of_birth. 
        The date_of_birth format should be dd/mm/yyyy. Write methods to read customer data as <name, dd/mm/yyyy> and display as 
        <name, dd, mm, yyyy> using StringTokenizer class considering the delimiter character as “/”. */
        
import java.util.*;
class customer 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Customer Data");
		String data=in.nextLine();
		StringTokenizer st = new StringTokenizer(data, "/"); 
		System.out.print("Customer Details is ");
		int count=st.countTokens();
        while(st.hasMoreTokens()) 
		{ 
			String str = st.nextToken();
			System.out.print(str);
			if(count>1)
				System.out.print(","+" ");
            count--;
		}
       System.out.print("\n");
	}
}
