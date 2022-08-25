package com.pro.wings;

import org.springframework.stereotype.Component;

@Component
public class FlipcartClass {
		
	public void logInDetails() {
		System.out.println("Log-Details--> "+"\nEnter UserName: "+ "\nPassword: ");
		
	}

	
	public void addToCart() {
		System.out.println("List of product to in cart is: "+ "\nshopping of Shoes" +"\nshopping of Mens cloths"+"\nshpping of women cloths" + "\nShopping of jwellary");
	    
	}
	
	
}
