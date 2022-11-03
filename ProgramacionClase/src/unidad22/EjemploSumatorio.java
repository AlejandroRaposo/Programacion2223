package unidad22;

import java.util.Scanner;

public class EjemploSumatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un programa que dado un número me devuelva su sumatorio
		//por ejemplo si se introduce el 4 devolverá 4+3+2+1 es decir 10
		//Se comprobará que el número es positivo sino se cambiará el signo
		
		int num=0;
		int resultado=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el número");
		num=teclado.nextInt();
		
		if (num<0) 
		{
			num=-num;
		}

		
		for (int i=num; i>=1; i--)
		{
			resultado=resultado+i;
		}
		
		System.out.println("El sumatorio es " + resultado);	
		
		teclado.close();

	}

}
