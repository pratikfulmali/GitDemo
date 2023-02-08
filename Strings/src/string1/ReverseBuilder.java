package string1;

public class ReverseBuilder {

	public static void main(String[] args) {
		
		String str1="Hi How r u ?";
		StringBuilder str2=new StringBuilder();	
		str2.append(str1);
		str2.reverse();
		System.out.println("Reverse String is--------"+str2);

	}

}
