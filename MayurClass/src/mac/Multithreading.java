package mac;
class Mythread extends Thread
{
	public void run() {
		for (int i = 10; i>1; i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
}
public class Multithreading {
	public static void main(String[] args) {
	
	Mythread obj=new Mythread();
	obj.start();
	for (int i = 11; i <=20; i++) {
		System.out.println(i);
		try {
			Thread.sleep(500);
			System.out.println("Chield Thread");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}

}
