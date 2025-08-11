package polymorphism;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] cars = new Car[5];
		cars[0] = new Car("Toyota", 20);
		cars[1] = new Car("Insignia", 15);
		cars[2] = new Car("Focus", 25);
		cars[3] = new RacingCar("McLaren", 100, "Lando Norris", 3);
		cars[4] = new RacingCar("Ferrari", 200, "Lewis Hamilton", 3);

		processCars(cars);
			
			
		}
	public static void processCars(Car[] cars) {
		
		for(Car car : cars) {
			car.getToSixty();
			car.accelerate(2);
			System.out.println("Model:  " + car.getModel());
			System.out.println("Speed: " + car.getSpeed());
			
			if (car instanceof RacingCar) {
				
			RacingCar rc = (RacingCar) car;
			
			System.out.println("Driver: " + rc.getDriver());
			
			}
			System.out.println("----------------");
		}
		
		
	}

	
}
