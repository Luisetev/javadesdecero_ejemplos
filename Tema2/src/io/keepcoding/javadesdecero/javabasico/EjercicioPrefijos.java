package io.keepcoding.javadesdecero.javabasico;

public class EjercicioPrefijos {
	
	public static void main(String[] args) 
	{
		System.out.println(hasSuffix("Hola Mundo", "Mundoss"));
		System.out.println(hasSuffix("Hola Mundo", "Hola"));
		System.out.println(isSuffix("Hola Mundo", "Mundo"));
		
	}

	public static boolean hasSuffix(String string, String prefix)
	{
		return string.startsWith(prefix);
	}

	public static boolean isSuffix(String string, String suffix)
	{
		return string.endsWith(suffix);
	}
	
}
