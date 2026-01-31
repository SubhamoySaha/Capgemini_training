package Abstraction_oops.Payyment_System;

public abstract class Payment {

	double amount;
	public Payment(double amount) {
		this.amount=amount;
	}
	
	public void paymentInfo() {
		System.out.println("Amount: "+amount);
	}
	
	public abstract void makePayment();
}
