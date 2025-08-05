

	import java.util.Scanner;

	public class Utils {
		
		public  static int getInt(String prompt) {

			Scanner s = new Scanner(System.in);
			System.out.println(prompt);
			return s.nextInt();
			
		}
			public  static String getString(String prompt) {
				
				Scanner s = new Scanner(System.in);
				System.out.println(prompt);
				return s.nextLine();
				
			}

	}

