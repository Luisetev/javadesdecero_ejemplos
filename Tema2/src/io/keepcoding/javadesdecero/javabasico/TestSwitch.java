package io.keepcoding.javadesdecero.javabasico;

public class TestSwitch {

	public static void main(String[] args) {
		String option="a";
		String res ="";
		
		/*
		if (option=="a") {
			res="Go to the cinema";
		} else if (option=="b") {
			res="Go to the restaurant";
		}else {
			res="stay at home";
		}
		*/
		
		switch(option) {
			case "a":
				res="Go to cinema";
				break;
			case "b":
				res="Go to the restaurant";
				break;
			default:
				res="Stay at home";
				break;
		}

		System.out.println(res);
	}

}
