package dsf;

import java.util.Scanner;

public class StringEg {

	/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=obj.next();
		System.out.println("Enter second String");
		String str2=obj.next();
		Character s3=str1.charAt(0);
		System.out.println(s3+str2);
		
		*/
	/*	String s1="Infodeal Technologies";
		
		int leng=s1.length();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
			{
		rev=rev+s1.charAt(i);
			}
	System.out.println(rev);
	*/
		
			  public static void main(String[] args) {

			    String str = "Radar", reverseStr = "";
			    
			    int strLength = str.length();

			    for (int i = (strLength - 1); i >=0; --i) {
			      reverseStr = reverseStr + str.charAt(i);
			    }

			    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			      System.out.println(str + " is a Palindrome String.");
			    }
			    else {
			      System.out.println(str + " is not a Palindrome String.");
			    }
			  
			
	}

	
	}


