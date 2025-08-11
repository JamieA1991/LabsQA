package polymorphism2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("Jamie","Manager");
		Employee emp1 = new Employee("Alex", "Developer");
		Employee emp2 = new Employee("Ben", "Junior Developer");
		
		manager.addEmployee(emp1);
		manager.addEmployee(emp2);
		
		SkilledWorkers skillEmp = new SkilledWorkers("Tom C", "Tech Specialist");
		
		manager.addEmployee(skillEmp);
	
		Manager newMgr = new Manager("John D", "Tech Manager");
        manager.addEmployee(newMgr);
		

        System.out.println(manager.getInfo());

	}

}
