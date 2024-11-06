package modulo_1;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
// 6-Realiza un programa que muestre el fragmento de la cadena de texto a partir de la
// posición de una palabra determinada (ambas cadenas introducidas por el usuario).
		
		System.out.println("Comenzando el programa...");
		
	// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca la frase");
		// String - cadena de texto
		String cadena = scanner.nextLine();
		
		System.out.println("Introduzca la posicion en la que desea extraer el fragmento");
		// int - entero para comprobar la posición indicada
		int palabra = scanner.nextInt();
		
	// USAMOS UN CONDICIONAL PARA AVISAR AL USUARIO QUE ESTA COLOCANDO UNA POSICIÓN 
    // MENOR A 0 O MAYOR AL TAMAÑO DEL TEXTO Y AVISAMOS POR CONSOLA...
		
		if(palabra <= 0 || palabra > cadena.length()) {
			System.out.println(" ⛔ Error introduca una posición acorde al tamaño del texto");
		}else {
			System.out.println("Fragmento: " + cadena.substring(palabra));
			
			// El método substring de la clase String se utiliza para obtener una subcadena 
			// o un fragmento de una cadena original. 
		}
		scanner.close();
		

	}

}
