
public class Account {

private int id;
private String owner;
private double balance;

public Account (int id, String owner,double balance) {
	
	this.id = id;
	this.owner = owner;	
	this.balance= balance;
}


public void  Deposit(double amount) {
	
if(amount < 0.00) {
	System.out.println("Invalid Deposit, value must be greater or equal to 0.00");
	return;
}
balance += amount;
	
}

public void Withdraw (double amount) {

	if(amount>balance) {
		System.out.println("You can not with draw this amount as this exceeds your acount balance!");
		return;
	}
	balance-= amount;
	
	}

public String getDetails() {
	return String.format("Account ID: %d\nOwner: %s\nBalance: £%.2f", id, owner, balance);
}

public void Addinterest() {

	balance += balance * 0.025;
     }
	
	
}



