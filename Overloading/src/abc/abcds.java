package abc;
class Vehical
{
	void run()
	{
		System.out.println("Vehical");
	}
}
class Bike extends Vehical
{
	void run()
	{
		System.out.println("Bike");
		super.run();
}
}
public class abcds {

	public static void main(String[] args) {
		   Bike obj= new Bike();
		   obj.run();
				
			}
			
		}

	


