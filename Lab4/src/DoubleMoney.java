
public class DoubleMoney {

	

		
		// TODO Auto-generated method stub
		

		    public static void account() {
		     
		        double initialMoney = 100.0;
		        double currentMoney = initialMoney;
		        double interest = 0.05; 
		        int years = 0;

		      
		        while (currentMoney < 200.0) {
		            currentMoney += currentMoney * interest;
		            years++;
		        }

		    
		        System.out.println("It takes " + years + " years to double your money at 5% interest.");
		    }

		    public static void main(String[] args) {
		        account(); 
		    }
		

	}

