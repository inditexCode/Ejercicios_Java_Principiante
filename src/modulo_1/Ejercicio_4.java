package modulo_1;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		// 4-Realiza un programa que calcule el área de un triángulo 
	   // (areaTriangulo = base * altura / 2).

		System.out.println("Calcular el area de un triangulo");
		
		// USAMOS SCANNER PARA EL INGRESO DE DATOS POR PARTE DEL USUARIO
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("===> Ingrese la base del triangulo <===");
		String baseTriangulo = teclado.nextLine();
		
		System.out.println("===> Ingrese la altura del triangulo <===");
		String alturaTriangulo = teclado.nextLine();
		
	// CONVERTIMOS LAS CADENAS DE TEXTO A ENTEROS
		int base = Integer.parseInt(baseTriangulo);
		int altura = Integer.parseInt(alturaTriangulo);
		
		double areaTriangulo = (base*altura)/2;
System.out.println("Base: " + base + " * " + " Altura: " + altura + " / 2 " + " area del triangulo:  " + areaTriangulo);
		
       teclado.close();
	}

}
