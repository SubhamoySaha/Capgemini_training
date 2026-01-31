package Abstraction_oops.Payyment_System;


public class CreditCard extends Payment {

	String CreditCo;
	public CreditCard(String CreditCo, double Amount) {
		super(Amount);
		this.CreditCo=CreditCo;
	}
	
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Company: "+CreditCo);
	}
	
	public void makePayment() {
		System.out.println("Payment is done using Credit Card");
	}
}
