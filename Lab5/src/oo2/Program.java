package oo2;

import java.util.ArrayList;
import java.io.*;


public class Program {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle(0,1));
		vehicles.add(new Vehicle(0,2));
		vehicles.add(new Vehicle(0,3));
		vehicles.add(new Vehicle(0,4));
		vehicles.add(new Vehicle(0,5));
		vehicles.add(new Vehicle(0,6));
		vehicles.add(new Vehicle(0,7));
		vehicles.add(new Vehicle(0,8));
		vehicles.add(new Vehicle(0,9));
		vehicles.add(new Vehicle(0,10));
		vehicles.add(new Vehicle(0,11));
		vehicles.add(new Vehicle(0,12));
		

		
				
		for (Vehicle  v : vehicles) {
			if(v.registrationPlate == null) {
				System.out.println("Error Factory out of Plates!");
			} else
System.out.println("Lane: " + v.lane + " Speed: " + v.Speed +" Reg: " + v.registrationPlate.getNumber());
;


		

		
	}
	
	
}
		
	
		
	}

