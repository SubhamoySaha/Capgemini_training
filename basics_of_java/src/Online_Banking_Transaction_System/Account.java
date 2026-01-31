package Online_Banking_Transaction_System;

interface Transactiontype{
	public void Deposit(double amount) throws InsufficientBalanceException;
	public void Withdraw(double amount) throws InsufficientBalanceException;
}

	

public abstract class Account implements Transactiontype {

	private long Account_Number;
	private String Account_Holder_Name;
	private String account_type;
	private double Balance;
	
	
	
	Account(long Account_Number, String Account_Holder_Name, String account_type)// throws InsufficientBalanceException
	{
		this.Account_Number=Account_Number;
		this.Account_Holder_Name=Account_Holder_Name;
		this.account_type=account_type;
//		setBalance(Balance);
	}
	
	public void setBalance(double Balance) throws InsufficientBalanceException{
		if(Balance<0) {
			throw new InsufficientBalanceException("Your Balance is insufficient!");
		}
		
		this.Balance=Balance;
	}
	
	public double getBalance() {
		return this.Balance;
	}
	
	public String getDetails() {
		return "\nAccount Number:\t"+this.Account_Number+"\nAccount holder name:\t"+this.Account_Holder_Name+"\nAccount type:\t"+this.account_type+"\nAccount Balance:\t"+this.Balance;
	}
}

class Savings extends Account{
	
	double balance;
	Savings(long Account_Number, String Account_Holder_Name){
		super(Account_Number, Account_Holder_Name, "Savings Account");
	}
	
	public void Withdraw(double amount) throws InsufficientBalanceException{
		if(amount>50000) {
			throw new InvalidTransactionException("Savings amount can withdraw maximum 50000");
		}
		
		if(getBalance()<=2000) {
			throw new InsufficientBalanceException("Your Balance is insufficient!");
		}
		
		balance=getBalance()-amount;
		setBalance(balance);
	}
	
	public void Deposit(double amount) throws InsufficientBalanceException
	{
	balance=getBalance()+amount;
		setBalance(balance);
	}
	
}


class Current extends Account{
	
	double balance;
	Current(long Account_Number, String Account_Holder_Name){
		super(Account_Number, Account_Holder_Name, "Current Account");
	}
	
	public void Withdraw(double amount) throws InsufficientBalanceException{
//		if(amount>50000) {
//			throw new InvalidTransactionException("Savings amount can withdraw maximum 50000");
//		}
		
		if(getBalance()< -20000) {
			throw new InsufficientBalanceException("Your overdraft limit has reached!");
		}
		
		balance=getBalance()-amount;
		setBalance(balance);
	}
	
	public void Deposit(double amount) throws InsufficientBalanceException
	{
	balance=getBalance()+amount;
		setBalance(balance);
	}
	
}
 

