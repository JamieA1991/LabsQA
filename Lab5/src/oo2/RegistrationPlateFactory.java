package oo2;

public class RegistrationPlateFactory {

	private static String[] registrationPlates = { "LA05 XYZ", // London
			"NG58 JKL", // Nottingham
			"MA13 HYP", // Manchester
			"BX06 TUV", // Birmingham
			"CF67 QRS", // Cardiff
			"YS09 PQR", // Yorkshire
			"WD21 NML", // Exeter area (Western region)
			"KR16 FGH", // Northampton
			"SJ04 UVW", // Glasgow
			"LV22 ABC", // Liverpool
			"WX19 XYZ" // Bristol
	};

	private static int nextIndex = 0;


		


	
		static RegistrationPlate getNextRegistrationPlate() {
		    try {
		        if (nextIndex >= registrationPlates.length) {
		            throw new IllegalStateException("No more plates left in factory!");
		        }

		        String plateString = registrationPlates[nextIndex];
		        RegistrationPlate plate = new RegistrationPlate();
		        plate.setNumber(plateString);
		        nextIndex++;
		        return plate;

		    } catch (IllegalStateException e) {
		        System.out.println("Error: " + e.getMessage());
		        System.out.println("-----------------------------");
		        return null; // ✅ valid return type
		    }
		}
	}
