package io.keepcoding.javadesdecero.javabasico;

public class Ejercicio4 {
	
	public static float INTEREST_PERCENT=1.03f;
	
	public static void main(String[] args) {
		float testValue=5000f;
		double result=investment(testValue);
		
		System.out.println("Ganarás: " + result);
	}

	public static double investment(float money) {
		return money * INTEREST_PERCENT;
	}
	
	public static double credit(float money) {
		return money * (1-INTEREST_PERCENT);
	}
}
