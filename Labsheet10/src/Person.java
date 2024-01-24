
public class Person {
	//declare 2 private Attributes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Intialize firstname and lastname to an empty string
	Person(){
		firstName = "";
		lastName = "";
	}
	Person(String first,String last){
		//firstName = first;
		//lastName = last;
		setName(first, last);
	}
	//Method to set first and last according to parameters
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	//Method to return firstName
	public String getFisrtName() {
		return firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return firstName +" "+lastName;
	}
	

}
