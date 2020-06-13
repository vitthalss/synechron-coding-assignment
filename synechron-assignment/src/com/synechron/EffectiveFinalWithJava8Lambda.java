package com.synechron;

/**
 * @author vitthal.shirke
 * 
 * @description 1. To check java 8 features knowledge. b. Write program to show
 *              casing effectively final feature of java8.
 */
public class EffectiveFinalWithJava8Lambda {

	public static void main(String args[]) {
		String effectiveFinal = "I am non final local variable";
		// effectiveFinal = "some changed value";
		/*
		 * it will show error : 'local variables referenced from a lambda
		 * expression must be final or effectively final'.
		 */
		Runnable r = () -> {
			System.out.println("Value of effectively variable is : " + effectiveFinal);
		};

		Thread t = new Thread(r);
		t.start();
	}

}
