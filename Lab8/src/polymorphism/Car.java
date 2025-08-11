package polymorphism;

public class Car {
	private String model;
	private int speed;
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	String getModel() {
		return this.model;
}
	int getSpeed() {
		return this.speed;
}
	public void setModel(String model) {
		this.model = model;
	}
	
		public void setSpeed (int speed) {
			this.speed =speed;
		}
		
		public void getToSixty() {
			setSpeed(60);

		}
		
		public void accelerate (int seconds) {
			speed += 5 * seconds;
		}
	
		
	}
		
	