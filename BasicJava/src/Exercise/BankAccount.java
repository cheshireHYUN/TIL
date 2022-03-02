package Exercise;

public class BankAccount {
	//필드
	private int balance; //잔액
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	// 메소드
	
	//현재 계좌의 잔액
	public int getBalance() {
		return balance;
	}
	
	//입금 메소드
	public void deposit(int amount) {
		
	}
	
	//출금 메소드
	public boolean withdraw(int amount) {
		return true;
	}
	
	// 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드
	public boolean transfer(int amount,BankAccount otherAccount) {
		return true;
	}
	
	
	
	

}
