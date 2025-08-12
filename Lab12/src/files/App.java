package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String[] courses = readCSV("src/files/course.txt");
			String[] trainers =readCSV("src/files/trainer.txt");
			
			FileWriter writer = new FileWriter("src/files/trainersandcourses.txt");
			writer.write(String.join(",", courses) + "\n");
			writer.write(String.join(",", trainers) + "\n");
			writer.close();
		
			System.out.println("Data written to trainersAndCourses.txt successfully.");
		}
	
		catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	
	}
	
private static String[] readCSV(String inFile) throws IOException {

	BufferedReader reader  = new BufferedReader(new FileReader(inFile));
	String line = reader.readLine();
	reader.close();
	return line.split(",");
	}


}
