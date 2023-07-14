package Lab5;

public class BankAccount {
	private long accountNumber;
	private double balance;
	private String CustomerName;
	public BankAccount() {
		
	}
	public BankAccount(long accountNumber, double balance, String customerName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		CustomerName = customerName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
}
