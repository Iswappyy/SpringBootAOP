package com.pro.wings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LogManager.getLogger(LoggingAspect.class);

	@After("execution(* com.pro.wings.FlipcartClass.logInDetails(..))")
	public void logInDetails() {
		logger.info("Log-In done Successfully...." + " Well Come User..");
	}

	@Before("execution(* com.pro.wings.FlipcartClass.logInDetails(..))")
	public void logInDetailsBefore() {
		logger.info("********Enter The log-in Detils********");
	}

	@After("execution(* com.pro.wings.FlipcartClass.addToCart(..))")
	public void addToCartDetails() {
		logger.info("Selected item list saved to cart successfully...");

	}

	@Before("execution(* com.pro.wings.FlipcartClass.addToCart(..))")
	public void addToCartDetailsBefore() {
		logger.info("********Add Items to the cart********");

	}

	@Before("execution(* com.pro.wings.PaymentCheckout.enterDetail(..))")
	public void enterUserDetil() {
		logger.info("********Enter The User Details********");
	}

	@After("execution(* com.pro.wings.PaymentCheckout.enterDetail(..))")
	public void enterUserDetilAfter() {
		logger.info("User details enter Successfully...");
	}

	@After("execution(* com.pro.wings.PaymentCheckout.paymentStatus(..))")
	public void enterPaymentStasus() {
		logger.info("*******Payment Done Successfully..keep Shopping*******");
	}

	@Before("execution(* com.pro.wings.PaymentCheckout.paymentStatus(..))")
	public void enterPayment() {
		logger.info("Select payment Mode..");
	}

}
