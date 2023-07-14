package Lab5;

public class BankAccounts {
public static void main(String[] args) {
	
	BankAccount b1=new BankAccount();
	b1.setAccountNumber(678494444);
	b1.setBalance(90008.98);
	b1.setCustomerName("Lakshmi Narayana");
	System.out.println("Account Number: "+b1.getAccountNumber()+", Balance: "+b1.getBalance()+", Customer Name: "+b1.getCustomerName());
	
}
}
