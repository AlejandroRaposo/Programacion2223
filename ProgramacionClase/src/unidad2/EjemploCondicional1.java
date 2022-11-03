package unidad2;

import java.util.Scanner;

public class EjemploCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Siempre es buena idea poner un valor inicial a todas las variables aunque vayan a tener otro valor despues
		
		int edad=0;
		double sueldo=0;
		String comunidad="";
		
		//Leemos la edad de teclado
		System.out.println("Introduce tu edad");
		Scanner teclado= new Scanner(System.in);
		edad = teclado.nextInt();
		
		//Ejemplo de estructura condicional
		//evalua la condición entre parentesis y si es cierta ejecuta el codigo que hay dentro
		
		if (edad%2==0) {
			System.out.println("Oye, tu edad " + edad + " es par, jajaja");
			
		}
			//Leemos el sueldo por teclado
			System.out.println("Introduce tu sueldo");
			sueldo = teclado.nextDouble();
		
			
			//Si el sueldo es mayor o igual a 30000 saco un mnsaje
			if (sueldo>=30000) {
				System.out.println("Tu sueldo es mayor o igual a 30000");
				
			}
			
			//Leemos la comunidad por teclado
			System.out.println("Introduce tu comunidad");
			comunidad = teclado.next();
			
			// Para comparar Strings debe usarse .equals o .equalsIgnoreCase (Ignora mayausculas y minusculas)
			if (comunidad.equalsIgnoreCase("Andalucia")) {
				System.out.println("Bienvenido al sur");
			}
			
			
			teclado.close();
		

	}

}
