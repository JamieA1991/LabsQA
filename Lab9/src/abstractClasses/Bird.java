package abstractClasses;

import abstractClasses.Interface.Flyable;
import abstractClasses.Interface.Movable;

public abstract class Bird extends Animal implements Movable, Flyable{


	public Bird(String name) {
		super(name);
		super.animalType = AnimalType.Bird;
		}
	
	;

	
	
	 public abstract void makeNest();

	 @Override
	 public void move() {
		// TODO Auto-generated method stub
		 System.out.println(name + " is Moving like a Bird.");
		
	 }
	 @Override
	 public void fly() {
		 System.out.println(name + " is Flying like a Duck.");
		
	 }
	

}
