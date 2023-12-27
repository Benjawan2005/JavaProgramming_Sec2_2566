import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		int[] number = new int[7];
		String text= "";
		int countOdd = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
			if(number[i]%2!=0) {
				countOdd++;
			}
		}
		System.out.println();
		System.out.println("There are "+countOdd+" of odd number.");
		System.out.print("List of odd number : ");
		for(int _number:number) {
			if(_number%2==1) {
				System.out.print(_number+" ");
			}
		}
	}

}
