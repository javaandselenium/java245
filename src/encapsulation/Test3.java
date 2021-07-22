package encapsulation;

public class Test3 {
	private int accountNumb=1234;
	private String accountHoldername="John";
	private int balance=800;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNumb() {
		return accountNumb;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	
	

}
