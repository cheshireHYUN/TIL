package Exercise;
//customer는 bankAccount를 갖고있다
public class Customer {
	//
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	//
	public Customer(String firstName, String lastName) {
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
		return String.format("이름: %s %s, 잔고: %d원", firstName,lastName,account.getBalance());
	}



}
