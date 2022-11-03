package unidad22;

import java.util.Scanner;

public class EjemploRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Leer por teclado la altura y la base de un rectangulo
		 * y dibujarlo por pantalla con *
		 * por ejemplo un rectangulo de altura 2 y base 3 seria:
		 * 
		 *         ***
		 *         ***
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int base=0,altura=0;
		
		System.out.println("Introduce la base");
		base=teclado.nextInt();
		System.out.println("Introduce la altura");
		altura=teclado.nextInt();
		
		System.out.println("\n\n");
		
		
		System.out.println("Rectángulo");
		System.out.println("\n\n");
		
		for (int j=0;j<altura;j++)
			//Dibujamos una linea de ancho base
		{
		 for (int i=0;i<base;i++)
		 {
		 System.out.print("*");
		 }
		//Después de cada linea hacemos un enter
		System.out.println();
		}
		
		
		System.out.println("\n\n");
		
		System.out.println("Rectángulo hueco");
		
		System.out.println("\n\n");
		/*
		 * Forma complicada
		//Dibujamos la linea superior
		
		for (int i = 0; i < base; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//Escribimos con un bucle las lineas con los espacios en blanco
		for (int i=0;i<altura;i++) {
			//Dibujo el primer borde
			System.out.print("*");
			
			for (int j=0;j<(base-2);j++) {
				System.out.print(" ");
			}
			
			//Dibujo el segundo borde
			System.out.print("*\n");
		}
		
		//Dibujamos la última linea
		for (int i = 0; i < base; i++) 
			System.out.print("*");
			*/
		
		
		//Forma fácil
		

		for (int j=0;j<altura;j++)
			//Dibujamos una linea de ancho base
		{
		 for (int i=0;i<base;i++)
		 {
		 if (j==0 || j==altura-1 || i==0 || i==base-1)
			 System.out.print("*");
			 else
		     System.out.print(" ");			
			 }
		//Después de cada linea hacemos un enter
			System.out.println();
		 }
	
		//Triángulo falla un punto
		
        System.out.println("\n\n");
		
		System.out.println("Triángulo");
		
		System.out.println("\n\n");
		
		for (int j=0;j<altura;j++)
			//Dibujamos una linea de ancho base
		{
		 for (int i=0;i<base;i++)
		 {
		 if ((j==0 && i==0 ) || j==altura-1 || i==0 || (i==base-1 && j==0)|| i==j)
			 System.out.print("*");
			 else
		     System.out.print(" ");			
			 }
		//Después de cada linea hacemos un enter
			System.out.println();
		 }
		
		
        System.out.println("\n\n");
		
		System.out.println("Triángulo profesor");
		
		System.out.println("\n\n");
		
		for (int i=0; i<altura; i++) 
		{
			for (int j = 0; j<i+1; j++)
			{
				System.out.print("*");
			}
			//Después de cada linea hacemos un enter
			System.out.println();
		}
		
		
		teclado.close();

	}

}
