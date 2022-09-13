package BankAccount;

public class AccountOp {
	
	private int numAccount;
	private String nameAccount;
	private double balanceAccount;
	private double limitOverdraftAccount;
	private boolean overdraftUse;
	
	/* numAccount set and get */
	public int getNumAccount() {
		return numAccount;
	}
	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;		
	}
	
	/* nameAccount set and get */
	public String getNameAccount() {
		return nameAccount;
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	
	/* balanceAccount set and get */
	public double getBalanceAccount() {
		return balanceAccount;
	}
	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}
	
	/* limitOverdraftAccount set and get */
	public double getLimitOverdraftAccount() {
		return limitOverdraftAccount;
	}	
	public void setLimitOverdraftAccount(double limitOverdraftAccount) {
		this.limitOverdraftAccount = limitOverdraftAccount;
	}
	
	/* overdraftUse set and get */
	public boolean isOverdraftUse() {
		return overdraftUse;
	}
	public void setOverdraftUse(boolean overdraftUse) {
		this.overdraftUse = overdraftUse;
	}
	
	public AccountOp() {
		
	}
	
	public AccountOp(int numAccount, String nameAccount, double balanceAccount,
			double limitOverdraftAccount, boolean overdraftUse) {
		this.numAccount = numAccount;
		this.nameAccount = nameAccount;
		this.balanceAccount = balanceAccount;
		this.limitOverdraftAccount = limitOverdraftAccount;
		this.overdraftUse = overdraftUse;
	}

	/* operations */
	public void welcomeUser() {
		System.out.printf("-------------------------%n"
				+ "Welcome, %s!%n"
				+ "-------------------------%n%n", getNameAccount());
	}
	
	public void checkBalance() {
		System.out.printf("Your current balance account is $%.2f.%n%n", getBalanceAccount());
	}
	
	public void makeDeposit(double depositAmount) {
		this.balanceAccount += depositAmount;
		System.out.printf("--Deposit made successfully!--%n%n");

	}
	
	public void checkOverdraftUse() {
		if(balanceAccount + limitOverdraftAccount >= limitOverdraftAccount) {
			setOverdraftUse(false);
			System.out.printf("--You are not using overdraft!--%n%n");

		}
		else {
			System.out.printf("--You are using overdraft!--%n%n");
		}
	}
	
	public void makeWithdrawal(double withdrawalAmount) {
		if(withdrawalAmount <= balanceAccount + limitOverdraftAccount) {
			this.balanceAccount -= withdrawalAmount;
			System.out.printf("--$%.2f successfully withdrawn!--%n%n", withdrawalAmount);
		}
		else {
			System.out.printf("You cannot -withdraw- $%.2f,%n"
					+ "please, check your current balance!%n%n", withdrawalAmount);
			withdrawalAmount = 0;
		}
	}	
		
	public void makeTransfer(double transferredAmount, int numAccount) {
		if(balanceAccount + limitOverdraftAccount >= transferredAmount) {
			this.balanceAccount -= transferredAmount;
			System.out.printf("--Transfer made successfully!--%n%n");
		}
			
		else {
			System.out.printf("You cannot -transfer- $%.2f,%n"
					+ "please, check your current balance!%n%n", transferredAmount);
			transferredAmount = 0;
		}
	}
}
