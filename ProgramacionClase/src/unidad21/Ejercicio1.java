package unidad21;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		double a=0;
		double b=0;
		int operacion=0;
		String resp="NO";
		
		//Se introducen los números
		System.out.println("Introduce el primer número:");
		a= teclado.nextDouble();
		
		System.out.println("Introduce es segundo número:");
		b= teclado.nextDouble();
		
		//Se indica la operación
		System.out.println("Introduce la operación: (suma=1) (resta=2) (multiplicación=3) (división=4)");
		operacion= teclado.nextInt();
		
		//Se realiza la operación
		switch (operacion) {
		
		//Suma
		case 1:
			System.out.println(a+b);
			break;
			
		//Resta	
		case 2:
			if (a<b) {
				System.out.println("El resultado sera negativo, ¿desea continuar?(S/N)");
			resp= teclado.next().toUpperCase();
			if (resp.charAt(0)=='S') {
				System.out.println(a-b);}
					
				}
			else { 
				System.exit(-1);
				
			}
			
			break;
			
		//Multiplicación	
		case 3:
			if (a==0 || b==0) {
				System.out.println("Error: El resultado es cero");}
				else {
			System.out.println(a*b);}
			
			break;
			
		//División	
		case 4:
			if (b==0) {
				System.out.println("Error: Imposible dividir por cero");}
			else  {
			System.out.println(a/b);}
			
		teclado.close();
		}
		
	}
}
