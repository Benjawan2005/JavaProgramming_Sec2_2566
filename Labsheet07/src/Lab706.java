import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		
		int indexNum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while(checkIndex(nums,indexNum)){
			indexNum = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
		}
		int currentValue = currentData(nums,indexNum);
		int prevValue = prevData(nums,indexNum);
		int nextValue = nextData(nums, indexNum);
		JOptionPane.showMessageDialog(null, "Current data, nums["+indexNum+"] is "+currentValue+
				"\n"+((indexNum-1<0)?"No previous data":"Prevoius data["+(indexNum-1)+"] is "+nums[prevValue]+
				"\n"+((indexNum+1>=nums.length)?"No next data":"Next data,nums["+(indexNum+1)+"] is "+nums[nextValue])));
		
		
		
		
		
	}//end of main
	public static boolean checkIndex(int[]number, int index) {
		/*if ((index >= number.length)||(index<0)) {
			return true;
		}
		else {
			return false;
		}*/
		return ((index >= number.length)||(index<0))?true:false;
	}//end of checkIndex
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return index-1;
	}
	public static int nextData(int[] nums,int index) {
		return index+1;
	}
}
