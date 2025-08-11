package coursebooking;

import java.util.HashMap;

public class Course {

	private String courseName;
	private HashMap<String, Integer> studentScores;

	public Course(String courseName) {
		this.courseName = courseName;
		this.studentScores = new HashMap<>();
	}

	public void addStudent(String studentName, int grade) {
		if(grade <=0 ) {
			System.out.println("Error: Grade cannot be less than 0");
			return;
		}
		if(grade >=100 ) {
			System.out.println("Error: Grade cannot be  greater than 100");
			return;
		}
		studentScores.put(studentName, grade);
	}

	public void printStudentList() {
		System.out.println("Course: " + courseName);
		for (String studentName : studentScores.keySet()) {
			System.out.println(" - " + studentName + ": " + studentScores.get(studentName));
		}
	}
}
