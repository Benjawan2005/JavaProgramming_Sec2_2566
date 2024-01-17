import java.util.*;
public class AuthorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String Mail = scan.nextLine();
		System.out.print("Input author gender : ");
		char Gen = scan.next().charAt(0);
		
		Author A1 = new Author(name,Mail,Gen);
		System.out.print(A1);
		

	}

}
