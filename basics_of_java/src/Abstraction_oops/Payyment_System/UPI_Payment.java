package Abstraction_oops.Payyment_System;

public class UPI_Payment extends Payment {

	String UPIApp;
	public UPI_Payment(String UPIApp, double Amount) {
		super(Amount);
		this.UPIApp=UPIApp;
	}
	
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Company: "+UPIApp);
	}
	
	public void makePayment() {
		System.out.println("Payment is done using UPI");
	}
}
