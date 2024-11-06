package modulo_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
// 3-Realiza un programa que muestre por pantalla un número aleatorio 
//		entre dos valores introducidos por el usuario.
		
		System.out.println("Programa para mostrar números aleatorios");
		
		// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("===> Ingrese el primer valor <===");
		String valor1 = teclado.nextLine();
		
		System.out.println("===> Ingrese el segundo valor <===");
		String valor2 = teclado.nextLine();
		
// CONVERTIMOS UN STRING (CADENA DE TEXTO) A ENTEROS (INT)
        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

 // CREAMOS UN OBJETO random DE LA CLASE Random      
        Random random = new Random();
        
        // Generamos un número aleatorio entre menor y mayor (inclusive)
        int numeroRandom = random.nextInt(numero2 - numero1)+numero1;
        
        // IMPRIMIMOS POR CONSOLA
        System.out.println("Número aleatorio entre " + numero1 + " y " + numero2 + " es: " + numeroRandom);
	    teclado.close(); 
	}

}
