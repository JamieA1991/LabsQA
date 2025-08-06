
public class Program {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		Account myAccount = new Account(195,"Jamie Airey",500.00);
		processAccount(myAccount);  
		System.out.println(myAccount.getDetails());
		System.out.println("-------------------------");
		myAccount.Deposit(500);
		myAccount.Withdraw(45);
		System.out.println(myAccount.getDetails());
		System.out.println("-------------------------");
		
		Account[] accounts = new Account[3];
		
		accounts[0] = new Account(101,"Jamie Airey",500.00);
		accounts[1] = new Account(102,"Alex Winskill",700.00);
		accounts[2]= new Account(103,"Talia Ayles",1500.00);
		
		for(Account acc : accounts) {
			System.out.println(acc.getDetails());
			System.out.println("-------------------------");
			
			
			Account intAccount = new Account(105,"Tommy Airey",100.00);
			 intAccount.Addinterest();
			 System.out.println(intAccount.getDetails());
				System.out.println("-------------------------");
				
				Account partnerAccount = intAccount;
				partnerAccount.Addinterest();
				 System.out.println(intAccount.getDetails());
					System.out.println("-------------------------");
					
					int k = 100;
					 incInt(k);
					System.out.println(k);
		}

		}

	private static void processAccount(Account acc) {
		
		acc.Addinterest();
		// TODO Auto-generated method stub
		
	}
	
	private static void incInt(int x) {
		x++;
		}

	
	

}
