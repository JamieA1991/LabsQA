package oo2;

public class Vehicle {

	 int Speed;
	 int lane;
	  RegistrationPlate registrationPlate;
	  private static int totalVehicles = 0;
		
	private String plate;

	public Vehicle(int speed, int lane) {

		this.Speed = speed;
		this.lane = lane;
		this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		totalVehicles++;
		
	}

	public void accelerate(int amount) {

		Speed += amount;

	}

	public void brake(int amount) {

		Speed -= amount;

	}
	
	public String getDetails() {
		return String.format("Speed: %d\nLane: %d\nPlate: %s", Speed, lane, plate);
		
	}
		
	    
	    }
		

		 
}