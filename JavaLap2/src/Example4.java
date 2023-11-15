import javax.swing.*; //1. import library for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.Display and input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		/*String strUnit = JOptionPane.showInputDialog("Input product unit");
		//Convert string to int
		int unitPrice = Integer.parseInt(strUnit); */
		
		int unitPrice = Integer.parseInt(
				JOptionPane.showInputDialog("Input product unit"));
		
		double priceperUnit = Double.parseDouble(
				JOptionPane.showInputDialog("Input Price per unit :"));
		
		double totalPrice = unitPrice * priceperUnit;
		double vatPrice = totalPrice +(totalPrice*0.07);
		
		//show message from dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalPrice) + " baht."+
				"\nAdd VAT 7% is "+frm.format(vatPrice)+" baht.");

	}

}
