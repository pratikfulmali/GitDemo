package abc;

import java.util.Scanner;

class Result extends Exception
{
	Result()
	{
		super("You are Pass");
	}
}
public class StudentPorF {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Marks");
	int Marks=sc.nextInt();
	
	try {
		if (Marks>40)
		{
			throw new Result();
		} else {
			System.out.println("You Are Failed");

		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}

	}

}
