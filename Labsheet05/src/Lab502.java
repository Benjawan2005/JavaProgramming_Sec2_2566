import java.util.*;

import javax.swing.JOptionPane;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		int Count = -1;
		
		for(int i = 0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				System.out.println(sentence.substring((Count+1),i));
			    Count=i;
			}
		}
		System.out.println(sentence.substring(Count+1));
		
		
		

	}

}
