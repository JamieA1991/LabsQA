package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;





public class JsonMain {

	public static void main(String[] args)  throws Exception{

	    Gson gson = new Gson();

	    String fileName = "C:\\Users\\airey1j\\eclipse-workspace\\Lab12\\src\\files\\customers.json";

	    String content = new String(Files.readAllBytes(Paths.get(fileName)));

	    Customer[] customers = gson.fromJson(content, Customer[].class);

	    for (Customer a: customers){
    				
	    
	    System.out.println(a.CustomerID);
	   
	    
	    	

	}
		Gson gson1 = new Gson();

    	int[] nos = {1,3,5,7,9};
    	String res = gson1.toJson(nos);
    	System.out.println(res);

    	String[] names= {"Bob","Fred","Wilma"};
    	res = gson1.toJson(names);
    	System.out.println(res);

    	Student[] students = {
    	   	new Student("Bob",21), 
    	   new Student("Fred",32), 
    	   new Student("Wilma",26)
    	};

    	res = gson1.toJson(students);
    	System.out.println(res);		
    	
    	try (FileWriter writer = new FileWriter("students.json")) {
    		gson1.toJson(students,writer);
    			    		
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	try (FileReader reader = new FileReader("students.json")) {
    		Student[] parsedStudents = gson.fromJson(reader, Student[].class);
    		for (Student s: parsedStudents) {
    			System.out.println(s.name + " - "+ s.age);
    		}
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	    

	}
}
