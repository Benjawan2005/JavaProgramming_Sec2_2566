import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//Input email from dialog box
		
		String yourEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		//check email start with @ or space bar or not
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
			yourEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		//check email end with hotmail.com or gmail.com or not
		yourEmail = yourEmail.toLowerCase();
		
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			
			JOptionPane.showMessageDialog(null, "Your e-mail is "+yourEmail);
			
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			
		}

	}

}
