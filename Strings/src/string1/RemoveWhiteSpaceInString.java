package string1;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Wel   come    T  o fu tu    re";
		 System.out.println(str1+"\n");
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  

	}

}
