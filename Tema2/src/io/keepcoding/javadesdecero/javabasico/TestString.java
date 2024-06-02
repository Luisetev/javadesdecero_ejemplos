package io.keepcoding.javadesdecero.javabasico;

public class TestString {
	
	public static void main (String[] args) {
		String str ="My awesome String";
		System.out.println("Length: " + str.length());
		System.out.println("Contains: " + str.contains("aw"));
		//accedemos directamente a las posiciones desde el 0 hasta el length()-1
		System.out.println("Substring sólo begin:"+ str.substring(11));
		System.out.println("Substring begin y end:"+ str.substring(11,13));
		System.out.println("CharAt a la ultima posicion:"+ str.charAt(str.length()-1));
		System.out.println("CharAt a la primera posicion:"+ str.charAt(0));
	}

}
