package io.keepcoding.javadesdecero.libreria;

import io.keepcoding.javadesdecero.libreria.model.Person;

/*
 * Pruebas, instanciar los modelos e inicializar
 * 
 */

public class Main {

	public static void main(String[] args) {
		Person p =new Person();

		p.setName("Homer lopez");
		//Sample error accesing private property
		p.setAge(20);
		p.setAddress("calle falsa, 123");
		System.out.print(p.showInfo());
	}

}
