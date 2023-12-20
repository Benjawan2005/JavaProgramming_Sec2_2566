import java.util.*;
public class Lab604 {
	static Scanner scan = new Scanner(System.in);
	static String studentId,strSubjectId;
	static int subjectId;
	
	public static void main(String[] args) {
		inputStudent();

	}//end main
	
	public static void inputStudent() {
		
		do {
			System.out.print("Enter student Id:");
			studentId = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextInt();
			//convert subjectId from Integer to string(strSubjectId)
			strSubjectId = subjectId+"";
		}while(!(isLength(studentId,strSubjectId)));
		
		System.out.println();
		displayData(isITstudent(studentId),isITsubject(strSubjectId));
		
	}//inputStudent
	
	public static boolean isLength(String id,String sub_id) {
		if(id.length()==10 && sub_id.length()==7) {
			return true;
			
		}
		return false;
		
	}//end isLength
	
	public static boolean isITstudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
			return true;
		}
		else return false;
		
	}//end isITstudent
	
	public static boolean isITsubject(String sub_id) {
		
		if(sub_id.substring(0,2).equals("21")&&sub_id.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
		
	}
	
	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.print("student id:"+studentId+" 1st year student in IT");
		}
		else {
			System.out.print("student id:"+studentId+" is not 1st year student in IT");
		}
		
		if(subid) {
			System.out.print("\nEnroll in couse for Year 1");
		}
		else {
			System.out.print("Not enroll in couse for Year 1");
		}
	}
	
	

}
