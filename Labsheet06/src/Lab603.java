import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter your name, separate by a space.");
		System.out.print(":");
		String fullname = scan.nextLine();
		
		int result = fullname.indexOf(' ');
		String firstName = fullname.substring(0,result);
		
		System.out.print(abbreviatName(fullname).toUpperCase()+firstName);
	}
	public static String abbreviatName(String Fullname) {
		String name = "";
		for(int i=0;i<Fullname.length();i++) {
			if(Fullname.charAt(i)==' ') {
				name = name+Fullname.charAt(i+1)+".";
			}
		}
		return name;
	}

}
