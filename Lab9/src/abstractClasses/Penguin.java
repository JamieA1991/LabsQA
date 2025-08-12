package abstractClasses;


import abstractClasses.Interface.Movable;

public class Penguin extends Bird implements Movable{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void makeNest() {
		// TODO Auto-generated method stub
		System.out.println(name + " is making a penguins nest");
	}

	@Override
	public void move() {
		System.out.println(name + " is moving like a Penguin");
	}
}