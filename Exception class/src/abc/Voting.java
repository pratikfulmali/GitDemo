package abc;

import java.util.Scanner;

class Age extends Exception
{
	public Age() {
		// TODO Auto-generated constructor stub
		System.out.println("You Are Not-Elligible To vote ");
		
	}
}
public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age");
		int Page=sc.nextInt();
		
		try {
			if (Page<18)
			{
				int b=18-Page;
				System.out.println("Please come after "+b+" Years");
				throw new Age();
			} 
			else
			{
				System.out.println("Elligible To vote");
				
				
			}
				
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			//System.out.println(e.getMessage());
		}
	}}	


