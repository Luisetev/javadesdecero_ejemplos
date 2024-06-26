package io.keepcoding.javadesdecero.bank.model;

public class BankAccount {
	private String dni;
	private String name;
	private String surname;
	private int pass;
	private double balance;
	private boolean isLogged=false;

	//constructor. mismo nombre que la clase y sin tipo de funcion ni retorno
	public BankAccount(
			String dni, 
			String name, 
			String surname, 
			int pass, 
			double balance) {
		//TODO set propierties
		this.dni=dni;
		this.name=name;
		this.surname=surname;
		this.pass=pass;
		this.balance=balance;
		this.isLogged=false;
	}
	


	public boolean authenticate(
			String dni,
			int pass
	) {
		//para comprobar que una cadena es exactamente a otra con objetos, usar el metodo equals
		this.isLogged=this.dni.equals(dni) && this.pass==pass;
		return isLogged;
	}
	
	/*
	 * OPCION SIN DEVOLVER EL ESTADO, PORQUE EN VOID YA LO GUARDA DENTRO
	public boolean authenticate(String dni,int pass ) {
		this.isLogged=this.dni == dni && this.pass==pass;
		return isLogged;
	}
	*/
	
	/**
	 * si puede, deduce el balance y devuelve resultado
	 * @param quantity cantidad a descontar
	 * @return si ha tenido éxito
	 */
	public boolean getcash(int quantity) {
		boolean hasSuccess=false;
		if(isLogged && (balance-quantity>=0)) {
			hasSuccess=true;
			balance-=quantity;
		}
		return hasSuccess;
	}

	public boolean income(int quantity) {
		boolean hasSuccess = false;
		if (isLogged) {
			hasSuccess=true;
			balance+=quantity;
		}
		return hasSuccess;
		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public boolean isLogged() {
		return isLogged;
	}

	@Override
	public String toString() {
		return String.format(
				"DNI: %s, Name:%s, Surname: %s, Balance: %s",dni,name,surname,Double.toString(balance));
				
	}
	
	


	

}
