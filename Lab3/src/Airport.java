

	

	import java.util.Scanner;

	public class Airport {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);


	System.out.print("Enter amount in GBP: ");
	        double gbp = scanner.nextDouble();

	        System.out.print("Choose currency (1 = USD, 2 = EUR, 3 = JPY): ");
	        int currencyChoice = scanner.nextInt();

	        System.out.print("Enter customer type (R = Regular, V = VIP, S = Staff): ");
	        char customerType = scanner.next().toUpperCase().charAt(0);


	double convertedAmount = 0;
	        switch (currencyChoice) {
	            case 1:
	                convertedAmount = gbp * 1.25;
	                break;
	            case 2:
	                convertedAmount = gbp * 1.15;
	                break;
	            case 3:
	                convertedAmount = gbp * 180.50;
	                break;
	            default:
	                System.out.println("Invalid currency choice.");
	                return;
	        }

	        // Service fee
	        double serviceFeeRate = gbp < 100 ? 0.05 : 0.025;
	        double serviceFee = convertedAmount * serviceFeeRate;

	        // Airport tax
	        double taxRate;
	        		if (customerType == 'R') {
	        		    taxRate = 0.10;
	        		} else if (customerType == 'V') {
	        		    taxRate = 0.05;
	        		} else if (customerType == 'S') {
	        		    taxRate = 0.0; // Staff exempt from tax
	        		} else {
	        		    System.out.println("Invalid customer type.");
	        		    return;
	        		}
	        double tax = convertedAmount * taxRate;

	        // Final amount
	        double finalAmount = convertedAmount - serviceFee - tax;

	        // Output
	        System.out.printf("Converted amount: %.2f\n", convertedAmount);
	        System.out.printf("Service fee: %.2f\n", serviceFee);
	        System.out.printf("Airport tax: %.2f\n", tax);
	        System.out.printf("Final amount received: %.2f\n", finalAmount);
	    }



		

	}


