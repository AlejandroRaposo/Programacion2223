package unidad1;

import java.util.Scanner;

public class EjemploEntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="";
		int edad;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos texto con next
		System.out.print("Intruduce tu nombre: ");
		nombre = teclado.next();
		
		//Leemos numeros enteros con nextInt
		System.out.print("Intruduce tu edad: ");
		edad = teclado.nextInt();
		
		//Leemos cadenas de texto con next o next
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
		
		//Cerramos el objeto Scanner
		teclado.close();

	}

}
