package abstractClasses;

import abstractClasses.Interface.Flyable;
import abstractClasses.Interface.Movable;
import abstractClasses.Interface.Swimable;

public class Duck extends Bird implements Movable, Flyable, Swimable {

	public Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void makeNest() {
		// TODO Auto-generated method stub
		System.out.println(name + "is making a nest");
	}
	@Override
    public void move() {
		System.out.println(name + " is moving like a Duck");
        
    }
	@Override
    public void fly() {
        System.out.println(name + " is Flying like a Duck.");
    }

	@Override
    public void swim() {
        System.out.println(name + " is Flying like a Duck.");
    }
	
}