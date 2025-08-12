package exceptions;

public class Account  implements Comparable<Account>{

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

try {
        if (balance < amount) {
            throw new IllegalArgumentException("You cannot withdraw this much");
        }

     
        balance -= amount;

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("-----------------------------");

    } finally {
        System.out.println("Final Code");
        System.out.println("-----------------------------");

    }
}


public String getDetails() {
	return String.format("Account ID: %d\nOwner: %s\nBalance: £%.2f", id, owner, balance);
}

public void Addinterest() {

	balance += balance * 0.025;
     }



@Override
    public int compareTo(Account other) {
        return Double.compare(this.id, other.id);
    }



@Override
public String toString() {
    return id +" - " + owner + " - Balance: " + balance;
}

	
}

