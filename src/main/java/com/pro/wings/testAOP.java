package com.pro.wings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testAOP {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		ctx.getBean(FlipcartClass.class).logInDetails();
//		ctx.getBean(FlipcartClass.class).addToCart();
//		
//		ctx.getBean(PaymentCheckout.class).enterDetail();
//		ctx.getBean(PaymentCheckout.class).paymentStatus();
	}

}
