package encapsulation;

public class Test1 {
	public static void main(String[] args) {
		BankAccount account=new BankAccount(1,"miller",200);
		account.details();
		account.deposit(1000);
		account.details();
		account.withdraw(500);
		account.details();
	}

}
