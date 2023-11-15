import java.util.*; //import library for input data from keyboard(console)
import java.text.*;
public class Exaple3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		//2. define object for scanner Class
		Scanner input = new Scanner(System.in);
		
		//3.Display text and input data
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		double totalPrice = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPrice)+" baht.");
		double vatPrice = totalPrice +(totalPrice*0.07);
		System.out.println("Add VAT 7%  is "+frm.format(vatPrice)+" baht.");

	}

}
