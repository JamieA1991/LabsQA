package abstractClasses;

import java.util.ArrayList;

import abstractClasses.Interface.Flyable;
import abstractClasses.Interface.Movable;
import abstractClasses.Interface.Swimable;
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
			
			if (a instanceof Flyable) {
				
				Flyable fly = (Flyable) a;
				fly.fly();
				
				
			}
			
			if (a instanceof Movable) {
	
				Movable move = (Movable) a;
				move.move();
				
				
			}
			
			if (a instanceof Swimable) {
				
				Swimable swim = (Swimable) a;
				swim.swim();
				
				
			}
			
			
			
			
			if(a instanceof Bird) {
				((Bird) a).makeNest();
			}
			
			
			
			
		}
		
		

		System.out.println("-----------------");

	}

}
