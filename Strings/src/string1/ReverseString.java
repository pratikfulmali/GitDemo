package string1;

public class ReverseString {

	public static void main(String[] args) {
		String str="HI HOW R YOu??";
		String Rstr="";
		char ch;
		
		for (int i = 0; i < str.length(); i++) {
			ch=str.charAt(i);
			Rstr=ch+Rstr;
		}
		System.out.println(Rstr);
	}
	}

