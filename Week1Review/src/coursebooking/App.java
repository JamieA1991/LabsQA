package coursebooking;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Course> courses = new ArrayList<>();
		Course java = new Course("Java");
		Course sql = new Course ("SQL");
		Course python = new Course ("Python");
		courses.add(java);
		courses.add(python);
		courses.add(sql);
		
		Student st1 = new Student("Jamie", "jamie@gmail.com","001");
		Student st2 = new Student("Tony", "Tony1@Sky.com","002");
		Student st3 = new Student("Jenny", "jenny@hotmail.com","003");
		
		java.addStudent(st1.getDetails(), 85);
		java.addStudent(st2.getDetails(), 70);

		python.addStudent(st2.getDetails(), 65);
		sql.addStudent(st3.getDetails(), 90);
		
		
		
		System.out.println("Student Course List");
		for (Course c :courses) {
			c.printStudentList();
		}
	}

}
