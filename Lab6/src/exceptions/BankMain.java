package exceptions;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account(195,"Jamie Airey",100.00);
		System.out.println(myAccount.getDetails());
		System.out.println("-----------------------------");
		myAccount.Withdraw(50);
		System.out.println(myAccount.getDetails());
		System.out.println("-----------------------------");
		myAccount.Withdraw(60);
		System.out.println(myAccount.getDetails());
		System.out.println("-----------------------------");
	}

}
