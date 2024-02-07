import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input email : ");
		String email = input.nextLine();
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		boolean check = false;
		String tmp = "";
		
		
		while(readFile.hasNext()) {
		
		//String[] data = tmp.split("\t");
		readFile.next();
		readFile.next();
		String password = readFile.next();
		String Email = readFile.next().toUpperCase();
			
		if(Email.equalsIgnoreCase(email)) {
			System.out.print("Your password is "+password);
			check = true;
			if(check) {
				break;
			}
	
		}
		else {
			check = false;
		}
		}
		
		if(check == false) {
			System.out.println("The data not found....");
		}
		readFile.close();

	}

}
