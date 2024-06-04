package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList {
	
	public static void main(String[] args) {
		//testArrayList();
		testWhile();
		//testDoWhile();
	}
	
	public static void testWhile() {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		//pseudocodigo
		//crear contador = 0
		//mientras contador < longitud de la lista
		//get elemento(contador)
		
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
	
		i=0;
		while(i<list.size()) {
			System.out.println(list.get(i++));//Se evalua antes de realizar el incremento
		}
		
	}

	public static void testDoWhile() {
		ArrayList<Integer>list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		int i =0;
		if(list.size()>0) {
			do {
				System.out.println(list.get(i));
				i++;
			}while (i<list.size());	
		}

		
	}
	
	public static void testArrayList() {
		//Aquí van clases y no tipos basicos
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		
		//mostralo como lista completa
		System.out.println(list);
		
		//iterador
		for(Integer str:list) {
			System.out.println(str);
		}	
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
			
		/*
		 * i=0
		 * i<2? ->Si
		 * print del numero
		 * actualiza i++
		 * i<2? -> Si...
		 * print del numero
		 * actualiza i++
		 * 
		 * 
		 */
		
		
	}

	
}
