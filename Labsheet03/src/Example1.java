import javax.swing.*; //import library for input from Dialog box
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		
		double priceDiscount , totalPrice = 0;
		//calculate total price of BUFFET
		totalPrice = BUFFET * numberofCustomer;
		//using showMessage dialog box for display totalprice
		//JOptionPane.showConfirmDialog(null, "Amount to be paid is "+
		//								frm.format(totalPrice) + "baht.");
		//using comfirm dialog box
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is "+frm.format(totalPrice) + " baht."+
					"\nDo you have a membercard?");
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		
		if(memberCard==JOptionPane.YES_OPTION) {
			priceDiscount = totalPrice * 90/100; //discount 10%
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+
					frm.format(priceDiscount) + " baht.");
			
		}//end of if
		else if (memberCard==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+
					frm.format(totalPrice) + " baht.");
		}
		
		

	}

}
