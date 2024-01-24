
public class PersonalInfo {
	private Person name; //object name reference class Person
	private Date bDay; //object bDay redference class date
	
	//declare 1 private attribute
	private int personID;
	
	//default constructor
	//Postcondition firstname="",lastname = ""
	//dMonth = 1; dDay =1; and dYear=1990
	//PersonId = 0
	PersonalInfo(){
		name = new Person();
		bDay = new Date();
		personID = 0;
	}
	PersonalInfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last);//firstName = first and lastName = last
		bDay = new Date(month, day,year);
		personID = ID;
	}
	
	//invoke set method from class person and class date
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	public String toString() {
		return "Name:"+ name.toString()+"\n"+"Date of birth : "+bDay.toString()+"\n"+"Personal ID"+personID;
	}

}
