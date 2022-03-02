package Exercise;

public class Customer extends BankAccount {
	//
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	//
	public Customer(String firstName, String lastName) {
		super(0);
		this.firstName = firstName;
		this.lastName =lastName;
	}


	//
	// firstName의 getter
	public String getFirstName() {
		return firstName;
	}
	
	// lastName의 getter
	public String getLastName() {
		return lastName;
	}
	
	// account의 getter와 setter
	public BankAccount getAccount() {
		return account;	
	}
	
	public void setAccount(BankAccount bankAccount) {
		this.account = bankAccount;
	}
	
	// 고객이름(first+last)과 고객계좌(account)의 잔액(balance)을 문자열로 반환
	public String toString() {
		return "a";
	}



}
