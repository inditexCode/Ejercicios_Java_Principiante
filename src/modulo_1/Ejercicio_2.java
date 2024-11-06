package modulo_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
//   2-Realiza un programa que indique cuántos dígitos tiene un número introducido 
//		  por el usuario.
		
		System.out.println("Mostrar cuantos dígitos tiene los números ingresados:");
		
		// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner scanner = new Scanner(System.in);
		System.out.println("===> Ingrese Números <===");
		String numeros = scanner.nextLine();
		
	    int cantDigitos = numeros.length();
	    System.out.println("Cantidad de digitos: " + cantDigitos);

	    scanner.close();
	}

}
