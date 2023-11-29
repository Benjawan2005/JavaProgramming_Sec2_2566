import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int Valueof_X = scan.nextInt();
		System.out.print("Input value of Y : ");
		int Valueof_Y = scan.nextInt();
		
		while (Valueof_X>Valueof_Y)  {
			System.out.print("Input value of Y,again : ");
			Valueof_Y = scan.nextInt();
			
		}
		System.out.println();
		
		int Valueof_Z = Valueof_X;
		
		while(Valueof_X<Valueof_Y) {
			int Total = Valueof_Z+Valueof_X+1;
			System.out.println(""+Valueof_Z+" + "+(Valueof_X+1)+" = "+""+Total);
			Valueof_Z = Total;
			Valueof_X++;
		}
		
		
		/*for (int i = Valueof_X+1;i<=Valueof_Y;i++) {		
			int Total = Valueof_X+i;
			System.out.println(Valueof_X+" + "+i+" = "+Total);
			Valueof_X = Total;
		}*/
		
		

	}

}
