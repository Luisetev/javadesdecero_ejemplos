package io.keepcoding.javadesdecero.javabasico;

public class TestIfElse {
	public static void main (String[] args) {
		//prueba
		float nota=5.5f;
		
		//boolean isApproved= nota >=7;
		
		System.out.println("Result: "+ passesTest(nota));
		
	}
	
	public static boolean passesTest(float note) {
		return note>=7;
	}
	
}
