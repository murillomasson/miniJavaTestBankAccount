package BankAccount;

public class TestAccount {
	
	public static void main(String[] args) {
		
		AccountOp user001 = new AccountOp(12345, "João da Silva", 452.559, 150.00, false);
		AccountOp user002 = new AccountOp(54321, "Maria da Silva", 242.062, 300.00, true);
		
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
