package mac;

import java.util.ArrayList;

public class StrBuff {

	public static void main(String[] args) {
		 ArrayList<String> obj=new ArrayList<>();
		 obj.add("Pratik");
		 obj.add("Rohit");
		 obj.add("harshada");
		 obj.add("ashwini");
		 obj.add("pooja");
		 obj.add("vishal");
		 obj.add("Rohit");
		 ArrayList<String> name=new ArrayList<>();
		 name.add("micro");
		 name.add("BItinject");
		 name.add("infodeal");
		 obj.addAll(name);
//		 obj.remove("Rohit");
//		 obj.removeAll(name);
		 obj.add(2,"pratik");
		 System.out.println(obj);
		 System.out.println(obj.hashCode());
		 for (String ob: obj) {
			 System.out.println(ob);
			
		}

		 
	}

}
