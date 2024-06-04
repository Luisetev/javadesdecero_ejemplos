package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class Ejercicio_select_mult_5 {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(25);
		
		System.out.println(multiplos(list));
	}

	public static ArrayList<Integer> multiplos(ArrayList<Integer> lista) {
		
		ArrayList<Integer> new_list =new ArrayList<>();
		
		for(int i=0;i<lista.size();i++){
			if (lista.get(i)%5==0) {
				new_list.add(lista.get(i));
			}
			

		}
		return new_list;
		
	}
	
}
