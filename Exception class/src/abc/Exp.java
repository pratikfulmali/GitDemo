package abc;

public class Exp {

	public static void main(String[] args) {
	System.out.println("Start");
		 try {
			System.out.println(10/0);
			System.out.println("Try block Executed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Catch Block Executed");
			
		}
		System.out.println("After Catch block");
					
		}
	
	}


