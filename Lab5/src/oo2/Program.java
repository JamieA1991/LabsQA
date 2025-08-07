package oo2;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle(0,1));
		vehicles.add(new Vehicle(0,2));
		vehicles.add(new Vehicle(0,3));
	
		
				
		for (Vehicle  v : vehicles) {
System.out.println("Lane: " + v.lane + " Speed: " + v.Speed +" Reg: " + v.registrationPlate.getNumber());
;


		}
		
	}

}
