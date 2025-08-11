package coursebooking;

public class Student extends Person{
	
	private String studentID;
	
public Student(String name, String email,String studentID) {
	
	super(name,email);
	this.studentID = studentID;
	
	}
	
public String getStudentID() {
	return studentID;
}

public String getDetails() {
	return "ID: " +studentID + " " + super.getDetails();
}


}
