package polymorphism;

public class RacingCar extends Car {
	
	private String driver;
	private int turboFactor;

	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
		
		// TODO Auto-generated constructor stub
		
	}
		String getDriver() {
			return this.driver;
	}
		int getTurbofactor() {
			return this.turboFactor;
	}
		
		public void setDriver(String driver) {
			this.driver = driver;
		}
		
			public void setTurboFactor(int turboFactor) {
				this.turboFactor = turboFactor;
			}
			
			@Override
			public void accelerate(int seconds) {
				super.accelerate(seconds);
				setSpeed(getSpeed() *turboFactor);
			}
	}

	
	
