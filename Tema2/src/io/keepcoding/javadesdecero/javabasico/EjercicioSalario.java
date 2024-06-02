package io.keepcoding.javadesdecero.javabasico;

public class EjercicioSalario {

	public static void main(String[] args) {
		double salario=1000;
		System.out.println("El nuevo salario es " + new_salary(salario));
	}
	
	public static double new_salary(double salary) {
		if (salary<=1000) {
			return salary*1.08;
		}
		else {
			return salary;
		}
	}
	
}
