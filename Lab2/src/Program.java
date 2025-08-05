import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score: ");
		int score = scanner.nextInt();
		
		if((score <1 || score >100)) {
			System.out.println("Error Marks must be betweeen 1 and 100");
		}
		else if((score >0 && score <50)) {
			System.out.println("Fail");
		}
		else if((score >=50 && score <61)) {
			System.out.println("Pass");
		}
		else if((score >=61 && score <=70)) {
			System.out.println("Merit");
		}
		else if((score >=71 && score <=100)) {
			System.out.println("Distinction");
		}
		
		else {
			System.out.println("Invalid Entry ");
		}

	}


	}


