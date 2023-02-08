package num;
import java.util.Scanner;

public class SwapTwoNumbers {
	 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner Ab = new Scanner(System.in);
        x = Ab.nextInt();
        y = Ab.nextInt();
        System.out.println("Before Swapping = " +"X="+ x  +"  "+"Y="+ y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping = "+"X=" + x +"  "+"Y=" + y);
         
    }
 
}
