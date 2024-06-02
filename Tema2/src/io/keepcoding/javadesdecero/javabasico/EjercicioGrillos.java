package io.keepcoding.javadesdecero.javabasico;

public class EjercicioGrillos {
	
	public static void main(String[] args) {
		float frec=20;
		System.out.println("La temperatura es " + temp(frec));
	}

	
	public static float temp(float frecuencia) {
		return 10+((frecuencia-40)/7);
	}
}
