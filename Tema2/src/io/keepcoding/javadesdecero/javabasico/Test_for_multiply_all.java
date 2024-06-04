package io.keepcoding.javadesdecero.javabasico;

import java.util.ArrayList;

public class Test_for_multiply_all {

	public static void main(String[] args) {

		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(multiplo(list));
	}
		public static int multiplo(ArrayList<Integer> list) {
		
			int multiplo=1;
			
			for(int i=0;i<list.size();i++){
				multiplo=multiplo*list.get(i);
			}
			return multiplo;

		}
		
	

}
