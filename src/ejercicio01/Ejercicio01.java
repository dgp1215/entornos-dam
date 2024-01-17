package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Hacer un programa que pida al usuario que introduzca
	 * una frase por pantalla, y muestre por pantalla cuántas
	 * vocales hay en el texto
	*/
	public static boolean esVocal(char car) {
		//Implementamos diferentes lógicas para comprobar si es vocal
		boolean es_vocal = false;
		
		System.out.println("Estamod en método esVocal");
		
		return es_vocal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int numeroVocales = 0;
		
		
		System.out.println("Por favor, introduce la cadena de texto: ");
		cadena = sc.nextLine();
		for(int i = 0; i<cadena.length(); i++) {
			if(esVocal(cadena.charAt(i)));
				numeroVocales++;
			
			
		}
		
		System.out.println("El numero de vocales es: " + numeroVocales);
		
		
		
		sc.close();
		System.out.println("Bye");
	}

}
