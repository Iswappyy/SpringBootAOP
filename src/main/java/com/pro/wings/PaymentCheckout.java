package com.pro.wings;

import org.springframework.stereotype.Component;

@Component
public class PaymentCheckout {
	
	public void enterDetail() {
		System.out.println("Enter Address details succesfully...");
	}
	
	public void paymentStatus() {
		
		System.out.println("Select Payment Mode: "+ "\nCash on Delivery"+"\nCard Payment" +"\nUPI payment");
	}

}
