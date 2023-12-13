import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name :");
		String Fullname = scan.nextLine();
		int result = Fullname.indexOf(' ');
		
		if(result == -1) {
			System.out.println("Incorrect name");
		}
		else {
			String Firstname = Fullname.substring(0,result);
			String Lastname = Fullname.substring(result);
			System.out.println("First name : "+Firstname.toUpperCase());
			System.out.print("Last name : "+Lastname);
		}

	}

}
