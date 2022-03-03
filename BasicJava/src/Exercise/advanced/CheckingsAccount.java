package Exercise.advanced;

public class CheckingsAccount extends BankAccount{
	
	private SavingsAccount protectedBy;
	
	public CheckingsAccount(int balance) {
		super(balance);
	}
	
	public CheckingsAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		/* saving : 100만원
		 * checking : 1만원
		 * checking에서 5만원출금 
		 */
		if(balance < amount) { //잔액이 부족할때
			this.protectedBy.withdraw(amount-balance);
			balance = 0;
		}
		balance -= amount;
		return true;
	}
	
}
