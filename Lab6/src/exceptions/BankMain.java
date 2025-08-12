package exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankMain  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList<>( );
		accounts.add(new Account(100, "Bob", 1000));
		accounts.add(new Account(500, "Linda", 3000));
		accounts.add(new Account(300, "David", 2000));
		Collections.sort(accounts);
		

        for (Account acc : accounts) {
            System.out.println(acc);
        }

			
		}
			

		


}

	
		
		
	
	

	


