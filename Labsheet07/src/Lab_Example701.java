
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12, 50, 93, 45, 75, 52, 80};
		for(int i = 0;i<nums.length;i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		System.out.println("Using foreach to display value from array nums ");
		int j=0;
		for(int _nums : nums) {
			System.out.println("nums["+j+"]="+_nums);
			j+=1;
		}
		printArray(nums);
	}//end main method
	public static void printArray(int[] number) {
		System.out.println("Using method to display values from array number");
		
		for(int i=0;i<number.length;i++) {
			System.out.println("num["+i+"]="+number[i]);
		}
		
	}//end of printArray

}
