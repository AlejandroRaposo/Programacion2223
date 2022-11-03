package unidad22;

import java.util.Scanner;

public class EjemploCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Realizar una calculadora que haga las 4 operaciones básicas
		//Se montrara un menu del tipo
		/*
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicación
		 * 4. División
		 * 5. Salir
		 * 
		 * Introduce la opción mas deseada (1-5):
		 * 
		 * el programa seguira funcionando hasta que 
		 */
		int opcion=0;
		double a=0;
		double b=0;
		String resp="N";
		Scanner teclado=new Scanner(System.in);
		
		while (opcion!=5)
		{
			System.out.println("/n 1. Suma\n"
					+ "/n 2. Resta\n"
					+ "/n 3. Multiplicación\n"
					+ "/n 4. División\n"
					+ "/n 5. Salir\n"
					+ " \n Introduce la opción mas deseada (1-5):\n");
			
			opcion=teclado.nextInt();
			
			
			
			//Si la opción elegida no es valida, volvemos a mostrar el menu
			//Saltandonos el resto de instrucciones del while
			if ((opcion<1) || (opcion>5))
				{
				System.out.println("/n/nOpción erronea/n/n");
				continue;
				}
			
			
			if (opcion!=5) 
			{
			//Se introducen los números
			System.out.println("Introduce el primer número");
			a=teclado.nextDouble();
			System.out.println("Introduce el segundo número");
			b=teclado.nextDouble();
			

			//Se realiza la operación
			switch (opcion) {
			
			//Suma
			case 1:
				System.out.println("El resultado es " + (a+b));
				break;
				
			//Resta	
			case 2:
				
				System.out.println("El resultado es " + (a-b));
				break;
				
			//Multiplicación	
			case 3:
				if (a==0 || b==0) {
					System.out.println("Error: El resultado es cero");}
					else {
				System.out.println("El resultado es " + a*b);}
				
				break;
				
			//División	
			case 4:
				if (b==0) {
					System.out.println("Error: Imposible dividir por cero");}
				else  {
				System.out.println("El resultado es " + a/b);}
				break;
				
			//Salir
			case 5:
				System.out.println("Gracias por utilizar la calculadora");
				System.exit(-1);
			    break;}
			
			System.out.println("¿Quieres hacer otra operación? (Si/No)");   
			resp= teclado.next().toUpperCase();
			if (resp.charAt(0)=='N') {
				System.exit(-1);
				
			}
				
		}
		}
	}
	}

