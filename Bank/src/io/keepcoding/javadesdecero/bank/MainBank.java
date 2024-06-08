package io.keepcoding.javadesdecero.bank;

import java.util.Scanner;

import io.keepcoding.javadesdecero.bank.model.BankAccount;

public class MainBank {

	public static void main(String[] args) {
		//llamada sin parametros
		//BankAccount account = new BankAccount();
		BankAccount account = new BankAccount(
				"12345678D", 
				"Pedro", 
				"Martinez", 
				1234,
				100.0);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el DNI");
		String dniInput=input.nextLine();
		
		System.out.println("Introduce el password");
		Integer passInput=input.nextInt();
		
		//creando una cuenta fake
		account.setDni("12345678D");
		account.setName("Pepe");
		account.setSurname("Martinez");
		account.setPass(1234);
		account.setBalance(100.0);
		
		//pruebas de uso
		//String dniInput="12345678D";
		//int passInput=1234;
		
		//Authenticate
		account.authenticate(dniInput, passInput);
		

		//get cash
		account.getcash(50);
		System.out.println("Current balance: " + account.getBalance());
	
		//get Data -> showInfo()
		System.out.println(account.toString());
		
		//income
		account.income(20);
		System.out.println("Current balance: " + account.getBalance());
	}

	
	
}
