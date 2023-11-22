import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("###.00");
		
		//input weight from user
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input weight : "));
		//input and convert height(cm.) from user
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height : "));
		//convert height from cm. to m.
		height = height/100;
		double BMI = weight / (height*height);
		
		//check condition and declare meaning of BMI
		String bmiCategory;
		if(BMI<18.5) bmiCategory="Underweight";
		else if (BMI<25) bmiCategory="Normal-weight";
		else if (BMI<30)bmiCategory="Overweight";
		else bmiCategory="Obesity";
		
		//display BMI value to showMessage dialog box
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",BMI)+"\nYou're "+bmiCategory);
		

	}

}
