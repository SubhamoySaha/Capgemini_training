package Abstraction_oops.Payyment_System;

public class TEST_UPI {
	public static void main(String[] args) {
		Payment payment=new UPI_Payment("Gpay",5000);
		payment.paymentInfo();
		payment.makePayment();
	
		Payment payment1=new CreditCard("SBI",50000);
		payment1.paymentInfo();
		payment1.makePayment();
	}
}
