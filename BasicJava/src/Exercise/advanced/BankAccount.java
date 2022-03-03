package Exercise.advanced;

public class BankAccount {
	//필드
	protected int balance; //잔액
	
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
		this.balance += amount;
	}
	
	//출금 메소드, 출금 성공시 true 실패시 false
	public boolean withdraw(int amount) {
		if(this.balance < amount) {
			return false;
		}
		this.balance -=amount;
		return true;
	}
	
	// 현재계좌에서 amount만큼 다른계좌로 송금하는 메소드, 성공시 true 실패시 false
	public boolean transfer(int amount,BankAccount otherAccount) {
		if (withdraw(amount)) {
		otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%d",this.balance);
	}
	

}
