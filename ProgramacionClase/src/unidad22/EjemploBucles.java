package unidad22;

import java.util.Scanner;

public class EjemploBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer por pantalla dos números y mostrar los impares entre elleos

		int num1=1;
		int num2=0;
		Scanner teclado= new Scanner(System.in);
		/*
		
		System.out.println("Introduce el primer número");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2=teclado.nextInt();
		
		//Si se introduce el primer número mayor que el primero tenemos
		//un error, que se soluciona cambiando valores con una variable de intercambio
		
		if (num1>num2)
		{
			int intercambio=num1;
			num1=num2;
			num2=intercambio;
		}
		
		
		
		//Optimizada
		
		if (num1%2==0) num1++;
		
		while (num1<=num2) 
		{
			if (num1%2!=0) System.out.println(num1);
		num1=num1+2;
		}
		
		
		//Sin optimizar
		
		/* 
		 * if (num1%2==0) num1++;
		
		while (num1<=num2) 
		{
			if (num1%2!=0) System.out.println(num1);
		num1=num1++;
		}
		 */
		
	/*	while (num1<=10)
		{
			System.out.println("5 x " +num1 + " = " +5*num1);
			num1++;
		}
		*/
		/*
		int numtabla=0;
		
		/*System.out.println("Tabla de multiplicar del número(int)");
		numtabla=teclado.nextInt();
		
		for (int i=1;i<=10;i++)
			System.out.println(numtabla+" x " +i +" = " +numtabla*i);
		if (numtabla<=10)
				{
		numtabla++;
				}
		*/
		
		//Secar todas las tablas de multiplicacion
		
		int j=1;
		int i=1;
		
		
		/*
		 //Ejemplo while
		while (j<=10)
		{
			
			System.out.println("\n\n*********************************");
			System.out.println("**  Tabla de multiplicar del " +j +"**");
			System.out.println("*********************************\n\n");
			i=1;
			while (i<=10) {
				
			System.out.println(j + " x " + i + " = " + j*i);
			i++;
		}
		
		// Pasamos a la siguiente tabla
		j++;
		}
		*/
		
		
		for (i=1; i<=10; i++) 
		{
			System.out.println("\n\n*********************************");
			System.out.println("**  Tabla de multiplicar del " +i +"**");
			System.out.println("*********************************\n\n");
			
			//Muestra la tabla de multiplicar de i
			for (j=1; j<=10; j++)
			{
				System.out.println(j + " x " + i + " = " + j*i);
			}
		}
		
		
		teclado.close();
		
	}

}
