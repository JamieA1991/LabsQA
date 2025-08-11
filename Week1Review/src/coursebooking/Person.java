package coursebooking;

public class Person {

	private String name;
	private String email;
	
	
	


	public Person(String name, String email) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email =email;
	}






	String getDetails() {
		return this.name+" (" +this.email+ ") ";
	}

	
}
