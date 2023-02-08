package mac;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> obj=new LinkedHashSet<String>();
		obj.add("Info");
		obj.add("TCS");
		obj.add("Info");
		obj.add("TCS");
		obj.add("Info");
		obj.add("TCS");
		obj.add("Info");
		obj.add("TCS");
		for (String obj1 : obj) {
			System.out.println(obj1);
		}
		
		
	}

}
