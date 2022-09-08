package BankAccount;

public class accountOp {
	
	int numAccount;
	String nameAccount;
	double balanceAccount;
	double limitOverdraftAccount;
	boolean overdraftUse;
	
	void welcomeUser() {
		System.out.printf("-------------------------%n"
				+ "Welcome, %s!%n"
				+ "-------------------------%n%n", nameAccount);
	}
	
	void checkBalance() {
		System.out.printf("Your current balance account is $%.2f.%n%n", balanceAccount);

	}
	
	void makeDeposit(double depositAmount) {
		this.balanceAccount += depositAmount;
		System.out.printf("--Deposit made successfully!--%n%n");

	}
	
	void checkOverdraftUse() {
		if(balanceAccount + limitOverdraftAccount >= limitOverdraftAccount) {
			overdraftUse = false;
			System.out.printf("--You are not using overdraft!--%n%n");

		}
		else {
			overdraftUse = true;
			System.out.printf("--You are using overdraft!--%n%n");
		}
	}
	
	void makeWithdrawal(double withdrawalAmount) {
		if(withdrawalAmount <= balanceAccount + limitOverdraftAccount) {
			balanceAccount -= withdrawalAmount;
			System.out.printf("--$%.2f successfully withdrawn!--%n%n", withdrawalAmount);
		}
		else {
			System.out.printf("You cannot -withdraw- $%.2f,%n"
					+ "please, check your current balance!%n%n", withdrawalAmount);
			withdrawalAmount = 0;
		}
	}	
		
	void makeTransfer(double transferredAmount, int numAccount) {
		if(balanceAccount + limitOverdraftAccount >= transferredAmount) {
			balanceAccount -= transferredAmount;
			System.out.printf("--Transfer made successfully!--%n%n");
		}
			
		else {
			System.out.printf("You cannot -transfer- $%.2f,%n"
					+ "please, check your current balance!%n%n", transferredAmount);
			transferredAmount = 0;
		}
	}
}