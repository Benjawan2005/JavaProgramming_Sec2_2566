import java.util.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double []number = new double[5];
		
		double Ave =0;
		
		for(int i=0;i<number.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			number[i] = scan.nextDouble();
			Ave += number[i];
		}
		Ave = Ave/number.length;
		
		System.out.println();
		System.out.println("Average of "+number.length+" is "+String.format("%.2f", Ave));
		int i=0;
		for(double _number : number) {
			if(_number>Ave) {
				System.out.println("> Student "+(i+1)+" ("+_number+")");
			}
		}

	}

}
