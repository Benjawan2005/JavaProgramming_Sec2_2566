import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book b1 = new Book();
		
		System.out.print("Input book title : ");
		String name = scan.next();
		
		System.out.print("Input book price : ");
		float price = scan.nextFloat();
		
		System.out.print("Input publish year : ");
		int publish = scan.nextInt();
		
		b1.setTitle(name);
		b1.setPrice(price);
		b1.setPublishyear(publish);
		
		System.out.println();
		System.out.print(b1);
		

	}

}
