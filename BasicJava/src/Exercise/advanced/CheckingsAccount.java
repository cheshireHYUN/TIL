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
		/* saving : 100����
		 * checking : 1����
		 * checking���� 5������� 
		 */
		if(balance < amount) { //�ܾ��� �����Ҷ�
			this.protectedBy.withdraw(amount-balance);
			balance = 0;
		}
		balance -= amount;
		return true;
	}
	
}
