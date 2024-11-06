package modulo_1;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
// 5-Realiza un programa que compruebe si un texto aparece en una cadena determinada 
// (ambas introducidas por el usuario
		
		System.out.println("Programa para comprobar si un texto aparece en una cadena determinada");
		
		// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner scanner = new Scanner(System.in);

		// CADENA DE TEXTO 	
		System.out.println("===> Ingrese la cadena de texto <===");
		String cadena = scanner.nextLine();
		
		// TEXTO A COMPROBAR
		System.out.println("===> Ingrese el texto a comprobar <===");
		String texto = scanner.nextLine();

// La función contains es un método de la clase String en Java,
//que devuelve true si el texto especificado aparece en la cadena y false si no.
		// -------------------------------------- 
// (toLowerCase): Este paso convierte cadena a minúsculas 
		
		if(cadena.toLowerCase().contains(texto)) {
			System.out.println("Se encontro similitud => " + cadena + " <= y => " + texto + " ✅");
		}else {
			System.out.println("No hay similitudes ⛔");
			scanner.close();
		}
	}

}
