package io.keepcoding.javadesdecero.objetos;

public class test_objetos {

	public static void main(String[] args) {
		// miSilla -> objeto o instancia
		//Silla es la clase
		silla miSilla=new silla();
		silla miSilla1=new silla();
		
		//object context
		//se almacena el valor en el objeto
		miSilla.hasRespaldo=true;
		miSilla1.hasRespaldo=false;
		
		//Static context
		//se almacena el valor en la propia clase
		//Silla.hasrespaldo=true;
		
		System.out.println(miSilla.hasRespaldo);
	}

}
