public class CheckingAccount extends BankAccount {
	private final double FEE = 0.15; 
	
	public CheckingAccount(String name, double amount) {
		super(name, amount); 
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean flag;
		flag = super.withdraw(amount + FEE);
		return flag; 
	}
}