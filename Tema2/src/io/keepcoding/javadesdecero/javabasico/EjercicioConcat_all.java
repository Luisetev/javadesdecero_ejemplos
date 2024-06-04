package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class EjercicioConcat_all {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<>();
		
		list.add("Hola");
		list.add(" ");
		list.add("mundo");
		list.add(" ");
		list.add("2");
		list.add("4");
		
		System.out.println(concat_all(list));

	}

	public static String concat_all(ArrayList<String> list) {
		
		String New_list="";
		
		for (int i=0;i<list.size();i++) {
			New_list=New_list+list.get(i);
		}
		return New_list;
		
	}
	
}
