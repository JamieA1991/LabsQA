package abstractClasses;

import java.util.ArrayList;
//import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Fish("Goldy"));
		animals.add(new Duck("Quacky"));
		animals.add(new Penguin("Coldy"));
		
		for (Animal a: animals) {
			
			System.out.println("Animal: " + a.name);
			
			if(a instanceof Bird) {
				((Bird) a).makeNest();
			}
			
			if(a instanceof Fish) {
				((Fish) a).swim();
			}
			
			
		}
		
		

		System.out.println("-----------------");

	}

}
