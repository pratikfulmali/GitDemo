package mac;
/*abstract class Vehical
{
	abstract void Start();
	abstract void Tank();
}
class Test extends Vehical
{

	@Override
	void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start with Keys");
	}												//Absract class(partally Abstraction)
void Tank() {
	System.out.println("Petrol or Diseal");
}
}

public class AnyBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.Start();
		Test obj1=new Test();
		obj1.Tank();;
	}

}
*/
interface Vehical
{
	abstract void Start();
	
}
class Test implements Vehical
{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start with Keys");
	}												//Using Interface Fully abstraction

}


public class AnyBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.Start();
		
	}

}

