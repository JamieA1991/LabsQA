package polymorphism2;

import java.util.ArrayList;

public class SkilledWorkers extends Employee {
	
	 ArrayList<String> skills;
	
	public SkilledWorkers (String name, String jobTitle){
		super(name,jobTitle);
		this.skills = new ArrayList<>();
			
    }
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
}
