import javax.swing.*;
import java.util.*; //use library for random class
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		//using class random for random money
		Random rdMoney = new Random();
		int balance = rdMoney.nextInt(9)*100000;
		
		int Withdraw = Integer.parseInt(JOptionPane.showInputDialog(null, "Your balance : "+frm.format(balance)+"\nInput money to withdraw:","INPUT",JOptionPane.QUESTION_MESSAGE));
		
		if (Withdraw > balance) {
			
			JOptionPane.showMessageDialog(null, "Error : Can not withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(Withdraw>20000) {
			
			JOptionPane.showMessageDialog(null, "Error : Can not withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if (Withdraw%100 < 99 && Withdraw%100 > 1 ) {
			
			int Lower = Withdraw%100;
			JOptionPane.showMessageDialog(null, "Error : Can not withdraw "+Lower+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+Withdraw+" baht."+"\n1000 = "+Withdraw/1000+"\n500 = "+(Withdraw%1000)/500+"\n100 = "+(Withdraw%500)/100);
			
		}

		
	}

}
