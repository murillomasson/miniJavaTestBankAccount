package BankAccount;

public class TestAccount {
	
	public static void main(String[] args) {
		
		accountOp user001 = new accountOp();
		accountOp user002 = new accountOp();

		user001.nameAccount = "João da Silva";
		user001.numAccount = 1234567;
		user001.balanceAccount = 452.559;
		user001.limitOverdraftAccount = 150.00;
		user001.overdraftUse = false;

		user002.nameAccount = "Maria da Silva";
		user002.numAccount = 2345678;
		user002.balanceAccount = -242.062;
		user002.limitOverdraftAccount = 300.00;
		user002.overdraftUse = true;

		user001.welcomeUser();
		user001.checkBalance();
		user001.makeDeposit(50);
		user001.checkBalance();
		user001.checkOverdraftUse();
		user001.makeWithdrawal(500);
		user001.checkOverdraftUse();
		user001.checkBalance();
		user001.makeTransfer(40, 2345678);
		user001.checkBalance();
		user001.checkOverdraftUse();
		
		user002.welcomeUser();
		user002.checkBalance();
		user002.checkOverdraftUse();
		user002.makeDeposit(1000);
		user002.checkBalance();
		user002.checkOverdraftUse();
		user002.makeWithdrawal(5000);
		user002.checkBalance();
		user002.makeTransfer(2192.45, 2345678);
		user002.checkBalance();
		user002.checkOverdraftUse();
		
		}

	
	}
