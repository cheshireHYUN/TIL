package Exercise.advanced;
//customer는 bankAccount를 갖고있다
public class Customer {
	//
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	//
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName =lastName;
		accounts = new BankAccount[5];
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
	
	public void addaccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	
	
	// 고객이름(first+last)과 고객계좌(account)의 잔액(balance)을 문자열로 반환
	public String toString() {
		return String.format("이름: %s %s, 계좌의 갯수: %d", firstName,lastName,numberOfAccounts);
	}



}
