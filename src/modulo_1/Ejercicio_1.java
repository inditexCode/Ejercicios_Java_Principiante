package modulo_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
// 1-Realiza un programa en el que el usuario deba introducir dos valores cualesquiera 
// y se le muestre la suma de ambos.
		
		System.out.println("=====> Introduce 2 valores: ");
		
		// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Ingrese el primer valor");
		int numero1 = teclado.nextInt();
		System.out.println("2 - Ingrese el segundo valor");
        int numero2 = teclado.nextInt();
        
        int resultado = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " + " + numero2 + " =  " + resultado);

		teclado.close();

	}

}
