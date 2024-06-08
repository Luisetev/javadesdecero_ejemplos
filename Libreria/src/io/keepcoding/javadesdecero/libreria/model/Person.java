package io.keepcoding.javadesdecero.libreria.model;

/*
 * las propiedades son privadas
 */

public class Person {
	private String name;
	private int age;
	private String address;
	public String showInfo;

/*
 * get consultar valor, set asignar/modificar valor
 */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name!=null)
			//Contexto del propio objeto
			this.name=name;

	}

	/*
	 * ejemplo de devolucion del resultado de la asgiancion
	 
	 	public boolean setName(String name) {
		if(name!=null) {
			name=name;
			return true;
		}else
			return false;
	 *
	 *
	 */
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0) {
			this.age=age;
		}

	}
	
	public String getAddress() {
		return address;
		
	}
	
	public void setAddress(String address) {
		this.address=address;
		
	}
	
	public String showInfo() {
		//String interpolation
		return String.format("%s | %d | %s",name,age,address);
		//String result="Nombre: " + name + "; Edad: " + age + "; Direccion: " + address; 
		//return result;
	}
	
	
}