package swap1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of A=");
		int a=obj.nextInt();
		System.out.println("Enter the value of B=");
		int b=obj.nextInt();
		//int a=10;
		//int b=20;
	/*	int c;
		
		c=a;
		a=b;
		b=c; 
*/
	/*	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping");
		System.out.println("value of a="+a);
		System.out.println("Value of b="+b);

		
		// Prime no
		
		int no=13;
		int temp=0;
		for (int i=2;i<=no-1;i++)
		{	
			if(no%i==0)
			{
		}
			temp=temp*1;
			
		}
		
		if(temp>0)
		{
			System.out.println("no is prime");
		}
		else
		{
			System.out.println("no is not a prime");
		}
		
		// Amgstrong no
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number :-");
		int no=sc.nextInt();
		int x=no;
		int sum=0;
		int rem;
		while(no !=0)
		{
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
		if(x==sum)
			{System.out.println("Amstrong");
		}
		else {
			System.out.println("Not amgstrong");
		}
		*/
		
		// Palindrome no
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number :-");
		int no=sc.nextInt();
		int temp=no;

		int rem;
		int rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
			{System.out.println(no+" Palindrome");
		}
		else {
			System.out.println(no+" Not a Palindrome");
		}
		
	}
		
}
