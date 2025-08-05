


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = Utils.getInt("Please enter a number");
String text = Utils.getString("Please enter some text:");

System.out.println("You entered number " + number);
System.out.println("You entered text " + text);

theLunchQueue();

convertInputToStonesPounds(250);
convertKgsToStonesPounds(93);
		
	}


		
		public static void theLunchQueue() {
			String mainCourse = Utils.getString("What main dish would you like(Fish, Burgers or veg) ?");
			int potatos = Utils.getInt("How many roast potatoes would you like?");
			int sprouts = Utils.getInt("How many Brussel Sprouts would you like?");
			System.out.println("Hello, your lunch is " + mainCourse + " with " +  potatos + " roast potatoes and " + sprouts + " Brussel sprouts.");
			
		}
		
		  public static void convertInputToStonesPounds(int pounds) {
		        int stones = pounds / 14;
		        int remainingPounds = pounds % 14;
		        System.out.println(pounds + " pounds is " + stones + " stones and " + remainingPounds + " pounds.");
		    }
			


		    static void convertKgsToStonesPounds(int kg) {
		        double pounds = kg * 2.20462;
		        System.out.println(kg + " kilograms is approximately " + pounds + " pounds.");
		        convertInputToStonesPounds((int) pounds); // Call the first method
		    }

		  
		}
		
		
	



