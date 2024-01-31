import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Title : ");
		String TitleInput = scan.nextLine();
		System.out.print("Year : ");
		int publicYearInput = scan.nextInt();
		
		FictionBook book1 = new FictionBook(TitleInput,publicYearInput);
		scan.nextLine();
		
		System.out.print("Name : ");
		String nameInput = scan.nextLine();
		book1.setAuthorName(nameInput);
		while(!book1.checkFormatName()) {
			System.out.print("Name : ");
			nameInput = scan.nextLine();
			book1.setAuthorName(nameInput);
		}
		
		System.out.print("Email : ");
		String emailInput = scan.nextLine();
		book1.setEmail(emailInput);
		while(!book1.checkEmail()) {
			System.out.print("Email : ");
			emailInput = scan.nextLine();
			book1.setEmail(emailInput);
		}
		
		System.out.println(book1);
		
		
		
		
		
		

	}

}
