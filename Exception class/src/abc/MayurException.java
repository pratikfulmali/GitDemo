package abc;

import java.util.Scanner;

class Onlinepay extends Exception
{
	public Onlinepay() 
	{
		System.out.println("Insufficient Fund");
	}
}
public class MayurException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int Amount=sc.nextInt();
		
		try {
			if (Amount<100) 
			{	throw new Onlinepay();	
			} else {
				System.out.println("Transacction Successfull");
			}
		} catch (Onlinepay e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
